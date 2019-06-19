package org.team3.loveyoga.util;

import java.util.Random;

/**
 * 验证码的工具类，用来生成和发送验证码，依赖SMSUtil
 */
public class PhoneCodeUtil {
    private static Random random = new Random(17);// 随机数生成类，用来生成随机验证码


    /**
     * 生成随机的验证码，并且发送验证码短信，将生成验证码返回给服务调用方
     * @param phoneNumber
     * @return 生成的随机的验证码
     */
    public static String sendPhoneCode(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        SMSUtil.sendSms(phoneNumber, stringBuilder.toString());
        return stringBuilder.toString();
    }


}
