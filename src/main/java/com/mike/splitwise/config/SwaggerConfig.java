package com.mike.splitwise.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket swaggerApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .paths(PathSelectors.any())
        .apis(RequestHandlerSelectors.basePackage("com.mikekiplangat,splitwise"))
        .build()
        .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
            "SplitWise",
            "Splits your expenses with your friends",
            "v1.0",
            "Public API",
                new Contact(
                        "Mike Kiplangat",
                        "www.github.com/kiplangatmike",
                        "kiplangatmike1938@gmail.com"),
                "MIT",
                "",
                Collections.emptyList());
    }

}
