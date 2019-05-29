package com.ldp.springboot13task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot13TaskApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void send() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("通知-今晚开会");
        message.setText("今天晚上7:30，所有人到我办公室开会，不得缺席。");
        message.setTo((String[]) Arrays.asList("1241262356@qq.com","947913857@qq.com","574185505@qq.com","1846882398@qq.com").toArray());
        message.setFrom("1846882398@qq.com");
        javaMailSender.send(message);
    }

    @Test
    public void send1() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper message = new MimeMessageHelper(mimeMessage,true);
//        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("通知-今晚开会");
        message.setText("今天晚上<font class='red'>7:30</font>，所有人到我办公室开会，不得缺席。",true);
    message.setTo((String[]) Arrays.asList("1542968064@qq.com","1241262356@qq.com","947913857@qq.com","574185505@qq.com","1846882398@qq.com").toArray());
//        message.setTo("1542968064@qq.com");
        message.setFrom("1846882398@qq.com");
        //上传文件
        message.addAttachment("1.jpg",new File("C:\\Users\\ASUS\\Pictures\\1.jpg"));
        message.addAttachment("告白气球.mp3",new File("C:\\Users\\ASUS\\Music\\告白气球—周二珂_超清.mp3"));
        javaMailSender.send(mimeMessage);
    }

}
