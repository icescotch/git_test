package com.baizhi.util.aliyun;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.baizhi.exception.MessageException;

import java.util.Random;

//本工具类中需要完成短信验证码的发送和生成
public class AliYunSMSUtil implements AK{
    //准备短信签名和模板编号
    private static final String SIGNNAME="阿里云短信测试";
    private static final String TEMPLATECODE="SMS_154950909";

    //定义发送短信的方法
    public static void sendSMS(String phone,String code)throws Exception{
        //建立与阿里云的通信
        Config config=new Config().setAccessKeyId(ACCESS_KEY_ID).setAccessKeySecret(ACCESS_KEY_SECRET);
        //定义阿里云的域名
        config.endpoint="dysmsapi.aliyuncs.com";
        //建立客户端
        Client client = new Client(config);
        //设置短信的信息
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setSignName(SIGNNAME)
                .setTemplateCode(TEMPLATECODE)
                .setPhoneNumbers(phone)
                .setTemplateParam("{\"code\":\""+code+"\"}");
        //发送验证码
        SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
        //验证发送状态
        if(!sendSmsResponse.getBody().getCode().equals("OK")) throw new MessageException("短信发送失败");
    }

    public static String getCode(){
        return getCode(6);
    }

    //获取验证码
    public static String getCode(int size){
        char[] pool = "0123456789".toCharArray();
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<size;i++){
            stringBuilder.append(pool[random.nextInt(pool.length)]);
        }
        return stringBuilder.toString();
    }



    //TODO 测试用，上线前记得删除
    public static void main(String[] args) throws Exception {
        String code=AliYunSMSUtil.getCode();
        System.out.println(code);
        AliYunSMSUtil.sendSMS("17634112486",code);
    }
}
