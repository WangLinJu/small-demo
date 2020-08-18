package com.itheilv.poi.config;


import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * @author WSQ
 * @since 2020/7/20
 * Swagger-ui文档描述
 */


@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket poiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("poi-demo")
                .apiInfo(poiApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itheilv.poi"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(securitySchemes());
    }

    private ApiInfo poiApiInfo() {
        return new ApiInfoBuilder()
                .title("Poi文档")
                .description("Poi接口定义")
                .contact(new Contact("", "", ""))
                .build();
    }

    private List<ApiKey> securitySchemes() {
        return Lists.newArrayList(new ApiKey("access-token", "access-token", "header"));
    }

}
