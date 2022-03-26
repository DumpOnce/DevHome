package com.jproject.app.onfiguration;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

import org.springframework.util.ResourceUtils;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@Configuration
/*@EnableWebMvc*/
public class Config implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/logout").setViewName("logout");
    }
}
