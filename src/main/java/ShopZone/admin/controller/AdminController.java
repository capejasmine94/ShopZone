package ShopZone.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/")
    public String adminLogin() {
        return "adminLogin";
    }

    @GetMapping("/adminRegister")
    public String adminRegister() {
        return "adminRegister";
    }

}
