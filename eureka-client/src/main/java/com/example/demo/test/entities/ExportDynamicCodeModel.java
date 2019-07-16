package com.example.demo.test.entities;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
public class ExportDynamicCodeModel extends BaseRowModel {
    @ExcelProperty(value = "任务序号", index = 0)
    private String taskSn;
    @ExcelProperty(value = "主机厂", index = 1)
    private String maker;
    @ExcelProperty(value = "经销商代码", index = 2)
    private String dealerCode;
    @ExcelProperty(value = "经销商名称", index = 3)
    private String dealerName;
    @ExcelProperty(value = "经销商集团名称", index = 4)
    private String groupName;
    @ExcelProperty(value = "省份", index = 5)
    private String province;
    @ExcelProperty(value = "城市", index = 6)
    private String city;

    public String getTaskSn() {
        return taskSn;
    }

    public void setTaskSn(String taskSn) {
        this.taskSn = taskSn;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
