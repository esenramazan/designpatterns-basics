package com.ramazan.designpatterns.behavioral.iterator;

// ChannelIterator.java
public interface ChannelIterator {
    public boolean hasNext();
    public Channel next();
}


/**
 * Iterator: Iterator, koleksiyonun öğelerine sırayla erişim sağlar.
 * Genellikle hasNext() ve next() gibi metodları içerir. hasNext() metodu, koleksiyonda daha fazla öğe olup olmadığını kontrol eder.
 * next() metodu ise koleksiyondaki sonraki öğeyi döndürür.
 */
