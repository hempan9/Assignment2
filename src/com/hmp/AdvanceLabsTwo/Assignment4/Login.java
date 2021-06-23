package com.hmp.AdvanceLabsTwo.Assignment4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
    private Map<Integer, String> login = new LinkedHashMap<Integer, String>();
    public void addLogin(int customerId, String password) {
        login.put(customerId, password);
    }
}
