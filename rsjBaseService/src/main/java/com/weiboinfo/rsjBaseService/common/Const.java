package com.weiboinfo.rsjBaseService.common;

/**
 * 常量类；后续增加常量需要按类型枚举
 * 
 * @author ulnit
 * @date 2016年03月05日
 * @version V1.0
 */
public class Const {

	/**
	 * 统一的异常打印信息
	 */
	public static final String DEBUG_MESSAGE = "====报异常了====";

	/**
	 * 通用常量值 ： 可表示： 成功、是、等
	 */
	public static final String COMM_TYPE_YES_STR = "1";
	public static final Integer COMM_TYPE_YES_INT = 1;
	/**
	 * 通用常量值 ： 可表示： 失败、否、等
	 */
	public static final String COMM_TYPE_NO_STR = "0";
	public static final Integer COMM_TYPE_NO_INT = 0;
	/**
	 * Windows操作系统文件路径分隔符
	 */
	public static final String SEPARATOR_WINDOW = "\\";

	/**
	 * Linux/Unix操作系统文件路径分隔符
	 */
	public static final String SEPARATOR_LINUX = "/";

	/**
	 * 通用分页的PageSize
	 */
	public static final int GENERAL_PAGESIZE = 10;

	/**
	 * 系统并发部署线程最大数
	 */
	public static final Integer MAXTHREADQUANTiTY = 10;

	/**
	 * 邮件发送类型常量
	 */
	public class SendMailType {
		/**
		 * 邮件发送类型常量 -- 系统 （cm_maillog.SendType）
		 */
		public static final String TYPE_SENDMAIL_SYS = "system";

		/**
		 * 邮件发送类型常量 -- 手工 （cm_maillog.SendType）
		 */
		public static final String TYPE_SENDMAIL_HAND = "handwork";

		/**
		 * 邮件类型常量 -- 广告邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_AD = "ad";

		/**
		 * 邮件类型常量 -- 激活邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_ACTIVATE = "activate";

		/**
		 * 邮件类型常量 -- 通知邮件 （cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_NOTICE = "notice";

		/**
		 * 邮件类型常量 -- 系统消息邮件（cm_maillog.MailType）
		 */
		public static final String TYPE_MAIL_SYSMESSAGES = "SYSmessages";
	}

	public class GlobalFileVariables {

		/**
		 * 上传文件基础路径
		 */
		public static final String PATH_FILEBASE = "fileUploadBasePath";

		/**
		 * 上传文件临时目录
		 */
		public static final String PATH_TEMP = "fileUploadTempFolder";

		/**
		 * 图片-用户头像存放目录
		 */
		public static final String PATH_AVATARS = "picAvatarFolder";

		/**
		 * 图片-单位Logo存放目录
		 */
		public static final String PATH_ORGLOGO = "picOrgLogoFolder";

		/**
		 * 图片-菜单图标存放目录
		 */
		public static final String PATH_MENUICON = "picMenuIconFolder";

		/**
		 * 图片-通用图片存放目录
		 */
		public static final String PATH_IMAGESCM = "picCommonFolder";

		/**
		 * 内容发布-内容发布图片存放目录
		 */
		public static final String PATH_CMSIMAGE = "cmsImageFolder";

		/**
		 * 内容发布-内容其他文件存放目录
		 */
		public static final String PATH_CMSFILES = "cmsFilesFolder";

		/**
		 * 安装包-软件资源存放目录
		 */
		public static final String PATH_SOFTWARES = "softwaresFolder";

		/**
		 * 镜像-镜像资源存放目录
		 */
		public static final String PATH_IMGS = "imgsFolder";

		/**
		 * 视频-视频存放目录
		 */
		public static final String PATH_VIDEOS = "videosFolder";

		/**
		 * 音频-音频存放目录
		 */
		public static final String PATH_AUDIOS = "audiosFolder";

		/**
		 * 文档-文档存放目录
		 */
		public static final String PATH_DOCS = "docsFolder";

		/**
		 * （上传）通用目录 -- 图片
		 */
		public static final String PATH_CM_IMAGES = "imagesCmFolder";

