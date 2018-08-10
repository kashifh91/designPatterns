package design.patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
  List<Channel> channels;

  public ChannelCollectionImpl() {
    this.channels = new ArrayList<>();
  }

  @Override
  public void addChannel(Channel channel) {
    channels.add(channel);

  }

  @Override
  public void removeChannel(Channel channel) {

    channels.remove(channel);
  }

  @Override
  public ChannelIterator iterator(ChannelType channelType) {
    return new ChannelIteratorImpl(channels,channelType);
  }

  private class ChannelIteratorImpl implements ChannelIterator {

    List<Channel> channels;
    ChannelType channelType;
    int pos;

    public ChannelIteratorImpl(List<Channel> channels, ChannelType channelType) {
      this.channels = channels;
      this.channelType = channelType;
      pos=0;
    }

    @Override
    public boolean hasNext() {
      while (pos<channels.size()){
        Channel channel=channels.get(pos);
        if(channel.getChannelType().equals(channelType)||channel.getChannelType().equals(ChannelType.ALL)){
          return true;
        }
        pos++;
      }
      return false;
    }

    @Override
    public Channel next() {
      Channel channel = channels.get(pos);
      pos++;
      return channel;
    }
  }
}
