package com.shamengxin.bank.exceptions;

/**
 * APP异常
 * @author 傻萌新
 * @version 2.0
 * @since 2.0
 */
public class AppException extends Exception{
    public AppException() {

    }

    public AppException(String message) {
        super(message);
    }
}
