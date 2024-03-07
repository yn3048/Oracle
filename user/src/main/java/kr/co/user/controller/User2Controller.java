package kr.co.user.controller;

import kr.co.user.dto.User2DTO;
import kr.co.user.service.User2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class User2Controller {

    private final User2Service service;


    public User2Controller(User2Service service) {
        this.service = service;
    }

    @GetMapping("/user2/list")
    public String list(Model model) {
        List<User2DTO> users = service.selectUser2s();
        model.addAttribute("users", users);
        return "/user2/list";
    }

    @GetMapping("/user2/register")
    public String register(){
        return "/user2/register";
    }

    @PostMapping("/user2/register")
    public String register(User2DTO user2DTO){
        System.out.println(user2DTO);

        service.insertUser2(user2DTO);
        return "redirect:/user2/list";
    }

    @GetMapping("/user2/modify")
    public String modify(@RequestParam("id") String id, Model model) {
        System.out.println("id : " + id);

        User2DTO user2DTO = service.selectUser2(id);
        model.addAttribute(user2DTO);

        return "/user2/modify";
    }

    @PostMapping("/user2/modify")
    public String modify(User2DTO user2DTO) {
        System.out.println(user2DTO);

        service.updateUser2(user2DTO);
        return "redirect:/user2/list";
    }

    @GetMapping("/user2/delete")
    public String delete(@RequestParam("id") String id) {
        System.out.println("id : " + id);

        service.deleteUser2(id);
        return  "redirect:/user2/list";
    }


}














