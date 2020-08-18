package com.itheilv.poi.test;

import com.google.common.collect.Lists;
import com.itheilv.poi.PoiApplication;
import com.itheilv.poi.model.BomApproval;
import com.itheilv.poi.model.BomManufactureMaterial;
import com.itheilv.poi.model.BomManufactureTitle;
import com.itheilv.poi.service.BomManufactureMaterialService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author WSQ
 * @since 2020-08-12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PoiApplication.class)
public class PoiTest {

    @Autowired
    private BomManufactureMaterialService bomManufactureMaterialService;

    @Test
    public void testJxls() throws IOException {
        InputStream is = new FileInputStream("D:\\IdeaProjects\\study\\poi-demo\\src\\main\\resources\\template\\MBOM.xlsx");
        final int hour = LocalDateTime.now().getHour();
        final int minute = LocalDateTime.now().getMinute();
        final int second = LocalDateTime.now().getSecond();
        String time = hour + "" + minute + "" + second;
        OutputStream outputStream = new FileOutputStream("C:\\Users\\WSQ\\Desktop\\test\\test" + time + ".xlsx");
        final List<BomManufactureMaterial> materialList = bomManufactureMaterialService.list(null);
        Context context = new Context();
        context.putVar("materialList", materialList);
        JxlsHelper.getInstance().processTemplate(is, outputStream, context);
    }

    @Test
    public void testJxls02() throws IOException {
        final List<BomManufactureMaterial> materialList = bomManufactureMaterialService.list(null);
        final List<Integer> collect = materialList.stream().map(BomManufactureMaterial::getFeedNo).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testMoreSheet() throws IOException {
        InputStream is = new FileInputStream("D:\\IdeaProjects\\study\\poi-demo\\src\\main\\resources\\template\\test03.xlsx");
        final int hour = LocalDateTime.now().getHour();
        final int minute = LocalDateTime.now().getMinute();
        final int second = LocalDateTime.now().getSecond();
        String time = hour + "" + minute + "" + second;
        OutputStream outputStream = new FileOutputStream("C:\\Users\\WSQ\\Desktop\\test\\test" + time + ".xlsx");
        Context context = new Context();
        List<BomManufactureTitle> bomManufactureTitles = new ArrayList<>();
        BomManufactureTitle bomManufactureTitle1 = new BomManufactureTitle();
        bomManufactureTitle1.setName("张三");
        bomManufactureTitles.add(bomManufactureTitle1);
        BomManufactureTitle bomManufactureTitle2 = new BomManufactureTitle();
        bomManufactureTitle2.setName("李四");
        bomManufactureTitles.add(bomManufactureTitle2);
        context.putVar("list", bomManufactureTitles);
        JxlsHelper.getInstance().processTemplate(is, outputStream, context);
    }
}
