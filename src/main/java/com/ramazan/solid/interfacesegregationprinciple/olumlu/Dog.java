package com.ramazan.solid.interfacesegregationprinciple.olumlu;

public class Dog implements Runnable, Barkable {
    public void bark() { System.out.println("Havlayan köpek"); }
    public void run() { System.out.println("Koşan köpek"); }
}


/*
 * bir sınıfın yalnızca ihtiyaç duyduğu metotları içeren interfaceleri implemente etmesi gerektiğini
 * ve bu durumun kodun daha esnek ve bakımı daha kolay olmasını sağladığını göstermektedir
 */