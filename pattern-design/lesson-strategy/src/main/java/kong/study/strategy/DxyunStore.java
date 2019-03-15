package kong.study.strategy;

public class DxyunStore implements CloudStore {

    public void putObject(String filename) {
        System.out.println("电信云上传文件："+filename);
    }
}
