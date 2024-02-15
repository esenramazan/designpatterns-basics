package com.ramazan.designpatterns.behavioral.observer.ornek;

import java.util.ArrayList;
import java.util.List;

abstract class PersonelActivity {
    private List<Manager> managerList = new ArrayList<>();

    public void subscribe(Manager manager) {
        managerList.add(manager);
    }

    public void unsubscribe(Manager manager) {
        managerList.remove(manager);
    }

    public void informActivitiesToManagers(String message) {
        for(Manager m : managerList) {
            m.inform(message);
        }
    }
}
