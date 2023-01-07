package effective.item02.builder.v2;

import lombok.Builder;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈드 장점만 취했다. (17-18 page)
// @Builder 어노테이션 활용
@Builder
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        // 장점 : 간결하다
        // 단점 : 1. 모든 필드를 받는 생성자가 생긴다 (@AllArgsConstructor(access = AccessLevel.PRIVATE)로 해결 가능)
        //       2. 필수 값을 지정 할 수 없다
        NutritionFacts nutritionFacts = new NutritionFactsBuilder()
                .servingSize(100)
                .servings(10)
                .build();
    }


}
