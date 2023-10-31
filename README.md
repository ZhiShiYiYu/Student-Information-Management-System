# Student-Information-Management-System
与MySQL数据库连接，只涉及到java初学者的增删改查操作。

# 使用操作文档

#### 1.下载解压安装包

#### 2.安装IDEA并激活

#### 3.下载JDK并安装(本人这里使用jdk1.8做示例)

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/6e0dda6a-cd3a-46e5-9b05-5eb39eca0ccc)


#### 4.配置环境变量

右击“此电脑”（或“我的电脑”）—属性----高级系统设置

Path的设置：Administrator的用户变量或系统变量中的Path，如下图所示

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/7eaf77af-2a4b-4abd-9923-5b6cbb53c0e9)

在编辑环境变量窗口中点击“新建”，输入“C:\Program Files\Java\jdk1.8.0_181\bin”（或你的安装路径\bin）,完成后所有窗口点确定。

#### 5.测试自己所配置的环境变量是否正确

WINDOWS键+R键，输入cmd，进入命令行界面，输入javac，出现以下内容即配置成功。

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/a226188a-6ae4-4a39-84f1-864d18cf4420)

#### 6.导入数据库

使用数据库命令行控制台或者Workbench等可视化工具将swing_student导入数据库

#### 7.下载驱动

下载mysql-connector-java-8.0.11驱动连接器（本压缩包内已有）

#### 8.打开IDEA导入项目文件

#### 9.编辑数据库连接

##### （1）点击右面数据库

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/cad8ff3c-6c90-482e-8609-76b3662a3a17)

##### （2）添加数据源，这里使用的是MySQL

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/5d9ce112-8136-4dbd-a027-52f07059e8fc)

##### （3）填写用户，密码，数据库名称(即swing_student)

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/be61fc98-a2b9-4f2c-b0e1-06d2676750f1)

##### （4）添加驱动，选中即可

![image](https://github.com/ZhiShiYiYu/Student-Information-Management-System/assets/105644411/534ab305-596b-4c88-97ab-d130661a51ca)

#### 10.编译运行即可使用
