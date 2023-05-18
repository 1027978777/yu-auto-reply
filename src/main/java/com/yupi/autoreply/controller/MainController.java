package com.yupi.autoreply.controller;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;


/**
 * 开放接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Controller
@Slf4j
public class MainController {
    @RequestMapping("/x")
    public String helloWorld(Model model) {
        //HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
        //objectObjectHashMap.put("username", "username");
        //model.addAttribute("answer", objectObjectHashMap);
        return "from";
    }

    @RequestMapping("/xx")
    public ModelAndView helloWorld2(@RequestParam("username") String username, ModelAndView mod) {
        System.out.println(username);
        //String answer = new OpenAiAnswerer().doAnswer(username);
        //HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
        String answer = username;
        HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put("username", answer);
        mod.addObject("answer", objectObjectHashMap);
        mod.setViewName("from");
        return mod;
    }

    @RequestMapping("/hello")
    public String helloWorld1(Model model) {
        //HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
        //objectObjectHashMap.put("username", "username");
        //model.addAttribute("answer", objectObjectHashMap);
        return "Hello";
    }
}
