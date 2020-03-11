package com.zyc.entity;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

@Data
public class BigDataEntity {

	 // baseInfo
	@ExcelProperty("ID")
	private String id;
	@ExcelProperty("姓名")
	private String realname;
	@ExcelProperty("出生日期")
	private String birthday;
	@ExcelProperty("当前区域")
	private String currentareas;
	@ExcelProperty("性别")
	private String sex;
	@ExcelProperty("身份证")
	private String idcard;
	@ExcelProperty("详细地址")
	private String fulladdress;
	//@ExcelIgnore
	//private String currentprovince;// @ExcelProperty("当前省份")
	//@ExcelIgnore
	//private String dataflag;
	//@ExcelIgnore
	//private String userid;// @ExcelProperty("用户ID")
	@ExcelProperty("联系手机")
	private String mobilephone;
	//@ExcelIgnore
	//private String currentcity;
	@ExcelProperty("年龄")
	private String age;
	@ExcelProperty("付费方式")
	private String medicalpayment;
	@ExcelProperty("主要联系人")
	private String contactperson;
	@ExcelProperty("联系人电话")
	private String contactpersonphone;
	/*@ExcelIgnore
	private String currentaddress;*/
	@ExcelProperty("教育程度")
	private String educationlevel;
	/*@ExcelIgnore
	private String householdareas;*/
	/*@ExcelIgnore
	private String householdcity;
	@ExcelIgnore
	private String householdprovince;
	@ExcelIgnore
	private String householdregistration;*/
	@ExcelProperty("结婚状态")
	private String marriagestatus;
	@ExcelProperty("户籍")
	private String nationality;
	@ExcelProperty("职业")
	private String occupation;
	@ExcelProperty("与本人关系")
	private String relationship;
	@ExcelProperty("户口")
	private String residencestatus;
	@ExcelProperty("是否退休")
	private String retirestatus;
	@ExcelProperty("收入")
	private String revenue;
	@ExcelProperty("电话")
	private String telphone;

    //life
	@ExcelProperty("茶/ml")
	private String teaml;
	@ExcelProperty("吃豆制品")
	private String eatbeanproduct;
	@ExcelProperty("口味")
	private String taste;
	@ExcelProperty("年")
	private String years;
	@ExcelProperty("数量")
	private String number;
	@ExcelProperty("茶")
	private String tea;
	@ExcelProperty("戒酒情况")
	private String giveupdrink;
	@ExcelProperty("面粉")
	private String flour;
	@ExcelProperty("荤素")
	private String meatandvegetables;
	@ExcelProperty("25岁前体重")
	private String tfyearsoldweight;
	@ExcelProperty("通勤时间")
	private String housework;
	@ExcelProperty("减重")
	private String lyloseweight;
	@ExcelProperty("几杯茶")
	private String teaserveralcups;
	@ExcelProperty("牛奶")
	private String milk;
	@ExcelProperty("营养品")
	private String nourishement;
	@ExcelProperty("饮酒情况")
	private String drink;
	@ExcelProperty("体重结果")
	private String weightresult;
	@ExcelProperty("打鼾")
	private String snore;
	@ExcelProperty("戒烟")
	private String warngiveupsmoke;
	@ExcelProperty("杂粮量")
	private String coarsecerealsquantity;
	@ExcelProperty("呼吸气短")
	private String lybreathpanting;
	@ExcelProperty("茶类")
	private String teakind;
	@ExcelProperty("戒烟情况")
	private String giveupsmoke;
	@ExcelProperty("几倍咖啡")
	private String coffeeserveralcups;
	@ExcelProperty("有害健康")
	private String harmfulhealth;
	@ExcelProperty("戒烟次数")
	private String giveupsmoketimes;
	@ExcelProperty("杂粮")
	private String coarsecereals;
	@ExcelProperty("是否咳痰粘液")
	private String lybex;
	@ExcelProperty("疲劳")
	private String daytimefatigue;
	@ExcelProperty("戒烟年限")
	private String giveupsmokeyear;
	@ExcelProperty("咖啡量")
	private String coffeeml;
	@ExcelProperty("烟龄")
	private String pastsmokeyear;
	@ExcelProperty("面粉量")
	private String flourquantity;
	@ExcelProperty("吸烟量")
	private String pastsmokequantity;
	@ExcelProperty("体重变化")
	private String lybodyweightchange;
	@ExcelProperty("米量")
	private String ricequantity;
	@ExcelProperty("体力活动")
	private String physicalexertion;
	@ExcelProperty("睡眠")
	private String sleepapnea;
	@ExcelProperty("业余运动")
	private String sparetimesport;
	@ExcelProperty("劝诫戒烟")
	private String exhortgiveupsmoke;
	@ExcelProperty("米")
	private String rice;
	@ExcelProperty("未放弃原因")
	private String nevergiveupbecause;
	@ExcelProperty("警告戒烟")
	private String warngiveupdrink;
	@ExcelProperty("交通工具")
	private String traffictool;
	@ExcelProperty("分钟")
	private String minute;
	@ExcelProperty("吸烟情况")
	private String smokestatus;
	@ExcelProperty("是否戒烟")
	private String isgiveupsmoke;
	@ExcelProperty("咖啡")
	private String coffee;
	@ExcelProperty("减肥措施")
	private String lychoosemethod;// 您采取了哪些减肥措施
	@ExcelProperty("吃蔬菜")
	private String eatvegetables;
	@ExcelProperty("一直吸烟")
	private String harmless;// 觉得无害健康，一直吸烟
	@ExcelProperty("吃水果")
	private String eatfruit;
	
