package org.wxm.core.util;

import java.lang.reflect.Field;

/**
 * <b>标题: </b>反射工具类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>Cybele 398600198@qq.com <br/>
 * <b>时间: </b>2015-2-23 下午11:47:26 <br/>
 * <b>修改记录: </b>
 */
public class ReflectUtils {
    /**
     * 
     * <b>标题: </b>利用反射获取指定对象的指定属性 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-23 下午11:48:07 <br/>
     * <b>修改记录: </b>
     * 
     * @param obj
     *            目标对象
     * @param fieldName
     *            目标属性
     * @return 目标属性的值
     */
    public static Object getFieldValue(Object obj, String fieldName) {
        Object result = null;
        Field field = ReflectUtils.getField(obj, fieldName);
        if (field != null) {
            field.setAccessible(true);
            try {
                result = field.get(obj);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 
     * <b>标题: </b>利用反射获取指定对象里面的指定属性 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-23 下午11:49:39 <br/>
     * <b>修改记录: </b>
     * 
     * @param obj
     *            目标对象
     * @param fieldName
     *            目标属性
     * @return 目标字段
     */
    private static Field getField(Object obj, String fieldName) {
        Field field = null;
        for (Class<?> clazz = obj.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                field = clazz.getDeclaredField(fieldName);
                break;
            } catch (NoSuchFieldException e) {
                // 这里不用做处理，子类没有该字段可能对应的父类有，都没有就返回null。
            }
        }
        return field;
    }

    /**
     * 
     * <b>标题: </b>利用反射设置指定对象的指定属性为指定的值 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>Cybele 398600198@qq.com <br/>
     * <b>时间: </b>2015-2-23 下午11:50:32 <br/>
     * <b>修改记录: </b>
     * 
     * @param obj
     *            目标对象
     * @param fieldName
     *            目标属性
     * @param fieldValue
     *            目标值
     */
    public static void setFieldValue(Object obj, String fieldName, String fieldValue) {
        Field field = ReflectUtils.getField(obj, fieldName);
        if (field != null) {
            try {
                field.setAccessible(true);
                field.set(obj, fieldValue);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
