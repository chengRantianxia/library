package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.Administrator;
import com.guangc.library.library.bean.AdministratorExample;
import com.guangc.library.library.mapper.AdministratorMapper;
import com.guangc.library.library.service.IAdministratorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:20
 */
@Service
public class AdministratorServiceImpl implements IAdministratorService {
    @Resource
    private AdministratorMapper administratorMapper;
    @Override
    public List<Administrator> findAllAdm() {
        return administratorMapper.selectByExample(new AdministratorExample());
    }

    @Override
    public Administrator findAdmById(Integer id) {
        return administratorMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addOrUpdateAdm(Administrator administrator) {
        System.out.println(administrator);
        if(administrator.getAdmId()==null){
            administratorMapper.insert(administrator);
        }else {
            administratorMapper.updateByPrimaryKey(administrator);
        }
    }

    @Override
    public void deleteAdm(Integer id) {
        administratorMapper.deleteByPrimaryKey(id);
    }
}
