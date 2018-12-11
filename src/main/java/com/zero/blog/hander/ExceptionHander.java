package com.zero.blog.hander;

import com.zero.blog.entity.Result;
import com.zero.blog.enums.ResultEnum;
import com.zero.blog.exception.UserException;
import com.zero.blog.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * @author ZERO
 * @version V1.4
 * @description 全局异常处理
 * @package com.zero.blog.hander
 * @date 2018 12-11 15:40
 */
@ControllerAdvice
public class ExceptionHander {

    private final static Logger LOG = LoggerFactory.getLogger(ExceptionHander.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result hander(Exception e) {
        if (e instanceof UserException) {
            UserException user = (UserException) e;
            return ResultUtil.error(user.getCode(), user.getMessage());
        } else if (e instanceof SQLException) {
            LOG.error("【SQL ERROR】", e);
            return ResultUtil.error(ResultEnum.SQL_ERROR.getCode(), e.getMessage());
        } else {
            LOG.error("【System error】", e);
            return ResultUtil.error(-1, "未知异常");
        }
    }
}
