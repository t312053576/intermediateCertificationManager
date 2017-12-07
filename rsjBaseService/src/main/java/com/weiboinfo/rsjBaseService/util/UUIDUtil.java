/**
 * 
 * @title UUIDUtil.java
 * @package com.bjhit.erange.util
 * @copyright(c) 2009-2012 BJHIT.com All rights reserved.
 * @author xlaby
 * @date 2013-3-13 上午9:52:12
 * @version V1.0 
 */
package com.weiboinfo.rsjBaseService.util;

import java.util.UUID;

/**
 * UUID工具类
 * @author xlaby
 * @date 2015年03月05日
 * @version V1.0
 */
public class UUIDUtil {

    /**
     * 获取40位随机码
     * @return 40位随机码
     * @author xlaby
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 获取指定前缀的40位随机码
     * @param prefix 前缀
     * @return 指定前缀的40位随机码
     * @author xlaby
     */
    public static String getUUID(String prefix) {
        String uuid = getUUID();
        if (prefix == null || prefix.length() > uuid.length())
            return uuid;
        return prefix + uuid.substring(prefix.length());
    }
}
