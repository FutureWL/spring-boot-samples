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
java.lang.annotation|提供了支持Java编程语言的注释设备库
java.lang.instrument|提供了允许Java编程语言代理运行在JVM上的程序的服务。
java.lang.invoke|java.lang.invoke包包含了直接提供Java核心类库和虚拟机的动态语言支持。
java.lang.management|提供了Java运行时监控和管理Java虚拟机和其他组件的管理接口。
java.lang.ref|提供了与垃圾回收器有限程度交互作用的引用对象类。
java.lang.reflect|提供了获取关于类和对象反射信息的类和接口。
java.math|提供了执行任意精度整数算法（BigInteger）和任意精度小数算法的类。
java.net|提供了实现网络应用程序的类。
java.nio|定义了缓冲器，它是数据容器，并且提供其他NIO包的概述。
java.nio.channels|定义了描述连接能够执行I/O操作的实体，例如文件和sockets。定义了多路复用且非阻塞I/O操作的选择器。
java.nio.channels.spi|java.nio.channels包的服务提供者类。
java.nio.charset|定义了用于字节和统一编码字符之间转换的字符集、解码器和编码器。
java.nio.charset.spi|java.nio.charset包的服务提供者类。
java.nio.file|定义了Java虚拟机访问文件、文件属性和文件系统的接口和类。
java.nio.file.attribute|提供访问文件和文件系统属性的接口和类。
java.nio.file.spi|java.nio.file.spi包的服务提供者类。
java.rmi|提供了RMI包。
java.rmi.activation|为RMI对象激活提供支持。
java.rmi.dgc|提供了RMI分布式垃圾收集（DGC）的类和接口。
java.rmi.registry|提供了RMI注册表的一个类和两个接口。
java.rmi.server|提供了支持RMI的服务器端的类和接口。
java.security|提供了安全框架的类和接口。
java.security.acl|这个包里的类和接口已经取代了 in the java.security包的类。
java.security.cert|提供了解析和管理证书、证书废除列表（CRLs）和证书路径的类和接口。
java.security.interfaces|提供了生成在RSA实验室技术说明PKS#1中定义的RSA（Rivest，Shamir和Adleman AsymmetricCipher算法）密匙和在NIST’s FIPS-186中定义的DSA（数字信号算法）密匙的接口。
java.security.spec|提供了密匙规范和算法参数规范的类和接口。
java.sql|提供了使用Java编程语言访问和处理存储在一个数据源（通常是一个关系数据库）的API。
java.text|提供了语言无关的方式处理文本、日期、数字和信息的类和接口。
java.text.spi|java.text包的服务提供者类。
java.time|日期、时间、时刻和时间段的主要API。
java.time.chrono|不同于默认ISO的日历系统的通用API。
java.time.format|提供了打印和解析日期和时间的类。
java.time.temporal|使用字段和单元和日期时间调整来访问日期和时间，
java.time.zone|时区及其规则的支持。
java.util|包含了集合框架、遗留的集合类、事件模型、日期和时间工具、国际化和各种各样的工具类（一个字符编译器、一个随机数生成器和一个位数组）。
java.util.concurrent|用于并发编程的的公共工具类。
java.util.concurrent.atomic|支持单一变量无锁和线程安全的小工具类。
java.util.concurrent.locks|为锁定和等待不同的内置同步和监视器提供一个框架的类和接口。
java.util.function|为微积分表达式和方法引用提供目标类型的功能接口。
java.util.jar|提供了读写JAR（Java归档）文件格式，它是基于标准的的ZIP文件格式和一个可选清单文件的。
java.util.logging|为JavaTM2平台核心日志工具提供了类和接口。
java.util.prefs|此包允许应用程序存储并检索用户和系统首选项和配置数据。
java.util.regex|用于匹配违反了正则表达式指定模式的字符序列的类。
java.util.spi|java.util包的服务提供者类。
java.util.stream|支持在如集合多核处理转换这样的元素流上的功能样式操作的类。
java.util.zip|提供了读写标准的ZIP和GZIP文件格式的类。
javax.accessibility|定义了用户界面组件和提供了访问其他组件的辅助技术之间的协议。
javax.activation|
javax.activity|包含了解组期间通过ORB机制抛出异常的相关活动服务。
javax.annotation|
javax.annotation.processing|声明注释处理器和允许注释处理器与注释处理工具环境通信的工具。
javax.crypto|提供了加密操作的类和接口。
javax.crypto.interfaces|提供了RSA实验室的PKCS＃3中定义的Diffie-Hellman密钥接口。
javax.crypto.spec|提供了密匙规范和算法参数规范的类和接口。
javax.imageio|Java 图像 I/O API 的主包。
javax.imageio.event|一个在读写图像期间Java 图像 I/O API处理同步通知的事件的包。
javax.imageio.metadata|Java 图像 I/O API处理读写元数据的一个包。
javax.imageio.plugins.bmp|包含了用于内置BMP插件公共类的包。
javax.imageio.plugins.jpeg|支持内置JPEG插件的类。
javax.imageio.spi|Java图像I/O API的包含阅读器、写入器、转码器和流，和一个运行时注册表的插件接口的包。
javax.imageio.stream|Java图像I/O API处理低级文件和流的包。
javax.jws|
javax.jws.soap|
javax.lang.model|用于模拟Java编程语言的类和包层次结构。
javax.lang.model.element|用于模拟Java编程语言的元素接口。
javax.lang.model.type|用于模拟Java编程语言的类型的接口。
javax.lang.model.util|帮助在编程元素和类型过程中处理的实用程序。
javax.management|提供了Java管理拓展的核心类。
javax.management.loading|提供了实现高级动态加载的类。
javax.management.modelmbean|提供了ModelMBean类的定义。
javax.management.monitor|提供了监视器类的定义。
javax.management.openmbean|提供了开放数据类型和开放MNBeam描述符类。
javax.management.relation|提供了关系服务的定义。
javax.management.remote|远程访问JMX MBean服务器的接口。
javax.management.remote.rmi|RMI连接器是一个使用RMI来传输客户端请求道一个远程MBean服务器的 JMX Remote API 连接器。
javax.management.timer|提供了MBean定时器的定义。
javax.naming|提供了访问命名服务的类和接口。
javax.naming.directory|扩展了he javax.naming包提供访问目录服务的功能。
javax.naming.event|提供了当访问命名和目录服务时支持事件通知。
javax.naming.ldap|提供了支持LDAPv3 扩展操作和控制。
javax.naming.spi|
javax.net|提供了网络应用的类。
javax.net.ssl|提供了安全套接字包。
javax.print|提供了Java打印服务API 的主要类和接口。
javax.print.attribute|提供了描述Java打印服务属性和如何将它们收集到属性集中的类和接口。
javax.print.attribute.standard|包包含了特定打印属性的类。
javax.print.event|包含了事件类和监听接口。
javax.rmi|包含了RMI-IIOP的用户APIs
javax.rmi.CORBA|包含了 RMI-IIOP的便携性APIs。
javax.rmi.ssl|提供了安全套接字层（SSL）或传输层安全（TLS）协议之上的RMIClientSocketFactory和RMIServerSocketFactory的实现。
javax.script|组成API脚本的和接口定义了Java TM脚本引擎并提供了它们在Java应用程序中使用的一个。框架
javax.security.auth|此包提供了验证和授权的框架。
javax.security.auth.callback|此包提供了为了检索信息（验证包含例如用户名或密码的数据）或者呈现信息（例如错误和警告信息）相作用的所需要的服务类。
javax.security.auth.kerberos|此包包含了Kerberos 网络验证协议相关的实用工具类。
javax.security.auth.login|此包提供了一个可插拔的认证框架。
javax.security.auth.spi|此包提供了用于实现可插入验证模块的接口。
javax.security.auth.x500|此包包含了可用于存储X500 Principal 和 X500私有证书的主题类。
javax.security.cert|提供了用于公钥证书的类。
javax.security.sasl|包含了支持SASL的类和接口。
javax.sound.midi|提供了I/O、 系列化和合成MIDI（音乐乐器数字接口）数据的接口和类。
javax.sound.midi.spi|提供接口当提供新的MIDI设备、MIDI文件读写器或音库读取器时服务提供者去实现。
javax.sound.sampled|提供了捕获、处理和音频数据取样回放的接口和类。
javax.sound.sampled.spi|当提供音频设备、声音文件读写器或音频格式转换器时提供抽象类给服务提供者作为子类。
javax.sql|
javax.sql.rowset|JDBC RowSet实现的标准接口和基类。
javax.sql.rowset.serial|在Java编程语言中提供了允许SQL类型和数据类型之间序列化映射的实用工具类。
javax.sql.rowset.spi|给同步提供者的实现中使用的第三方供应商的标准类和接口。
javax.swing|提供了一组“轻量级”（纯Java语言）组件，最大程度的可能，在所有平台上进行同样的工作。
javax.swing.border|提供了围绕一个Swing组件绘制特殊边框的类和接口。
javax.swing.colorchooser|包含了供JColorChooser组件使用的类和接口。
javax.swing.event|提供了由Swing组件触发的事件。
javax.swing.filechooser|包含用于JFileChooser组件的类和接口。
javax.swing.plaf|提供一个接口和许多抽象类，Swing用它们来提供自己的可插入的外观和感觉功能。
javax.swing.plaf.basic|提供了根据基本外观构建的用户界面对象。
javax.swing.plaf.metal|提供根据Java外观（曾经代称为Metal）构建的用户界面对象，这是默认的外观和感觉。
javax.swing.plaf.multi|提供了组合两个或多个外观的用户界面对象。
javax.swing.plaf.nimbus提供了根据跨平台的Nimbus外观构建的用户界面对象。
javax.swing.plaf.synth|Synth是一个可更换皮肤的外观，其中所有绘制都是可委托的。
javax.swing.table|提供了处理 javax.swing.JTable.的类和接口。

