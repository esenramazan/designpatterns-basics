package com.ramazan.designpatterns.behavioral.memento.kredibasvuru;

public class Main {
    public static void main(String[] args) {
        var application = new LoanApplication();
        var history = new ApplicationHistory();

        application.setName("John Doe");
        application.setAddress("123 Main St");
        application.setEmploymentStatus("Employed");
        application.setIncome(50000);
        history.push(application.save());

        application.setName("Jane Doe");
        application.setAddress("456 Elm St");
        application.setEmploymentStatus("Unemployed");
        application.setIncome(0);
        history.push(application.save());

        application.restore(history.pop());

        System.out.println("Name: " + application.save().getName());
        System.out.println("Address: " + application.save().getAddress());
        System.out.println("Employment Status: " + application.save().getEmploymentStatus());
        System.out.println("Income: " + application.save().getIncome());
    }
}


/**
 * Bu örnekte, LoanApplication sınıfı bir kredi başvurusunu temsil eder ve
 * setName, setAddress, setEmploymentStatus, setIncome, save, restore gibi metotlara sahiptir.
 * ApplicationState sınıfı, başvurunun belirli bir zaman dilimindeki durumunu temsil eder.
 * ApplicationHistory sınıfı ise ApplicationState nesnelerinin bir yığınını tutar ve bu yığın,
 * başvurunun geçmiş durumlarının bir geçmişini oluşturur.
 * Bu sayede, başvurunun herhangi bir durumu geri yüklenebilir.
 * Bu örnekte, Main sınıfında, başvurunun durumu iki kez değiştirilir ve her değişiklikten sonra durum ApplicationHistory nesnesine eklenir.
 * Sonra, pop metodu ile en son durum geri alınır ve başvuru bu duruma geri döner. Bu durum, başvurunun ilk durumudur ("John Doe", "123 Main St", "Employed", 50000). Bu yüzden, program bu bilgileri çıktı olarak verir.
 * Bu, Memento tasarım kalıbının tipik bir kullanım örneğidir.
 * Bu kalıp, özellikle kullanıcıların bir uygulamanın önceki durumlarına geri dönmelerini sağlayan uygulamalar için kullanışlıdır
 * (örneğin, bir kredi başvurusunda geri alma işlemi).
 */