package com.gettingstarted.helloworld;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
        @RequestMapping("/")
        public String index(@RequestParam(name = "name", defaultValue = "WORLD") String name){
            return "HOLA " + name;
        }
}


