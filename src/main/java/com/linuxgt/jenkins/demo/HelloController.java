package com.linuxgt.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuteng on 2018/11/9
 */
@RestController
public class HelloController {

    @GetMapping("/who")
    public String who() {
        return "I'm jenkins demo";
    }
}
