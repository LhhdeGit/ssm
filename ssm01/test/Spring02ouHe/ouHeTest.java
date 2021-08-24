package Spring02ouHe;

import org.junit.Test;

public class ouHeTest {
    //创建几个类 模拟耦合
    @Test
    public void test01(){
        //如果使用电脑传输数据
       // Computer computer = new Computer(); //将来要改computer
       // computer.usbDate();
        //如果使用电视传输数据
        //MyTv myTv = new MyTv();
       // myTv.usbDate();
        //更新接口后，代码优化了，解耦1次
       //Usb u = new Computer();
        //Usb u = new MyTv();
         //u.usbData();

        //需求1：现在 new Computer(); new MyTv(); 都有 usbDate的功能
        //直接修改  代码修改了比较大
        //想把Computer类不用，修改成Tv
        //那么需要吧USBDate 方法提取出接口，然后使用多态的思想进行代码更新
        //第一次使用 接口，多态的意思 解耦  好处是，可以多次修改代码，不用改变量直接一个u就可以代替上面的new对象
        //第二次解耦，即更方便
        Usb u = FactoryBean.getInstance("Computer");
        u.usbData();
        //以上 第二次写法是不是更优美了， 更解耦了 让用户输入字符，比打开源代码找到第几行更方便，将来源代码要加密

    }


}
