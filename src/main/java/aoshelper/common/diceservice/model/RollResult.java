package aoshelper.common.diceservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RollResult {

    private List<Integer> results = new ArrayList<>();

    public void addResult(int result) {
        results.add(result);
    }
}
