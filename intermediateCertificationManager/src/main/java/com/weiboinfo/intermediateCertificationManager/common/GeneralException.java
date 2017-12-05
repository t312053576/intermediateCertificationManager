package com.weiboinfo.intermediateCertificationManager.common;

public class GeneralException extends RuntimeException {
	private int code;
	public GeneralException() {
		super();
	}
	
	public GeneralException(String message) {
		super(message);
	}
	
	public GeneralException(int code,String message) {
		super(message);
		this.setCode(code);
	}
	
	public GeneralException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public GeneralException(Throwable cause) {
		super(cause);
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


	private static final long serialVersionUID = 2174655670701233591L;
}
