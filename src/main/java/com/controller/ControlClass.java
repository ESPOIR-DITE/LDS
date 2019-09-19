package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class ControlClass {

    //@Autowired
    //CashierController cashier;
    @GetMapping("/home")
    public String getPage()
    {
        System.out.println("i'm here");
        return "greeting.html";
    }
    @RequestMapping(value = "/cashier")
    public ArrayList getCashierServicer()
    {
        System.out.println("in cashier");
        //return cashier.getAll();
        return null;
    }

   //@GetMapping("/home")
   @ResponseBody
    public String getHome()
    {
        return "hello home";
    }
}
