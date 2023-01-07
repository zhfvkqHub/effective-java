package effective.item02.builder.v1;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈드 장점만 취했다. (17-18 page)
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        // 장점 : 필수 속성 설정 가능
        // 단점 : 필드 중복, 코드를 이해하기 어렵게 만듬
        // -> 필수적인 필드와 옵셔널한 필드를 구분하고 immutable하게 만들고 싶을때 사용
        NutritionFacts cocaCola = new Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }

    public static class Builder{
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // setter 역할을 함
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder sodium(int val){
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
