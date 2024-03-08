package kr.co.user.controller;


import kr.co.user.dto.User6DTO;
import kr.co.user.service.User6Service;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class User6Controller {
    private final User6Service service;

    public User6Controller(User6Service service) {
        this.service = service;
    }

    @GetMapping("/user6/list")
    public String list(Model model) {
        List<User6DTO> users = service.selectUser6s();
        model.addAttribute("users", users);
        return "/user6/list";
    }

    @GetMapping("/user6/register")
    public String register(){
        return "/user6/register";
    }

    @PostMapping("/user6/register")
    public String register(User6DTO user6DTO){
        System.out.println(user6DTO);

        service.insertUser6(user6DTO);
        return "redirect:/user6/list";
    }

    @GetMapping("/user6/modify")
    public String modify(@RequestParam("seq") int seq, Model model){
        System.out.println("seq : " + seq);

        User6DTO user6DTO = service.selectUser6(seq);
        model.addAttribute(user6DTO);

        return "/user6/modify";
    }

    @PostMapping("/user6/modify")
    public String modify(User6DTO user6DTO){
        System.out.println(user6DTO);

        service.updateUser6(user6DTO);
        return "redirect:/user6/list";
    }

    @GetMapping("/user6/delete")
    public String delete(@RequestParam("seq") int seq) {
        System.out.println("seq : " + seq);

        service.deleteUser6(seq);
        return "redirect:/user6/list";
    }
}

















