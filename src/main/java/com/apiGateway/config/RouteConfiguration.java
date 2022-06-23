//package com.apiGateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RouteConfiguration {
//	
//	 @Bean
//	 public RouteLocator routes(RouteLocatorBuilder builder) {
//	        return builder.routes()
//	        		.route("communication-scaffold-service", request->request.path("/v1/**").uri("lb://communication-scaffold-service"))
//	        		.build();
//	  }
//
//}
