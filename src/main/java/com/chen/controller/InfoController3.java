package com.chen.controller;

import com.chen.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/knowledge")
public class InfoController3 {
    @PostMapping("/upload")
    public Result<List<List<String>>> handleFileUpload(@RequestParam("file") MultipartFile file) throws InterruptedException {
        String fileName = file.getOriginalFilename();
        Thread.sleep(3000);
        List<List<String>> result = new ArrayList<>();
        if (file.isEmpty()) {
            return Result.packSuccess(result, "请选择文件上传");
        }
        if ("智能家居1.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "TCL、海尔、美的、小米",
                    "GB4706.1-2008家电和类似用途电器的安全第一部分：通用要求；",
                    "阻隔膜、隔热芯材、吸气剂",
                    "真空隔热板",
                    "冰箱",
                    "温度传感器",
                    "安全标准：包括强制性国家标准GB4706.1-2005《家用和类似用途电器的安全第1部分:通用要求》和GB4706.13-2008《家用和类似用途电器的安全制冷器具、冰淇淋机和制冰机的特殊要求》",
                    "顺丰、万纬物流",
                    "保修期1年"
            );
            List<String> department = Arrays.asList(
                    "麻省理工学院媒体实验室（可穿戴设备）",
                    "阻隔膜、隔热芯材、吸气剂",
                    "《中华人民共和国产品质量法》、冰箱",
                    "《中华人民共和国对外贸易法》",
                    "保修期1年",
                    "顺丰、万纬物流"
            );
            List<String> aspect = Arrays.asList(
                    "阻隔膜、隔热芯材",
                    "温度控制器",
                    "温度传感器、启动继电器",
                    "冰箱",
                    "《中华人民共和国对外贸易法》",
                    "购买产品家庭",
                    "保修期1年、《中华人民共和国消费者权益保护法》"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "家电");
        }
        else if ("智能家居2.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "美的、小米",
                    "GB4343.1-2018家用电器电动工具和类似器具的电磁兼容要求；GB17625.1-2016电磁兼容限值谐波电流发射限值",
                    "壳体、电机、缸体、活塞",
                    "压缩机",
                    "冰箱",
                    "冷却系统",
                    "GB/T8059-2016《用和类似用途制冷器具》；国家标准GB19606-2004《家用和类似用途电器噪声限值》",
                    "菜鸟网络、京东物流",
                    "保修期2年"
            );
            List<String> department = Arrays.asList(
                    "卡内基梅隆大学集成创新研究所（智能传感器网络）",
                    "壳体、电机、缸体、活塞",
                    "《中华人民共和国产品质量法》、冰箱",
                    "《零售商促销行为管理办法》、《消费者权益保护法》",
                    "保修期2年",
                    "菜鸟网络、京东物流"
            );
            List<String> aspect = Arrays.asList(
                    "壳体、电机、缸体、活塞、压缩机",
                    "冷却系统",
                    "温度传感器",
                    "冰箱",
                    "《零售商促销行为管理办法》、《消费者权益保护法》",
                    "购买用户",
                    "保修期2年、《中华人民共和国消费者权益保护法》"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "家电");
        }

        else if ("3D打印1.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "EOS、铂力特",
                    "尼龙、树脂、聚对苯二甲酸乙二醇酯",
                    "打印机、加热床、螺丝",
                    "GB/T 42617-2023、GB/T 42618-2023",
                    "医疗专业人员"
            );
            List<String> department = Arrays.asList(
                    "医疗专业人员",
                    "材料挤压工艺、立体光刻",
                    "打印机、加热床、螺丝",
                    "燃油动力、激光焊接",
                    "EOS、铂力特"
            );
            List<String> aspect = Arrays.asList(
                    "发动机（内饰）",
                    "3D打印控制系统、变细分数控制",
                    "尼龙、树脂、聚对苯二甲酸乙二醇酯",
                    "打印机、加热床、螺丝",
                    "维修期、生产日期",
                    "医疗专业人员"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "增材制造");
        }
        else if ("3D打印2.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "华曙高、Sandivik",
                    "镍基合金、银、钛",
                    "轴承、假体、医疗器械",
                    "GB/T 42619-2023、GB/T 42620-2023、GB/T 42621-2023",
                    "室内设计师、模型爱好者"
            );

            List<String> department = Arrays.asList(
                    "室内设计师、模型爱好者",
                    "彩色喷墨打印、粉末床熔合工艺",
                    "轴承、假体、医疗器械",
                    "激光焊接",
                    "华曙高、Sandivik"
            );

            List<String> aspect = Arrays.asList(
                    "机翼、起落装置",
                    "打印平台温度控制、S形曲线控制",
                    "镍基合金、银、钛",
                    "轴承、假体、医疗器械",
                    "维修期、生产日期",
                    "室内设计师、模型爱好者"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "增材制造");

        }
        else if ("3D打印3.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "Carbon、3DSystem",
                    "热塑性塑料、光聚合物",
                    "外科手术模型、珠宝",
                    "GB/T 43110-2023",
                    "牙医、科学博物馆"
            );
            List<String> department = Arrays.asList(
                    "牙医、科学博物馆",
                    "电子束增材制造、光聚合工艺",
                    "外科手术模型、珠宝",
                    "数字化三维、冷喷涂",
                    "Carbon、3DSystem"
            );
            List<String> aspect = Arrays.asList(
                    "控制系统、传感器",
                    "调平系统控制、模糊PID算法、神经网络PID算法",
                    "热塑性塑料、光聚合物",
                    "外科手术模型、珠宝",
                    "维修期、生产日期",
                    "牙医、科学博物馆"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "增材制造");

        }

        else if ("新能源车1.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "触摸屏、车内电子设备",
                    "底盘",
                    "电机",
                    "铅酸蓄电池",
                    "内外灯光配套，自动大小灯",
                    "整流器",
                    "GB/T18385-2005、GB/T18386-2017"
            );
            List<String> department = Arrays.asList(
                    "固态电池、锂电池",
                    "德赛西威、弗迪科技",
                    "触摸屏、车内电子设备",
                    "GB/T18385-2005、GB/T18386-2017",
                    "海运、铁路运输",
                    "特斯拉、比亚迪",
                    "维修日期",
                    "销售、推广经理"
            );
            List<String> aspect = Arrays.asList(
                    "维修日期",
                    "特斯拉、比亚迪",
                    "铅酸蓄电池",
                    "直流电机、交流电机",
                    "电力驱动系统、电源系统",
                    "电驱系统集成",
                    "GB/T18385-2005、GB/T18386-2017",
                    "汽车底盘集成与仿生全国重点实验室、整车先进设计制造技术全国重点实验室"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "新能源");
        }

        else if ("新能源车2.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "车窗、遮阳板、后备箱",
                    "车身、",
                    "变速器",
                    "锰酸锂电池、磷酸铁锂电池",
                    "自动防眩目，日间行车灯",
                    "电气控制器",
                    "GB/T18386.1-2021、GB/T18388-2005"
            );
            List<String> department = Arrays.asList(
                    "充电桩、车辆网",
                    "弗迪动力、比亚迪半导体",
                    "车窗、遮阳板、后备箱",
                    "GB/T18386.1-2021、GB/T18388-2005",
                    "绿色慧联、福佑卡车",
                    "小鹏、蔚来",
                    "生产日期",
                    "电池工程师"
            );
            List<String> aspect = Arrays.asList(
                    "生产日期",
                    "小鹏、蔚来",
                    "锰酸锂电池、磷酸铁锂电池",
                    "无刷直流电机、开关阻磁电机",
                    "辅助系统、电池包系统、整车控制器",
                    "电气电子架构、多合一技术集成",
                    "GB/T18386.1-2021、GB/T18388-2005",
                    "智能绿色车辆与交通全国重点实验室、高端装备机械传动全国重点实验室"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "新能源");
        }
        else if ("新能源车3.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "气囊、方向盘、后视镜",
                    "底盘、车身、",
                    "传动轴",
                    "三元锂电池",
                    "车内舱应急照明灯和逃生灯、音箱",
                    "电池管理系统",
                    "GB/T34585-2017、GB/T36980-2018"
            );
            List<String> department = Arrays.asList(
                    "智能驾驶、EV续航里程",
                    "弗迪电池、上声电子",
                    "气囊、方向盘、后视镜",
                    "GB/T34585-2017、GB/T36980-2018",
                    "新沃运力、一微新能源",
                    "问界、小米",
                    "保修期",
                    "电机工程师、项目经理"
            );
            List<String> aspect = Arrays.asList(
                    "保修期",
                    "问界、小米",
                    "三元锂电池",
                    "步进电机、无刷永磁电机",
                    "驱动电机控制器、电池管理系统",
                    "电驱三合一",
                    "GB/T34585-2017、GB/T36980-2018",
                    "比亚迪汽车研究院、国家电动客车电控与安全工程技术研究中心"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "新能源");

        }

        else if ("航天航空1.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "波音、Airbus",
                    "铝合金、铝锂合金",
                    "发动机（内饰）",
                    "飞机",
                    "《航空涡喷涡扇涡轴涡桨发动机通用规范》",
                    "国航、东航、南航、四川航空"
            );

            List<String> department = Arrays.asList(
                    "波音、Airbus",
                    "铝合金、铝锂合金",
                    "发动机（飞机内饰）",
                    "燃油动力、激光焊接",
                    "传感器",
                    "国航、东航、南航、四川航",
                    "《航空涡喷涡扇涡轴涡桨发动机通用规范》"
            );

            List<String> aspect = Arrays.asList(
                    "发动机（内饰）",
                    "铝合金、铝锂合金",
                    "传感器、发动机",
                    "激光焊接",
                    "《航空涡喷涡扇涡轴涡桨发动机通用规范》",
                    "波音、Airbus",
                    "《中华人民共和国消费者权益保护法》"
            );

            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "航空航天");
        }

        else if ("航天航空2.pdf".equals(fileName)) {
            List<String> process = Arrays.asList(
                    "达索航空、Embraer",
                    "A100钢、塑料、织物",
                    "机翼、起落装置、控制系统",
                    "火箭",
                    "《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》",
                    "长龙航空、顺丰航空、华夏航空、吉祥航空、成都航空"
            );

            List<String> department = Arrays.asList(
                    "达索航空、Embraer",
                    "A100钢、塑料、织物",
                    "发动机（飞机内饰）",
                    "冷喷涂",
                    "控制系统",
                    "顺丰航空、华夏航空、吉祥航空、成都航空",
                    "《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》"
            );

            List<String> aspect = Arrays.asList(
                    "机翼、起落装置、控制系统",
                    "A100钢、塑料、织物",
                    "发动机、机翼",
                    "冷喷涂",
                    "《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》",
                    "达索航空、Embraer",
                    "维修期"
            );
            result.add(process);
            result.add(department);
            result.add(aspect);
            return Result.packSuccess(result, "航空航天");

        } else {
            return Result.packSuccess(result, "文件内容选择不匹配,请重新挑选");
        }

    }
}