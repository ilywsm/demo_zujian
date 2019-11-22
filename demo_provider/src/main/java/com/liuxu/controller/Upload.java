package com.liuxu.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
public class Upload {
        @Value("${file.domain}")
        private  String filedomain;
        @Value("${file.path}")
        private  String filepath;
        @RequestMapping("upload")
        public Object file(@RequestParam("file")MultipartFile file){
            Map<String,Object> map=new HashMap<>();
            map.put("map",false);
            String originalFilename = file.getOriginalFilename();
            String  fileName = UUID.randomUUID()+".jpg";
            String absFilname =  filepath+ fileName;
            try {
                file.transferTo(new File(absFilname));
                map.put("map",true);
                map.put("imgUrl",filedomain+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  map;
        }

}
