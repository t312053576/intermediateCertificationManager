package com.weiboinfo.intermediateCertificationManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/certification")
public class CertificateInfoController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello";
	}
}