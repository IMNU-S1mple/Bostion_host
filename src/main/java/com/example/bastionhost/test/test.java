package com.example.bastionhost.test;

import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    public List<String> Subdomain(){
        File file = new File("src/main/resources/Subdomain/Subdomain.txt");
        ArrayList<String> SubDomain = new ArrayList<>();

        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                SubDomain.add(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return SubDomain;
    }

    @Test
    public void User_Dir(){
        String property = System.getProperty("user.dir");
        System.out.println(property);
    }

    @Test
    public void Subdomain_01(){
        List<String> subdomains = Subdomain();
        for (Object Subdomain :
                subdomains) {
            System.out.println(Subdomain);
        }
    }
}
