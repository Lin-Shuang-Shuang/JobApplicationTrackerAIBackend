package com.jobtrackerai.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173") // allow Vite dev server
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // allow preflight and common methods
                .allowedHeaders("*") // allow all headers
                .allowCredentials(true); // only needed if you use cookies/auth

    }
}
