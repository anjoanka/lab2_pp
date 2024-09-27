package train;
import seats.Seats;
public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;
    private Seats seats;

    public Train(String destination, int trainNumber, String departureTime, Seats seats){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.seats = seats;
    }

    public String getDestination(){
        return destination;
    }

    public int getTrainNumber(){
        return trainNumber;
    }

    public String getDepartureTime(){
        return departureTime;
    }
    public Seats getSeats() { return seats; }

    public void setDestination(String destination) { this.destination = destination; }
    public void setTrainNumber(int train_number) { this.trainNumber = trainNumber; }
    public void setDepartureTime(String departure_time) { this.departureTime = departureTime; }

    @Override
    public String toString() {
        return String.format("Train Number: %d | Destination: %s | Departure Time: %s | General Seats: %d | Coupe Seats: %d | Platzkart Seats: %d | Lux Seats: %d",
                trainNumber, destination, departureTime,
                seats.getGeneralSeats(), seats.getCoupeSeats(),
                seats.getPlatzkartSeats(), seats.getLuxSeats());
    }

}
