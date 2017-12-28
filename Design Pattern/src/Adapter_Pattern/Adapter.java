package Adapter_Pattern;
//适配器
public class Adapter extends Adaptee implements Target{
    public int get110v(){
        return 110;
    }
}