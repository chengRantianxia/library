package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.Lease;
import com.guangc.library.library.bean.LeaseExample;
import com.guangc.library.library.mapper.LeaseMapper;
import com.guangc.library.library.service.ILeaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:21
 */
@Service
public class LeaseServiceImpl implements ILeaseService {
    @Resource
    private LeaseMapper leaseMapper;

    @Override
    public List<Lease> findAllLease() {
        return leaseMapper.selectByExample(new LeaseExample());
    }

    @Override
    public Lease findLeaseById(Integer id) {
        return leaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Lease> findLeaseByUserId(Integer id) {
        LeaseExample example = new LeaseExample();
        example.createCriteria().andUserIdEqualTo(id);
        return leaseMapper.selectByExample(example);
    }

    @Override
    public void addOrUpdateLease(Lease lease) {
        if(lease.getLeaseId()==null){
            if(lease.getLeaseState()==null){
                lease.setLeaseState("正常");
            }
            leaseMapper.insert(lease);
        }else {
            leaseMapper.updateByPrimaryKey(lease);
        }
    }

    @Override
    public void deleteLease(Integer id) {
        leaseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchdeleteLease(Integer[] ids) {
        for (Integer i:ids) {
            leaseMapper.deleteByPrimaryKey(i);
        }
    }
}
