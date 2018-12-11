package com.zero.blog.service;

import com.zero.blog.entity.Result;
import com.zero.blog.entity.ZBlogUser;

import java.util.List;

/**
 * @author ZERO
 * @version V1.4
 * @description 用户
 * @package com.zero.blog.service
 * @date 2018 12-11 14:55
 */
public interface UserService {

    Result insertUser(ZBlogUser zBlogUser);

    int batchInsertUser(List<ZBlogUser> zBlogUsersList);

    int updateUser(ZBlogUser zBlogUser);

    int delUser(Long id);

    List<ZBlogUser> userList(ZBlogUser zBlogUser);

    ZBlogUser getUser(ZBlogUser zBlogUser);
}
