package aoshelper.common.armyservice.model.unit;


import aoshelper.common.armyservice.model.weapon.Weapon;

import java.util.List;

public record Unit(
        String name,
        int headCount,
        UnitStats stats,
        List<Weapon> weapons) {
}
