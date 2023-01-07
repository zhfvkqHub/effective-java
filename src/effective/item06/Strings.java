package effective.item06;

// 불필요한 객체 생성을 피하라
public class Strings {
    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = new String("hello");
        String hello3 = "hello";

        System.out.println(hello1 == hello2); // false
        System.out.println(hello1 == hello3); // true
    }
}
