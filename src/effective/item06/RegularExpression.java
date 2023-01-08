package effective.item06;

import java.util.regex.Pattern;

public class RegularExpression {
    private static final Pattern SPLIT_PATTERM = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i=0; i<1000; i++){
            String name = "hello, effective";
            name.split(",");
//            SPLIT_PATTERM.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}
