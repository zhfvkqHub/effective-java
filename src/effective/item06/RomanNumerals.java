package effective.item06;

import java.util.regex.Pattern;

// 값비싼 객체를 재사용하여 성능을 개선한다.(32 page)
public class RomanNumerals {
    static boolean isRomanNumeralSlow(String s){
        return s.matches("^[a-zA-Z]*$");
    }
    private static Pattern ROMAN = Pattern.compile("^[a-zA-Z]*$");
    static boolean isRomanNumeralFast(String s){
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean result = false;
        long start = System.nanoTime();

        for(int j = 0; j < 50; j++){
            // 성능 차이를 확인하려면 xxxSlow 메서드를 xxxFast 메서드로 바꿔 실행
            result = isRomanNumeralSlow("XCMLXXVI");
        }

        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(result);
    }
}
