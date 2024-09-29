package com.example.note_collector.config;

import jakarta.servlet.annotation.MultipartConfig;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@MultipartConfig
public class WebAppConfig {
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
