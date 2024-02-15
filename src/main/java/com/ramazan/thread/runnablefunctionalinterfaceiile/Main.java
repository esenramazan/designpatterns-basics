package com.ramazan.thread.runnablefunctionalinterfaceiile;

// Ana sınıfımız
public class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}


/*
 *Bu kodda, MyRunnable adında bir sınıf oluşturduk ve Runnable arayüzünü uyguladık.
 * run metodunu geçersiz kılarak, thread’in ne yapacağını belirledik.
 * Ardından, ana main metodunda iki thread oluşturduk ve start() metodu kullanarak bu thread’leri başlattık.
 * Her thread, run() metodunda belirtilen işlemi gerçekleştirir. Bu durumda, her thread 0’dan 4’e kadar olan sayıları yazdırır.
 * Her thread’in kendine ait bir ID’si vardır ve Thread.currentThread().getId() ile bu ID’yi alabiliriz.
 * Bu kodu çalıştırdığınızda, her iki thread’in de paralel olarak çalıştığını göreceksiniz.
 * Bu, thread’lerin aynı anda birden fazla işlem yapabilme yeteneğinin bir örneğidir.
 *  Bu konuda daha fazla bilgi edinmek için Java’nın resmi belgelerine veya çeşitli online kaynaklara başvurabilirsiniz
 */
