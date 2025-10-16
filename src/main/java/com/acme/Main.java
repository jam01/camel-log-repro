package com.acme;

import org.apache.camel.builder.RouteBuilder;

public class Main extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1000")
                .setBody(header("foo"))
                .throwException(new IllegalStateException())
                .log("Hello World");
    }
}
