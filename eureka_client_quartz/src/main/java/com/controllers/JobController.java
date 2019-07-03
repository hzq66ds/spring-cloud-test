package com.controllers;

import com.controllers.beans.ReturnMsg;
import com.dbEntity.member.basicentity.AppQuartz;
import com.services.AppQuartzService;
import com.utils.JobUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobUtil jobUtil;
    @Autowired
    private AppQuartzService appQuartzService;

    /**
     * 获取所有
     * @param appQuartz
     * @return
     * @throws Exception
     */
    @GetMapping(value="/getJobs/{id}")
    public ReturnMsg getJobs(@PathVariable("id")Integer id) throws Exception {
        List<AppQuartz> list = appQuartzService.getJobs(id);
        return new ReturnMsg<AppQuartz>("200","查询成功",list);
    }

    /**
     * 添加一个job
     * @param appQuartz
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/addJob",method=RequestMethod.POST)
    public ReturnMsg addjob(@RequestBody AppQuartz appQuartz) throws Exception {
        appQuartzService.insertAppQuartzSer(appQuartz);
        return new ReturnMsg("200",jobUtil.addJob(appQuartz));
    }

    /**
     * 暂停job
     * @param quartzIds
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/pauseJob",method=RequestMethod.POST)
    public ReturnMsg pausejob(@RequestBody Integer[]quartzIds) throws Exception {
        AppQuartz appQuartz=null;
        if(quartzIds.length>0){
            for(Integer quartzId:quartzIds) {
                appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId);
                jobUtil.pauseJob(appQuartz.getJobName(), appQuartz.getJobGroup());
            }
            return new ReturnMsg("200","success pauseJob");
        }else {
            return new ReturnMsg("404","fail pauseJob");
        }
    }

    /**
     * 恢复job
     * @param quartzIds
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/resumeJob",method= RequestMethod.POST)
    public ReturnMsg resumejob(@RequestBody Integer[]quartzIds) throws Exception {
        AppQuartz appQuartz=null;
        if(quartzIds.length>0) {
            for(Integer quartzId:quartzIds) {
                appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId);
                jobUtil.resumeJob(appQuartz.getJobName(), appQuartz.getJobGroup());
            }
            return new ReturnMsg("200","success resumeJob");
        }else {
            return new ReturnMsg("404","fail resumeJob");
        }
    }


    /**
     * 删除job
     * @param quartzIds
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/deletJob",method=RequestMethod.POST)
    public ReturnMsg deletjob(@RequestBody Integer[]quartzIds) throws Exception {
        AppQuartz appQuartz=null;
        for(Integer quartzId:quartzIds) {
            appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId);
            String ret=jobUtil.deleteJob(appQuartz);
            if("success".equals(ret)) {
                appQuartzService.deleteAppQuartzByIdSer(quartzId);
            }
        }
        return new ReturnMsg("200","success deleteJob");
    }

    /**
     * 修改
     * @param appQuartz
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/updateJob",method=RequestMethod.POST)
    public ReturnMsg  modifyJob(@RequestBody AppQuartz appQuartz) throws Exception {
        String ret= jobUtil.modifyJob(appQuartz);
        if("success".equals(ret)) {
            appQuartzService.updateAppQuartzSer(appQuartz);
            return new ReturnMsg("200","success updateJob",ret);
        }else {
            return new ReturnMsg("404","fail updateJob",ret);
        }
    }

    /**
     * 暂停所有
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/pauseAll",method=RequestMethod.GET)
    public ReturnMsg pauseAllJob() throws Exception {
        jobUtil.pauseAllJob();
        return new ReturnMsg("200","success pauseAll");
    }

    /**
     * 恢复所有
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/repauseAll",method=RequestMethod.GET)
    public ReturnMsg repauseAllJob() throws Exception {
        jobUtil.resumeAllJob();
        return new ReturnMsg("200","success repauseAll");
    }

}
