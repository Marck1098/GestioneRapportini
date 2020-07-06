package it.gestrap.springmvc.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import it.gestrap.web.controller.Utente;

/**
 * @author Ramesh Fadatare
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"it.gestrap"})
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resolverjsp() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/resources/**")
            .addResourceLocations("/resources/");
    }
    
    @Bean
    Utente utenteBean(){
        return new Utente();
    }
    
}
