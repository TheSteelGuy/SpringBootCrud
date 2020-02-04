package com.example.springjpacrud.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.CorsUtils;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//
//
//    public ResourceServerConfig() {
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .requestMatchers(CorsUtils::isCorsRequest).permitAll()
//                .antMatchers("/**").permitAll()
//                .and()
//                .cors()
//                .configurationSource(corsConfig());
//    }
//
//
//    @Bean
//    CorsConfigurationSource corsConfig() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration corsConfig = new CorsConfiguration();
//        corsConfig.applyPermitDefaultValues();
//        corsConfig.addAllowedHeader("Access-Control-Allow-Origin");
//        corsConfig.addExposedHeader("Access-Control-Allow-Origin");
//        corsConfig.addAllowedMethod(HttpMethod.GET);
//        corsConfig.addAllowedMethod(HttpMethod.POST);
//        corsConfig.addAllowedMethod(HttpMethod.PUT);
//        corsConfig.addAllowedMethod(HttpMethod.OPTIONS);
//        corsConfig.addAllowedMethod(HttpMethod.DELETE);
//        corsConfig.addAllowedMethod(HttpMethod.HEAD);
//        corsConfig.addAllowedOrigin("*");
//        source.registerCorsConfiguration("/**", corsConfig);
//        return source;
//    }
//}
