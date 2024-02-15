package com.ramazan.designpatterns.behavioral.iterator;

// Main.java
public class Main {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}


/**
 * Iterator Pattern, bir koleksiyonun öğelerine sırayla erişim sağlamak için kullanılan bir tasarım modelidir.
 * Bu model, koleksiyonun iç yapısını gizler ve bu sayede koleksiyonun nasıl temsil edildiği veya depolandığı hakkında endişelenmeden öğeler üzerinde dolaşabiliriz.
 *
 * Bu modelin ana bileşenleri şunlardır:
 *
 * Iterator: Iterator, koleksiyonun öğelerine sırayla erişim sağlar. Genellikle hasNext() ve next() gibi metodları içerir. hasNext() metodu, koleksiyonda daha fazla öğe olup olmadığını kontrol eder. next() metodu ise koleksiyondaki sonraki öğeyi döndürür.
 *
 * Concrete Iterator: Iterator arayüzünü uygulayan sınıftır. Bu sınıf, Iterator’un metodlarını gerçekleştirir ve koleksiyonun öğelerine sırayla erişim sağlar.
 *
 * Aggregate: Aggregate (toplu) bir koleksiyonu temsil eder ve bir Iterator oluşturmak için bir metoda sahip olmalıdır.
 *
 * Concrete Aggregate: Aggregate arayüzünü uygulayan sınıftır. Bu sınıf, bir Iterator oluşturmak için gereken metodu sağlar.
 *
 * Java’da, java.util.Iterator arayüzü Iterator Pattern’i uygular ve çoğu Java koleksiyonu bu arayüzü kullanır. Bu sayede, farklı türdeki koleksiyonlar üzerinde aynı şekilde dolaşabiliriz, bu da kodun daha tutarlı ve anlaşılır olmasını sağlar.
 *
 * Örneğin, bir List ve bir Set üzerinde dolaşmak için aynı Iterator metodlarını (hasNext() ve next()) kullanabiliriz. Bu, kodun daha genel ve esnek olmasını sağlar, çünkü belirli bir koleksiyon türüne bağlı kalmaz. Bu, Iterator Pattern’in en büyük avantajlarından biridir.
 */

