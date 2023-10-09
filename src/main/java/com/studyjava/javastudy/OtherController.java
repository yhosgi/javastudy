package com.studyjava.javastudy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class OtherController {

    @GetMapping("/other-controller")
    public String showOtherPage(Model model) {
        model.addAttribute("message", "Hello from the controller!");

        return "other-page"; // 遷移先のテンプレート名を返す
    }
}