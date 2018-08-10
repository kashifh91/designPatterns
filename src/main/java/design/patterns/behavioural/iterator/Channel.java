package design.patterns.behavioural.iterator;

public class Channel {
  double frequency;
  ChannelType channelType;

  public Channel(double frequency, ChannelType channelType) {
    this.frequency = frequency;
    this.channelType = channelType;
  }

  public double getFrequency() {
    return frequency;
  }

  public ChannelType getChannelType() {
    return channelType;
  }
}
