package dev.ikhtiyor.springbootmultilang.controller;

import dev.ikhtiyor.springbootmultilang.config.MessageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    final
    MessageConfig messageConfig;

    @Autowired
    public Controller(MessageConfig messageConfig) {
        this.messageConfig = messageConfig;
    }

    @GetMapping
    public String sayHello() {
        return messageConfig.getMessageByLanguage("say.hello");
    }
}