	@ExcelProperty("冠心病子女数")
	private String coronarychildnumber;
	@ExcelProperty("糖尿病子女")
	private String diabetesrelatives;
	@ExcelProperty("高血脂子女数")
	private String hypertchildnumber;
	@ExcelProperty("高血脂亲属")
	private String hyperlipidaemiarela;
	@ExcelProperty("糖尿病亲属人数")
	private String diabetesrelanumber;
	@ExcelProperty("冠心病亲属")
	private String coronaryrelatives;
	@ExcelProperty("脑卒中")
	private String apoplexy;
	@ExcelProperty("脑卒中亲属数")
	private String coronaryrelanum;
	@ExcelProperty("脑卒中子女数")
	private String apoplexychildnum;
	@ExcelProperty("冠心病")
	private String coronary;
	@ExcelProperty("高血脂人数")
	private String hypertenrelatnum;
	@ExcelProperty("高血脂亲属")
	private String hypertenrelat;
	@ExcelProperty("脑卒中亲属")
	private String apoplexyrelatives;
	@ExcelProperty("高血脂子女人数")
	private String hyperlipchildnum;
	@ExcelProperty("亲属")
	private String relativesnumber;
	@ExcelProperty("高脂血症亲属人数")
	private String hyperliprelatnum;
	@ExcelProperty("脑卒中(中风)")
	private String apoplexyrelatnum;
	@ExcelProperty("糖尿病子女数")
	private String diabeteschildnum;
	@ExcelProperty("高血压")
	private String hypertension;
	@ExcelProperty("糖尿病")
	private String diabetes;
	@ExcelProperty("高脂血症")
	private String hyperlipidaemia;
	@ExcelProperty("子女")
	private String childrennumber;
	
