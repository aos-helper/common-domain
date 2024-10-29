package aoshelper.common.armyservice.model.weapon;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DamageTest {
    @ParameterizedTest
    @CsvSource({
            "1, false, 0, 0, 1",
            "1D6, true, 6, 1, 0",
            "2D6, true, 6, 2, 0",
            "2D3, true, 3, 2, 0",
            "2d3, true, 3, 2, 0",
            "2d3, true, 3, 2, 0",
    })
    void valuesTest(
            String value,
            Boolean expectedDiceBased,
            Integer expectedDiceSides,
            Integer expectedDiceCount,
            Integer expectedFixedValue) {
        Attack attack = new Attack(value);
        assertEquals(expectedDiceBased, attack.isDiceBased());
        assertEquals(expectedDiceSides, attack.getDiceSides());
        assertEquals(expectedDiceCount, attack.getDiceCount());
        assertEquals(expectedFixedValue, attack.getFixedValue());
    }
}