package design.patterns.behavioural.iterator;

public class Executor {

  public static void main(String[] args) {
    ChannelCollection channelCollection= new ChannelCollectionImpl();

    channelCollection.addChannel(new Channel(104.00,ChannelType.HINDI));
  }
}
