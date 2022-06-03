package com.zzr.product.exception;

import com.zzr.common.exception.BizCodeEnume;
import com.zzr.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * 集中处理所有异常
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/7 20:06
 */
@Slf4j
//@ResponseBody
//@ControllerAdvice(basePackages = "com.zzr.product.controller")

@RestControllerAdvice(basePackages = "com.zzr.product.controller")
public class MallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{}，异常类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        HashMap<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(),
                BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {

        log.error("错误：", throwable);
        return R.error(BizCodeEnume.UNKNOWN_EXCEPTION.getCode(),
                BizCodeEnume.UNKNOWN_EXCEPTION.getMsg());
    }
}
