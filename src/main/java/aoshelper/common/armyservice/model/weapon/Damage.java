package aoshelper.common.armyservice.model.weapon;

public record Damage(String damageValue) implements DiceBasedValue {
    public Damage(int value){
        this(String.valueOf(value));
    }

    @Override
    public String getValue() {
        return damageValue;
    }
}
