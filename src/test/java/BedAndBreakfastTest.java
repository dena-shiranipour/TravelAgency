import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BedAndBreakfastTest {
    BedAndBreakfast bedAndBreakfast;



        @BeforeEach
        public void setUp() {
           bedAndBreakfast = new BedAndBreakfast(10, "maria");
        }

        @Test
        public void hasPrice() {
            assertThat(bedAndBreakfast.getPrice()).isEqualTo(34);
        }

        @Test
        public void hasCustomer() {
            assertThat(bedAndBreakfast.getCustomer()).isEqualTo(100);
        }





    }
}
