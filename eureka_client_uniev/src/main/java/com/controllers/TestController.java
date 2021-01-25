package com.controllers;

import com.controllers.beans.ReturnMsg;
import com.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;


    /**
     * 恢复所有
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/test",method=RequestMethod.GET)
    @ResponseBody
    public ReturnMsg test() {
        return new ReturnMsg("200","success repauseAll",testService.getCode());
    }
    /**
     * 恢复所有
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/test1",method=RequestMethod.GET)
    @ResponseBody
    public ReturnMsg test1() {
        return new ReturnMsg("200","success repauseAll",testService.getCode1());
    }
}
