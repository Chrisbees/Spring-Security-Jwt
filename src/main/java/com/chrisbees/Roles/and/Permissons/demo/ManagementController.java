package com.chrisbees.Roles.and.Permissons.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/vq1/management")
public class ManagementController {

    @GetMapping
    public String get() {
        return "GET:: Management controller";
    }

    @PostMapping
    public String post() {
        return "POST:: Management controller";
    }

    @PutMapping
    public String put() {
        return "PUT:: Management controller";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE:: Management controller";
    }
}
