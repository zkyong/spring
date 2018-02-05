package com.yiibai.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ExcelController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// user data
		Map<String, String> userData = new HashMap<String, String>();
		userData.put("100", "刘小花");
		userData.put("102", "张二狗");
		userData.put("301", "李大海");
		userData.put("400", "王飞蛋");
		return new ModelAndView("UserSummary", "userData", userData);
	}
}