package com.jiayifu.crowd.mvc.handler;

import com.jiayifu.crowd.entity.Admin;
import com.jiayifu.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String testSSM(ModelMap modelMap){

        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);

        return "target";
    }
}
