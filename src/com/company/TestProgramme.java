package com.company;
import Bank.* ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyThread3 extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 10; i++) {
            System.out.println("This is Thread "+i);
            try{
                this.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }
}

public class TestProgramme {

    public static void main(String[] args){

        System.out.println("This is test method");

        Student stu = new Student(1,"vikas");

        System.out.println(stu.getStuname());
        System.out.println(stu.getrolId());
        stu.getStuInfo();

        Bank bnkObj = new Bank();
        bnkObj.setBankName("State Bank of India");
        System.out.println(bnkObj.getBankName());

        List<String> allowedLdapRoles = new ArrayList<>();
        String ldapRoles="CN=DARE_ADMIN,OU=Groups,ou=optususers,cn=standard,dc=vdsppt,dc=singtelgroup,dc=net|CN=EDSG_ADMIN,OU=Groups,ou=optususers,cn=standard,dc=vdsppt,dc=singtelgroup,dc=net|CN=EDSG_Write,OU=Groups,ou=optusppt,cn=Standard,dc=vdsppt,dc=singtelgroup,dc=net|CN=EDSG_Read,OU=Groups,ou=pptoptus,cn=Standard,dc=vdsppt,dc=singtelgroup,dc=net|CN=EDSG_Read,OU=UserGroups,ou=pptsingtel,cn=Standard,dc=vdsppt,dc=singtelgroup,dc=net|CN=EDSG_Write,OU=Groups,ou=optusppt,cn=standard,dc=vdsppt,dc=singtelgroup,dc=net";
        String[] roles = ldapRoles.split("\\|");

        Collections.addAll(allowedLdapRoles, roles);

        System.out.println(allowedLdapRoles);
        System.out.println(allowedLdapRoles.size());

//        MyThread3 t3 = new MyThread3();
//        t3.start();

        Thread t = Thread.currentThread();
        System.out.println("current thread "+ t.getName());
        BigDecimal val = new BigDecimal(400.10);
        System.out.println("big "+val);


    }
}
