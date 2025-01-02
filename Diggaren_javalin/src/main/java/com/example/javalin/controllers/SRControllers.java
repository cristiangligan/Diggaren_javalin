package com.example.javalin.controllers;

import io.javalin.http.Handler;
import com.example.javalin.services.SRService;

public class SRController {

    private SRService srService;

    // Konstruktor för att injicera SRService
    public SRController(SRService srService) {
        this.srService = srService;
    }


    // Endpoint för att hämta data från P3
    public Handler getP3Data = ctx -> {
        String p3Data = srService.fetchP3Data(); // Hämtar data från service-klassen
        ctx.result(p3Data);
    };
}
