import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("World",100);
        System.out.println(map.size());
        System.out.println(map);
        map.put("World2",150);
        map.put("World3",150);
        map.put("World4",150);
        map.put(null,150);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("-----------------------");

        for(Map.Entry<String,Integer>temp:map.entrySet()){
            System.out.println(temp.getKey()+" "+temp.getValue());
        }
    }
}
