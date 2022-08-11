package cn.qingyandark.controller.advice;

import cn.qingyandark.domain.Exception.BusinessException;
import cn.qingyandark.domain.Exception.SystemException;
import cn.qingyandark.controller.data.Code;
import cn.qingyandark.controller.data.UserResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    //记录日志
    //发送消息给运维
    //发送邮件给开发人员,ex对象发送给开发人员

    //@ExceptionHandler用于设置当前处理器类对应的异常类型
    @ExceptionHandler(SystemException.class)
    public UserResult doSystemException(SystemException ex){
        return new UserResult(ex.getCode(),null,"SystemException!, " + ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public UserResult doBusinessException(BusinessException ex){
        return new UserResult(ex.getCode(),null,"BusinessException!, " + ex.getMessage());
    }

    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public UserResult doOtherException(Exception ex){
        return new UserResult(Code.SYSTEM_UNKNOW_ERR,null,"Exception, 系统错误!");
    }
}
