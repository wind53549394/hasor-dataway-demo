package com.pp.hasor.dataway.demo;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import net.hasor.web.startup.RuntimeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


/**
 * Hasor-Dataway Demo启动主类
 *
 * @author Kevin
 */
@EnableHasor
@EnableHasorWeb
@SpringBootApplication
public class HasorDatawayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HasorDatawayDemoApplication.class, args);
    }

    /**
     * 配置RuntimeFilter
     *
     * @return FilterRegistrationBean
     */
//    @Bean
//    public FilterRegistrationBean runtimeFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean(new RuntimeFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("runtimeFilter");
//        registration.setOrder(1);
//        return registration;
//    }
}
