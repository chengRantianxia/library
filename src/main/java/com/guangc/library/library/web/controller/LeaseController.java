package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.Lease;
import com.guangc.library.library.service.ILeaseService;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/16 19:10
 */
@RestController
@RequestMapping("/lease")
public class LeaseController {
    @Autowired
    private ILeaseService leaseService;

    @GetMapping("findAllLease")
    public Message findAllLease(){
        return MessageUtil.success(leaseService.findAllLease());
    }

    @GetMapping("findLeaseById")
    public Message findLeaseById(Integer id){
        return MessageUtil.success(leaseService.findLeaseById(id));
    }

    @GetMapping("findLeaseByUserId")
    public Message findLeaseByUserId(Integer userId){
        return MessageUtil.success(leaseService.findLeaseByUserId(userId));
    }

    @PostMapping("addOrUpdateLease")
    public void addOrUpdateLease(Lease lease){
        leaseService.addOrUpdateLease(lease);
    }

    @GetMapping("deleteLease")
    public void deleteLease(Integer id){
        leaseService.deleteLease(id);
    }

    @GetMapping("batchdeleteLease")
    public void batchdeleteLease(Integer[] ids){
        leaseService.batchdeleteLease(ids);
    }
}
