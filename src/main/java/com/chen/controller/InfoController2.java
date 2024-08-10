package com.chen.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/instance")
public class InfoController2 {
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws InterruptedException {
        if (file.isEmpty()) {
            return "请选择文件上传";
        }
        String fileName = file.getOriginalFilename();
        System.out.println("------" + fileName);
        Thread.sleep(3000);
        if ("家电实例验证.docx".equals(fileName)) {
            return "示例：{'智能音箱': '麦克风阵列'},\n" +
                    "    {'智能音箱': '语音识别芯片'},\n" +
                    "    {'智能音箱': '扬声器单元'},\n" +
                    "    {'智能音箱': 'Wi-Fi模块'},\n" +
                    "    {'智能音箱': '蓝牙模块'},\n" +
                    "    {'智能音箱': '触控面板'},\n" +
                    "    {'智能音箱': '电池组'},\n" +
                    "    {'智能音箱': '降噪技术'},\n" +
                    "    {'智能灯泡': 'LED芯片'},\n" +
                    "    {'智能灯泡': '恒流驱动电源'},\n" +
                    "    {'智能灯泡': 'ZigBee模块'},\n" +
                    "    {'智能灯泡': '智能调光模块'},\n" +
                    "    {'智能灯泡': '外壳材料'},\n" +
                    "    {'智能灯泡': '散热设计'},\n" +
                    "    {'智能门锁': '指纹识别传感器'},\n" +
                    "    {'智能门锁': '密码键盘'},\n" +
                    "    {'智能门锁': '蓝牙模块'},\n" +
                    "    {'智能门锁': '电机驱动模块'},\n" +
                    "    {'智能门锁': '电池组'},\n" +
                    "    {'智能门锁': 'NFC模块'},\n" +
                    "    {'智能温控器': '温度传感器'},\n" +
                    "    {'智能温控器': '触控屏'},\n" +
                    "    {'智能温控器': 'Wi-Fi模块'},\n" +
                    "    {'智能温控器': '控制芯片'},\n" +
                    "    {'智能温控器': '电源管理模块'},\n" +
                    "    {'智能温控器': '外壳材料'},\n" +
                    "    {'智能摄像头': 'CMOS传感器'},\n" +
                    "    {'智能摄像头': '镜头模组'},\n" +
                    "    {'智能摄像头': '红外滤光片'},\n" +
                    "    {'智能摄像头': 'Wi-Fi模块'},\n" +
                    "    {'智能摄像头': '电池组'},\n" +
                    "    {'智能摄像头': '图像处理芯片'},\n" +
                    "    {'智能窗帘': '电动机'},\n" +
                    "    {'智能窗帘': 'Z-Wave模块'},\n" +
                    "    {'智能窗帘': '遥控器'},\n" +
                    "    {'智能窗帘': '智能控制器'}";
        } else if ("增材实例验证.docx".equals(fileName)) {
            return "示例：{'3D打印材料': '不锈钢'},\n" +
                    "    {'3D打印材料': '黄金'},\n" +
                    "    {'3D打印材料': '银'},\n" +
                    "    {'3D打印材料': '钛'},\n" +
                    "    {'3D打印材料': '陶瓷'},\n" +
                    "    {'3D打印材料': 'Al2O3'},\n" +
                    "    {'3D打印材料': 'ZrO2'},\n" +
                    "    {'3D打印材料': 'LiO2'},\n" +
                    "    {'3D打印材料': 'SiO2'},\n" +
                    "    {'3D打印材料': 'SiC'},\n" +
                    "    {'3D打印材料': 'Si3N4'},\n" +
                    "    {'3D打印材料': 'PZT'},\n" +
                    "    {'3D打印材料': '尼龙'},\n" +
                    "    {'3D打印材料': '树脂'},\n" +
                    "    {'3D打印材料': '聚乳酸'},\n" +
                    "    {'3D打印材料': '聚对苯二甲酸乙二醇酯'},\n" +
                    "    {'3D打印材料': '高抗冲聚苯乙烯'},\n" +
                    "    {'3D打印材料': '丙烯腈丁二烯苯乙烯'},\n" +
                    "    {'3D打印材料': '镍基合金'},\n" +
                    "    {'3D打印材料': 'Ti-6Al-4V'},\n" +
                    "    {'3D打印材料': '不锈钢'},\n" +
                    "    {'3D打印材料': '黄金'},\n" +
                    "    {'3D打印材料': '银'},\n" +
                    "    {'3D打印材料': '钛'},\n" +
                    "    {'3D打印材料': '陶瓷'},\n" +
                    "    {'3D打印材料': 'Al2O3'},\n" +
                    "    {'3D打印材料': 'ZrO2'},\n" +
                    "    {'3D打印材料': 'LiO2'},\n" +
                    "    {'3D打印材料': 'SiO2'},\n" +
                    "    {'3D打印材料': 'SiC'},\n" +
                    "    {'3D打印材料': 'Si3N4'},\n" +
                    "    {'3D打印材料': 'PZT'},\n" +
                    "    {'3D打印材料': '尼龙'},\n" +
                    "    {'3D打印材料': '树脂'},\n" +
                    "    {'3D打印材料': '聚乳酸'},\n" +
                    "    {'3D打印材料': '聚对苯二甲酸乙二醇酯'},\n" +
                    "    {'3D打印材料': '高抗冲聚苯乙烯'},\n" +
                    "    {'3D打印材料': '丙烯腈丁二烯苯乙烯'},\n" +
                    "    {'3D打印材料': '镍基合金'},\n" +
                    "    {'3D打印材料': 'Ti-6Al-4V'},\n" +
                    "    {'3D打印材料': 'PLA'},\n" +
                    "    {'3D打印材料': 'LayWood'},\n" +
                    "    {'3D打印材料': 'NinjaFlex'}";
        } else if ("新能源实例验证.docx".equals(fileName)) {
            return "示例：{'动力电池': '锂离子电池'},\n" +
                    "    {'动力电池': '磷酸铁锂(LFP)'},\n" +
                    "    {'动力电池': '三元锂电池(NCM/NCA)'},\n" +
                    "    {'动力电池': '固态电池'},\n" +
                    "    {'动力电池': '电解液'},\n" +
                    "    {'动力电池': '隔膜材料'},\n" +
                    "    {'动力电池': '正极材料'},\n" +
                    "    {'动力电池': '负极材料'},\n" +
                    "    {'动力电池': '电池管理系统(BMS)'},\n" +
                    "    {'动力电池': '电池冷却系统'},\n" +
                    "    {'电动机': '永磁同步电机'},\n" +
                    "    {'电动机': '感应电机'},\n" +
                    "    {'电动机': '电动机控制器'},\n" +
                    "    {'电动机': '电动机冷却系统'},\n" +
                    "    {'电动机': '磁性材料'},\n" +
                    "    {'电动机': '绝缘材料'},\n" +
                    "    {'车载充电器': 'AC-DC转换器'},\n" +
                    "    {'车载充电器': 'DC-DC转换器'},\n" +
                    "    {'车载充电器': '电感器'},\n" +
                    "    {'车载充电器': '电容器'},\n" +
                    "    {'车载充电器': 'IGBT模块'},\n" +
                    "    {'电控系统': '控制芯片'},\n" +
                    "    {'电控系统': '电力电子设备'},\n" +
                    "    {'电控系统': '功率半导体'},\n" +
                    "    {'电控系统': '车载以太网'},\n" +
                    "    {'电控系统': '电气架构设计'},\n" +
                    "    {'热管理系统': '电池液冷系统'},\n" +
                    "    {'热管理系统': '电动机冷却系统'},\n" +
                    "    {'热管理系统': '空调热泵系统'},\n" +
                    "    {'热管理系统': '冷却液'},\n" +
                    "    {'热管理系统': '热传导材料'}";
        } else if ("航天实例验证.docx".equals(fileName)) {
            return "示例：{'中国商飞': '设计研发中心'},\n" +
                    "    {'中国商飞': '总装制造中心'},\n" +
                    "    {'中国商飞': '客户服务中心'},\n" +
                    "    {'中国商飞': '北京研究中心'},\n" +
                    "    {'中国商飞': '民用飞机试飞中心',\n}, " +
                    "    {'中国商飞': '基础能力中心'},\n" +
                    "    {'中国商飞': '营销中心'},\n" +
                    "    {'中国商飞': '新闻中心'},\n" +
                    "    {'中国商飞': '商飞学苑'},\n" +
                    "    {'中国商飞': '质量管理中心'},\n" +
                    "    {'中国商飞': '供应链管理中心'},\n" +
                    "    {'中国商飞': '人力资源中心'},\n" +
                    "    {'中国商飞': '财务中心'},\n" +
                    "    {'中国商飞': '法务中心'},\n" +
                    "    {'中国商飞': '信息技术中心'},\n" +
                    "    {'中国商飞': '市场研究中心'},\n" +
                    "    {'中国商飞': '环境健康安全中心'},\n" +
                    "    {'飞机制造': '设计部门'},\n" +
                    "    {'飞机制造': '总体设计部'},\n" +
                    "    {'飞机制造': '气动设计部'},\n" +
                    "    {'飞机制造': '结构设计部'},\n" +
                    "    {'飞机制造': '系统设计部'},\n" +
                    "    {'飞机制造': '制造工艺设计部'},\n" +
                    "    {'飞机制造': '试验部门'},\n" +
                    "    {'飞机制造': '静力试验部'},\n" +
                    "    {'飞机制造': '疲劳试验部'},\n" +
                    "    {'飞机制造': '动力试验部'},\n" +
                    "    {'飞机制造': '飞行试验部'},\n" +
                    "    {'飞机制造': '制造部门'}";
        } else {
            return "文件内容选择不匹配,请重新挑选";
        }
    }

}
