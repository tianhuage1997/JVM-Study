/*
   本节用到的参数如下：
    -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
    -XX:+PrintCommandLineFlags -XX:MaxTenuringThreshold=5 -XX:+PrintTenuringDistribution

 */
public class Test3 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size];

        System.out.println("hello world");
    }
}
