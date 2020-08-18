package com.itheilv.poi.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author WSQ
 * @since 2020-07-30
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.itheilv.poi.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     * @return the paginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
