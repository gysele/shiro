package org.wxm.core.util;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>标题: </b>字符串工具类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-9-17 下午9:21:47 <br/>
 * <b>修改记录: </b>
 */
public class StringUtils extends org.apache.commons.lang.StringUtils {
    /**
     * 
     * <b>标题: </b>字符串转换成长整型 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-9-17 下午9:22:08 <br/>
     * <b>修改记录: </b>
     * 
     * @param s
     * @return
     */
    public static Long stringToLong(String s) {
        Long l = new Long(0);
        if (s == null || "".equals(s))
            l = new Long(0);
        else
            try {
                l = new Long(s.trim());
            } catch (Exception _ex) {
            }
        return l;
    }

    /**
     * 
     * <b>标题: </b>字符串转换成长整型列表 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>吴晓敏 398600198@qq.com <br/>
     * <b>时间: </b>2015-10-8 下午4:08:29 <br/>
     * <b>修改记录: </b>
     * 
     * @param toSplit
     * @param regex
     * @return
     */
    public static List<Long> stringToLongList(String toSplit, String regex) {
        List<Long> longList = new ArrayList<Long>();
        String[] strings = toSplit.split(regex);
        for (String string : strings) {
            longList.add(StringUtils.stringToLong(string));
        }
        return longList;
    }
}
