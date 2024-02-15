package com.ramazan.designpatterns.behavioral.mediator.eventhandling;

import java.awt.*;
import java.awt.event.*;

class ButtonExample {
    public static void main(String[] args) {
        Frame f=new Frame("Button Example");

        final TextField tf=new TextField();
        tf.setBounds(50,50, 150,20);

        Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Java Event Handling");
            }
        });

        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}


/***
 * , Mediator Pattern’ın klasik anlamda bir uygulaması yoktur. Ancak, ButtonExample sınıfı, bir bakıma Mediator rolünü üstlenir çünkü düğme tıklama olayını (ActionEvent) işler
 * ve bu olaya yanıt olarak ne yapılacağını belirler.
 *
 * Örnekteki ButtonExample sınıfı, bir Button nesnesi oluşturur ve bu nesneye bir ActionListener ekler.
 * ActionListener bir olay dinleyicisi (event listener) olup, düğmeye tıklanması gibi bir eylem gerçekleştiğinde actionPerformed metodu çağrılır.
 * Bu metod, bir ActionEvent nesnesini parametre olarak alır. Bu örnekte, actionPerformed metodu, metin alanına bir mesaj yazdırır.
 *
 * Bu, Java’da olay işlemenin temel bir örneğidir.
 * Ancak, daha karmaşık uygulamalar genellikle birden çok olay türünü işler ve birden çok olay dinleyicisi kullanır.
 * Bu durumda, bir Mediator sınıfı, farklı olay türlerini işlemek için farklı olay dinleyicileri arasında koordinasyon sağlayabilir.
 * Bu, Mediator Pattern’ın bir örneği olabilir. Ancak, bu örnekte böyle bir durum söz konusu değildir.
 */