	// pasthistory
	@ExcelProperty("就诊机构级别")
	private String firstinstitutionslevel;
	@ExcelProperty("测量频率")
	private String measuretimeofweek;
	@ExcelProperty("治疗前血压最高值")
	private String agohyperhighvalue;
	@ExcelProperty("用药品种")
	private String hypertdrugkind;// hypertensiondrugkind
	@ExcelProperty("血脂异常年限")
	private String dyslipidemiayear;
	@ExcelProperty("脑血管发病次数")
	private String diseasetime;
	@ExcelProperty("阵发性房颤")
	private String paroxysmatrialfabri;
	@ExcelProperty("脑血管病类型")
	private String cerebralvasculartype;
	@ExcelProperty("服用调脂药")
	private String dyslipidemiadrugkind;
	@ExcelProperty("尿蛋白")
	private String urinaryproteinvalue;
	@ExcelProperty("血脂异常类型")
	private String dyslipidemiatype;
	@ExcelProperty("本次调查以前血压测量频率")
	private String hypertensionmeasuresta;
	@ExcelProperty("诊断依据")
	private String firstdiagnosisbasis;
	@ExcelProperty("首次诊断依据")
	private String firstcdmaindiagnoses;
	@ExcelProperty("末次住院期间是否接受康复治疗")
	private String lasthosphealtreat;
	@ExcelProperty("冠心病发病次数")
	private String coronarydiseasetime;
	@ExcelProperty("治疗前血压最高值")
	private String agohyperlowvalue;
	@ExcelProperty("糖尿病确诊时间")
	private String diabetesyear;
	@ExcelProperty("血脂异常确诊时间")
	private String dyslipidemiameasurestat;
	@ExcelProperty("主要诊断")
	private String firstmaindiagnoses;
	@ExcelProperty("血压控制情况")
	private String hypercontrlowvalue;
	@ExcelProperty("末次诊断依据")
	private String lastcdmainbasis;
	@ExcelProperty("出院后是否接受康复治疗")
	private String firstdischargehealtreat;
	@ExcelProperty("首次就诊机构级别")
	private String firstcdinstitutionslevel;
	@ExcelProperty("末次就诊机构级别")
	private String lastcdinstitutionslevel;
	@ExcelProperty("化验时间")
	private String creatininetestingdate;
	@ExcelProperty("是否服用抗栓药物")
	private String eatantithrombotic;
	@ExcelProperty("共几枚")
	private String piece;
	@ExcelProperty("末次出院后是否接受康复治疗")
	private String lastdischargehealtreat;
	@ExcelProperty("房颤 ")
	private String alwaysatrialfabrillation;
	@ExcelProperty("肌酐测量频率")
	private String creatininemeasurestatus;
	@ExcelProperty("脑血管病史")
	private String cerebralvascular;
	@ExcelProperty("首次确诊时间")
	private String firstatrialfabryear;
	@ExcelProperty("血脂异常")
	private String dyslipidemia;
	@ExcelProperty("是否服用药物治疗")
	private String drugtherapy;
	@ExcelProperty("用药品种")
	private String antithrombotickind;
	@ExcelProperty("是否家庭自测血压")
	private String homemeasurestatus;
	@ExcelProperty("肾病")
	private String kidneydisease;
	@ExcelProperty("降压药")
	private String hypertensiondrug;
	@ExcelProperty("血糖测量频率")
	private String hypoglycemiameasurestat;
	@ExcelProperty("吃降压药年限")
	private String eathypertensiondrugyear;
	@ExcelProperty("测量值大概是低值")
	private String measurelowvalue;
	@ExcelProperty("初次诊断时的年龄")
	private String firstdiagnosesage;
	@ExcelProperty("末次就诊机构级别")
	private String lastinstitutionslevel;
	@ExcelProperty("吃降脂药")
	private String eatdyslipidemiadrug;
	@ExcelProperty("血压控制情况状态")
	private String hypertensioncontrolstat;
	@ExcelProperty("肾病类型")
	private String kidneydiagnosestype;
	@ExcelProperty("血压控制情况")
	private String hypercontrhighvalue;
	@ExcelProperty("测量地点")
	private String measureaddress;
	@ExcelProperty("是否应用降糖药")
	private String eathypoglycemicdrug;
	@ExcelProperty("是否植入过支架")
	private String coronarydiseasestent;
	@ExcelProperty("评估人")
	private String appraiser;
	@ExcelProperty("评估时间")
	private String evaluationdate;
	@ExcelProperty("心脏病史")
	private String heartdisease;
	@ExcelProperty("高血压确诊时间")
	private String hypertensionyear;
	@ExcelProperty("用药年限")
	private String eatantithromboticyear;
	@ExcelProperty("用药情况")
	private String eatantithromboticstatus;
	@ExcelProperty("尿潜血值")
	private String urinaryoccultbloodvalue;
	@ExcelProperty("确诊时间")
	private String urinaryyear;
	@ExcelProperty("首次发病时间")
	private String firstdiseaseyear;
	@ExcelProperty("血糖控制情况")
	private String hypoglycemiccontrolstat;
	@ExcelProperty("测量值大概是高值")
	private String measurehighvalue;
	@ExcelProperty("心脏病类型")
	private String heartdiseasetype;
	@ExcelProperty("房颤")
	private String fabrillation;
	@ExcelProperty("降糖药种类")
	private String hypoglycemicdrugkind;
	@ExcelProperty("化验时间")
	private String urinarydate;
	@ExcelProperty("药物治疗年限")
	private String drugtherapyyes;
	@ExcelProperty("MRS评分")
	private String msrscore;
	@ExcelProperty("末次发病时间")
	private String lastdiseaseyear;
	@ExcelProperty("药物名称")
	private String hypertensiondrugname;
	@ExcelProperty("肌酐化验")
	private String creatininetesting;
	// @ExcelProperty("")private String firsthosphealtreat;
	@ExcelProperty("尿常规测量频率")
	private String routineurinemeasurestat;
	@ExcelProperty("末次主要诊断")
	private String lastmaindiagnoses;
	@ExcelProperty("冠心病首次确诊时间")
	private String firstcoronarydiseaseyear;
	@ExcelProperty("服降糖药")
	private String hypoglycemicdrugname;
	@ExcelProperty("冠心病")
	private String coronarydisease;
	@ExcelProperty("冠心病末次发病时间")
	private String lastcdyear;
	@ExcelProperty("用药情况")
	private String eathypertensiondrugstat;
	@ExcelProperty("血压")
	private String phypertension;// as phypertension;
	@ExcelProperty("糖尿病史")
	private String pdiabetes;// as pdiabetes
	
