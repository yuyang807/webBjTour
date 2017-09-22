package com.yy.tourweb.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 * EmailUtil
 *
 * @author yy
 * @date 2017/9/19
 */
public class EmailUtil {
    private static final String SMTP_HOST  = PropertiesUtil.getValue("application", "email.smtp.host");
    private static final String EMAIL_NAME = PropertiesUtil.getValue("application", "email.name");
    private static final String EMAIL_PWD  = PropertiesUtil.getValue("application", "email.password");


    public static void sendEmail(String subject, String[] emailTo, String content) throws EmailException {
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName(SMTP_HOST);
        email.setSmtpPort(465);
        email.setAuthentication(EMAIL_NAME, EMAIL_PWD);
        email.setSSLOnConnect(true);
        email.setFrom(EMAIL_NAME);
        email.setSubject(subject);
        email.setMsg(content);
        for (int i = 0; i < emailTo.length; i++) {
            email.addTo(emailTo[i]);
        }
        email.send();
    }
}
