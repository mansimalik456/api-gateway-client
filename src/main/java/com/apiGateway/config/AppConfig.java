//package com.apiGateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RestController;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class AppConfig {
//	
//	 @Bean
//	 public Docket api() {
//		 return new Docket(DocumentationType.SWAGGER_2)
//				 .select()
//	             .apis(RequestHandlerSelectors.any())
//	             .paths(PathSelectors.any())
//	             .build();
//	    }
//	
////	 @Bean
////	 public Docket orderApi() {
////	        return new Docket(DocumentationType.SWAGGER_2)
////	                .select()
////	                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
////	                .paths(PathSelectors.any())
////	                .build()
////	                .apiInfo(getApiInfo());
////	    }
////
////	    //create api metadata that goes at the top of the generated page
////	    private ApiInfo getApiInfo() {
////	        return new ApiInfoBuilder()
////	                .title("Fete Bird Order Microservice")
////	                .version("1.0")
////	                .description("API for managing Fete Bird Order Microservice.")
////	                .license("Fete Bird License Version 1.0")
////	                .build();
////	    }
//
//}
