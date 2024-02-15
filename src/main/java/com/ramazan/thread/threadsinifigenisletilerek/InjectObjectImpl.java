package com.ramazan.thread.threadsinifigenisletilerek;

import org.springframework.stereotype.Service;

@Service
public class InjectObjectImpl implements InjectObject {

    public void saveOp(String eleman) {
        System.out.println("saved eleman" + eleman);
    }
}
