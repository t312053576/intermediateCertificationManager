/**
 * 
 * @title ListUtil.java
 * @package com.bjhit.erange.util
 * @copyright(c) 2009-2012 BJHIT.com All rights reserved.
 * @author xlaby
 * @date 2013-4-15 下午2:13:09
 * @version V1.0 
 */
package com.weiboinfo.rsjBaseService.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 数组List工具类
 * @author xlaby
 * @date 2015年03月05日
 * @version V1.0
 */
public class ListUtil {
    /**
     * 判断集合是否为空
     * @param list 集合
     * @return 验证结果
     * @author xlaby
     */
    public static boolean isNullOrEmpty(List<?> list) {
        boolean flag = false;
        if (list == null || list.size() == 0) {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断集合不为空
     * @param list
     * @return
     * @author xlaby
     * @version V2.0
     */
    public static boolean notNOE(List<?> list) {
        return !isNullOrEmpty(list);
    }

    /**
     * 对list进行分页
     * @param list 集合
     * @param curPage 当前页
     * @param pageSize 页大小
     * @return
     * @author xlaby
     * @version V2.0
     */
    public static <T> List<T> paged(List<T> list, int curPage, int pageSize) {
    	List<T> newList = new ArrayList<T>();
    	int firstIdx = ((curPage - 1) * pageSize);
        int lastIdx = firstIdx + pageSize;
        if(firstIdx < list.size()){
        	if(lastIdx < list.size()){
        		newList = list.subList(firstIdx, lastIdx);
        	}else{
        		newList = list.subList(firstIdx, list.size());
        	}
        }
    	return newList;
    }

    /**
     * 根据属性名和属性值，在集合中获取符合条件的第一个对象
     * @param propertyName 属性名称
     * @param propertyValue 属性值
     * @param list 集合
     * @return
     * @author xlaby
     */
    public static <T> T getObject(String propertyName, Object propertyValue, List<T> list) {
        for (T t : list) {
            try {
                Method method = t.getClass().getDeclaredMethod("get" + StringUtil.initialToUpper(propertyName));
                if (method.invoke(t).equals(propertyValue)) {
                    return t;
                }
            }
            catch (Exception e) {
//                LOG.debug(Constants.DEBUG_MESSAGE, e);
            }
        }
        return null;
    }

    /**
     * 查询Map中List为指定值的关键字
     * @param map 键/值对集合
     * @param value 指定值
     * @return
     * @author xlaby
     */
    public static String getKeyContainsValue(Map<String, List<String>> map, String value) {
        String obj = null;
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            for (String item : list) {
                if (item.equals(value)) {
                    obj = key;
                    break;
                }
            }
            if (obj != null) {
                break;
            }
        }
        return obj;
    }

    /**
     * 拷贝集合
     * @param list
     * @return
     * @author xlaby
     * @version V2.0
     */
    public static <T> List<T> copy(List<T> list){
        List<T> copy = new ArrayList<T>();
        for(int i=0;i<list.size(); i++){
            copy.add(list.get(i));
        }
        return copy;
    }
}
