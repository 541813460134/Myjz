package com.wqm.myjz.bean.extend;

import com.wqm.myjz.bean.Role;
import com.wqm.myjz.bean.User;

/**
 * @autor 王启蒙
 * @create 2021/6/11 16:58
 */
public class UserExtend  extends User {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
