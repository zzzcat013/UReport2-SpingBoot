package com.nongsin.ureport;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: zhang
 * @Date: 2019/10/31 11:06
 * @Description:
 */
@Slf4j
@ImportResource("classpath:context.xml")
@SpringBootApplication
public class Application {
    public static void main(String[] args)  throws UnknownHostException {

        ConfigurableApplicationContext application = SpringApplication.run(Application.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path")==null?"":env.getProperty("server.servlet.context-path");
        log.info("\n----------------------------------------------------------\n\t" +
                "Application UReport is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/ureport/designer\n\t" +
                "----------------------------------------------------------");

    }

}
