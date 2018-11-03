package cn.guangjian.spring.service.impl;

import cn.guangjian.spring.service.AccountService;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;

import java.util.*;

public class AccountServiceImpl2 implements AccountService {
  private String[] myStrs;
  private List<String> myList;
  private Set<String> mySet;
  private Map<String,String> myMap;
  private Properties myPro;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    public void show(){
        System.out.println("展示...");
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myPro);
    }
}
