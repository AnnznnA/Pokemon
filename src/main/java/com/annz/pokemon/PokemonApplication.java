package com.annz.pokemon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@ResponseBody表示该方法的返回结果直接写入HTTP response body中一般用于构建Restful Api
//@ComponentScan扫描到配置类并把它加入到程序上下文，@Controller，@Service，@Repository，@Component注解的类到spring容器中
//@EnableAutoConfiguration自动配置
@MapperScan("com.annz.pokemon.mapper")
//扫描Mapper接口
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

}

