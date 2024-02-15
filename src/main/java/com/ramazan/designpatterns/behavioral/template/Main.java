package com.ramazan.designpatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        System.out.println("Standard Computer: " + standardComputer.getComputerParts());

        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        System.out.println("High-End Computer: " + highEndComputer.getComputerParts());
    }
}


/*
 * ComputerBuilder sınıfı, Template tasarım deseninin bir parçasıdır ve bir algoritmanın iskeletini (veya “şablonunu”) oluşturur.
 * Bu şablon, bir bilgisayarın nasıl oluşturulacağını belirler.
 *
 * Her yeni bilgisayar türü (StandardComputerBuilder, HighEndComputerBuilder vb.) için, bu sınıflar ComputerBuilder’ın alt sınıflarıdır
 * ve ComputerBuilder’ın belirlediği adımları uygularlar. Ancak, her bir alt sınıf bu adımları kendi ihtiyaçlarına göre uygular.
 * Bu, kodun yeniden kullanılabilirliğini artırır ve algoritmanın genel yapısının farklı uygulamalar arasında tutarlı kalmasını sağlar.
 * Bu nedenle, evet, her yeni uyguladığımız bilgisayar, bu template üzerinden işlemlerini yapar. Bu, Template tasarım deseninin temel fikridir.
 */


/*
 *Java ve Spring Boot’ta Template (şablon) tasarım deseni genellikle aşağıdaki durumlarda kullanılır:

***Çerçeve oluşturma: Template deseni, çerçeve oluşturmak için doğal bir uyum sağlar,
* böylece ana çerçeve sınıfları, çocuklarda uygulanan yöntemlere geri çağrı yapabilir. Örneğin, Spring Framework’deki JdbcTemplate ve
* HibernateTemplate sınıfları, veritabanı işlemlerini gerçekleştirmek için Template desenini kullanır.

***Algoritma iskeleti oluşturma: Template deseni, bir algoritmanın iskeletini tanımlar
* ve alt sınıfların algoritmanın belirli adımlarını yeniden tanımlamasına izin verir.
* Bu, kodun yeniden kullanılabilirliğini artırır ve algoritmanın genel yapısının farklı uygulamalar arasında tutarlı kalmasını sağlar.

***Çeşitli algoritmaları destekleme: Template deseni, bir sınıfın birden çok benzer algoritmayı desteklemesi gereken durumlarda kullanışlıdır.
*  Örneğin, bir veri şifreleme sınıfı, AES, TripleDES ve Blowfish gibi farklı şifreleme algoritmalarını kullanarak verileri şifreler.

***Kod tekrarını azaltma: Template deseni, kod tekrarını azaltır ve kodun daha okunabilir ve bakımı daha kolay olmasını sağlar.
* Aynı adımları izleyen ancak bu adımları farklı şekillerde uygulayan birden çok sınıf varsa,
* bu adımları bir Template sınıfında tanımlamak ve bu sınıfı genişletmek kod tekrarını önler.

Bu örnekler, Template deseninin Java ve Spring Boot’ta nasıl kullanılabileceğine dair genel bir bakış sağlar. Ancak, bu desenin kullanımı, uygulamanın özel ihtiyaçlarına ve tasarımına bağlıdır.
 */