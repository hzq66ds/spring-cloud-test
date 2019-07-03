package com.services;

import com.dbEntity.member.basicentity.AppQuartz;
import com.dbEntity.member.basicentity.AppQuartzExample;
import com.dbEntity.member.basicmappers.AppQuartzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/6/21.
 */
@Service
public class AppQuartzService {
    @Autowired
    private AppQuartzMapper appQuartzMapper;

    public List<AppQuartz> getJobs(Integer id){
        List<AppQuartz> result = new ArrayList<>();
        if (id!=null&&id>0) {
            AppQuartz quartz = appQuartzMapper.selectByPrimaryKey(id);
            result.add(quartz);
        }else {
            AppQuartzExample example = new AppQuartzExample();
            result.addAll(appQuartzMapper.selectByExample(example));

        }
        return result;
    }

    public void insertAppQuartzSer(AppQuartz appQuartz){
        appQuartzMapper.insert(appQuartz);
    }

    public AppQuartz selectAppQuartzByIdSer(Integer quartzId){
        return appQuartzMapper.selectByPrimaryKey(quartzId);
    }

    public void deleteAppQuartzByIdSer(Integer quartzId){
        appQuartzMapper.deleteByPrimaryKey(quartzId);
    }

    public void updateAppQuartzSer(AppQuartz appQuartz){
        appQuartzMapper.updateByPrimaryKey(appQuartz);
    }
}
