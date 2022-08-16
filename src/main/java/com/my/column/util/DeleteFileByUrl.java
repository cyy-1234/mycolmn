package com.my.column.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.URI;

public class DeleteFileByUrl {



    public  Boolean delete(String url) {

        String name=url.substring(url.lastIndexOf(":")+1);
        String newFileName=name.substring(name.indexOf("/"));
        String dir=newFileName.split("/")[1];
        if(dir.equals("images")){
            System.out.println("newFileName是默认文件，没有权限删除");
            return false;
        }

//        System.out.println(newFileName);
        File file = null;
        try {
            file = new File(ResourceUtils.getURL("classpath:static").getPath()+ newFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (file.exists()) {
            file.delete();
            System.out.println(newFileName+"===========删除成功=================");
            return true;
        } else {
            System.out.println(newFileName+"===============删除失败==============");
            return false;
        }
    }
}
