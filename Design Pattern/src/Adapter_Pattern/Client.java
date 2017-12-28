package Adapter_Pattern;
//客户端
public class Client {
    public static void main(String rags[]) {
        new Client().test();
    }

    public void test() {
        Target target = new Adapter();
        int v1 = target.get110v();
        int v2 = target.get220v();
    }
}