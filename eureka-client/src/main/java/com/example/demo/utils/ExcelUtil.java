package com.example.demo.utils;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by hanzhiqiang@lenztechretail.com
 * on 2019/7/16.
 */
public class ExcelUtil {
    /**
     * 导出 Excel ：一个 sheet，带表头
     *
     * @param response HttpServletResponse
     * @param list 数据 list，每个元素为一个 BaseRowModel
     * @param fileName 导出的文件名
     * @param sheetName 导入文件的 sheet 名
     * @param model 映射实体类，Excel 模型
     */
    public static void writeExcel(List<? extends BaseRowModel> list,
                                  String fileName, String sheetName, BaseRowModel model) throws Exception{

        FileOutputStream outputStream = new FileOutputStream(fileName);
        ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
        Sheet sheet = new Sheet(1, 0, model.getClass());
        sheet.setSheetName(sheetName);
        sheet.setAutoWidth(true);
        writer.write(list, sheet);
        writer.finish();
    }
}
