import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

public class TrainTest {
    Train train;

    @Test
    public void setUp() {
        train = new Train(34, 100, );
    }

    @Test
    public void hasPrice() {
        assertThat(train.getPrice()).isEqualTo();
    }


    @Test
    public void hasCapacity() {
        assertThat(train.getCapacity()).isEqualTo();
    }


    @Test
    public void hasCustomers() {
        assertThat(train.getCustomers()).isEqualTo();
    }

    @Test
    public void hasCustomers() {
        assertThat(train.getClass()).isEqualTo();
    }

    @Test
    public void hasPrice(){
        train.setPrice(50);
        assertThat(train.getPrice()).isEqualTo(50);
    }


}