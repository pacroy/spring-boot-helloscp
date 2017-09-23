package com.pacroy.helloscp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by pacroy on 9/23/17.
 */
@SpringBootApplication
public class HelloScpApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(HelloScpApplication.class);
    }

    public static void main(String ... args){
        SpringApplication.run(HelloScpApplication.class, args);
    }

}
