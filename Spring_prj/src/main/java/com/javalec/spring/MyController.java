package com.javalec.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	
	@RequestMapping(method=RequestMethod.POST, value="/input")
	public String login(HttpServletRequest httpservletrequest, Model model)
	{
		return "addAddress";
	}

	@RequestMapping(method=RequestMethod.POST, value="/info")
	public String addAddress(HttpServletRequest httpservletrequest, Model model)
	{
		String region = httpservletrequest.getParameter("region");
		String name = httpservletrequest.getParameter("name");
		String address1 = httpservletrequest.getParameter("address1");
		String address2 = httpservletrequest.getParameter("address2");
		String city = httpservletrequest.getParameter("city");
		String state = httpservletrequest.getParameter("state");
		String zip = httpservletrequest.getParameter("zip");
		String phnumber = httpservletrequest.getParameter("phnumber");

		model.addAttribute("customerRegion", region);
		model.addAttribute("customerName", name);
		model.addAttribute("customeraddress1", address1);
		model.addAttribute("customeraddress2", address2);
		model.addAttribute("customerCity", city);
		model.addAttribute("customerState", state);
		model.addAttribute("customerZip", zip);
		model.addAttribute("customerPhoneNumber", phnumber);
		
		return "addressDisplay";
	}
	
}
