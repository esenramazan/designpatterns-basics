package com.ramazan.thread.threadsinifigenisletilerek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondThread extends Thread {


    private InjectObject injectObject = new InjectObjectImpl();

    public void run() {
        for (int i = 0; i < 5; i++) {
            injectObject.saveOp(Thread.currentThread().getId() + " Değer: " + i);
        }
    }
}
