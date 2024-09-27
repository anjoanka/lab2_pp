package seats;

public class Seats {
    private int generalSeats;
    private int coupeSeats;
    private int platzkartSeats;
    private int luxSeats;

    public Seats(int generalSeats, int coupeSeats, int platzkartSeats, int luxSeats){
        this.generalSeats = generalSeats;
        this.coupeSeats = coupeSeats;
        this.platzkartSeats = platzkartSeats;
        this.luxSeats = luxSeats;
    }

    public int getGeneralSeats() { return generalSeats; }
    public int getCoupeSeats() { return coupeSeats; }
    public int getPlatzkartSeats() { return platzkartSeats; }
    public int getLuxSeats() { return luxSeats; }

    public void setGeneralSeats(int generalSeats) {this.generalSeats = generalSeats; }
    public void setCoupeSeats(int coupeSeats) {this.coupeSeats = coupeSeats; }
    public void setPlatzkartSeats(int platzkartSeats) {this.platzkartSeats = platzkartSeats; }
    public void setLuxSeats(int luxSeats) {this.luxSeats = luxSeats; }
}
