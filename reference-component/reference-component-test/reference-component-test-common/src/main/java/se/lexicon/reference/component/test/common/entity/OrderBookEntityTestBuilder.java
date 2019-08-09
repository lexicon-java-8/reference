package se.lexicon.reference.component.test.common.entity;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;
import se.lexicon.reference.component.entity.OrderBookEntity;

public class OrderBookEntityTestBuilder extends AbstractTestBuilder<OrderBookEntity> {
    public OrderBookEntity.Builder builder;

    public OrderBookEntityTestBuilder(OrderBookEntity.Builder builder) {
        this.builder = Required.notNull(builder,"builder");
        this.builder.withId("1234")
                .withName("test1");
    }
    public static OrderBookEntityTestBuilder builder(){
        return new OrderBookEntityTestBuilder(OrderBookEntity.builder());
    }

    @Override
    public OrderBookEntity build() {
        return (builder.build());
    }
}
