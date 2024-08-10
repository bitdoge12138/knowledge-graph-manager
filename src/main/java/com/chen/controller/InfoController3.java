package com.chen.controller;

import com.chen.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/knowledge")
public class InfoController3 {
    @PostMapping("/upload")
    public Result handleFileUpload(@RequestParam("file") MultipartFile file) throws InterruptedException {
        if (file.isEmpty()) {
            return new Result("请选择文件上传");
        }
        String fileName = file.getOriginalFilename();
        System.out.println("------" + fileName);
        Thread.sleep(3000);

        if ("高端冰箱用低导热真空隔热板研发项目.pdf".equals(fileName)) {
            String process = "1、启动：LG、三星、西门子、海尔、美的、博世\n" +
                    "2、规划：冷藏室、冷冻室、触摸屏、Wi-Fi连接、温度传感器、湿度传感器、门封条\n" +
                    "3、执行：压缩机、制冷剂、蒸发器、冷凝器、风扇、冷气导流板、照明灯\n" +
                    "4、质量保障：GB/T 8059.1-2016、GB/T 8059.2-2016、GB/T 8059.3-2016、GB/T 8059.4-2016、GB/T 8059.5-2016\n" +
                    "5、销售：家庭主妇、厨师、酒店管理人员、智能家居爱好者、健康饮食倡导者\n";
            String department = "1、销售部门：家庭主妇、厨师、酒店管理人员、智能家居爱好者、健康饮食倡导者\n" +
                    "2、技术部门：压缩机控制、温度调节、湿度调节、食物保鲜技术、自动除霜系统、故障诊断\n" +
                    "3、生产部门：压缩机、制冷剂、蒸发器、冷凝器、风扇、冷气导流板、照明灯\n" +
                    "4、售后服务部门：故障排除、零件更换、定期保养、远程诊断\n" +
                    "5、市场部门：LG、三星、西门子、海尔、美的、博世\n";
            String aspect = "1、机械工程师：压缩机、蒸发器、冷凝器、风扇、冷气导流板\n" +
                    "2、软件开发人员：温度调节算法、湿度调节算法、故障诊断系统、远程控制平台、Wi-Fi连接\n" +
                    "3、材料工程师：冷藏室材料、冷冻室材料、门封条材料、绝缘材料、冷媒\n" +
                    "4、设计建模工程师：压缩机、制冷剂、蒸发器、冷凝器、风扇、冷气导流板\n" +
                    "5、售后工程师：故障排除、零件更换、定期保养\n" +
                    "6、智能冰箱销售：家庭主妇、厨师、酒店管理人员、智能家居爱好者、健康饮食倡导者\n";
            return new Result(process, department, aspect);
        } else if ("工程专业 3D 打印项目.docx".equals(fileName)) {
            String process = "1、启动：EOS、铂力特、华曙高、Sandivik、Carbon、3DSystem\n" +
                    "2、规划：尼龙、树脂、聚对苯二甲酸乙二醇酯、镍基合金、银、钛、热塑性塑料、光聚合物\n" +
                    "3、执行：打印机、加热床、螺丝、轴承、假体、医疗器械、外科手术模型、珠宝\n" +
                    "4、质量保障：GB/T 42617-2023、GB/T 42618-2023、GB/T 42619-2023、GB/T 42620-2023、GB/T 42621-2023、GB/T 42787-2023、GB/T 43110-2023\n" +
                    "5、销售：医疗专业人员、汽车制造商、室内设计师、模型爱好者、牙医、科学博物馆\n";
            String department = "1、销售部门：医疗专业人员、汽车制造商、室内设计师、模型爱好者、牙医、科学博物馆\n" +
                    "2、技术部门：材料挤压工艺、立体光刻、彩色喷墨打印、粉末床熔合工艺、电子束增材制造、光聚合工艺\n" +
                    "3、生产部门：打印机、加热床、螺丝、轴承、假体、医疗器械、外科手术模型、珠宝\n" +
                    "4、售后服务部门：燃油动力、激光焊接、数字化三维、冷喷涂\n" +
                    "5、市场部门：EOS、铂力特、华曙高、Sandivik、Carbon、3DSystem\n";
            String aspect = "1、机械工程师：发动机（内饰）、机翼、起落装置、控制系统、传感器\n" +
                    "2、软件开发人员：3D打印控制系统、变细分数控制、打印平台温度控制、S形曲线控制、调平系统控制、模糊PID算法、神经网络PID算法\n" +
                    "3、材料工程师：尼龙、树脂、聚对苯二甲酸乙二醇酯、镍基合金、银、钛、热塑性塑料、光聚合物\n" +
                    "4、设计建模工程师：打印机、加热床、螺丝、轴承、假体、医疗器械、外科手术模型、珠宝\n" +
                    "5、售后工程师：维修期、生产日期\n" +
                    "6、3D打印销售：医疗专业人员、汽车制造商、室内设计师、模型爱好者、牙医、科学博物馆\n";
            return new Result(process, department, aspect);
        } else if ("甲烷基固体氧化物燃料电池阳极的催化重整研究进展.pdf".equals(fileName)) {
            String process = "1、零部件生产和准备：触摸屏、车内电子设备、仪表盘、摄像头、车窗、遮阳板、后备箱、前背箱、座椅、气囊、方向盘、后视镜\n" +
                    "2、主体结构装配：底盘、车身、\n" +
                    "3、动力系统装配：电机、变速器、传动轴\n" +
                    "4、电池组装配：铅酸蓄电池、金属氢化物镍电池、锰酸锂电池、磷酸铁锂电池、三元锂电池\n" +
                    "5、内饰装配：内外灯光配套，自动大小灯，自动防眩目，日间行车灯，车内舱应急照明灯和逃生灯、音箱\n" +
                    "6、电气系统安装：整流器、电气控制器、电池管理系统\n" +
                    "7、质量检测与安装：GB/T18385-2005、GB/T18386-2017、GB/T18386.1-2021、GB/T18388-2005、GB/T24552-2009、GB/T34585-2017、GB/T36980-2018\n";
            String department = "1、研发部：固态电池、锂电池、电机及驱动系统、充电桩、车辆网、智能驾驶、EV续航里程\n" +
                    "2、采购部：德赛西威、弗迪科技、弗迪动力、比亚迪半导体、弗迪电池、上声电子\n" +
                    "3、生产制造部：触摸屏、车内电子设备、仪表盘、摄像头、车窗、遮阳板、后备箱、前背箱、座椅、气囊、方向盘、后视镜\n" +
                    "4、质量控制部：GB/T18385-2005、GB/T18386-2017、GB/T18386.1-2021、GB/T18388-2005、GB/T24552-2009、GB/T34585-2017、GB/T36980-2018\n" +
                    "5、物流部：海运、铁路运输、中远海运集运、绿色慧联、福佑卡车、地上铁、新沃运力、一微新能源\n" +
                    "6、市场营销部：特斯拉、比亚迪、小鹏、蔚来、理想、问界、小米\n" +
                    "7、售后服务部：维修日期、生产日期、保修期\n" +
                    "8、人力资源部：销售、推广经理、电池工程师、电机工程师、项目经理\n";
            String aspect = "1、售后服务员：维修日期、生产日期、保修期\n" +
                    "2、市场推广经理：特斯拉、比亚迪、小鹏、蔚来、理想、问界、小米\n" +
                    "3、电池工程师：铅酸蓄电池、金属氢化物镍电池、锰酸锂电池、磷酸铁锂电池、三元锂电池\n" +
                    "4、电机工程师：直流电机、交流电机、无刷直流电机、开关阻磁电机、步进电机、无刷永磁电机\n" +
                    "5、控制系统工程师：电力驱动系统、电源系统、辅助系统、电池包系统、整车控制器、驱动电机控制器、电池管理系统\n" +
                    "6、系统集成工程师：电驱系统集成、电气电子架构、多合一技术集成、电驱三合一\n" +
                    "7、质量工程师：GB/T18385-2005、GB/T18386-2017、GB/T18386.1-2021、GB/T18388-2005、GB/T24552-2009、GB/T34585-2017、GB/T36980-2018\n" +
                    "8、研发人员：汽车底盘集成与仿生全国重点实验室、整车先进设计制造技术全国重点实验室、智能绿色车辆与交通全国重点实验室、高端装备机械传动全国重点实验室、比亚迪汽车研究院、国家电动客车电控与安全工程技术研究中心\n";
            return new Result(process, department, aspect);
        } else if ("民用发动机研发项目.pdf".equals(fileName)) {
            String process = "1、设计：波音、Airbus、中国商飞、庞巴迪、达索航空、Embraer\n" +
                    "2、材料准备：铝合金、铝锂合金、钛合金、镍基高温合金、钴基高温合金、A100钢、塑料、织物\n" +
                    "3、加工制造：发动机（内饰）、机翼、起落装置、控制系统\n" +
                    "4、组装测试：飞机、火箭\n" +
                    "5、认证验收：《航空涡喷涡扇涡轴涡桨发动机通用规范》、《航空涡喷涡扇涡轴涡桨发动机通用规范指南》、《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》\n" +
                    "6、生产交付：国航、东航、南航、四川航空、春秋航空、长龙航空、顺丰航空、华夏航空、吉祥航空、成都航空\n";
            String department = "1、设计部门：波音、Airbus、中国商飞、庞巴迪、达索航空、Embraer\n" +
                    "2、采购部门：铝合金、铝锂合金、钛合金、镍基高温合金、钴基高温合金、A100钢、塑料、织物\n" +
                    "3、生产部门：发动机（飞机内饰）\n" +
                    "4、质量控制部门：燃油动力、激光焊接、数字化三维、冷喷涂\n" +
                    "5、测试部门：传感器、控制系统\n" +
                    "6、生产规划部门：国航、东航、南航、四川航空、春秋航空、长龙航空、顺丰航空、华夏航空、吉祥航空、成都航空\n" +
                    "7、认证部门：《航空涡喷涡扇涡轴涡桨发动机通用规范》、《航空涡喷涡扇涡轴涡桨发动机通用规范指南》、《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》\n";
            String aspect = "1、研发工程师：发动机（内饰）、机翼、起落装置、控制系统、传感器\n" +
                    "2、采购专员：铝合金、铝锂合金、钛合金、镍基高温合金、钴基高温合金、A100钢、塑料、织物\n" +
                    "3、机械工程师：传感器、发动机、机翼\n" +
                    "4、工艺工程师：激光焊接、数字化三维、冷喷涂\n" +
                    "5、质量保障工程师：《航空涡喷涡扇涡轴涡桨发动机通用规范》、《航空涡喷涡扇涡轴涡桨发动机通用规范指南》、《民用航空材料、零部件和机载设备技术标准规定》、《中华人民共和国民用航空器适航管理条例》\n" +
                    "6、生产主管：波音、Airbus、中国商飞、庞巴迪、达索航空、Embraer\n" +
                    "7、售后人员：维修期、《中华人民共和国消费者权益保护法》\n";
            return new Result(process, department, aspect);
        } else {
            return new Result("文件内容选择不匹配,请重新挑选");
        }
    }
}