javax.swing.text

提供了处理可编辑和不可编辑的文本组件的类和接口。

javax.swing.text.html

提供了用于创建HTML文本编辑器的HTMLEditorKit和支持类。

javax.swing.text.html.parser

提供了默认的HTML解析器以及支持类。

javax.swing.text.rtf

提供一个类（RTFEditorKit），用于创建富文本格式的文本编辑器。

javax.swing.tree

提供了处理 javax.swing.JTree的类和接口。

javax.swing.undo

允许开发者提供支持撤消/重做的应用，如文本编辑器。

javax.tools

提供le 可以从一个程序被调用的接口，例如编译器工具。

javax.transaction

包含解组期间ORB机制抛出的三个异常。

javax.transaction.xa

提供了事务管理和资源管理之间的协议的定义，这样允许事务管理在JTA事务中去获取和去除资源对象（由资源管理驱动程序提供）。

javax.xml

javax.xml.bind

提供了一个运运行时绑定框架给客户端应用程序，包括解组、编组和验证功能。

javax.xml.bind.annotation

定义为XML模式映射定义Java变成元素的注释

javax.xml.bind.annotation.adapters

XmlAdapter及其规范定义的子类允许任意Java类与JAXB一起使用。

javax.xml.bind.attachment

javax.xml.bind.helpers

