package aoshelper.common.armyservice.model.weapon;

public record Weapon(
        String name,
        WeaponType type,
        Range range,
        Attack attack,
        Hit hit,
        Wound wounds,
        Rend rend,
        Damage damage) {

}
