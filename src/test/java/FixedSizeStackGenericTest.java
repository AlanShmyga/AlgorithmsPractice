import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class FixedSizeStackGenericTest {

    private class Item {
        String name;

        Item setName(String name) {
            this.name = name;
            return this;
        }
    }

    private Item itemOne = new Item().setName("ItemOne");
    private Item itemTwo = new Item().setName("ItemTwo");

    @Test
    public void shouldPushAndPopUntilIsEmpty() {
        GenericStack<Item> genericStack = new GenericStack<Item>();
        assertThat(genericStack.isEmpty()).isTrue();
        genericStack.push(itemOne);
        assertThat(genericStack.isEmpty()).isFalse();
        genericStack.push(itemTwo);
        genericStack.pop();
        genericStack.pop();

        assertThat(genericStack.isEmpty()).isFalse();
        assertThat(genericStack.pop().name).isEqualTo("ItemTwo");
        assertThat(genericStack.pop().name).isEqualTo("ItemOne");
        assertThat(genericStack.pop()).isEqualTo(null);
    }
}
