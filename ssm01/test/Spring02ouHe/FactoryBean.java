package Spring02ouHe;

//工厂类，工厂模式 spring创建bean的底层  工厂模式

public class FactoryBean {
    public static Usb getInstance(String beanName){
        Usb usb = null;
        if (beanName.equals("Mytv")){
            usb=new MyTv();
        }else if (beanName.equals("Computer")){
            usb=new Computer();
        }else if(beanName.equals("Mp4")){
            usb=new Mp4();
        }
        return usb;
        //大量 new对象是造成耦合的关键 那么就需要一个框架 来解决new对象的耦合
        //什么框架可以解决这个耦合？ spring，为什么spring可以解决new对象的耦合 ---->底层的反射

    }
}
