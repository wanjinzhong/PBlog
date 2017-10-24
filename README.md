## Potafish Blog
![PBlog ](https://raw.githubusercontent.com/wanjinzhong/PBlog/master/Resource/Logo/LOGO-128.png)

Potafish blog is a open-source project.

### How to setup the development environment
1. Email to the autor([wan_neil@163.com](mailto:wan_neil@163.com)) for database account
2. Install jdk1.8 tomcat8.0 maven3.*
3. Fork and clone pblog
4. Download mysql driver to {TOMCAT_HOME}/lib
5. Copy /PBlog/Resource/config/context.xml file to {TOMCAT_HOME}/conf(if your mysql driver version is 6, Please modify driverClassName to "com.mysql.cj.jdbc.Driver")
5. Fill your database account in the configuration file
7. run

**Pls do not push your context.xml to github !**

[www.potafish.com](http://www.potafish.com)