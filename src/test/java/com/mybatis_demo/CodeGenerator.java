package com.mybatis_demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : LS
 * @className : CodeGenerator
 * @package: com.mybatis_demo
 * @description :
 * @date : 2020/07/09 21:07
 */
public class CodeGenerator {
    //作者
    private static String author = "国良";
    //生成位置
//    private static String outPath = "D:\\zfpt\\zfpt-core\\src\\main\\java";
    private static String outPath = "E:\\ideaprojects\\mybatis_demo\\src\\main\\java";
    //驱动
    private static String driver = "com.mysql.cj.jdbc.Driver";
    //链接路径
    private static String url = "jdbc:mysql://47.110.42.239:3306/forSyl?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    //数据库用户名
    private static String username = "root";
    //数据库密码
    private static String password = "root";
    //数据库表的前缀
    private static String tablePrefix = "";
    //需要生成的表名
//    private static String [] tables = {"t_sys_user","t_sys_role"};
    //顶级包结构
    private static String parentPackage = "com.george";
    //数据访问层包名
    private static String dao = "mapper";
    //业务层包名
    private static String service = "service";
    //实体层包名
    private static String entity = "entity";
    //控制层包名
    private static String controller = "controller";
    //mapper映射文件包名
    private static String mapperxml = "mapper";
    //模块名
    private static String modulname = "";

    public static void main(String[] args) {
        //1.全局配置
        GlobalConfig config = new GlobalConfig();
        config.setAuthor(author)//作者
                .setOutputDir(outPath)//生成路径
                .setFileOverride(true)//文件覆盖
                .setIdType(IdType.ID_WORKER)//主键策略
                .setServiceName("I%sService")
                .setServiceImplName("I%sServiceImpl")
                //设置生成的Service接口名字的首字母是否为I，加上%s则不生成I
                .setBaseResultMap(true)//映射文件中是否生成ResultMap配置
                .setBaseColumnList(true)
                .setActiveRecord(false).setOpen(false)
                .setSwagger2(false);

        //2.数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)//设置数据库类型
                .setDriverName(driver)//设置驱动
                .setUrl(url)//设置连接路径
                .setUsername(username)//设置用户名
                .setPassword(password);//设置密码
        dsConfig.setTypeConvert(new MySqlTypeConvert() {

            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                if (fieldType.toLowerCase().contains("datetime")) {
                    return DbColumnType.DATE;
                }
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });

        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("UPDATE_TIMEE", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("CREAT_TIME", FieldFill.INSERT));

        //3.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        //全局大写命名
        strategyConfig.setCapitalMode(true)
                //数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(true)
                //表前缀
                .setTablePrefix(tablePrefix)
                .setTableFillList(tableFillList)
                .setEntityColumnConstant(false)
                .setEntityBuilderModel(false)
                .setEntitySerialVersionUID(true)
                .setEntityTableFieldAnnotationEnable(true)
                .setRestControllerStyle(true);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        templateConfig.setEntity("/templates/entity.java.vm");
        templateConfig.setMapper("/templates/mapper.java.vm");
        templateConfig.setService("templates/service.java.vm");
        templateConfig.setServiceImpl("/templates/serviceImpl.java.vm");
        templateConfig.setController("/templates/controller.java.vm");

        //4.包名策略
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(parentPackage)//顶级包结构
                .setModuleName(modulname)
                .setMapper(dao)//数据访问层
//                .setXml(mapperxml)//mapper映射文件
                .setService(service)//业务逻辑层
                .setController(controller)//控制器
                .setEntity(entity);//实体类
        //5.综合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .setTemplate(templateConfig);
        //6.执行
        autoGenerator.execute();
    }
}
