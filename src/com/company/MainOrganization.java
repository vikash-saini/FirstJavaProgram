package com.company;

public class MainOrganization {

    public static void main(String[] args) {

        Organization org = new Organization();
        Producer p=new Producer(org);
        Consumer c=new Consumer(org);
        p.start();
        c.start();
    }
}