		/**
		 * （上传）通用目录 -- CMS
		 */
		public static final String PATH_CM_CMS = "cmsCmFolder";

		/**
		 * （上传）通用目录 -- 其他
		 */
		public static final String PATH_CM_OTHER = "othersCmFolder";

	}

	/**
	 * （上传）目录类型
	 */
	public class DirType {
		/**
		 * （上传）目录 -- 图片
		 */
		public static final String DIR_IMAGES = "imagesDir";

		/**
		 * （上传）目录 -- CMS
		 */
		public static final String DIR_CMS = "cmsDir";

		/**
		 * （上传）目录 -- 其他
		 */
		public static final String DIR_OTHER = "othersDir";
	}

	/**
	 * （上传）文件类型常量
	 */
	public class CmFileType {
		/**
		 * （上传）文件类型常量 -- 用户头像
		 */
		public static final String TYPE_AVATARS = "avatars";

		/**
		 * （上传）文件类型常量 -- 普通图片
		 */
		public static final String TYPE_CMIMAGES = "images";

		/**
		 * （上传）文件类型常量 -- 内容发布图片
		 */
		public static final String TYPE_CMSCNTIMAGES = "cmscntimages";

		/**
		 * （上传）文件类型常量 -- 单位Logo
		 */
		public static final String TYPE_ORGLOGO = "orglogo";

		/**
		 * （上传）文件类型常量 -- 菜单图标
		 */
		public static final String TYPE_MENUICON = "menuicon";

		/**
		 * （上传）文件类型常量 -- 安装软件包
		 */
		public static final String TYPE_SOFTWARES = "softwares";

		/**
		 * （上传）文件类型常量 -- 镜像
		 */
		public static final String TYPE_IMGS = "imgs";

		/**
		 * （上传）文件类型常量 -- 视频
		 */
		public static final String TYPE_VIDEOS = "videos";

		/**
		 * （上传）文件类型常量 -- 音频
		 */
		public static final String TYPE_AUDIOS = "audios";

		/**
		 * （上传）文件类型常量 -- 个人资料word
		 */
		public static final String TYPE_DOCS = "docs";

		/**
		 * （上传）文件类型常量 -- 其他类型文件
		 */
		public static final String TYPE_OTHER = "other";
		
		/**
		 * （上传）文件类型常量 -- 调查表
		 */
		public static final String TYPE_QUESTIONAIRE = "questionaire";

	}

	/**
	 * 访问请求路径片段，用于区别权限的请求{@Path("super")}
	 */
	public class rolePath {
		/**
		 * 超级管理员特有的权限路径片段
		 */
		public static final String ROLE_ADMIN = "super";
		/**
		 * 普通用户特有的权限路径片段（除开管理员）
		 */
		public static final String ROLE_COMM = "comm";

	}

	/**
	 * 用于配置security的访问控制权限{hasRole('ROLE_SUPER')}
	 */
	public class roleAuthenticate {
		/**
		 * 超级管理员的角色定义
		 */
		public static final String ROLE_SUPER_Authenticate = "ROLE_SUPER";
		/**
		 * 普通用户的角色定义
		 */
		public static final String ROLE_COMM_Authenticate = "ROLE_COMM";
	}

	/**
	 * 日志类型
	 * 
	 * @author feng_wei
	 * @date 2016年1月13日
	 */
	public class LogTypeConfig {
		/* 用户日志 */
		public static final String LOG_USER = "USER";
		/* 系统日志 */
		public static final String LOG_SYSTEM = "SYSTEM";
	}

	/**
	 * 日志操作资源类型
	 * 
	 * @author feng_wei
	 * @date 2016年1月13日
	 */
	public class LogSrcTypeConfig {
		/* 菜单 */
		public static final String LOG_SRC_MENU = "MENU";
		/* 表 */
		public static final String LOG_SRC_DBTABLE = "DBTABLE";
		/* API */
		public static final String LOG_SRC_API = "API";
	}

	/**
	 * 日志结果类型
	 * 
	 * @author li_jya
	 * @date 2016年4月11日
	 */
	public class LogStatType {
		/* 成功 */
		public static final String SUCCESS = "success";
		/* 失败 */
		public static final String FAILURE = "failure";
	}
	
}
