package com.example.template.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(TemplateController.REQUEST_MAPPING)
@AllArgsConstructor
public class TemplateController {
    static final String REQUEST_MAPPING = "/template";


    @GetMapping()
    public String getStaticString() {
        return "THIS SERVICE WORKS FINE";
    }
}
