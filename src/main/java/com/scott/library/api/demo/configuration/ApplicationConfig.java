package com.scott.library.api.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.modelmapper.ModelMapper;

@Configuration
public class ApplicationConfig {

   @Bean
   public ModelMapper modelmapper() {
        return new ModelMapper();
   }
}