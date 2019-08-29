了解了Java 8中所有包的作用，对Java 8有了一个整体的了解，另外也是提高了自身的阅读能力。本文列出了Java 8中所有的包，并且对每一个包的功能做了简要的说明，希望对你有所帮助。

—————————————————–

Java平台，标准版第八版

API规范

包名|描述
---|---
java.applet | 提供了需要创建一个小程序和用来跟其他小程序交流上下文的类。
java.awt|包含了所有用于创建用户界面和绘制图形和图像的类。
java.awt.color|提供了颜色空间的类。
java.awt.datatransfer|提供了应用程序内部和应用程序之间进行数据交换的接口和类。
java.awt.dnd|拖放功能是分布在许多提供一个与GUI中的显示元素逻辑相关的两个实体之间交换数据机制的用户界面系统中的直接操作动作。
java.awt.event|提供了处理由AWT组件激活的不同类型的事件的接口和类。
java.awt.font|提供了与字体相关的类和接口。
java.awt.geom|提供了定义和执行二维几何相关对象的Java 2D类。
java.awt.im|提供了输入法框架的类和接口。
java.awt.im.spi|提供了能开发可用于在任何Java运行环境的输入法的接口。
java.awt.image|提供了创建和修改图片的类。
java.awt.image.renderable|提供了生产呈现无关的图像类和接口。
java.awt.print|提供了通用的打印API的类和接口。
java.beans|包含了beans（基于JavaBean架构组件）开发相关的类。
java.beans.beancontext|提供了bean上下文相关的类和接口。
java.io|提供了通过数据流、序列化和文件系统进行的系统系统输入和输出。
java.lang|提供了Java编程语言基础设计的类。

java.lang.annotation

提供了支持Java编程语言的注释设备库

java.lang.instrument

提供了允许Java编程语言代理运行在JVM上的程序的服务。

java.lang.invoke

java.lang.invoke包包含了直接提供Java核心类库和虚拟机的动态语言支持。

java.lang.management

提供了Java运行时监控和管理Java虚拟机和其他组件的管理接口。

java.lang.ref

提供了与垃圾回收器有限程度交互作用的引用对象类。

java.lang.reflect

提供了获取关于类和对象反射信息的类和接口。

java.math

提供了执行任意精度整数算法（BigInteger）和任意精度小数算法的类。

java.net

提供了实现网络应用程序的类。

java.nio

定义了缓冲器，它是数据容器，并且提供其他NIO包的概述。

java.nio.channels

定义了描述连接能够执行I/O操作的实体，例如文件和sockets。定义了多路复用且非阻塞I/O操作的选择器。

java.nio.channels.spi

java.nio.channels包的服务提供者类。

java.nio.charset

定义了用于字节和统一编码字符之间转换的字符集、解码器和编码器。

java.nio.charset.spi

java.nio.charset包的服务提供者类。

java.nio.file

定义了Java虚拟机访问文件、文件属性和文件系统的接口和类。

java.nio.file.attribute

提供访问文件和文件系统属性的接口和类。

java.nio.file.spi

java.nio.file.spi包的服务提供者类。

java.rmi

提供了RMI包。

java.rmi.activation

为RMI对象激活提供支持。

java.rmi.dgc

提供了RMI分布式垃圾收集（DGC）的类和接口。

java.rmi.registry

提供了RMI注册表的一个类和两个接口。

java.rmi.server

提供了支持RMI的服务器端的类和接口。

java.security

提供了安全框架的类和接口。

java.security.acl

这个包里的类和接口已经取代了 in the java.security包的类。

java.security.cert

提供了解析和管理证书、证书废除列表（CRLs）和证书路径的类和接口。

java.security.interfaces

提供了生成在RSA实验室技术说明PKS#1中定义的RSA（Rivest，Shamir和Adleman AsymmetricCipher算法）密匙和在NIST’s FIPS-186中定义的DSA（数字信号算法）密匙的接口。

java.security.spec

提供了密匙规范和算法参数规范的类和接口。

java.sql

提供了使用Java编程语言访问和处理存储在一个数据源（通常是一个关系数据库）的API。

java.text

提供了语言无关的方式处理文本、日期、数字和信息的类和接口。

java.text.spi

java.text包的服务提供者类。

java.time

日期、时间、时刻和时间段的主要API。

java.time.chrono

不同于默认ISO的日历系统的通用API。

java.time.format

提供了打印和解析日期和时间的类。

java.time.temporal

使用字段和单元和日期时间调整来访问日期和时间，

java.time.zone

时区及其规则的支持。

java.util

包含了集合框架、遗留的集合类、事件模型、日期和时间工具、国际化和各种各样的工具类（一个字符编译器、一个随机数生成器和一个位数组）。

java.util.concurrent

用于并发编程的的公共工具类。

java.util.concurrent.atomic

支持单一变量无锁和线程安全的小工具类。

java.util.concurrent.locks

为锁定和等待不同的内置同步和监视器提供一个框架的类和接口。

java.util.function

为微积分表达式和方法引用提供目标类型的功能接口。

java.util.jar

提供了读写JAR（Java归档）文件格式，它是基于标准的的ZIP文件格式和一个可选清单文件的。

java.util.logging

为JavaTM2平台核心日志工具提供了类和接口。

java.util.prefs

此包允许应用程序存储并检索用户和系统首选项和配置数据。

java.util.regex

用于匹配违反了正则表达式指定模式的字符序列的类。

java.util.spi

java.util包的服务提供者类。

java.util.stream

支持在如集合多核处理转换这样的元素流上的功能样式操作的类。

java.util.zip

提供了读写标准的ZIP和GZIP文件格式的类。