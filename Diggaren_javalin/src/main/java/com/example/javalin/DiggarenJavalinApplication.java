package com.example.javalin;

import io.javalin.Javalin;

public class DiggarenJavalinApplication {
    public static void main(String[] args) {
        // Detta startar javalin-servern
        Javalin app = Javalin.create(config -> {
            config.plugins.enableCors(cors -> {
                cors.add(it -> it.anyHost());
            });
        }).start(5008); // Servern körs på denna porten (5008)

        app.get("/", ctx -> ctx.result("Välkommen till Diggaren"));

        // Här lägger vi till fler endpoints
    }
}
