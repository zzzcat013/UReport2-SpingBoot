package com.nongsin.ureport.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhang
 * @Date: 2019/10/31 11:29
 * @Description:
 */
@Configuration
public class UReportConfig {
    @Bean
    public ServletRegistrationBean buildUReportServlet() {
        return new ServletRegistrationBean(new UReportServlet(),"/ureport/*");
    }
}
