package com.bkushmyruk.ipfilter.model;

import java.util.HashSet;
import java.util.Set;


public class IPFilterService {
    public boolean ipFilter(String s) {
        IPFilterStorage ipFilterStorage = new IPFilterStorage();
        Set<String> tmp = new HashSet<>(ipFilterStorage.getListOfIp());
        return tmp.contains(s);
      }
}
