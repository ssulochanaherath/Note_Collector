package com.example.note_collector.config;

import jakarta.servlet.annotation.MultipartConfig;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.example.note_collector")
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
