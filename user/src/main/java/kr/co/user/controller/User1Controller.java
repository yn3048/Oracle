package kr.co.user.controller;

import kr.co.user.dto.User1DTO;
import kr.co.user.service.User1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class User1Controller {

    private final User1Service service;

    public User1Controller(User1Service service) {
        this.service = service;
    }

    @GetMapping("/user1/list")
    public String list(Model model){
        List<User1DTO> users = service.selectUser1s();
        model.addAttribute("users", users);
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO user1DTO) {
        System.out.println(user1DTO);

        service.insertUser1(user1DTO);
        return "redirect:/user1/list";
    }


    @GetMapping("/user1/modify")
    public String modify(@RequestParam("id") String id, Model model){
        System.out.println("id : " + id);

        User1DTO user1DTO = service.selectUser1(id);
        model.addAttribute(user1DTO);

        return "/user1/modify";
    }

    @PostMapping("/user1/modify")
    public String modify(User1DTO user1DTO) {
        System.out.println(user1DTO);

        service.updateUser1(user1DTO);
        return "redirect:/user1/list";
    }

    @GetMapping("/user1/delete")
    public String delete(@RequestParam("id") String id) {
        System.out.println("id : " + id);

        service.deleteUser1(id);
        return "redirect:/user1/list";
    }

}

























