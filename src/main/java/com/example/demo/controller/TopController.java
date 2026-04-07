package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class TopController {

   @GetMapping("/")
   public List<String> top() {
       List<String> array = new ArrayList<>();
       array.add("これはトップページ");
       return array;
   }

   @GetMapping("comment")
   @ResponseBody
   public String comment() {
       return "これはコメントだよ";
   }
}
