package com.exception;

/**
 * @author ：alvin
 * @date ：Created in 2019/11/13 19:14
 * @description：错误类型
 * @modified By：alvin
 * @version: 1.0.0
 */
public interface ErrorType {

    /**
     * 返回code
     *
     * @return
     */
    String getCode();

    /**
     * 返回msg
     *
     * @return
     */
    String getMsg();
}
