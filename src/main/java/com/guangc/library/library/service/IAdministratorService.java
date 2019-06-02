package com.guangc.library.library.service;

import com.guangc.library.library.bean.Administrator;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:17
 */
public interface IAdministratorService {
    /*
        查找所有的管理员
     */
    public List<Administrator> findAllAdm();
    /*
        通过id查找管理员
     */
    public Administrator findAdmById(Integer id);
    /*
        增加或修改管理员
     */
    public void addOrUpdateAdm(Administrator administrator);
    /*
        通过di删除管理员
     */
    public void deleteAdm(Integer id);

}
