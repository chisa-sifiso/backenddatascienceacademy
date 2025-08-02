package com.datascienceacademy.backenddatascienceacademy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")// Apply to all endpoints
                .allowedOrigins("http://localhost:3000","http://localhost:3001,http://localhost:8082,http://localhost:8081","https://main.d1950hs9opzptx.amplifyapp.com") // Your React app origin
                .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH")
                .allowedHeaders("*");
    }
}
