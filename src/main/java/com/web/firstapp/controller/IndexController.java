package com.web.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //using HttpServletRequest
    /*@RequestMapping("/result")
    public String result(HttpServletRequest httpServletRequest){
        System.out.println("Data is "+ httpServletRequest.getParameter("data"));
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("data",httpServletRequest.getParameter("data"));
        return "result";
    }*/

    //Using HttpSession
    /*@RequestMapping("/result")
    public String result(String data,HttpSession session){
        session.setAttribute("data",data);
        return "result";
    }*/

    //Using @RequestParam
    /*@RequestMapping("/result")
    public String result(@RequestParam("val") String data, HttpSession session) {
        session.setAttribute("data", data);
        return "result";
    }*/

    // by using Model
    /*@RequestMapping("/result")
    public String result(@RequestParam("val") String data, Model model) {
        model.addAttribute("data", data);
        return "result";
    }*/

    //using ModelAndView
    @RequestMapping("/result")
    public ModelAndView result(@RequestParam("val") String data) {
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("data",data);
        return modelAndView;
    }

}
