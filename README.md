# apollo-annotation-demo
该项目基于Apollo-0.X版本进行测试，主要展示了使用注解的方式在Spring环境下使用Apollo。因为使用的是0.X版本，所以需要在apollo-core工程下配置ConfigService的服务地址。

准备阶段：
  请确保你本地或者服务器的apolloConfigService正确运行
  打包apollo-core到maven仓库
  更新本demo的pom文件中apollo-client的版本号为你使用的版本(0.x版本)
  
 启动main函数即可观察到配置获取情况。
