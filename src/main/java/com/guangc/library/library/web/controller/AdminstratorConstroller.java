package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.Administrator;
import com.guangc.library.library.service.IAdministratorService;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/16 19:18
 */
@RestController
@RequestMapping("/adminstrator")
public class AdminstratorConstroller {
    @Autowired
    private IAdministratorService administratorService;

    @GetMapping("findAllAdm")
    public Message findAllAdm(){
        return MessageUtil.success(administratorService.findAllAdm());
    }
    @GetMapping("findAdmById")
    public Message findAdmById(Integer id){
        return MessageUtil.success(administratorService.findAdmById(id));
    }
    @GetMapping("deleteAdm")
    public void deleteAdm(Integer id){
        administratorService.deleteAdm(id);
    }
    @PostMapping("saveOrUpdateAdm")
    public void saveOrUpdateAdm(Administrator administrator){
        administratorService.addOrUpdateAdm(administrator);
    }
}
