package com.game.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        try {
            Configuration config = new Configuration();

            String path = "D:\\GitWork\\vue-admin-java\\api-admin\\src\\main\\resources\\templates";
            TemplateLoader templateLoader = new FileTemplateLoader(new File(path));
            config.setTemplateLoader(templateLoader);

            Template template = config.getTemplate("index.ftl",Locale.SIMPLIFIED_CHINESE);
            Map<String,String> map = new HashMap<String,String>();
            map.put("name", "宫水三叶");

            FileWriter fileWriter = new FileWriter("D:\\GitWork\\vue-admin-java\\api-admin\\src\\main\\resources\\templates\\html\\index.html");
            template.process(map, fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // TODO Auto-generated method stub
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

}