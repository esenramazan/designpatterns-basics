package com.ramazan.designpatterns.behavioral.observer.ornek;

public class ManagerImpl implements Manager{

    private String managerBilgisi;

    public ManagerImpl(String managerBilgisi) {
        this.managerBilgisi = managerBilgisi;
    }

    @Override
    public void inform(String informMessage) {
        System.out.println(managerBilgisi + " : " + informMessage +" ile manager bilgilendirildi.");
    }

    public String getManagerBilgisi() {
        return managerBilgisi;
    }

    public void setManagerBilgisi(String managerBilgisi) {
        this.managerBilgisi = managerBilgisi;
    }
}
