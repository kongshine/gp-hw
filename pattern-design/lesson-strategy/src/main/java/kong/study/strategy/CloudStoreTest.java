package kong.study.strategy;

public class CloudStoreTest {
    public static void main(String[] args) {
        CloudStore cs = CloudStoreFactory.getInstance("aliyun");
        cs.putObject("aaa.txt");
    }
}
