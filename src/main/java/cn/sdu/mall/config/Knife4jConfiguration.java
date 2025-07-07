/*
package cn.sdu.mall.config;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//声明配置类
@EnableSwagger2//启用swagger2
@EnableKnife4j//启用Knife4j
public class Knife4jConfiguration {


        @Bean
        public Docket createRestApi(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("cn.sdu.mall.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }


}
*/
