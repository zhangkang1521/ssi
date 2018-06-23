package org.zk.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zk.model.Result;

/**
 * Created by Administrator on 6/23/2018.
 */
@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public Result hadler(Exception e) {
        Result  result = new Result();
        result.setSuccess(false);
        return result;
    }

}
