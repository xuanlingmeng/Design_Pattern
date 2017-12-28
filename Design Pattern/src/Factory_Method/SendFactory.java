package Factory_Method;
//工厂类--简单工厂模式。工厂类组会包括了必要的逻辑判断。去除了与产品的依赖。
//public class SendFactory {
//    public Sender produce(String type) {
//        if ("mail".equals(type)) {
//            return new MailSender();
//        } else if ("sms".equals(type)) {
//            return new SmsSender();
//        } else {
//            System.out.println("请输入正确的类型!");
//            return null;
//        }
//    }

//工厂类--工厂方法模式
//public class SendFactory {
//
//    public Sender produceMail(){
//        return new MailSender();
//    }
//
//    public Sender produceSms(){
//        return new SmsSender();
//    }
//}

//工厂类-静态工厂模式
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
