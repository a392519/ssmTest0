package com.mhys.controller;

import com.mhys.model.User;
import com.mhys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(User user){
        ModelAndView mv=new ModelAndView("./index.jsp");
        List<User> list= userService.findAll(user);
        mv.addObject("list",list);
        return mv;
    }
    @RequestMapping("/add")
    public ModelAndView add(User user){
        ModelAndView mv=new ModelAndView("./add.jsp");
        int count=userService.add(user);
        if(count>0) {
             mv.setViewName("./findAll");
            return mv;
        }
        return mv;
    }
    @RequestMapping("/findById")
    public ModelAndView findById( User user){
        ModelAndView mv=new ModelAndView("./add.jsp");
        User user1=userService.findById(user);

        if(user1.getId()!=0){
            System.out.println(user1.getUsername()+"....");
            mv.addObject("user",user1);
            return mv;
        }
        else {
            mv.setViewName("./index.jsp");
            return mv;
        }
    }
    @RequestMapping("/addOrUpdate")
    public ModelAndView addOrUpdate(@RequestParam("sid") String id,User user){


        if(id!=null && !id.equals("")){//修改
            user.setId(Integer.parseInt(id));
            int count=userService.updateById(user);
            return  new ModelAndView("./findAll");
        }else{//新增
            int count=userService.add(user);
            return new ModelAndView("./findAll");
        }
    }
    @RequestMapping("/test")
    public String test(){
        return "add.jsp";
    }
}
