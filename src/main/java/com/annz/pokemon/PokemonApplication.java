package com.annz.pokemon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@ResponseBody��ʾ�÷����ķ��ؽ��ֱ��д��HTTP response body��һ�����ڹ���Restful Api
//@ComponentScanɨ�赽�����ಢ�������뵽���������ģ�@Controller��@Service��@Repository��@Componentע����ൽspring������
//@EnableAutoConfiguration�Զ�����
@MapperScan("com.annz.pokemon.mapper")
//ɨ��Mapper�ӿ�
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

}

