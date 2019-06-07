package io.github.futurewl.spring.boot.web.mvc.exception;

import io.github.futurewl.spring.boot.web.mvc.controller.UserController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-01-31:13:07
 * @version 1.0
 */
@ControllerAdvice(basePackageClasses = UserController.class)
public class AcmeControllerAdvice {


//    ResponseEntity<?> handlerControllerException(HttpServletRequest request, Throwable ex) {
//        HttpStatus status = getStatus(request);
//        return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
//    }
//
//    private HttpStatus getStatus(HttpServletRequest request) {
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//        if (statusCode == null) {
//            return HttpStatus.INTERNAL_SERVER_ERROR;
//        }
//        return HttpStatus.valueOf(statusCode);
//    }

}
