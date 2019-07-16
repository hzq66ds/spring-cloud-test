package com.example.demo.test;

import com.example.demo.test.entities.ExportDynamicCodeModel;
import com.example.demo.utils.ExcelUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanzhiqiang on 2018/1/20.
 * 采用阿里的easyexcel进行execl文件的导出
 */
@RestController
public class EasyExcelTest {

    @RequestMapping(value = {"/donwloadExecl"})
    public String donwloadExecl() throws Exception{
        // 自定义Excel文件名
        String excelName = "";
        // 按条件筛选records
        List<ExportDynamicCodeModel> dynamicCodeModels = new ArrayList<>();
        // easyexcel工具类实现Excel文件导出
        ExcelUtil.writeExcel(dynamicCodeModels, excelName, "test", new ExportDynamicCodeModel());

        return "hello!";
    }
}
