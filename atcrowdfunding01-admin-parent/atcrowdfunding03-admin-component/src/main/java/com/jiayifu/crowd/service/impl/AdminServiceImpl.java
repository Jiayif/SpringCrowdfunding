package com.jiayifu.crowd.service.impl;

import com.jiayifu.crowd.entity.Admin;
import com.jiayifu.crowd.entity.AdminExample;
import com.jiayifu.crowd.mapper.AdminMapper;
import com.jiayifu.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
        // throw new RuntimeException();
    }
    @Override
    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }
}