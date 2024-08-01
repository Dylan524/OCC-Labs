import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @Test
    void testConstructorandGets() {
        //Arrange
            String exceptedBreadType = "White";
            double exceptedBaseCost = 6.50;
            double exceptedCostPerItem = 0.75;

        //Act
            Sandwich sandwich = new Sandwich(exceptedBaseCost, exceptedCostPerItem, exceptedBreadType );
            String actualBreadType = sandwich.getBreadType();
            double actualBaseCost = sandwich.getBaseCost();
            double actualCostPerItem = sandwich.getCostPerItem();

        //Assert
            assertEquals(exceptedBreadType, actualBreadType);
            assertEquals(exceptedBaseCost, actualBaseCost);
            assertEquals(exceptedCostPerItem, actualCostPerItem);
    }

    @Test
    void addItem() {
    }
}