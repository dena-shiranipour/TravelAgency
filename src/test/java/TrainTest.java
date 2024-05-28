import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrainTest{
    Train train;
    Customer maria;
    Customer dena;

    @BeforeEach
    public void setUp() {
        train = new Train(34, 100);
        maria = new Customer("maria", 200);
        dena = new Customer("dena", 200);
    }

    @Test
    public void hasPrice() {
        assertThat(train.getPrice()).isEqualTo(34);
    }

    @Test
    public void hasCapacity() {
        assertThat(train.getCapacity()).isEqualTo(100);
    }


    @Test
    public void hasCustomers() {
        train.addCustomer(maria);
        train.addCustomer(dena);
        assertThat(train.customerCount()).isEqualTo(2);
    }



}