package com.exception;

import lombok.Getter;

/**
 * @author : Alvin
 * @className : BaseException
 * @package: net.izd.common.web.exception
 * @description : 运行时异常 基类
 * @date : 2019/11/16 12:52
 */
@Getter
public class BaseException extends RuntimeException {

  private final ErrorType errorType;

  public BaseException() {
    this.errorType = SystemErrorType.SYSTEM_ERROR;
  }

  public BaseException(ErrorType errorType) {
    this.errorType = errorType;
  }

  public BaseException(ErrorType errorType, String message) {

    super(message);
    this.errorType = errorType;
  }

  public BaseException(ErrorType errorType, String message, Throwable cause) {

    super(message, cause);
    this.errorType = errorType;
  }
}
