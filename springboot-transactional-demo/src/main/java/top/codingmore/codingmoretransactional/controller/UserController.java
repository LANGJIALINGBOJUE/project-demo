package top.codingmore.codingmoretransactional.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.codingmore.codingmoretransactional.entity.User;
import top.codingmore.codingmoretransactional.service.UserService;

import javax.annotation.Resource;


/**
 * @author 郎家岭伯爵
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users", userService.findAll());
        return "all";
    }

    @RequestMapping("/update")
    public String update(Model model) throws InterruptedException {
        User user = userService.findById(2);
        user.setName("郎家岭伯爵");
        userService.update(user);
        return "update";
    }
}
