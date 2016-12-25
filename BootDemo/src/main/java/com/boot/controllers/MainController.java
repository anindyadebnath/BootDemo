package com.boot.controllers;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.injection.model.InterfaceInjectedModel;

@Controller
public class MainController {
	@Resource(name="my")
	private InterfaceInjectedModel model;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String getHello(){
		model.show();
		return "home";
	}

}
