package aoshelper.common.armyservice.model.weapon;

public interface DiceBasedValue {
    default boolean isDiceBased() {
        return getUpperCaseValue().contains("D");
    }

    default int getDiceCount() {
        if (isDiceBased()) {
            return Integer.parseInt(getUpperCaseValue().split("D")[0]);
        }
        return 0;
    }

    default int getDiceSides() {
        if (isDiceBased()) {
            return Integer.parseInt(getUpperCaseValue().split("D")[1]);
        }
        return 0;
    }

    default int getFixedValue() {
        if (!isDiceBased()) {
            return Integer.parseInt(getUpperCaseValue());
        }
        return 0;
    }

    String getValue();

    private String getUpperCaseValue() {
        return getValue().toUpperCase();
    }
}
