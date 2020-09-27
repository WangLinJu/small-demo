package com.itheilv.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.itheilv.mybatisplus.base.BaseModel;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;


/**
 * @author WSQ
 * @since 2020-09-25
 */
public class MybatisPlusGeneratorUtil {

    /**
     * Oracle
     */
    private static final String ORACLE = "oracle";

    /**
     * 根据模板生成文件
     *
     * @param likeTable    需要生成的数据库表
     * @param packageName  父包名
     * @param jdbcDriver   数据库连接驱动
     * @param jdbcUrl      数据库链接URL
     * @param jdbcUsername 数据库账户
     * @param jdbcPassword 数据库密码
     */
    public static void generator(String likeTable, String packageName, String module, String jdbcDriver, String jdbcUrl, String jdbcUsername, String jdbcPassword) {
        //1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        //文件的输出目录
        gc.setOutputDir(projectPath + module + "\\src\\main\\java");
        //是否覆盖已有文件
        gc.setFileOverride(true);
        //是否打开输出目录
        gc.setOpen(false);
        //是否在xml添加二级缓存
        gc.setEnableCache(false);
        //作者
        gc.setAuthor(System.getProperties().getProperty("user.name"));
        //开启Swagger2
        gc.setSwagger2(true);
        //开启BaseResultMap
        gc.setBaseResultMap(true);
        //时间类型对应策略
        gc.setDateType(DateType.TIME_PACK);
        //开启baseColumnList
        gc.setBaseColumnList(true);
        //去掉Service接口的首字母I
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        //3.数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        if (jdbcDriver.contains(ORACLE)) {
            dsc.setDbType(DbType.ORACLE);
        } else {
            dsc.setDbType(DbType.MYSQL);
        }

        dsc.setDriverName(jdbcDriver);
        dsc.setUrl(jdbcUrl);
        dsc.setUsername(jdbcUsername);
        dsc.setPassword(jdbcPassword);
        mpg.setDataSource(dsc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("StringUtils", StringUtils.class);
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packageName);
        pc.setEntity("model");
        mpg.setPackageInfo(pc);

        // 5.策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置表前缀不生成
        //strategy.setTablePrefix(tablePrefix);
        //设置需要映射的表名
        strategy.setLikeTable(new LikeTable(likeTable));
        strategy.setRestControllerStyle(true);
        //字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
        //逻辑删除字段
        strategy.setLogicDeleteFieldName("del_flag");
        //去掉布尔值的is_前缀
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);

        // 自定义实体父类
        strategy.setSuperEntityClass(BaseModel.class);
        // 自定义 mapper 父类
        strategy.setSuperMapperClass("com.itheilv.mybatisplus.base.BaseMapper");
        // 自定义 service 父类
        strategy.setSuperServiceClass("com.itheilv.mybatisplus.base.BaseService");
        // 自定义 service 实现类父类
        strategy.setSuperServiceImplClass("com.itheilv.mybatisplus.base.BaseServiceImpl");
        // 自定义 controller 父类
        strategy.setSuperControllerClass("com.itheilv.mybatisplus.base.BaseController");
        mpg.setStrategy(strategy);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/template 下面内容修改，
        TemplateConfig tc = new TemplateConfig();
        tc.setEntity("template/entity.java.vm");
        tc.setMapper("template/mapper.java.vm");
        //tc.setXml("template/mapper.xml.vm");
        tc.setService("template/service.java.vm");
        tc.setServiceImpl("template/serviceImpl.java.vm");
        tc.setController("template/controller.java.vm");
        mpg.setTemplate(tc);

        //6.执行
        mpg.execute();

    }
}
