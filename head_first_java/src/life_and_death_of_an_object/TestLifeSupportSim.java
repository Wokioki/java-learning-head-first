package life_and_death_of_an_object;

import java.util.*;

class V2Radiator {
    V2Radiator(ArrayList<SimUnit> list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList<SimUnit> list) {
        super(list);
        for (int g = 0; g < 10; g++) {
            list.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList<SimUnit> list) {
        list.add(new SimUnit("HeatingMachine"));
    }
}

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList<SimUnit> alist = new ArrayList<>();
        V2Radiator v2 = new V2Radiator(alist);
        V3Radiator v3 = new V3Radiator(alist);

        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(alist);
        }
    }
}

class SimUnit {
    String botType;

    SimUnit(String type) {
        botType = type;
        System.out.println("Created: " + botType);
    }

    int powerUse() {
        if ("HeatingMachine".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}