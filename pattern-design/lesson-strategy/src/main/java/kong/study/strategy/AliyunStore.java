package kong.study.strategy;

public class AliyunStore implements CloudStore {

    public void putObject(String filename) {
        System.out.println("阿里云上传文件："+filename);
    }
}
