package com.ramazan.designpatterns.behavioral.iterator;

// ChannelCollection.java
public interface ChannelCollection {
    void addChannel(Channel c);
    void removeChannel(Channel c);
    ChannelIterator iterator(ChannelTypeEnum type);
}

/**
 * Örnekteki Aggregate sınıfımız ChannelCollection arayüzüdür.
 * Bu arayüz, bir Iterator oluşturmak için gereken metodu (iterator(ChannelTypeEnum type)) tanımlar.
 * Bu arayüzü uygulayan ChannelCollectionImpl sınıfı ise Concrete Aggregate sınıfıdır.
 * Bu sınıf, ChannelIteratorImpl nesneleri oluşturarak ChannelCollection arayüzünün iterator(ChannelTypeEnum type) metodunu gerçekleştirir.
 * Bu sayede, belirli bir ChannelTypeEnum türündeki kanallar üzerinde yineleme yapabiliriz. Bu, Iterator Pattern’ın temel bir parçasıdır.
 */
