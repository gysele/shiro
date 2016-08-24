package org.wxm.core.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>标题: </b> 通用常量 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b> 吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b> 2016-3-26 下午12:59:51 <br/>
 * <b>修改记录: </b>
 */

public class CstCommon {

    /**
     * --------------------------------------------/ ---------------基本类型及类常量定义------------/ --------------------------------------------/
     */

    /**
     * "1"=【是】或【有效】
     */
    public static final String VAR_INTEGER_YES = "1";
    /**
     * "0"=【否】或【无效】
     */
    public static final String VAR_INTEGER_NO = "0";
    /**
     * 默认密码
     */
    public static final String PASSWORD_DEFAULT = "112233";
    /**
     * 用户类型 [1:超级管理员]
     */
    public static final String USER_TYPE_SYSADMIN = "1";
    /**
     * 用户类型 [2:普通管理员]
     */
    public static final String USER_TYPE_ADMIN = "2";
    /**
     * 用户类型 [3:普通用户]
     */
    public static final String USER_TYPE_USER = "3";

    /**
     * --------------------------------------------/ ---------------基本类型及类常量定义------------/ --------------------------------------------/
     */

    /**
     * 【是否】长整型转换成布尔型
     */
    public static final Map<String, Boolean> VAR_MAP_IB_YES_NO = new HashMap<String, Boolean>();

    /**
     * --------------------------------------------/ ----------------MAP类型常量赋值块-------------/ --------------------------------------------/
     */
    static {
        VAR_MAP_IB_YES_NO.put(VAR_INTEGER_YES, true);
        VAR_MAP_IB_YES_NO.put(VAR_INTEGER_NO, false);
    }
}
