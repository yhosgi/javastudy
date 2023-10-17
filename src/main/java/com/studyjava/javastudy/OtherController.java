package com.studyjava.javastudy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.studyjava.model.model;


@Controller
public class OtherController {
    @Autowired
    private DBConService DBConService;

    @GetMapping("/other-controller")
    public String showOtherPage(Model model) {
        List<model> resultList = DBConService.conDB();
        model.addAttribute("resultList", resultList);

        // try {
        //     List<model> resultList = DBConService.conDB();
        //     for (model a : resultList) {
        //     System.out.println("ID: " + a.getId() + ", Name: " + a.getName());
        //     }
        //     model.addAttribute("message", resultList.toString());

        // } catch (Exception e) {
            
        // }




        
        //model.addAttribute("message", "Hello from the controller!");
        
        return "other-page"; // 遷移先のテンプレート名を返す
    }
}