package com.zero.blog.service;

import com.zero.blog.dao.ZBlogUserMapper;
import com.zero.blog.entity.Result;
import com.zero.blog.entity.ZBlogUser;
import com.zero.blog.enums.ResultEnum;
import com.zero.blog.exception.UserException;
import com.zero.blog.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package com.zero.blog.service.impl
 * @date 2018 12-11 14:59
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private ZBlogUserMapper zBlogUserMapper;

    /**
     * 新增用户
     * @param zBlogUser
     * @return
     */
    @Override
    public Result insertUser(ZBlogUser zBlogUser) {
        if (StringUtils.isEmpty(zBlogUser.getLoginName())) {
            throw new UserException();
        }
        if (StringUtils.isEmpty(zBlogUser.getLoginPassword())) {
            throw new UserException();
        }
        if (StringUtils.isEmpty(zBlogUser.getuPhone())) {
            throw new UserException();
        }
        int result = 0;
        try {
             result = zBlogUserMapper.insertSelective(zBlogUser);
        } catch (Exception ex) {
            //log.error("【SQL ERROR】", ex);
            throw new RuntimeException(ex.getMessage());
        }

        if (result > 0) {
            ResultUtil.success(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), null);
        }
        return ResultUtil.success(ResultEnum.ADDED_FAILURE.getCode(), ResultEnum.ADDED_FAILURE.getMsg(), null);
    }

    @Override
    public int batchInsertUser(List<ZBlogUser> zBlogUsersList) {
        return 0;
    }

    @Override
    public int updateUser(ZBlogUser zBlogUser) {
        return 0;
    }

    @Override
    public int delUser(Long id) {
        return 0;
    }

    @Override
    public List<ZBlogUser> userList(ZBlogUser zBlogUser) {
        return null;
    }

    @Override
    public ZBlogUser getUser(ZBlogUser zBlogUser) {
        return null;
    }
}
