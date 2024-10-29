package aoshelper.common.armyservice.model;

import aoshelper.common.armyservice.model.unit.Unit;

import java.util.List;

public record Army(String name, List<Unit> units) {
}
