package com.swagger.demo.exception;

import com.aeto.userservice.user.model.ResultObject;
import lombok.Getter;

@Getter
public class BusinessErrorException extends RuntimeException {

    private ResultObject resultObject;

    public BusinessErrorException() {

    }

    public BusinessErrorException(ResultObject resultObject) {
        this.resultObject = resultObject;
    }
}
