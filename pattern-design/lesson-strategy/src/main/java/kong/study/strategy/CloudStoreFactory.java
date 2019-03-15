package kong.study.strategy;

import java.util.HashMap;
import java.util.Map;

public class CloudStoreFactory {

    private CloudStoreFactory(){}

    public static Map<String,CloudStore> map = new HashMap<String, CloudStore>();

    static {
        map.put("aliyun", new AliyunStore());
        map.put("txyun",new TxyunStore());
        map.put("dxyun",new DxyunStore());
    }

    public static  CloudStore getInstance(String type){
        if (map.containsKey(type)){
            return map.get(type);
        }
        return map.get("aliyun");
    }
}