	//operation
	@ExcelProperty("实施CAS手术机构名称")
	private String casinstitutionsname;
	// @ExcelProperty("")private String caspostoperreexam;
	@ExcelProperty("内膜剥脱术(CEA)状态")
	private String ceastatus;
	@ExcelProperty("复查方式")
	private String ceareexammode;
	@ExcelProperty("治疗方式")
	private String ceatherapymode;
	@ExcelProperty("出血性卒中治疗方式")
	private String apoplexymode;
	@ExcelProperty("再次干预")
	private String ceaagain;
	@ExcelProperty("手术时间")
	private String eiyear;
	@ExcelProperty("外科搭桥术")
	private String cabg;
	@ExcelProperty("支架术（CAS）")
	private String cas;
	@ExcelProperty("介入术（PCI支架）")
	private String pci;
	@ExcelProperty("内膜剥脱术手术时间")
	private String ceayear;
	// @ExcelProperty("")private String extracranialintrabypass;
	@ExcelProperty("支架术位置")
	private String casstatus;
	@ExcelProperty("术后再狭窄")
	private String cearestenosis;
	@ExcelProperty("出血性卒中治年份")
	private String apoplexyyear;
	@ExcelProperty("支架术年份")
	private String casyear;
	// @ExcelProperty("")private String ceapostoperreexam;
	@ExcelProperty("介入术年份")
	private String pciyear;
	// @ExcelProperty("")private String apoplexy2;
	@ExcelProperty("CEA复查时间")
	private String ceareexamdate;
	@ExcelProperty("复查方式")
	private String casreexammode;
	@ExcelProperty("CAS复查时间")
	private String casreexamdate;
	@ExcelProperty("冠状动脉相关手术时间")
	private String cabgyear;
	@ExcelProperty("实施CEA手术机构名称")
	private String ceainstitutionsname;
	@ExcelProperty("内膜剥脱术(CEA)")
	private String cea;
	
	//body
	@ExcelProperty("收缩压第一次")
	private String firstsbp;
	@ExcelProperty("平均收缩压")
	private String avgsbp;
	@ExcelProperty("脉搏一")
	private String firstpulse;
	@ExcelProperty("脉搏二")
	private String secondpulse;
	@ExcelProperty("检查时间")
	private String examdatetime;
	@ExcelProperty("体重")
	private String weight;
	@ExcelProperty("检查血压时间")
	private String bloodpressuredatetime;
	@ExcelProperty("舒张压第二次")
	private String seconddbp;
	@ExcelProperty("舒张压第一次")
	private String firstdbp;
	@ExcelProperty("平均脉搏")
	private String avgpulse;
	@ExcelProperty("平均舒张压")
	private String avgdbp;
	@ExcelProperty("腰围")
	private String waistline;
	@ExcelProperty("收缩压第二次")
	private String secondsbp;
	@ExcelProperty("身高")
	private String height;
	@ExcelProperty("BMI")
	private String bmi;
	//心电图
	@ExcelProperty("检查时间")
	private String ecgexamdatetime;
	@ExcelProperty("是否房颤")
	private String atrialfabrillation;
	@ExcelProperty("检查人")
	private String examiner;
	@ExcelProperty("描述")
	private String description;
	@ExcelProperty("检查结果")
	private String ecgexamresult;
	//lab
	
	@ExcelProperty("甘油三酯")
	private String triglyceride;
	@ExcelProperty("肾功能检测时间")
	private String kidneyfunctionexamdatatime;
	@ExcelProperty("糖化血红蛋白检测时间")
	private String hbalceaxmdatetime;
	@ExcelProperty("同型半胱氨酸")
	private String hcyvalue;
	@ExcelProperty("尿酸")
	private String uavalue;
	@ExcelProperty("血脂检查时间")
	private String bloodfatexamdatatime;
	@ExcelProperty("总胆固醇")
	private String cholvalue;
	@ExcelProperty("肌酐")
	private String creatininevalue;
	@ExcelProperty("糖化血红蛋白")
	private String hbalcvalue;
	@ExcelProperty("高密度脂蛋白胆固醇")
	private String hdlc2;
	@ExcelProperty("血糖检查时间")
	private String gluexamdatatime;
	@ExcelProperty("低密度胆固醇")
	private String ldlc;
	@ExcelProperty("高密度胆固醇")
	private String hdlc;
	@ExcelProperty("同型半胱氨酸检测时间")
	private String hcyexamdatatime;
	@ExcelProperty("空腹血糖")
	private String fbgvalue;
	@ExcelProperty("尿素氮")
	private String bunvalue;
	
	//guide
	@ExcelProperty("筛查员")
	private String  screeningstaff;
	@ExcelProperty("指导建议")
	private String guidestate;
	@ExcelProperty("机构")
	private String unitname;
}
