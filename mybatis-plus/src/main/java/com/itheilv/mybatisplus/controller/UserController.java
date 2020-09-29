package com.itheilv.mybatisplus.controller;

import com.itheilv.mybatisplus.base.BaseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.itheilv.mybatisplus.base.BaseController;
import com.itheilv.mybatisplus.service.UserService;
import com.itheilv.mybatisplus.model.User;

/**
 * 用户详情管理 Controller
 *
 * @author WSQ
 * @since 2020-09-29
 */
@RestController
@Api(value = "User管理", tags = "用户详情管理")
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 分页列表
     *
     * @param page the page
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "用户详情列表--分页", response = User.class)
    @GetMapping(value = "/")
    public Object list(Page<User> page, User user) {
        Page<User> userPage = userService.queryByPageWithAutoWrapper(user, page);
        return BaseResult.successResultCreate(userPage);
    }

    /**
     * 查询
     *
     * @param userId the user
     * @return the user
     */
    @ApiOperation(value = "用户详情信息")
    @GetMapping(value = "/getUser")
    public Object getUser(String userId) {
        User user = userService.getById(userId);
        return BaseResult.successResultCreate(user);
    }

    /**
     * 新增
     *
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "新增用户详情信息", response = User.class)
    @PostMapping(value = "/")
    public Object create(@RequestBody User user) {
        return BaseResult.successResultCreate(userService.save(user));
    }

    /**
     * 删除
     *
     * @param userId the userId
     * @return the object
     */
    @ApiOperation(value = "删除用户详情信息")
    @DeleteMapping(value = "/delete")
    public Object delete(String userId) {
        int count = userService.remove(userId);
        return BaseResult.checkCountOneResult(count);
    }

    /**
     * 修改
     *
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "修改用户详情信息")
    @PutMapping(value = "/")
    public Object update(@RequestBody User user) {
        int count = userService.updateSelective(user);
        return BaseResult.checkCountOneResult(count);
    }

}
