package com.jiayifu.crowd.service.api;

import com.jiayifu.crowd.entity.Admin;

import java.util.List;

public interface AdminService {

    void saveAdmin(Admin admin);

    List<Admin> getAll();
}