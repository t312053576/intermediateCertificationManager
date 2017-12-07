package com.weiboinfo.rsjBaseService.dto;

import java.util.HashMap;

import com.weiboinfo.rsjBaseService.common.ErrorCode;


public class UnifyInfo {
	private int code;
	private String message;
	private String prompt;
	private String path;
	private HashMap<String, ?> attribute;

	public UnifyInfo() {
		this.code = ErrorCode.SUCCESS.getCode();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public HashMap<String, ?> getAttribute() {
		return attribute;
	}

	public void setAttribute(HashMap<String, ?> attribute) {
		this.attribute = attribute;
	}

}
