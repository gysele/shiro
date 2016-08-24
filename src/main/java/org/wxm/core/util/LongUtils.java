package org.wxm.core.util;

/**
 * <b>标题: </b> <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 398600198@qq.com <br/>
 * <b>时间: </b>2015-9-30 下午5:36:24 <br/>
 * <b>修改记录: </b>
 */
public class LongUtils {
    /**
     * 
     * <b>标题: </b>是否不为空 <br/>
     * <b>描述: </b>长整型变量不为空，且值大于0 <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>吴晓敏 398600198@qq.com <br/>
     * <b>时间: </b>2015-9-30 下午5:37:41 <br/>
     * <b>修改记录: </b>
     * 
     * @param l
     *            长整型变量
     * @return
     */
    public static boolean isNotNull(Long l) {
        if (l != null && l > 0) {
            return true;
        } else {
            return false;
        }
    }
}
