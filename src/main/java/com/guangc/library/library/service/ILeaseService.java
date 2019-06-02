package com.guangc.library.library.service;

import com.guangc.library.library.bean.Lease;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:19
 */
public interface ILeaseService {
    /*
        查询所有的租赁信息
     */
    public List<Lease> findAllLease();
    /*
        根据id查询租赁信息
     */
    public Lease findLeaseById(Integer id);
    /*
        根据用户id查询租赁信息
     */
    public List<Lease> findLeaseByUserId(Integer user_id);
    /*
        添加或者修改租赁信息
     */
    public void addOrUpdateLease(Lease lease);
    /*
        删除租赁信息
     */
    public void deleteLease(Integer id);
    /*
        批量删除租赁信息
     */
    public void batchdeleteLease(Integer[] ids);
}
