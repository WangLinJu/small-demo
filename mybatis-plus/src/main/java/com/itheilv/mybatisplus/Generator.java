package com.itheilv.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WSQ
 * @since 2020-09-22
 */
public class Generator {
    private static final String MODULE = "poi";
    private static final String PARENT_NAME = "com.itheilv";
    private static final String TABLE_PREFIX = "";
    private static final String LIKE_TABLE = "BOM_MANUFACTURE_MATERIAL";
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
    private static final String JDBC_USERNAME = "CM";
    private static final String JDBC_PASSWORD = "root";

    public static void main(String[] args) {
        //1.创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        //文件的输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        //是否覆盖已有文件
        gc.setFileOverride(false);
        //是否打开输出目录
        gc.setOpen(false);
        //是否在xml添加二级缓存
        gc.setEnableCache(false);
        //作者
        gc.setAuthor("WSQ");
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
        dsc.setDbType(DbType.ORACLE);
        dsc.setDriverName(JDBC_DRIVER);
        dsc.setUrl(JDBC_URL);
        dsc.setUsername(JDBC_USERNAME);
        dsc.setPassword(JDBC_PASSWORD);
        mpg.setDataSource(dsc);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(MODULE);
        pc.setParent(PARENT_NAME);
        pc.setEntity("model");
        mpg.setPackageInfo(pc);

        // 5.策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置表前缀不生成
        strategy.setTablePrefix(TABLE_PREFIX);
        //设置需要映射的表名
        strategy.setLikeTable(new LikeTable(LIKE_TABLE));
        strategy.setRestControllerStyle(true);
        //字段注解
        strategy.setEntityTableFieldAnnotationEnable(true);
        //逻辑删除字段
        strategy.setLogicDeleteFieldName("del_flag");
        //去掉布尔值的is_前缀
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        //自动填充
        TableFill gmtCreate = new TableFill("create_date", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("update_date", FieldFill.INSERT_UPDATE);
        List<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        mpg.setStrategy(strategy);

        //6.执行
        mpg.execute();
    }
}