JAXB提供者专用：提供部分默认实现一些 the javax.xml.bind接口。

javax.xml.bind.util

有用的客户端实用工具类。

javax.xml.crypto

XML加密通用类。

javax.xml.crypto.dom

javax.xml.crypto包的DOM特定类。

javax.xml.crypto.dsig

用于生成和验证XML数字签名的类。

javax.xml.crypto.dsig.dom

javax.xml.crypto.dsig包的DOM特定类。

javax.xml.crypto.dsig.keyinfo

解析和处理KeyInfo元素和结构的类。

javax.xml.crypto.dsig.spec

XML数字签名的参数类。

javax.xml.datatype

XML/Java类型映射。

javax.xml.namespace

XML命名空间的处理。

javax.xml.parsers

提供允许处理XML文档的处理的类。

javax.xml.soap

提供用于创建和构建SOAP消息的API。

javax.xml.stream

javax.xml.stream.events

javax.xml.stream.util

javax.xml.transform

此包定义了用于处理转换指令，以及执行从源到结果的转换的一般API。

javax.xml.transform.dom

此包实现特定DOM的转换API。

javax.xml.transform.sax

此包实现了特定SAX2的转换API。

javax.xml.transform.stax

提供了特定的StAX的转换API。

javax.xml.transform.stream

此包实现了流和特定URI转换API。

javax.xml.validation

此包提供了用于XML文档验证的API。

javax.xml.ws

此包包含核心JAX-WS的API。

javax.xml.ws.handler

此包定义了消息处理程序的API。

javax.xml.ws.handler.soap

此包定义了SOAP消息处理程序的API。

javax.xml.ws.http

此包定义了特定于HTTP绑定的API。

javax.xml.ws.soap

此包定义了特定于SOAP绑定的API。

javax.xml.ws.spi

此包定义了JAX-WS的SPI。

javax.xml.ws.spi.http

提供了一个用于便携式容器部署JAX-WS Web服务（如用于HTTP SPI 提供了一个HTTP SPI用于在容器中JAX-WS服务的便携式部署（例如..）。

javax.xml.ws.wsaddressing

此包定义了WS-Addressing相关的API。

javax.xml.xpath

此件包为XPath表达式的访问评估和访问评估环境提供了对象模型中立的API。

org.ietf.jgss

此包提供了一个框架，允许应用程序开发人员使用安全服务，如身份验证，数据完整性和数据保密性的各种如Kerberos基础安全机制，采用了统一的API。

org.omg.CORBA

提供OMG CORBA API到JavaTM的编程语言的映射，包括ORB类，它已经实现，因此程序员可以使用它作为一个全功能对象请求代理（ORB）。

org.omg.CORBA_2_3

