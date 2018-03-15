package com.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.models.CommonResponse;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = {"/"},method = RequestMethod.GET )
	public CommonResponse indexMethod(){
		CommonResponse commonResponse = new CommonResponse();
		commonResponse.setResult("SUCCESS");
		return commonResponse;
	}
	
	/*@RequestMapping(value = {"/test1"},method = RequestMethod.GET )
	public ModelAndView viewCheck(){
		ModelAndView model = new ModelAndView();
		model.setViewName("NewFile");
		return model;
	}*/

}
