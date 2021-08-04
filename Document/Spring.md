### 1.Spring介绍

Spring是一个轻量级开发框架，是很多模块的集合，主要模块包括核心容器，web，数据访问/继承，AOP，Aspects，工具，消息，测试模块。

AOP：面向切面编程

Web：为创建web应用程序提供支持

core：Spring的核心；为IOC和依赖注入提供支持

JDBC：数据库连接

JMS：java消息服务

Aspects：提供与AspectJ的集成

### 2.@RestController、Controller

##### 1.Controller

controller返回一个页面

##### 2.RestController

RestController返回JSON或XML数据。

只返回对象，对象以JSON或XML形式写入HTTP相应（Response）中。

##### 3.Controller + ResponseBody

@Controller + @ResponseBody = @RestController

### 3.Spring IOC

IOC：控制反转，是一种设计思想，是把创建对象的控制权交给spring框架来做。通过bean来注册对象，所有对象都在IOC容器中，IOC容器实际上是个Map。

想创建对象，只需要在xml里配置或使用注解即可，不需要考虑对象如何被创建。需要使用对象时，只需要从context取得对象。

### 4.AOP

AOP：面向切面编程，将与业务本身无关，但需要被业务调用的功能（事务处理，权限控制，日志管理等）封装起来，降低模块的耦合度，提高代码的复用率。在不改变业务代码的情况下增加新功能。

AOP是基于动态代理的。

##### 1.Spring AOP、AspectJ AOP

Spring AOP是运行时增强，AspectJ AOP是编译时增强。

Spring AOP基于动态代理，AspectJ AOP基于字节码操作。

Spring已经集成了AspectJ，当切面比较少两者差异不大，当切面太多，首选AspectJ AOP。

##### 2.动态代理

实现动态代理的类需要实现InvocationHandler接口，并重写invoke()方法。

调用Proxy.newProxyInstance(classloader, interface, handler)来创建一个代理，类型是主体对象实现的接口。

### 5.Spring bean

bean相当于对象，注册的bean实例会存放在IOC容器中，可以通过xml配置或注解自动配置bean，实现IOC和依赖注入。

##### 1.scope作用域

singleton：单例模式，创建的bean实例只有一个，spring中的bean默认是singleton。

prototype：原型模式，每次请求都会创建一个新的bean实例。

request：每一次HTTP请求会创建一个新的bean，该bean仅在当前HTTP request有效。

session：每一次HTTP请求会创建一个新的bean，该bean仅在当前HTTP session有效。

##### 2.单例bean的线程安全问题

单例bean会有线程安全问题，当多线程操作同一个对象时，这个对象的成员变量的写操作会存在线程安全问题。

解决办法：1.在类中定义一个ThreadLocal成员变量，把可变的成员变量放入ThreadLocal中。

2.将bean作用域scope设为原型prototype，每次请求都会创建一个新的bean，就不会有线程安全问题了。

3.常用的controller，service，dao的bean是无状态的，不保存数据，所以是线程安全的。

##### 3.@Bean和@Component

1.作用对象不同：@Component注解作用于类，@Bean注解作用于方法。

2.@Component通过扫描类的路径来检测和自动装配bean到IOC容器中。

@Bean在标有该注解的方法中定义产生这个bean，通过该方法产生一个bean放到IOC容器中，即这个方法的返回值是一个对象。

3.@Bean比@Component注解的自定义更强，很多地方只能通过@Bean来注册bean。

##### 4.将类声明为bean的注解有哪些

@Component 组件，通用的注解

@Controller Contriller层

@Service Service层

@Repository Dao层

@Configuration 配置

@Bean 注解作用于方法，方法的返回值是个对象

##### 5.bean的生命周期

bean容器找到配置文件中的bean定义

bean容器通过java反射机制创建bean实例

使用set()方法设置属性值

实现Aware接口，则调用对应set方法



销毁时，如果实现了DisposableBean接口，则执行destory()方法

销毁时，如果Bean在配置文件包含destory-method属性，执行对应方法

### 6.Spring中用到的设计模式

##### 1.工厂设计模式

Spring通过BeanFactory和ApplicationContext来创建Bean对象。

BeanFactory：延迟注入，只有使用某个bean才注入，占用更小的内存，程序启动更快。

ApplicationContext：Spring容器启动一次性把所有bean创建。

##### 2.单例设计模式

Spring Bean默认都是单例。

好处：对于频繁使用的对象，省略创建对象花费的时间；new次数减少，对系统内存的使用频率降低，减轻垃圾回收的压力。

Spring通过ConcurrentHashMap实现了单例注册表来实现单例模式。

##### 3.代理设计模式

Spring AOP是基于动态代理实现的。

##### 4.模版方法模式

Spring中以Template结尾的对数据库操作的类，使用到了模版方法模式。

一般情况下，通过继承抽象类来实现模版模式，但Spring使用Callback模式和模版模式结合。

##### 5.包装器设计模式

连接多个数据库，不同用户根据需要访问不用数据库，包装器设计模式可以让程序根据用户需求动态切换数据源。

##### 6.观察者模式

Spring事务驱动模型使用观察者模式。

##### 7.适配器模式

Spring AOP的增强或通知（advice）使用到适配器模式；Spring MVC中用适配器模式适配Controller。