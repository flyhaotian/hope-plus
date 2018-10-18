package com.hope.service;

import com.hope.beans.SysUser;
import com.hope.entity.User;
import com.hope.mybatis.service.BaseService;

/**
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-16 15:10
 **/
public interface SysUserService extends BaseService<User>{
    /***
     * 根据用户名查询
     * @param username
     * @return
     */
    User getByUserName(String username);
}
