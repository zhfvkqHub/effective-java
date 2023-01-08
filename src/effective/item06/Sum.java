package effective.item06;

// 오토박싱(auto boxing) / 언박싱(unboxing)
public class Sum {
    private static long sum(){
        Long sum = 0l;
        for(long i=0; i<=Integer.MAX_VALUE; i++){
            sum += i; // 오토박싱 됨
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();

        System.out.println((end - start)/1_000_000. +"ms.");
        System.out.println(x);

//        4054.309334ms. -> 오토박싱 사용O
//        2305843008139952128

//        706.422041ms. -> 오토박싱 사용X
//        2305843008139952128
    }
}
