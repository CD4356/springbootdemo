<table bgcolor=SeaGreen4>
  <tr width="100%">
    <td>
      <font face="华文新魏">一. 创建项目</font>
    </td>
  </tr>
</table>

##### File -> New -> Project
![](https://img-blog.csdnimg.cn/20190215153232555.png? "悬停显示")

##### 选择 Spring Initializr 创建一个新的Spring Boot项目，如果你嫌麻烦，也可以点击红框中的链接 https://start.spring.io 下载官方网站提供的项目导入使用
![](https://img-blog.csdnimg.cn/20190214232102608.png? "悬停显示")

##### 填写 Group 和 Artifact ，注意Artifact输入框中不要包含大写字母
###### Group： 组织ID，一般分为多个段，这里我只说两段，第一段为域，第二段为公司名称，如果是个人学习项目，你也可以根据个人喜好来填
###### Artifact： 唯一标识，一般是指项目名称
![](https://img-blog.csdnimg.cn/20190214233221458.png? "悬停显示")

##### 因为我们要写的是一个简单的“Hello World！” web应用程序，所以这里添加Web依赖
![](https://img-blog.csdnimg.cn/2019021423532014.png? "悬停显示")

##### Finish 之后，就开始创建项目了，如果你是第一次使用idea创建Spring Boot项目添加web依赖，需要下载相应的依赖包，可能需要等一段时间(与网络有关)
![](https://img-blog.csdnimg.cn/20190215000344758.png? "悬停显示")

<br>

<table bgcolor=SeaGreen4>
  <tr width="100%">
    <td>
      <font face="华文新魏">二. 目录结构</font>
    </td>
  </tr>
</table>

##### 下面是项目的初始化结构，springbootdemoApplication是系统自动生成的Application启动类
###### 由于在创建项目的时候添加了web依赖，所以系统自动在src - main - resources目录下生成了static和templates文件夹，如果创建项目时没有添加依赖，则src - main - resources目录下就只有一个application.properties文件

##### src - main - resources目录结构：
###### static：一般用来存放css，js，image等静态资源文件
 
###### templates：一般用来存放各种html文件
 
###### application.properties：是默认的属性配置文件，用来配置一些Spring Boot相关信息 ( 比如： tomcat端口默认为8080，你在application.properties输入server.port=8001就可以将tomcat端口号修改成 8001 )
![](https://img-blog.csdnimg.cn/20190215172325136.png? "悬停显示")

##### springbootdemoApplication是程序的启动类，该类位于root package下，官方建议其它 .java文件不要与springbootdemoApplication.java文件放在同级目录下，而是在root package下新建package来放置
![](https://img-blog.csdnimg.cn/20190215225134696.png? "悬停显示")

##### 官方建议的代码[目录结构](https://docs.spring.io/spring-boot/docs/2.0.1.RELEASE/reference/htmlsingle/#using-boot-locating-the-main-class) ，虽然没有强制要求，但规范的格式会让人看起来更加舒服
![](https://img-blog.csdnimg.cn/20190215231802169.png? "悬停显示")

##### pom.xml文件：
![](https://img-blog.csdnimg.cn/20190218010026621.png? "悬停显示")

<br>

<table bgcolor=SeaGreen4>
  <tr width="100%">
    <td>
      <font face="华文新魏">三. 编写代码</font>
    </td>
  </tr>
</table>

##### 在root package目录下创建controller包，在controller包中创建TestController类
![](https://img-blog.csdnimg.cn/20190217142604371.png? "悬停显示")

##### 启动程序后，首先打印是Spring Boot的banner日志，这是由字符组成的Spring标语，banner标语是可以自定义的

###### Spring Boot内置tomcat默认的是8080端口

###### Spring Boot项目已启动 语句是在Application启动类的main方法中打印输出的
![](https://img-blog.csdnimg.cn/20190218000046665.png? "悬停显示")

##### 浏览器输入localhost:8080
![](https://img-blog.csdnimg.cn/20190216234426628.png? "悬停显示")

##### 有没有发现在该项目中我们从头到尾都没有手动的去配置 Tomcat 服务器，因为Spring Boot内嵌了tomcat，无需打包成war再执行

<br>

<table bgcolor=SeaGreen4>
  <tr width="100%">
    <td>
      <font face="华文新魏">四.自定义 banner 标志</font>
    </td>
  </tr>
</table>

##### 在src - main - resources目录下创建banner.txt，内容如下：

`${AnsiColor.BRIGHT_RED}` 设置控制台中输出内容的颜色

`${spring-boot.version}` Spring Boot的版本号
![](https://img-blog.csdnimg.cn/20190218004535264.png? "悬停显示")

###### 如果你要设置的banner标语很复杂，可使用[字符画生成工具](http://www.network-science.de/ascii/ "悬停显示")来生成想要的图标

##### 运行后打印结果如下：
![](https://img-blog.csdnimg.cn/20190218005500118.png? "悬停显示")
