package Spring01junttest;

import org.junit.Test;

public class Spring01 {
    //单元测试
    @Test
    public void test01(){
        System.out.println("1、我是单元测试，在公司中，单元测试是Java程序员的自己的"+
        "dao层，controller层，是否能正常运行"+
                ""+
                "2、单元测试的写法必须是@Test来自于org.junit.Test这个包，必须是void静态  没有返回值的方法！！" +
                "3.方法名称 和类名最好不可以 起 test（） Test.java"
        );
    }
    //反射：是在JVM虚拟机的类加载中 .java -----> class文件 在这个转换期间
    //jvm 可以看到类的所有信息，比如属性，方法，父类,接口等
    //即：反射对于任意一个对象都能调用出他的 任一方法 和属性
    //这样的动态获取信息以及动态对象的方法的功能  叫做java的反射机制 不是 我们通俗讲的 镜面反射光线的反射
    // 为什么spring框架要用到反射，因为 反射 可以解耦
    //什么是解耦 答：解耦就是 接触程序之间的耦合
    //什么是耦合 答：耦合就是程序之间过于依赖了。
    //什么是依赖 答:依赖就是A程序调用B程序，A程序中有B的方法调用

}
