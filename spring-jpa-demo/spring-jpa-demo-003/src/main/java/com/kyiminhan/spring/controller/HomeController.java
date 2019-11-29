package com.kyiminhan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kyiminhan.spring.constant.ControllerConstant;
import com.kyiminhan.spring.constant.URLConstant;

/**
 * The Class HomeController.<BR>
 *
 * @author KYIMINHAN <BR>
 * @version 1.0 <BR>
 * @since Nov 28, 2019 <BR>
 * spring-jpa-demo-002 system <BR>
 * com.kyiminhan.spring.controller <BR>
 * HomeController.java <BR>
 */
@Controller
public class HomeController {

	/**
	 * Home.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping(value = { URLConstant.DEFAULT, URLConstant.HOME })
	public String home(final Model model) {
		return ControllerConstant.HOME;
	}
}