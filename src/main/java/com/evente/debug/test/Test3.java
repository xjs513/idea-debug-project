package com.evente.debug.test;

import com.evente.debug.model.User;

public class Test3 {
    public static void main(String[] args) {
        User user = new User("张三", "123456", "超级管理员");
        login(user);
    }

    private static void login(User user){
        String userType = user.getUserType();

        switch (userType) {
            case "超级管理员":
                System.out.println("超级管理员的业务逻辑处理");
                break;
            case "董事长":
                System.out.println("董事长的业务逻辑处理");
                break;
            case "经理":
                System.out.println("经理的业务逻辑处理");
                break;
            case "员工":
                System.out.println("员工的业务逻辑处理");
                break;
            default:
                System.out.println("角色不存在");
                break;
        }
    }
}
