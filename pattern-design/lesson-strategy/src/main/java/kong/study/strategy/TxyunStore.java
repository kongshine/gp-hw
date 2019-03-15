package kong.study.strategy;

public class TxyunStore implements CloudStore {

    public void putObject(String filename) {
        System.out.println("腾讯云上传文件："+filename);
    }
}
