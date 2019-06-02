package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.User;
import com.guangc.library.library.bean.UserExample;
import com.guangc.library.library.mapper.UserMapper;
import com.guangc.library.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/10 11:25
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findUserByCondition(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameLike("%"+user.getUserName()+"%").andUserAddressLike("%"+user.getUserAddress()+"%").
                andUserEmailLike("%"+user.getUserEmail()+"%").andUserTelephoneLike("%"+user.getUserTelephone()+"%");
        return userMapper.selectByExample(example);
    }


    @Override
    public void addOrUpdateUser(User user) {
        if(user.getUserId()==null){
            userMapper.insert(user);
        }else{
            userMapper.updateByPrimaryKey(user);
        }
    }


    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void recharge(Integer id, Double rmb) {
        User user=userMapper.selectByPrimaryKey(id);
        user.setUserBalance(user.getUserBalance()+rmb);
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void consumption(Integer id, Double rmb) {
        User user=userMapper.selectByPrimaryKey(id);
        user.setUserBalance(user.getUserBalance()-rmb);
        userMapper.updateByPrimaryKey(user);
    }
}
