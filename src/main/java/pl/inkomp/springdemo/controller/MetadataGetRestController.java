package pl.inkomp.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetadataGetRestController {

    @RequestMapping("/")
    public String getMetadata() {
        return "Dummy metadata";
    }

}
