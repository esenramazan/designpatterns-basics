package com.ramazan.designpatterns.behavioral.visitor;

public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"), new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}


/*
 *Visitor tasarım deseni, bir grup benzer nesne üzerinde bir işlem gerçekleştirmemiz gerektiğinde kullanılır.
 * Visitor deseni, işlem mantığını nesnelerden başka bir sınıfa taşımamıza yardımcı olur.
 * Bu desen, bir işlemi tanımlamak için mevcut bir nesne yapısına değişiklik yapmadan yeni bir işlem tanımlamamıza olanak sağlar.
 *
 */


/*
 *Bu örnekte, ItemElement arayüzü, accept metodunu tanımlar ve bu metod, bir ShoppingCartVisitor’ı kabul eder.
 * Book ve Fruit sınıfları, ItemElement’i uygular ve accept metodunu uygulayarak bir ShoppingCartVisitor’ı kabul eder.
 * ShoppingCartVisitor arayüzü, her bir ItemElement türü için bir visit metodunu tanımlar.
 * ShoppingCartVisitorImpl sınıfı, ShoppingCartVisitor’ı uygular ve her bir visit metodunu uygulayarak belirli bir
 * ItemElement’in maliyetini hesaplar.
 *  Son olarak, ShoppingCartClient sınıfı, bir dizi ItemElement’i alır ve toplam maliyeti hesaplar
 *
 *
 */


/*
 *Visitor tasarım deseni, Java ve Spring Boot’ta genellikle aşağıdaki durumlarda kullanılır:

---Bileşenler üzerinde işlem yapma: Visitor deseni, benzer türdeki bir grup nesne üzerinde bir işlem gerçekleştirmemiz gerektiğinde kullanılır.
Bu desen, işlem mantığını nesnelerden başka bir sınıfa taşımamıza yardımcı olur.
 Bu, bir işlemi tanımlamak için mevcut bir nesne yapısına değişiklik yapmadan yeni bir işlem tanımlamamıza olanak sağlar.

---Karmaşık nesne yapıları ile çalışma: Enterprise uygulama geliştirmeye gittikçe daha fazla girerken,
daha fazla nesne yapısıyla çalışacaksınız. Bu yapılar, bir nesne koleksiyonundan, nesne kalıtım ağaçlarına,
Composite yapısal desenini kullanan karmaşık yapıları içerebilir. Bu tür yapılar üzerinde işlemler ekledikçe,
işlemleri yapının diğer öğelerine dağıtacaksınız. Bu, hızla anlaşılması, bakımı ve değiştirilmesi zor bir sisteme yol açabilir.

---API tüketimi: Eğer birisi API’nizi tüketiyorsa ve tüketicilere nesnelere yeni ad-hoc işlevsellik eklemek için bir yol vermek istiyorsanız,
 Visitor desenini kullanabilirsiniz. Ayrıca, mühürlü sınıflara ad-hoc işlevsellik eklemek için uygun bir yoldur.

Bu örnekler, Visitor deseninin Java ve Spring Boot’ta nasıl kullanılabileceğine dair genel bir bakış sağlar. Ancak, bu desenin kullanımı, uygulamanın özel ihtiyaçlarına ve tasarımına bağlıdır.
 */