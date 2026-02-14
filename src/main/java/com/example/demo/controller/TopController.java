package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TopController {

   @GetMapping
   public String top() {
       return "index";
   }

   @GetMapping("comment")
   @ResponseBody
   public String comment() {
       return "これはコメントだよ";
   }
}
