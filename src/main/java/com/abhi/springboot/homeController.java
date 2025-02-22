package com.abhi.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {
    @RequestMapping("index")
    public ModelAndView home(@RequestParam("name") String myName) {

        // System.out.println("hello " + name);
        // session.setAttribute("name", name);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("index");

        return mv; // This will map to /WEB-INF/views/index.jsp
    }
}
