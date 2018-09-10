# Apollo是什么？
Apollo（阿波罗）是携程框架部门研发的分布式配置中心，能够集中化管理应用不同环境、不同集群的配置，配置修改后能够实时推送到应用端，并且具备规范的权限、流程治理等特性，适用于微服务配置管理场景。请参考携程Apollo项目主页：[Apollo](http://https://github.com/ctripcorp/apollo "Apollo")

# 运行本demo的前置准备
- 需要了解apollo的基本功能
- 在本机通过apollo源码正确运行apollo的服务端、管理台、客户端
> 强烈建议先根据Apollo官方指南进行实践操作, 请参考[Quick-Start](https://github.com/ctripcorp/apollo/wiki/Quick-Start "Quick-Start")

# 本Demo主要演示功能？
本demo集成了Apollo客户端，用于展示结合Spring环境使用动态配置管理。将原有的使用properties配置文件的方式改为自动注入配置，以纯JavaBean配置方式实现。可以动态的获取由apollo管理的配置信息，做到远程管理，远程发布，自动更新配置。在本demo运行过程中，可在apollo管理台更改配置，可以看到控制台输出的配置，会随着apollo的发布而更新。

# 如何运行本demo？
本demo使用的Apollo版本为0.11.X，在此版本下，需要在apollo-core工程下面配置apollo服务端地址，并且需要自己打包apollo-core和apollo-client，所以需要使用本demo，需要在你的环境下使用0.11.X版本的源码，配置你的环境地址进行打包方可使用。默认情况下本demo依赖的apollo-core使用dev模式meta地址为dev.meta=http://localhost:8080。
- 配置你本机的apollo-core工程的dev.meta地址
- 安装至你的maven仓库
- 启动你本机的apollo服务端、管理台
- 在apollo控制台创建名称为apollo-annotation-demo的APP，并创建如下配置:
    userName = 韩梅梅    
    age = 20    
    address = Beijing    
- 运行Main函数，观察控制台的输出

> 也可以使用你现有的配置，只需要将本demo的resources/app.properties中的app.id改为你自己的appId即可
