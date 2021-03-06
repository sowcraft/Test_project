package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class configuration for saved images
 * and create controller for login
 *
 * @author Oleksandr_Ivaschenko
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    private static String uploadDirectory = System.getProperty("user.dir") + "/uploads";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file:///" + uploadDirectory + "/");
    }
}