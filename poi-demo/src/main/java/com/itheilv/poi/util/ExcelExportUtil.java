package com.itheilv.poi.util;

import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

/**
 * @author WSQ
 * @since 2020-08-07
 * Excel模板导出
 */
public class ExcelExportUtil {


    public static void init(){
        ExcelExportUtil.class.getClassLoader().getResource("template/MBOM.xlsx");
    }
}
