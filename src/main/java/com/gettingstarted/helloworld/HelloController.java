package com.gettingstarted.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
        @RequestMapping("/")
        public String index(@RequestParam(name = "name", defaultValue = "WORLD") String name){
            return "HOLA " + name;
        }
}


