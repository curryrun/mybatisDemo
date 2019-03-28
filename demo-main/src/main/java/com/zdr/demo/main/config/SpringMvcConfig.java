package com.zdr.demo.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter(); // NOSONAR
        jsonConverter.setSupportedMediaTypes(Arrays.asList(new MediaType[] { new MediaType("text", "json"),
                MediaType.APPLICATION_JSON, new MediaType("text", "plain"), MediaType.TEXT_PLAIN }));

        return jsonConverter;
    }

    @Bean
    public StringHttpMessageConverter customerStringHttpMessageConverter() {
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(
                Charset.forName("UTF-8"));
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_HTML);
        mediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
        mediaTypes.add(MediaType.APPLICATION_JSON);
        mediaTypes.add(new MediaType("text", "plain"));
        stringHttpMessageConverter.setSupportedMediaTypes(mediaTypes);
        return stringHttpMessageConverter;
    }

    @Bean
    public ResourceHttpMessageConverter customerResourceHttpMessageConverter() {
        return new ResourceHttpMessageConverter();
    }

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
