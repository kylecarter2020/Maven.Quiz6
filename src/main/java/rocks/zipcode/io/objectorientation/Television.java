package rocks.zipcode.io.objectorientation;

public class Television {
    private TVChannel channel;
    private boolean isTurnedOn;

    public Television() {
        this.isTurnedOn = false;
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void setChannel(Integer channel) {
        if(isTurnedOn) {
            this.channel = TVChannel.getByOrdinal(channel);
        }
        else {
            throw new IllegalStateException();
        }
    }

    public TVChannel getChannel() {
        return this.channel;
    }
}
