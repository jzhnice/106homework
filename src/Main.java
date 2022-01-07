import java.util.HashMap;
import java.util.Iterator;

/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/6 9:54
 * HashMap
 * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
 * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */
public class Main {
    public static void main(String[] args) {
        String[] strs ={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] strs2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap hashMap = new HashMap<String, String>();
        for (int i = 0; i < strs.length; i++) {
            hashMap.put(strs[i],strs2[i]);
        }
//        获取map集合的所有键的set集合  keyset() 有了set才能迭代
        Iterator iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.print(next);
            System.out.print("="+hashMap.get(next));
            System.out.println("");
        }
    }
}
