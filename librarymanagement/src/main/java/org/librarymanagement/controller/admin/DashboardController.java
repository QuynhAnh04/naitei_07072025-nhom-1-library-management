package org.librarymanagement.controller.admin;

import org.librarymanagement.constant.ApiEndpoints;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(ApiEndpoints.ADMIN_DASHBOARD)
public class DashboardController {

    @GetMapping
    public String showDashboard() {
        return "admin/dashboard"; // Thymeleaf template
    }
}
