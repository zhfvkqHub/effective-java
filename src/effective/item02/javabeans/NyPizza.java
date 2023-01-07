package effective.item02.javabeans;

import java.util.Objects;

// 뉴욕 피자 - 계층적 빌더를 활용한 하위 클래스 (20 page)
public class NyPizza extends Pizza {

    public enum Size{SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<NyPizza.Builder>{
        private final Size size;
        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }
    NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return toppings + "로 토핑한 피자";
    }
}
