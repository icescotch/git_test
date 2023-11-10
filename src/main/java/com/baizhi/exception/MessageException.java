package com.baizhi.exception;

public class MessageException extends RuntimeException{
    public MessageException(String message){
        //从RuntimeException中只获取异常信息，不要其他的内容
        super(message);
    }
}
