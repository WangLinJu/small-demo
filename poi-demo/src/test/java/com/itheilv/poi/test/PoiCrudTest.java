package com.itheilv.poi.test;

import com.itheilv.poi.PoiApplication;
import com.itheilv.poi.model.BomEngineerTitle;
import com.itheilv.poi.service.BomEngineerTitleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @author WSQ
 * @since 2020/7/20
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = PoiApplication.class)
public class PoiCrudTest {

    @Autowired
    public BomEngineerTitleService bomEngineerTitleService;


    @Test
    public void getList() {
        BomEngineerTitle bomEngineerTitle = new BomEngineerTitle();
        bomEngineerTitleService.save(bomEngineerTitle);
        System.out.println("保存成功！！！");
    }

}
