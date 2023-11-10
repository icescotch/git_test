package com.baizhi.handler;

import com.baizhi.dto.CommonDTO;
import com.baizhi.exception.MessageException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//全局异常处理的作用是，当发生异常时，不要直接抛出，交给全局异常捕获处理
public class GlobalExceptionHandler {

    @ExceptionHandler(MessageException.class)
    public CommonDTO handleMessageException(MessageException messageException){
        //打印异常信息
        messageException.printStackTrace();
        //将捕获到的异常，封装至dto中，告知前端，发生了异常即可
        CommonDTO commonDTO = new CommonDTO();
        commonDTO.setStatus(false);
        commonDTO.setMessage(messageException.getMessage());
        return commonDTO;
    }

    //针对自定义异常类无法处理的异常
    @ExceptionHandler(Exception.class)
    public CommonDTO handleException(Exception exception){
        exception.printStackTrace();
        //返回“未知错误”
        CommonDTO commonDTO = new CommonDTO();
        commonDTO.setStatus(false);
        commonDTO.setMessage("未知错误");
        return commonDTO;
    }
}
