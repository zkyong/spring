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
		userData.put("100", "��С��");
		userData.put("102", "�Ŷ���");
		userData.put("301", "���");
		userData.put("400", "���ɵ�");
		return new ModelAndView("UserSummary", "userData", userData);
	}
}