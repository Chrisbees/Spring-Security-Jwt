package com.chrisbees.Roles.and.Permissons.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/vq1/admin")
public class AdminController {

    @GetMapping
    public String get() {
        return "GET:: admin controller";
    }

    @PostMapping
    public String post() {
        return "POST:: admin controller";
    }

    @PutMapping
    public String put() {
        return "PUT:: admin controller";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE:: admin controller";
    }
}
