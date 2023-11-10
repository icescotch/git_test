package com.baizhi.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class RegexUtil {
    //该工具类的作用是验证手机号及验证码
    private static Pattern phonePattern = null;
    private static Pattern verificationCodePattern = null;

    static {
        try {
            InputStream stream = RegexUtil.class.getResourceAsStream("/regex.properties");
            Properties props = new Properties();
            props.load(stream);
            phonePattern = Pattern.compile(props.getProperty("phone"));
            verificationCodePattern = Pattern.compile(props.getProperty("verification_code"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Boolean isPhone(String phone){
        return phonePattern.matcher(phone).matches();
    }

    public static Boolean isCode(String code){
        return verificationCodePattern.matcher(code).matches();
    }

}
