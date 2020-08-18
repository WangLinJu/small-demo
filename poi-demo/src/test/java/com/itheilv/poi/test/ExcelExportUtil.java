package com.itheilv.poi.test;

import org.junit.Test;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WSQ
 * @since 2020-08-06
 */
public class ExcelExportUtil {

    @Test
    public void testOne() throws IOException {
        final InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("template/test03.xlsx");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\WSQ\\Desktop\\test04.xlsx");
        Context context = new Context();
        Map<String, String> model = new HashMap<>();
        context.putVar("id", "001");
        context.putVar("name", "张三");
        context.putVar("age", "18");
        JxlsHelper.getInstance().processTemplate(resourceAsStream, outputStream, context);
    }
}
