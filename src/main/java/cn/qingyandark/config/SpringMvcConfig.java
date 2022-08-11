package cn.qingyandark.config;

import cn.qingyandark.controller.interceptor.ProjectInterceptor;
import cn.qingyandark.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"cn.qingyandark.controller"})
//@ComponentScan({"cn.qingyandark.controller", "cn.qingyandark.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    // 这样虽然简化开发，但具有一定入侵性

    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    // 配置静态资源可直接访问
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    // 配置拦截器，拦截器链，执行顺序参照括号序列
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/users","/users/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/users","/users/*");
    }
}
