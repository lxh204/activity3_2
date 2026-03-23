package com.example.activity3_2.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Thymeleaf 测试 Controller
 * 用于演示 Thymeleaf 模板引擎的基本用法
 * 支持 Model 和 Session 数据传递
 */
@Controller
public class ThymeleafTestController {

    /**
     * 返回 Thymeleaf 视图的测试方法
     * 该方法演示如何向 Model 和 Session 中添加数据，并返回 Thymeleaf 视图
     *
     * @param model   Spring MVC 的 Model 对象，用于向视图传递数据
     *                数据仅在当前请求中有效，请求结束后自动清除
     * @param session HttpSession 对象，用于在会话范围内存储数据
     *                数据在整个用户会话期间有效，直到会话结束或手动移除
     * @return 返回 Thymeleaf 视图名称 "thym-test"
     *         Spring Boot 会自动解析为 templates/thym-test.html
     */
    @GetMapping("/thym-test")
    public String thymeleafTest(Model model, HttpSession session) {
        // 向 Model 中添加数据，用于在当前视图中显示
        model.addAttribute("title", "Thymeleaf 测试页面");
        model.addAttribute("message", "欢迎使用 Thymeleaf 模板引擎！");
        model.addAttribute("currentTime", System.currentTimeMillis());

        // 向 Session 中添加数据，用于在多个请求之间共享
        session.setAttribute("userSession", "测试用户");
        session.setAttribute("loginTime", System.currentTimeMillis());

        // 返回 Thymeleaf 视图名称
        return "thym-test";
    }
}
