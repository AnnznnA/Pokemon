package com.annz.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@ResponseBody��ʾ�÷����ķ��ؽ��ֱ��д��HTTP response body��һ�����ڹ���Restful Api
//@ComponentScanɨ�赽�����ಢ�������뵽���������ģ�@Controller��@Service��@Repository��@Componentע����ൽspring������
//@EnableAutoConfiguration�Զ�����
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

}

