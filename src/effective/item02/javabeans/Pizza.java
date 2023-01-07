package effective.item02.javabeans;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴(19 page)
// 여기서 사용한 '시뮬레이트한 셀프 타입' 관용구는 빌더뿐 아니라 임의의 유동적인 계층 구조를 허용한다.
public abstract class Pizza {
    enum Topping{HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    // 재귀적인 타입 제한을 사용 함
    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
//        public Builder<T> addTopping(Topping topping){
//            toppings.add(Objects.requireNonNull(topping));
//            return this;
//        }
        abstract Pizza build();
        // 하위 클래스는 이 메서드를 재정의 하여 "this"를 반환하도록 해야 됨
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }
}
