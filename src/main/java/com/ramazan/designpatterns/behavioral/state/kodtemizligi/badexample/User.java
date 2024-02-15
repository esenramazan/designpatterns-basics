package com.ramazan.designpatterns.behavioral.state.kodtemizligi.badexample;

class User {
    private String state = "new";

    public void promote() {
        if (state.equals("new")) {
            state = "active";
            System.out.println("User is now active.");
        } else if (state.equals("active")) {
            state = "inactive";
            System.out.println("User is now inactive.");
        } else if (state.equals("inactive")) {
            state = "new";
            System.out.println("User is now new again.");
        }
    }
}


/***
 * Bu kod, çok sayıda if-else ifadesi içerir ve bu da kodun karmaşık ve okunması zor olmasına neden olabilir.
 * Ayrıca, yeni bir durum eklemek isterseniz, promote metodunu değiştirmeniz gerekir. Bu, Açık/Kapalı Prensibini ihlal eder.
 */
