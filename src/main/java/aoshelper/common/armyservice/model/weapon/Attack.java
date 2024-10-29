package aoshelper.common.armyservice.model.weapon;

public record Attack(String attackValue) implements DiceBasedValue {
    public Attack(int value){
        this(String.valueOf(value));
    }
    @Override
    public String getValue() {
        return attackValue;
    }
}
