package com.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

/**
 * @author ：alvin
 * @date ：Created in 2019/11/13 18:49
 * @description：返回集
 * @modified By：alvin
 * @version: 1.0.0
 */
@Getter
@ToString
public class Result<T> {

    public static final String SUCCESSFUL_CODE = "0";
    public static final String SUCCESSFUL_MSG = "result.system.success";

    private String code;

    private String msg;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date time;

    public Date getTime() {
        if (this.time != null) {
            return (Date) time.clone();
        }
        return null;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String value;

    /**
     *
     */
    public Result() {
        this.time = new Date();
    }

    /**
     * @param errorType
     */
    public Result(ErrorType errorType) {

        this.code = errorType.getCode();
        this.msg = errorType.getMsg();
        this.time = new Date();
    }

    /**
     * @param errorType
     * @param data
     */
    public Result(ErrorType errorType, T data) {

        this(errorType);
        this.data = data;
    }

    /**
     * 内部构造
     *
     * @param code
     * @param msg
     * @param data
     */
    private Result(String code, String msg, T data) {

        this.code = code;
        this.msg = msg;
        this.data = data;
        this.time = new Date();
    }

    /**
     * 快速创建成功结果，并返回数据
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {

        return new Result<>(SUCCESSFUL_CODE, SUCCESSFUL_MSG, data);
    }

    /**
     * 输出总数
     *
     * @param total
     * @return
     */
    public Result setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Result setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 快速创建成功结果
     *
     * @return Result
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @return Result
     */
    public static Result fail() {
        return new Result(SystemErrorType.SYSTEM_ERROR);
    }

    /**
     * 系统异常类没有返回数据
     *
     * @param baseException
     * @return Result
     */
    public static Result fail(BaseException baseException) {
        return fail(baseException, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(BaseException baseException, Object data) {
        return new Result<>(baseException.getErrorType(), data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @param data
     * @return Result
     */
    public static Result fail(ErrorType errorType, Object data) {
        return new Result<>(errorType, data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @return Result
     */
    public static Result fail(ErrorType errorType) {
        return Result.fail(errorType, null);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(Object data) {
        return new Result<>(SystemErrorType.SYSTEM_ERROR, data);
    }
}
