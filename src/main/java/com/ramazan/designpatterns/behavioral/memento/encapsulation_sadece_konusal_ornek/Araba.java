package com.ramazan.designpatterns.behavioral.memento.encapsulation_sadece_konusal_ornek;

public class Araba {
    private int hiz;
    private int vites;

    // Hızı döndüren getter metodu
    public int getHiz() {
        return hiz;
    }

    // Hızı ayarlayan setter metodu
    public void setHiz(int hiz) {
        if(hiz >= 0) {
            this.hiz = hiz;
        } else {
            System.out.println("Hız negatif olamaz!");
        }
    }

    // Vitesi döndüren getter metodu
    public int getVites() {
        return vites;
    }

    // Vitesi ayarlayan setter metodu
    public void setVites(int vites) {
        if(vites >= 0 && vites <= 5) {
            this.vites = vites;
        } else {
            System.out.println("Vites 0 ile 5 arasında olmalıdır!");
        }
    }
}


/**
 * Bu örnekte, Araba sınıfının hiz ve vites özellikleri (değişkenleri) private olarak tanımlanmıştır.
 * Bu, bu özelliklere doğrudan erişimin engellenmesi anlamına gelir.
 * Bunun yerine, bu özelliklere erişmek ve onları değiştirmek için public getter ve setter metotları kullanılır.
 * Bu metotlar, hiz ve vites özelliklerinin geçerli değerlere sahip olmasını sağlar.
 * Bu, kapsüllemenin bir örneğidir. Bu sayede, Araba nesnesinin iç durumu korunur ve hatalar önlenir.
 * Bu nedenle, kapsülleme, nesne yönelimli programlamanın temel prensiplerinden biridir.
 */
