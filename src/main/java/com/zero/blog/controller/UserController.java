package com.zero.blog.controller;

import com.zero.blog.common.RequstCommons;
import com.zero.blog.entity.Result;
import com.zero.blog.entity.ZBlogUser;
import com.zero.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZERO
 * @version V1.4
 * @description controller
 * @package com.zero.blog.controller
 * @date 2018 12-11 16:56
 */
@RestController
@RequestMapping(value = RequstCommons.USER_REQUEST)
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping (value = "/add")
    public Result addUser(@RequestBody ZBlogUser zBlogUser) {
        Result result = new Result();
        return result = userService.insertUser(zBlogUser);
    }

    @PostMapping (value = "/list")
    public Result userList(@RequestBody ZBlogUser zBlogUser) {
        return userService.userList(zBlogUser);
    }
}
