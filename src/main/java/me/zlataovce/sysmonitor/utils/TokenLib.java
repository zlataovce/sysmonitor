package me.zlataovce.sysmonitor.utils;

import java.security.SecureRandom;

public class TokenLib {
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final SecureRandom rnd = new SecureRandom();

    public TokenLib() {}

    public String urlsafeToken(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
}
