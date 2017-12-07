package com.weiboinfo.rsjBaseService.common;

public enum ErrorCode {
	@Error(msg = "成功")
	SUCCESS(1),
	
	@Error(msg = "失败")
	FAILURE(0),

	/********************** 公共错误码定义开始 范围[-1001 - -1999] *****************************/

	@Error(msg = "用户名不存在或密码错误")
	COM_USERPASSWDERROR(-1001),

	@Error(msg = "登录超时")
	COM_SESSIONERROR(-1002),

	@Error(msg = "记录不存在")
	COM_NORECORDINDB(-1003),

	@Error(msg = "操作数据库异常")
	COM_DBOPTERROR(-1004),

	@Error(msg = "接口不存在")
	COM_APIERROR(-1005),

	@Error(msg = "接口未授权")
	COM_APINOAUTHORITY(-1006),

	@Error(msg = "输入参数为空值")
	COM_PARAISNULL(-1007),

	@Error(msg = "记录保存异常")
	COM_DBSAVEERROR(-1008),

	@Error(msg = "记录更新异常")
	COM_DBUPDATEERROR(-1009),

	@Error(msg = "记录查找异常")
	COM_DBSEARCHERROR(-1011),

	@Error(msg = "记录删除异常")
	COM_DBDELETEERROR(-1012),

	@Error(msg = "输入参数有误")
	COM_PARAISERROR(-1013),
	
	@Error(msg = "两次输入密码不相同")
	COM_PWDISNOTSAME(-1014),
	
		
	/********************** 公共错误码定义结束 ***********************************************/
	
	/********************** 系统管理错误码定义开始 范围[-2001 - -2999] *****************************/
	
	@Error(msg = "保存角色失败")
	SYS_SAVEROLEERROR(-2001),
	
	@Error(msg = "用户名已存在")
	SYS_USERSNAMEALREADYEXIST(-2002),
	
	@Error(msg = "角色不存在")
	SYS_ROLENOTEXIST(-2003),
	
	@Error(msg = "状态不存在")
	SYS_STATUSNOTEXIST(-2004),

	@Error(msg = "该用户不存在")
	SYS_USERNOTEXIST(-2005),
	
	@Error(msg = "单位不存在")
	SYS_ORGNIZATIONNOTEXIST(-2006),
	
	@Error(msg = "logo地址错误")
	SYS_LOGOPATHERROR(-2007),
	
	@Error(msg = "单位名已存在")
	SYS_ORGNAMEEXIST(-2008),
	
	@Error(msg = "工程名已存在")
	SYS_PROJNAMEEXIST(-2009),
	
	@Error(msg = "工程名已存在")
	SYS_OSPROJNAMEEXIST(-2010),
	
	@Error(msg = "集群资源已经存在")
    COM_EXISTCLUSTER(-2011),
	
	@Error(msg = "指定协议的端口号不存在")
	PROTOCOL_PORT_NOTEXIST(-2012),
	
	@Error(msg = "获取仓库虚拟机连接信息失败")
	GET_CONNECTINFODTO_FAIL(-2013),
	
	@Error(msg = "获取session失败,无法连接到虚拟机")
	GET_JSCHSESSION_FAIL(-2014),
	
	@Error(msg = "上传文件到仓库虚拟机失败")
	UP_TO_WAREHOUSE_FAIL(-2015),
	
	@Error(msg = "文件不存在")
	FILE_NOTEXIST(-2016),
	
	@Error(msg = "没有需要上传到仓库虚拟机的文件")
	NONEED_UPLOAD(-2017),
	
	@Error(msg = "无法查询到software和file的对应关系")
	R_SOFTWARE_FILE_MISTAKE(-2018),
	
	@Error(msg = "虚拟机通过SSH执行命令失败")
	SSH_EXCUTE_COMMAND_FAIL(-2019),
	
	@Error(msg = "没有需要部署的软件")
	NONEED_DEPLOY(-2020),
	
	@Error(msg = "该工程无法部署软件")
	CANT_DEPLOYSOFTWARE(-2021);

	/********************** 系统管理错误码定义结束 ***********************************************/

	// 成员变量
	private int code;

	// 构造方法
	private ErrorCode(int code) {
		this.code = code;
	}
	// 返回错误码
	public int getCode() {
		return code;
	}

	// 返回错误名称
	public String getName() {
		return this.name();
	}

	// 返回错误信息
	public String getMessage() {
		Error error = null;
		try {
			error = this.getClass().getField(this.getName())
					.getAnnotation(Error.class);
		} catch (Exception e) {
			return null;
		}
		return error.msg();
	}
	
	public static ErrorCode getECbyCode(int code){
		for(ErrorCode ec:ErrorCode.values()){
			if(code==ec.getCode())
				return ec;
		}
		return null;
		
	}
}
