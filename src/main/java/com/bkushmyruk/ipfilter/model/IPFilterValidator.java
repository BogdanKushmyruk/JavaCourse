package com.bkushmyruk.ipfilter.model;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IPFilterValidator {
    private static final String IP_REGEX = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public boolean validIP(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }
        ip = ip.trim();

        if ((ip.length() < 6) || (ip.length() > 15)) {
            return false;
        }

        try {
            Pattern pattern = Pattern.compile(IP_REGEX);
            Matcher matcher = pattern.matcher(ip);
            return matcher.matches();
        } catch (PatternSyntaxException ex) {
            return false;
        }
    }
}