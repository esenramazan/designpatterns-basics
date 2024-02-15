package com.ramazan.designpatterns.behavioral.strategy;

// Main
public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList(new BubbleSortStrategy());
        sortedList.sort(new int[]{1, 2, 3, 4, 5});  // Sorting array using bubble sort.

        sortedList.setStrategy(new QuickSortStrategy());
        sortedList.sort(new int[]{1, 2, 3, 4, 5});  // Sorting array using quick sort.
    }
}


/**
 * Bu örnekte, SortedList sınıfı, SortingStrategy arayüzünün bir referansını tutar ve bu referans,
 * BubbleSortStrategy veya QuickSortStrategy gibi belirli bir stratejiyi temsil eder.
 * sort çağrıldığında, SortedList’in mevcut stratejisi belirli bir işlemi gerçekleştirir.
 * Bu, nesnenin stratejisine bağlı olarak farklı davranışları dinamik olarak değiştirmesine olanak sağlar.
 * Bu örnek, Strategy Pattern’in nasıl kullanılabileceğini gösterir, ancak gerçek dünya uygulamaları genellikle çok daha karmaşıktır.
 * Bu yüzden bu örneği kendi ihtiyaçlarınıza göre uyarlamak gerekebilir.
 */


/***
 * State Pattern ve Strategy Pattern birbirine benzer gibi görünebilir çünkü her ikisi de belirli bir bağlamda farklı davranışları temsil eden sınıflar kullanır. Ancak, bu iki model arasında önemli farklar vardır:
 *
 * State Pattern:
 *
 * State Pattern, bir nesnenin iç durumuna bağlı olarak davranışını değiştirmesini sağlar.
 * Bu model genellikle bir nesnenin durumunu temsil eden bir dizi sınıf içerir ve bu durumlar genellikle birbirini izler
 * (örneğin, bir kapı önce “kapalı” durumunda olabilir, sonra “açık” durumuna geçebilir)^.
 * State Pattern, durum değişikliklerini yönetmek için kullanılır ve genellikle durum geçişlerini otomatik olarak yönetir.
 * Strategy Pattern:
 *
 * Strategy Pattern, bir nesnenin belirli bir işlemi gerçekleştirme şeklini değiştirmesini sağlar.
 * Bu model genellikle bir işlemi gerçekleştirmek için farklı stratejileri temsil eden bir dizi sınıf içerir ve bu stratejiler genellikle
 * birbirinin yerine geçebilir (örneğin, bir liste sıralama işlemi için hızlı sıralama veya kabarcık sıralama stratejisi kullanılabilir)^.
 * Strategy Pattern, algoritma değişikliklerini yönetmek için kullanılır ve genellikle algoritmayı değiştirmek için açıkça bir
 * yöntem çağrısı gerektirir.
 * Bu farklara rağmen, her iki model de belirli bir bağlamda farklı davranışları temsil eden sınıflar kullanır.
 * Bu nedenle, hangi modelin kullanılacağına karar verirken, uygulamanın gereksinimlerini ve karmaşıklığını dikkate almak önemlidir.
 * Bu iki model, kodun daha esnek ve genişletilebilir olmasını sağlar ve SOLID tasarım prensiplerine uygundur.
 * Bu nedenle, her iki model de modern yazılım tasarımında yaygın olarak kullanılır.
 */