CORBA`2`3包定义添加到Java（TM）标准版6现有的CORBA接口。这些改变发生在最近的由OMG定义的CORBA API版本。这些新的方法被添加到从在CORBA包中的相应接口派生的接口。这提供向后兼容性和避免断JCK测试。

org.omg.CORBA_2_3.portable

提供输入和输出值类型的方法，并包含其他更新的org/omg/CORBA便携包。

org.omg.CORBA.DynAnyPackage

提供了用DynAny接口（(InvalidValue, Invalid, InvalidSeq, and TypeMismatch）方式使用的异常。

org.omg.CORBA.ORBPackage

提供了InvalidName异常，这是由ORB方法抛出的，保留最初参数和InconsistentTypeCode异常，这是由ORB类中的动态Any创建的方法抛出的。

org.omg.CORBA.portable

提供可移植性层，即一组ORB API，这些API可以使一个供应商生成到另一个供应商的ORB运行代码。

org.omg.CORBA.TypeCodePackage

提供用户定义的异常BadKind和Bounds，它们通过方法TypeCode类中抛出。

org.omg.CosNaming

为Java IDL提供命名服务。

org.omg.CosNaming.NamingContextExtPackage

此包包含以下类，它们用于org.omg.CosNaming.NamingContextExt。

org.omg.CosNaming.NamingContextPackage

此包包含了 org.omg.CosNaming 包的异常类。

org.omg.Dynamic

此包包含了OMG移植拦截规范中的特定动态模块， http://cgi.omg.org/cgi-bin/doc?ptc/2000-08-06, 第21章第9节。

org.omg.DynamicAny

提供了能够遍历与任何运行时关联的数据值，并能提取出数值的原始成分的类和接口。

org.omg.DynamicAny.DynAnyFactoryPackage

此包包含了 DynAnyFactory接口中来自OMG的公共对象请求代理的定的DynamicAny模块的类和异常：结构和规范，http://cgi.omg.org/cgi-bin/doc?formal/99-10-07, 第九章第二节第二小点。

org.omg.DynamicAny.DynAnyPackage

此包包含了 DynAny接口中来自OMG的公共对象请求代理的定的DynamicAny模块的类和异常：结构和规范，http://cgi.omg.org/cgi-bin/doc?formal/99-10-07, 第九章第二节。

org.omg.IOP

此包包含了这个软件包包含了OMG文档中的通用对象请求代理指定的IOP模块：结构和规范,，http://cgi.omg.org/cgi-bin/doc?formal/99-10-07，第十三章第六节。

org.omg.IOP.CodecFactoryPackage

此包包含了IOP :: CodeFactory接口中指定的异常（作为Portable Interceptor规范的一部分）。

org.omg.IOP.CodecPackage

这个包是从IOP ::编解码器IDL接口定义生成。

org.omg.Messaging

此包包含了CORBA消息规范中的特定消息模块，, http://cgi.omg.org/cgi-bin/doc?formal/99-10-07。

org.omg.PortableInterceptor

提供了一个注册ORB钩子通过ORB服务可以截取执行ORB的正常流动的机制。

org.omg.PortableInterceptor.ORBInitInfoPackage

此包包含了来自OMG移植拦截规范中的HTTP指定的PortableInterceptor模块的ORBInitInfo本地接口的异常和类型定 义，http://cgi.omg.org/cgi-bin/doc?ptc/2000-08-06，第二十一章第七节第二小点。

org.omg.PortableServer

提供使您的应用程序移植的服务器端跨多个供应商ORB的类和接口。

org.omg.PortableServer.CurrentPackage

供方法实现能够访问被调用的方法的对象的身份。

org.omg.PortableServer.POAManagerPackage

封装POA关联的处理状态

org.omg.PortableServer.POAPackage

允许程序员构造便携不同ORB产品间对象实现。

org.omg.PortableServer.portable

提供使您的应用程序移植跨多个供应商ORB的服务器端的类和接口。

org.omg.PortableServer.ServantLocatorPackage|提供定位servant的类和接口。
org.omg.SendingContext|为值类型的编组提供支持。
org.omg.stub.java.rmi|包含RMI-IIOP Stubs给发生在 java.rmi包的远程类型。
org.w3c.dom|为文档对象模型（DOM）提供接口。
org.w3c.dom.Bootstrap|
org.w3c.dom.events|
org.w3c.dom.ls|
org.w3c.dom.views|
org.xml.sax|此包提供了核心SAX API。
org.xml.sax.ext|此包包含SAX2设施的接口，一致性的SAX驱动程序不一定支持。
org.xml.sax.helpers|此包包含“帮助器”类，其中包括对引导基于SAX的应用程序的支持。