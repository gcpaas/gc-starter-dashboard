package com.gccloud;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.gccloud.dashboard.core.constant.DashboardConst;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author hongyang
 * @version 1.0
 * @date 2023/3/13 10:55
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = {DashboardConst.ScanPackage.COMPONENT})
@MapperScan(value = {DashboardConst.ScanPackage.DAO})
public class DashboardApplication {

    public static void main(String[] args) {

        SpringApplication.run(DashboardApplication.class, args);
    }

    /**
     * 分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
