package com.ramazan.designpatterns.behavioral.iterator.collectionexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Bir ArrayList oluşturuyoruz.
        List<String> myList = new ArrayList<String>();

        // Listeye eleman ekliyoruz.
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        myList.add("JavaScript");

        // Iterator arayüzünün bir örneğini alıyoruz.
        // Bu, Iterator Pattern'ın bir örneğidir.
        // Iterator, koleksiyonun öğelerine sırayla erişim sağlar.
        Iterator<String> it = myList.iterator();

        // hasNext() metodu, koleksiyonda daha fazla öğe olup olmadığını kontrol eder.
        // next() metodu, koleksiyondaki sonraki öğeyi döndürür.
        // Bu iki metot, Iterator Pattern'ın temelini oluşturur.
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("Value: " + value);
        }

        List<String> myLists = Arrays.asList("Java", "Python", "C++", "JavaScript");
        myLists.forEach(System.out::println);
    }
}


/***
 * Evet, Java’da Iterator bir functional interface olarak kabul edilir. Functional interface, yalnızca bir tek soyut metoda sahip olan bir interface’dir.
 * Iterator interface’inde hasNext() ve next() olmak üzere iki metot bulunur ancak remove() metodu default olarak tanımlanmıştır ve bu yüzden Iterator bir functional interface olarak kabul edilir.
 *
 * Java 8 ve sonrasında, functional interface’ler lambda ifadeleri veya method referansları ile kullanılabilir. Bu, kodun daha kısa ve daha okunabilir olmasını sağlar. Ancak, Iterator genellikle geleneksel for-each döngüsü veya while döngüsü ile kullanılır. Lambda ifadeleri veya method referansları ile kullanımı daha az yaygındır.
 *
 * Örneğin, aşağıdaki gibi bir List üzerinde lambda ifadesi ile yineleme yapabiliriz:
 *
 * Java
 *
 * List<String> myList = Arrays.asList("Java", "Python", "C++", "JavaScript");
 * myList.forEach(System.out::println);
 * Yapay zeka tarafından oluşturulan kod. Dikkatle gözden geçirin ve kullanın. SSS hakkında daha fazla bilgi.
 * Bu kod, List’in forEach metodunu kullanır, bu metot Iterable interface’inin bir parçasıdır ve bir Consumer functional interface kabul eder. Bu örnekte, System.out::println method referansı bir Consumer olarak kullanılır. Bu, Java’daki functional interface’lerin ve method referanslarının gücünü gösterir. Ancak, bu örnekte doğrudan Iterator kullanılmamıştır.
 */
