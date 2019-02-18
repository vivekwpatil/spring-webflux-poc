package com.java.engineering.springwebfluxpoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class HelloWorldRouter {

    @Bean
    public RouterFunction<ServerResponse> hello(HelloWorldHandler helloWorldHandler) {
        return RouterFunctions.route(GET("/hello").and(accept(MediaType.TEXT_PLAIN)), helloWorldHandler::hello);
    }

    @Bean
    public RouterFunction<ServerResponse> hello2(HelloWorldHandler helloWorldHandler) {
        return RouterFunctions.route(RequestPredicates.path("/hello/{id}"),
            helloWorldHandler::hello1);
    }

}
