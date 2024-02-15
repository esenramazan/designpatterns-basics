package com.ramazan.solid.liskovsubtitutionprinciple.olumlu;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Shape square = new Square(5);
        System.out.println("Area of square: " + square.calculateArea());
    }
}
/*
 * Liskov Substitution Prensibi (LSP), bir alt sınıfın, üst sınıfının yerine geçebilmesi gerektiğini belirtir.
 * Yani, bir alt sınıfın nesnesi, herhangi bir üst sınıfın nesnesi ile yer değiştirebildiğinde, programın davranışı değişmemelidir.

Örneğin, Square (Kare) sınıfını Rectangle (Dikdörtgen) sınıfından türettiğimizde,
* Square sınıfının bir Rectangle sınıfı olarak kabul edilebilmesi gerektiği anlamına gelir.
* Ancak, bu durumda Square sınıfının setWidth ve setHeight metodları anlamsız hale gelir çünkü birini ayarlama, diğerini de değiştirir.
*  Bu durum, LSP’yi ihlal eder çünkü Square sınıfının bir Rectangle sınıfı olarak kullanılamamasına neden olur.

Bu nedenle, LSP’ye uygun bir tasarım yapmak için, bir sınıfı başka bir sınıftan türetirken, türetilen sınıfın (alt sınıfın), türeten sınıfın (üst sınıfın) yerine geçebilmesi gerektiğini göz önünde bulundurmalıyız. Bu, kodun daha esnek ve bakımı daha kolay olmasını sağlar.
 */