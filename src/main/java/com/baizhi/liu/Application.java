package com.baizhi.liu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//是一个组合注解,在spring中用到过@RestController 作用:组合注解 @Controller @ResponseBody  声明当前类为控制器,并且类中所用方法返回json
/*@SpringBootApplication=@Configuration作用:声明当前类是一个配置类
    +@EnableAutoConfiguration 开启自动配置 datasource  sqlsessionFactorybean  mapperScanner
    +@ComponentScan作用:组件扫描 把一些加有@service  @controller @component  @repository注解的对象交由工厂管理
    */
@SpringBootApplication
@MapperScan("com.baizhi.dao")//扫描dao
public class Application {
    public static void main(String[] args){
        //参数:入口类对象和主函数的参数
        SpringApplication.run(Application.class,args);
    }
}
