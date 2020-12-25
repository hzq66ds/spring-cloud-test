package com.services;

import com.dbEntity.member.basicentity.*;
import com.dbEntity.member.basicmappers.LxCecConnectorInfoMapper;
import com.dbEntity.member.basicmappers.LxCecEquipmentInfoMapper;
import com.dbEntity.member.basicmappers.LxCecStationInfoMapper;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/6/21.
 */
@Service
public class TestService {
    @Autowired
    private LxCecStationInfoMapper lxCecStationInfoMapper;
    @Autowired
    private LxCecEquipmentInfoMapper lxCecEquipmentInfoMapper;
    @Autowired
    private LxCecConnectorInfoMapper lxCecConnectorInfoMapper;
    private String preName = "app_sn_p_";
    String op="MA002TMQX";
    public String getCode(){
        int a=0;
        int b=0;
        int c=0;
        String name = "";
        try {
            InputStream is = new FileInputStream("I:\\a.xls");
            Workbook wb = Workbook.getWorkbook(is);
            c = wb.getSheets().length;
            for (int i = 0; i < wb.getSheets().length; i++) {
                Sheet sheet = wb.getSheet(i);
                name = sheet.getName();
                int rowNum=sheet.getRows();
                int columnsNum=sheet.getColumns();
                Map<String,Integer> headMap = new HashMap<>();
                Cell[] headCell = sheet.getRow(0);
                for (int i1 = 0; i1 < headCell.length; i1++) {
                    headMap.put(headCell[i1].getContents().trim(),i1);
                }
                Map<String,LxCecStationInfo> stationInfos = new HashMap<>();
                List<LxCecEquipmentInfo> equipmentInfos = new ArrayList<>();
                List<LxCecConnectorInfo> connectorInfos = new ArrayList<>();
                for (int j = 1; j < rowNum; j++){
                    if (sheet.getRow(j)!=null && sheet.getRow(j).length>0
                            && StringUtils.isNotBlank(sheet.getRow(j)[0].getContents())){
                        if (sheet.getName().equals("总表")){
                            a++;
                        }else{
                            b++;
                            //正式数据处理
                            LxCecStationInfo lxCecStationInfo = new LxCecStationInfo();
                            lxCecStationInfo.setStationId(sheet.getRow(j)[headMap.get("户号")].getContents());
                            if (stationInfos.keySet().contains(lxCecStationInfo.getStationId())){
                                lxCecStationInfo = stationInfos.get(lxCecStationInfo.getStationId());
                            }else{
                                lxCecStationInfo.setCountryCode("CN");
                                lxCecStationInfo.setStationType(50);
                                lxCecStationInfo.setStationStatus(0);
                                lxCecStationInfo.setParkNums(1);
                            }
                            initStation(lxCecStationInfo,headMap,sheet.getRow(j));
                            LxCecEquipmentInfo lxCecEquipmentInfo = new LxCecEquipmentInfo();
                            initEquipment(lxCecEquipmentInfo,headMap,sheet.getRow(j));
                            LxCecConnectorInfo lxCecConnectorInfo = new LxCecConnectorInfo();
                            initConnector(lxCecConnectorInfo,headMap,sheet.getRow(j));

                            lxCecStationInfo.setUpdateTime(new Date());
                            lxCecStationInfo.setCreateTime(new Date());
                            lxCecStationInfo.setArtificialState(-1);
                            lxCecStationInfo.setState(1);

                            lxCecEquipmentInfo.setUpdateTime(new Date());
                            lxCecEquipmentInfo.setCreateTime(new Date());
                            lxCecEquipmentInfo.setArtificialState(-1);
                            lxCecEquipmentInfo.setState(1);

                            lxCecConnectorInfo.setUpdateTime(new Date());
                            lxCecConnectorInfo.setCreateTime(new Date());
                            lxCecConnectorInfo.setArtificialState(-1);
                            lxCecConnectorInfo.setState(1);


                            equipmentInfos.add(lxCecEquipmentInfo);
                            connectorInfos.add(lxCecConnectorInfo);
                            stationInfos.put(lxCecStationInfo.getStationId(),lxCecStationInfo);
                        }
                        System.out.println(sheet.getName()+"\t"+i+"\t"+j);
                    }
                }
                if (stationInfos.size()>0){
                    int ii = 0;
                    for (LxCecStationInfo stationInfo:stationInfos.values()){
                        lxCecStationInfoMapper.insertSelective(stationInfo);
                        ii++;
                        System.out.printf("保存中 %s   %s\n",stationInfos.size()+"",ii+"");
                    }
                }
                if (equipmentInfos.size()>0){
                    int ii = 0;
                    for (LxCecEquipmentInfo equipmentInfo:equipmentInfos){
                        lxCecEquipmentInfoMapper.insertSelective(equipmentInfo);
                        ii++;
                        System.out.printf("保存中 %s   %s\n",stationInfos.size()+"",ii+"");
                    }
                }
                if (connectorInfos.size()>0){
                    int ii = 0;
                    for (LxCecConnectorInfo connectorInfo:connectorInfos){
                        lxCecConnectorInfoMapper.insertSelective(connectorInfo);
                        ii++;
                        System.out.printf("保存中 %s   %s\n",stationInfos.size()+"",ii+"");
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(c+"\t"+a+"\t"+b+"\t"+name);
        }

        return "success";
    }

    private void initStation(LxCecStationInfo lxCecStationInfo,Map<String,Integer> headMap,Cell[] cells){
        lxCecStationInfo.setConstruction(255);
        headMap.entrySet().forEach(v->{
            String text = "";
            System.out.println("aaa;   "+cells.length+"\t"+v.getValue());
            if(cells.length>v.getValue()){
                if (cells[v.getValue()]!=null) {
                    text = cells[v.getValue()].getContents().trim();
                }
                if (StringUtils.isNotBlank(text)){
                    if (v.getKey().equals("户号")){
                        lxCecStationInfo.setStationId(text);
                    }
                    if (v.getKey().equals("站名称")){
                        lxCecStationInfo.setStationName(text);
                    }
                    if (v.getKey().equals("户名")){
                        lxCecStationInfo.setStationCustomName(text);
                    }
                    if (v.getKey().equals("运营商")){
                        lxCecStationInfo.setOperatorId(op);
                        lxCecStationInfo.setProxyOperatorId(op);
                        lxCecStationInfo.setEquipmentOwnerId(op);
                    }
                    if (v.getKey().equals("区域（行政区域编码）")){
                        lxCecStationInfo.setAreaCode(text);
                    }
                    if (v.getKey().equals("地址")){
                        lxCecStationInfo.setAddress(text);
                    }
                    if (v.getKey().equals("办公电话")){
                        lxCecStationInfo.setStationTel(text);
                    }
                    if (v.getKey().equals("移动电话")){
                        lxCecStationInfo.setServiceTel(text);
                    }
                    if (v.getKey().equals("纬度")){
                        lxCecStationInfo.setStationLat(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                    if (v.getKey().equals("经度")){
                        lxCecStationInfo.setStationLng(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                    if (v.getKey().equals("供电所")){
                        lxCecStationInfo.setSiteGuide(text);
                    }
                }
            }

        });
    }
    private void initEquipment(LxCecEquipmentInfo lxCecEquipmentInfo,Map<String,Integer> headMap,Cell[] cells){
        lxCecEquipmentInfo.setEquipmentType(1);
        headMap.entrySet().forEach(v->{
            if(cells.length>v.getValue()){
                String text = cells[v.getValue()].getContents();
                if (StringUtils.isNotBlank(text)){
                    if (v.getKey().equals("户号")){
                        lxCecEquipmentInfo.setStationId(text);
                    }
                    if (v.getValue().equals(0)){
                        lxCecEquipmentInfo.setEquipmentId(preName+text);
                    }
                    if (v.getKey().equals("运营商")){
                        lxCecEquipmentInfo.setOperatorId(op);
                        lxCecEquipmentInfo.setProxyOperatorId(op);
                        lxCecEquipmentInfo.setManufactureId(op);

                    }
                    if (v.getKey().equals("供电电压")){
                        if (text.contains("交流")){
                            lxCecEquipmentInfo.setEquipmentType(2);
                        }else{
                            lxCecEquipmentInfo.setEquipmentType(5);
                        }
                    }
                    if (v.getKey().equals("功率（kW）")){
                        lxCecEquipmentInfo.setPower(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                    if (v.getKey().equals("站名称")){
                        lxCecEquipmentInfo.setEquipmentName(text);
                    }
                    if (v.getKey().equals("纬度")){
                        lxCecEquipmentInfo.setEquipmentLat(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                    if (v.getKey().equals("经度")){
                        lxCecEquipmentInfo.setEquipmentLng(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                }
            }
        });
    }
    private void initConnector(LxCecConnectorInfo lxCecConnectorInfo,Map<String,Integer> headMap,Cell[] cells){
        lxCecConnectorInfo.setNationalStandard(2);
        lxCecConnectorInfo.setAuxPower(-1);
        lxCecConnectorInfo.setStartType(1);

        headMap.entrySet().forEach(v->{
            if(cells.length>v.getValue()){
                String text = cells[v.getValue()].getContents();
                if (StringUtils.isNotBlank(text)){
                    if (v.getKey().equals("户号")){
                        lxCecConnectorInfo.setStationId(text);
                    }
                    if (v.getValue().equals(0)){
                        lxCecConnectorInfo.setEquipmentId(preName+text);
                        lxCecConnectorInfo.setConnectorId(preName+text);
                        lxCecConnectorInfo.setParkNo("1");
                    }
                    if (v.getKey().equals("站名称")){
                        lxCecConnectorInfo.setConnectorName(text);
                    }
                    if (v.getKey().equals("运营商")){
                        lxCecConnectorInfo.setOperatorId(op);
                        lxCecConnectorInfo.setProxyOperatorId(op);
                    }
                    if (v.getKey().equals("供电电压")){
                        if (text.contains("交流")){
                            lxCecConnectorInfo.setConnectorType(2);
                        }else{
                            lxCecConnectorInfo.setConnectorType(6);
                        }
                        Integer num = new Integer(0);
                        String str = text.replace("交流","").replace("V","");
                        if (StringUtils.isNotBlank(str)){
                            try {
                                num = Integer.valueOf(str);
                            }catch (Exception e){}
                        }

                        lxCecConnectorInfo.setVoltageUpperLimit(num);
                        lxCecConnectorInfo.setVoltageLowerLimit(num);
                    }
                    if (v.getKey().equals("运行容量")){
                        Integer num = new Integer(0);
                        if (StringUtils.isNotBlank(text)){
                            try {
                                num = Integer.valueOf(text);
                            }catch (Exception e){}
                        }
                        lxCecConnectorInfo.setCurrent(num);
                    }
                    if (v.getKey().equals("功率（kW）")){
                        lxCecConnectorInfo.setPower(BigDecimal.valueOf(Double.parseDouble(text)));
                    }
                }
            }
        });
    }
}
