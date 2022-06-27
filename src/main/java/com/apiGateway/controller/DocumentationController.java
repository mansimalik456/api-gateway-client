//package com.apiGateway.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import com.apiGateway.constants.Constants;
//
//import springfox.documentation.swagger.web.SwaggerResource;
//import springfox.documentation.swagger.web.SwaggerResourcesProvider;
//
//
//@Component
//@Primary
//public class DocumentationController implements SwaggerResourcesProvider {
//	
////	public static final String API_URI = "/v2/api-docs";
////	private final RouteDefinitionLocator routeLocator;
////	
////	public DocumentationController(RouteDefinitionLocator routeLocator) {
////		this.routeLocator = routeLocator;
////	}
////	
////	@Override
////	public List<SwaggerResource> get() {
////		List<SwaggerResource> resources = new ArrayList<>();
////		
////		routeLocator.getRouteDefinitions().subscribe(routeDefinition -> {
////			System.out.println("Discovered route definition : " + routeDefinition.getId());
////			String resourceName = routeDefinition.getId();
////			String location = routeDefinition.getPredicates().get(0).getArgs()
////					.get("_genKey_0").replace("**", API_URI);
////			System.out.println("Adding Swagger resources with location : " + resourceName + location);
////		});
////		return resources;
////	}
////
////	private SwaggerResource swaggerResource(String name, String location) {
////		SwaggerResource swaggerResource = new SwaggerResource();
////		swaggerResource.setName(name);
////		swaggerResource.setLocation(location);
////		return swaggerResource;
////	}
//	
//	
//public static final String API_URI = "/v2/api-docs";
//    
//    private final RouteDefinitionLocator routeLocator;
//    
//    public DocumentationController(RouteDefinitionLocator routeLocator) {
//        this.routeLocator = routeLocator;
//    }
//    
//    @Override
//    public List<SwaggerResource> get() {
//        String gatewayPredicate = "/" + Constants.API_GATEWAY_PREDICATE;
//        List<SwaggerResource> resources = new ArrayList<>();
//        routeLocator.getRouteDefinitions().subscribe(routeDefinition -> {
//            
//            System.out.println("Discovered route definition: " +  routeDefinition.getId());
//            String resourceName = routeDefinition.getId();
//            String location = routeDefinition.getPredicates().get(0).getArgs().get("_genkey_0").replace("/**", API_URI);
//
//            if (location.contains(gatewayPredicate)) {
//                location = location.replace(gatewayPredicate, "");
//            }
//
//            System.out.println("Adding swagger resource: {} with location " +  resourceName + location);
//            resources.add(swaggerResource(resourceName, location));
//        });
//        
//        return resources;
//    }
//    
//    private SwaggerResource swaggerResource(String name, String location) {
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(name);
//        swaggerResource.setLocation(location);
//        swaggerResource.setSwaggerVersion("2.0");
//        return swaggerResource;    
//    }
//	
//	
//
////@Autowired
////private RouteLocator routeLocator;
////
////@Override
////public List<SwaggerResource> get() {
////    List<SwaggerResource> resources = new ArrayList<>();
////
////    routeLocator.getRoutes().forEach(route -> {
////        resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
////    });
////
////    return resources;
////}
////
////private SwaggerResource swaggerResource(final String name, final String location, final String version) {
////    SwaggerResource swaggerResource = new SwaggerResource();
////    swaggerResource.setName(name);
////    swaggerResource.setLocation(location);
////    swaggerResource.setSwaggerVersion(version);
////    return swaggerResource;
////}
//
//}
