package com.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author CaiKe
 * @create 2020/7/22
 */
public class WebUtils {
    /**
     * 把 Map 属性直接注入到对应的 javabean 中
     * @param value Map
     * @param bean bean
     */
//    public static void copyParamToBean(HttpServletRequest request, Object bean) {
    public static <T>T copyParamToBean(Map value, T bean) {
        try {
            BeanUtils.populate(bean,value);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }
}