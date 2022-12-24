//package com.wnn.mymusiclog;
//
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.OutputFile;
//import com.baomidou.mybatisplus.generator.config.TemplateType;
//import org.junit.jupiter.api.Test;
//
//import java.util.Collections;
//import java.util.Properties;
//
///**
// * MySQL 代码生成
// *
// * @author lanjerry
// * @since 3.5.3
// */
//public class MySQLGeneratorTest extends BaseGeneratorTest {
//
//    /**
//     * 数据源配置
//     */
//    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
//            .Builder("jdbc:mysql://hadoop52:3306/mymusic?serverTimezone=Asia/Shanghai", "root", "root")
//            .schema("baomidou")
//            .build();
//
//    @Test
//    public void testSimple() {
////        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
////        generator.strategy(strategyConfig().build());
////        generator.global(globalConfig().outputDir("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog").fileOverride().build());
////        generator.packageInfo(
////                packageConfig()
////                        .parent("com.wnn.mymusiclog")
////                        .moduleName("mymusiclog")
////                        .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\mapper"))
////                        .build()
////        );
////        generator.template(templateConfig()
////                .entity("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\bean\\")
////                .service("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\service")
////                .serviceImpl("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\serviceImpl")
////                .mapper("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\mapper\\")
////                .xml("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\mapper\\")
////                .controller("E:\\onlineEducation\\mymusiclog\\src\\main\\java\\com\\wnn\\mymusiclog\\controller")
////                .build()
////        );
////        generator.execute();
//    }
//
//
//}