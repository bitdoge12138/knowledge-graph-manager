package com.chen.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/ontology")
public class InfoController {
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws InterruptedException {
        if (file.isEmpty()) {
            return "请选择文件上传";
        }
        String fileName = file.getOriginalFilename();
        System.out.println("------" + fileName);
        Thread.sleep(3000);
        if ("家电可重用本体.docx".equals(fileName)) {
            return "顶层概念：\n" +
                    "\t家电制造业\n" +
                    "\t产品分类\n" +
                    "\t制造企业\n" +
                    "\t制造工艺\n" +
                    "\t供应链\n" +
                    "\t销售和市场\n" +
                    "\t标准和法规\n" +
                    "细化概念：\n" +
                    "\t产品分类\n" +
                    "\t洗衣机\n" +
                    "\t功率\n" +
                    "\t容量\n" +
                    "\t能效等级\n" +
                    "\t冰箱\n" +
                    "\t容积\n" +
                    "\t冷藏方式\n" +
                    "\t能效等级\n" +
                    "\t空调\n" +
                    "\t制冷量\n" +
                    "\t能效等级\n" +
                    "\t类型（壁挂式、柜式等）\n" +
                    "\t制造企业\n" +
                    "\t企业名称\n" +
                    "\t地址\n" +
                    "\t联系人\n" +
                    "\t生产能力\n" +
                    "\t资质认证\n" +
                    "\t制造工艺\n" +
                    "\t制造步骤\n" +
                    "\t使用材料\n" +
                    "\t工艺标准\n" +
                    "\t质量控制方法\n" +
                    "\t供应链\n" +
                    "\t供应商\n" +
                    "\t原材料\n" +
                    "\t物流\n" +
                    "\t库存管理\n" +
                    "\t销售和市场\n" +
                    "\t销售渠道\n" +
                    "\t市场需求\n" +
                    "\t客户反馈\n" +
                    "\t竞争对手分析\n" +
                    "\t标准和法规\n" +
                    "\t国家标准\n" +
                    "\t行业标准\n" +
                    "\t环保法规\n" +
                    "\t安全法规\n";
        } else if ("增材可重用本体.docx".equals(fileName)) {
            return "顶层概念：\n" +
                    "\t增材制造业\n" +
                    "\t产品分类\n" +
                    "\t制造企业\n" +
                    "\t制造工艺\n" +
                    "\t供应链\n" +
                    "\t设计与工程\n" +
                    "\t质量控制与认证\n" +
                    "\t市场与应用领域\n" +
                    "\t标准和法规\n" +
                    "细化概念：\n" +
                    "产品分类\n" +
                    "\t3D打印机\n" +
                    "\t打印精度\n" +
                    "\t层厚\n" +
                    "\t打印速度\n" +
                    "\t打印材料\n" +
                    "\t材料类型（如金属、聚合物、陶瓷等）\n" +
                    "\t供应商\n" +
                    "\t打印件\n" +
                    "\t物理特性\n" +
                    "\t应用领域\n" +
                    "制造企业\n" +
                    "\t企业名称\n" +
                    "\t地址\n" +
                    "\t联系人\n" +
                    "\t设备能力\n" +
                    "\t专利信息\n" +
                    "制造工艺\n" +
                    "\t技术类型（FDM、SLA、SLS）\n" +
                    "\t制造步骤\n" +
                    "\t材料使用\n" +
                    "\t层厚\n" +
                    "\t打印速度\n" +
                    "供应链\n" +
                    "\t原材料供应商\n" +
                    "\t材料种类\n" +
                    "\t打印设备供应商\n" +
                    "设计与工程\n" +
                    "\tCAD文件\n" +
                    "\t设计参数\n" +
                    "\t材料选择\n" +
                    "\t拓扑优化\n" +
                    "质量控制与认证\n" +
                    "\t检测标准\n" +
                    "\t认证标准\n" +
                    "\t测试方法\n" +
                    "市场与应用领域\n" +
                    "\t应用领域（航空航天、医疗、汽车等）\n" +
                    "\t市场需求\n" +
                    "标准和法规\n" +
                    "\t国际标准\n" +
                    "\t行业标准\n" +
                    "\t安全操作规程\n";
        } else if ("新能源可重用本体.docx".equals(fileName)) {
            return "顶层概念\n" +
                    "\t新能源车制造业\n" +
                    "\t产品分类\n" +
                    "\t制造企业\n" +
                    "\t制造工艺\n" +
                    "\t供应链\n" +
                    "\t销售和市场\n" +
                    "\t标准和法规\n" +
                    "细化概念\n" +
                    "\t产品分类:\n" +
                    "\t电动轿车\n" +
                    "\t混合动力车\n" +
                    "\t商用电动车\n" +
                    "\t制造企业:\n" +
                    "\t企业名称\n" +
                    "\t地址\n" +
                    "\t研发能力\n" +
                    "\t制造工艺:\n" +
                    "\t制造步骤\n" +
                    "\t使用材料\n" +
                    "\t工艺标准\n" +
                    "\t供应链:\n" +
                    "\t供应商\n" +
                    "\t原材料\n" +
                    "\t物流\n" +
                    "\t销售和市场:\n" +
                    "\t销售渠道\n" +
                    "\t市场需求\n" +
                    "\t客户反馈\n" +
                    "\t标准和法规:\n" +
                    "\t国家标准\n" +
                    "\t环保法规\n";
        } else if ("航天可重用本体.docx".equals(fileName)) {
            return "顶层概念\n" +
                    "\t航天航空制造业\n" +
                    "\t产品分类\n" +
                    "\t制造企业\n" +
                    "\t制造工艺\n" +
                    "\t供应链\n" +
                    "\t研发与设计\n" +
                    "\t标准和法规\n" +
                    "\t项目管理\n" +
                    "\t设备维护与检测\n" +
                    "细化概念\n" +
                    "产品分类：\n" +
                    "\t卫星\n" +
                    "\t运载火箭\n" +
                    "\t战斗机\n" +
                    "\t无人机\n" +
                    "制造企业：\n" +
                    "\t企业名称\n" +
                    "\t地址\n" +
                    "\t联系人\n" +
                    "\t生产能力\n" +
                    "\t资质认证\n" +
                    "\t科研能力\n" +
                    "制造工艺：\n" +
                    "\t制造步骤\n" +
                    "\t使用材料\n" +
                    "\t工艺标准\n" +
                    "\t质量控制方法\n" +
                    "\t测试流程\n" +
                    "供应链：\n" +
                    "\t供应商\n" +
                    "\t原材料\n" +
                    "\t零部件\n" +
                    "\t物流\n" +
                    "\t库存管理\n" +
                    "研发与设计：\n" +
                    "\t设计需求\n" +
                    "\t设计方案\n" +
                    "\t模拟与测试\n" +
                    "\t原型开发\n" +
                    "标准和法规：\n" +
                    "\t航空航天标准\n" +
                    "\t质量管理标准\n" +
                    "\t安全法规\n" +
                    "项目管理：\n" +
                    "\t项目计划\n" +
                    "\t资源分配\n" +
                    "\t进度控制\n" +
                    "\t风险管理\n" +
                    "设备维护与检测：\n" +
                    "\t设备种类\n" +
                    "\t维护周期\n" +
                    "\t维修记录\n";
        } else {
            return "文件内容选择不匹配,请重新挑选";
        }
    }
}