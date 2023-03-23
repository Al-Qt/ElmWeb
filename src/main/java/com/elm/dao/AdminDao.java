package com.elm.dao;
import com.elm.dao.impl.po.Admin;
public interface AdminDao {
    public Admin getAdminByNameByPass(String adminName,String password);
}
