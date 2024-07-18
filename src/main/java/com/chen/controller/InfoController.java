package com.chen.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class InfoController {
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws InterruptedException {
        if (file.isEmpty()) {
            return "Please select a file to upload.";
        }
        String fileName = file.getOriginalFilename();
        Thread.sleep(3000);
        if ("name1".equals(fileName)) {
            return "contents you want to show";
        } else if ("name2".equals(fileName)) {
            return "contents you want to show";
        } else {
            return "contents you want to show";
        }
    }
}