package com.example.test_mix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController{

    @Autowired
    private MessageService messageService;


    @GetMapping("/echo")
    public void echo(String mid){
        System.out.println(messageService.getMessage());
        System.out.println("[***访问地址***]");
    }

    public String msg(){
        return (messageService.getMessage());
    }

}