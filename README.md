# Student-Information-Management-System
与MySQL数据库连接，只涉及到java初学者的增删改查操作。

# 使用操作文档

#### 1.下载解压安装包

#### 2.安装IDEA并激活

#### 3.下载JDK并安装(本人这里使用jdk1.8做示例)

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031122333104.png" alt="image-20231031122333104" style="zoom:50%;" />

#### 4.配置环境变量

右击“此电脑”（或“我的电脑”）—属性----高级系统设置

Path的设置：***\*Administrator的用户变量\****或***\*系统变量\****中的Path，如下图所示

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031123056043.png" alt="image-20231031123056043" style="zoom:50%;" />

在编辑环境变量窗口中点击“新建”，输入“C:\Program Files\Java\jdk1.8.0_181\bin”（或你的安装路径\bin）,完成后所有窗口点确定。

#### 5.测试自己所配置的环境变量是否正确

WINDOWS键+R键，输入cmd，进入命令行界面，输入javac，出现以下内容即配置成功。

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031124027232.png" alt="image-20231031124027232" style="zoom: 67%;" />

#### 6.导入数据库

使用数据库命令行控制台或者Workbench等可视化工具将swing_student导入数据库

#### 7.下载驱动

下载mysql-connector-java-8.0.11驱动连接器（本压缩包内已有）

#### 8.打开IDEA导入项目文件

#### 9.编辑数据库连接

##### （1）点击右面数据库

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031124811679.png" alt="image-20231031124811679" style="zoom: 67%;" />

##### （2）添加数据源，这里使用的是MySQL

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031124851039.png" alt="image-20231031124851039" style="zoom: 67%;" />

##### （3）填写用户，密码，数据库名称(即swing_student)

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031125023018.png" alt="image-20231031125023018" style="zoom:50%;" />

##### （4）添加驱动，选中即可

<img src="C:\Users\86152\AppData\Roaming\Typora\typora-user-images\image-20231031125123658.png" alt="image-20231031125123658" style="zoom: 50%;" />

#### 10.编译运行即可使用
