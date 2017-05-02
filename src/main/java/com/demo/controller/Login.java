package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {

	@RequestMapping("/login")
	public ModelAndView login(String name, String password) {

		ModelAndView mv = new ModelAndView("login");
		// 密码验证省略
		if ("root".equals(name) && "root".equals(password)) {
			mv.setViewName("redirect:/index");
		}
		return mv;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/creatSession")
	@ResponseBody
	public Map<String, String> creatSession(HttpSession session) {
		session.setAttribute("loginName", "root");

		Map<String, String> rst = new HashMap<>();
		rst.put("result", "ok");
		System.out.println("=====Login===Controller===========creatSession=========");
		return rst;
	}

	@RequestMapping("/getSession")
	@ResponseBody
	public Map<String, String> getSession(HttpSession session) {
		Object loginName = session.getAttribute("loginName");

		Map<String, String> rst = new HashMap<>();
		rst.put("loginName", loginName.toString());
		return rst;
	}

	@RequestMapping("/clearSession")
	@ResponseBody
	public Map<String, String> clearSession(HttpSession session) {
		session.invalidate();

		Map<String, String> rst = new HashMap<>();
		rst.put("result", "ok");
		return rst;
	}

}
