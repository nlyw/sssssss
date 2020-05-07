package com.jy.controller.index;

import com.jy.pojo.user.User;
import com.jy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    String sayHello(User user) {
        userService.insert(user);
        return "index";
    }
}
