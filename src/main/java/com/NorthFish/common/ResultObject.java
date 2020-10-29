package com.NorthFish.common;

import lombok.Data;

/**
 * 包装返回数据对象
 *
 * @author: duoduo
 * @date: 2019-03-08
 */
@Data
public class ResultObject<T> {

    public final static String INSERT_SUCCESS = "新增成功";
    public final static String INSERT_FAIL = "新增失败";
    public final static String UPDATE_SUCCESS = "修改成功";
    public final static String UPDATE_FAIL = "修改失败";
    public final static String DELETE_SUCCESS = "删除成功";
    public final static String DELETE_FAIL = "删除失败";

    /**
     * 成功
     */
    private boolean success = true;

    /***
     * 返回code
     * 具体参见http state code
     * @link
     */
    private int code = 200;

    /**
     * 信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 错误字段名
     */
    private String errorField;

    /***
     * 当前的页码
     */
    private int pageIndex;

    /***
     * 总数据量
     */
    private int total;

    /***
     *
     * @return
     */
    public static ResultObject createInstance(){
        return createInstance(true);
    }

    /***
     *
     * @param success
     * @return
     */
    public static ResultObject createInstance(boolean success){
        return createInstance(success,null);
    }

    /***
     *
     * @param success
     * @param message
     * @return
     */
    public static ResultObject createInstance(boolean success, String message){
        return createInstance(success,message,null);
    }


    /**
     *
     * @param success
     * @param code
     * @param message
     * @return
     */
    public static ResultObject createInstance(boolean success, int code, String message){
        ResultObject result = createInstance(success,message,null);
        result.code = code;
        return result;
    }

    public static <T> ResultObject createInstance(T data, int total) {
        return createInstance(data, total, 0);
    }

    public static <T> ResultObject createInstance(T data, int total, int pageIndex) {
        ResultObject result = createInstance(true);
        result.data = data;
        result.total = total;
        result.pageIndex = pageIndex;
        return result;
    }

    /***
     *
     * @param success
     * @param message
     * @param data
     * @return
     */
    public static ResultObject createInstance(boolean success, String message, Object data){
        return createInstance(success, message, data,null);
    }

    /***
     *
     * @param success
     * @param message
     * @param data
     * @param errorField
     * @return
     */
    public static ResultObject createInstance(boolean success, String message, Object data, String errorField){
        ResultObject ro=new ResultObject();
        ro.setData(data);
        ro.setSuccess(success);
        if (!success) {
            ro.setCode(500);
        }
        if(message!=null && (!"".equals(message.trim()))){
            ro.setMessage(message);
        }
        ro.setErrorField(errorField);

        return ro;
    }

}
