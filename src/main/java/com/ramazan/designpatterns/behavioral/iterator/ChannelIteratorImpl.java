package com.ramazan.designpatterns.behavioral.iterator;

import java.util.List;

// ChannelIteratorImpl.java
public class ChannelIteratorImpl implements ChannelIterator {
    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
        this.type = ty;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel c = channels.get(position);
            if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channels.get(position);
        position++;
        return c;
    }
}


/**
 * Concrete Iterator: Iterator arayüzünü uygulayan sınıftır. Bu sınıf, Iterator’un metodlarını gerçekleştirir ve koleksiyonun öğelerine sırayla erişim sağlar.
 */
