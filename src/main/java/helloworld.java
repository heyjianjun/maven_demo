/**
 * Created by heyjianjun on 2018/2/8.
 */
public class helloworld {
    public static void main(String[] args){
        Integer a = 10;
        Integer b = 400;
        Integer c = addNum(a,b);
        System.out.printf(c.toString());
    }
    public static Integer addNum(Integer a,Integer b){
        Integer c = a + b;
        return  c;

    }
}
