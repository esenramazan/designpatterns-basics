package com.ramazan.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

// ChannelCollectionImpl.java
public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }
}
