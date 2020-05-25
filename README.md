# course-online
这是一个简单选课系统
# 使用的框架和技术
- Spring Boot
- Mybatis
- MySQL数据库
- Thymeleaf模板引擎
- Druid连接池
- Maven
- Git
# 功能介绍
- 登录
- 修改密码
- 查看个人信息
- 选课
- 退选
- 查看教师信息
- 查看已选课程
- 课程容量实时变化
- 退出
# 对Spring Boot的定制
## 登录拦截校验

基本思路：
1. 登录时将学生对象存入session中
2. 设置拦截器，访问资源前先检查session中是否有已存入的对象
3. 如果有，则放行；如果没有，则转发到首页

注意：有些请求或路径不能拦截，比如访问首页的路径，访问登录页面的请求等。
这些路径应该被排除在外。


## Spring MVC的扩展

某些页面需要重定向，但controller方法的返回值会经过视图解析器解析映射到模板页面
所以手动添加页面到“返回值”的视图映射，方便重定向

实现方式：
新建一个配置类，实现`WebMvcConfigurer`接口，然后将其加入IoC容器中，便会自动生效。

实现接口方法，就能扩展Spring MVC的功能，比如添加视图映射，添加拦截器

# 其他
使用Thymeleaf模板引擎构建动态页面，能在前端直接获取到controller的Model对象中的值
使用的JQuery的js文件通过引入JQuery的webjar坐标获得