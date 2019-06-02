package com.guangc.library.library.service;

import com.guangc.library.library.bean.User;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/10 11:17
 */
public interface IUserService {
    /*
        查找所有的用户
     */
    public List<User> findAllUser();
    /*
        通过id查找用户
     */
    public User findUserById(Integer id);
    /*
        根据条件查询用户
     */
    public List<User> findUserByCondition(User user);
    /*
        新增或者修改用户信息
     */
    public void addOrUpdateUser(User user);
    /*
        删除用户
     */
    public void  deleteUser(Integer id);
    /*
        根据userid充值金额
     */
    public void  recharge(Integer id,Double rmb);
    /*
        根据userid消费金额
     */
    public void  consumption(Integer id,Double rmb);
}
