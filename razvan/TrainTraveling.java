package razvan;

public class TrainTraveling {
    
    public static void main(String[] args) {
        Ticket<String> bookingReference = 
            new Ticket<String>("ABC123");
        System.out.println(bookingReference.getInformation());
        bookingReference.setInformation("ZXC567");
        System.out.println(bookingReference.getInformation());

        Ticket<Integer> seatNumber = 
            new Ticket<>(22);
        System.out.println(seatNumber.getInformation());
        seatNumber.setInformation(35);
        System.out.println(seatNumber.getInformation());

        Passenger p = new Passenger("Teodor");
        Ticket<Passenger> passengerName = 
            new Ticket<>(p);
        System.out.println(passengerName.getInformation());
        Passenger q = new Passenger("Andrei");
        passengerName.setInformation(q);
        System.out.println(passengerName.getInformation());

        Ticket<Passenger> passangerTicket = 
            new Ticket<Passenger>(new Passenger("Matei"));
        System.out.println(passangerTicket.getInformation());
        passangerTicket.setInformation(new Passenger("Daniela"));
        System.out.println(passangerTicket.getInformation());

        // bookingReference.setInformation(100);
        // error: incompatible types: int cannot be converted to String
        
        // seatNumber.setInformation("25");
        // error: incompatible types: String cannot be converted to Integer

        // Ticket<int> anotherTicket = new Ticket<>(10);
        // error: unexpected type

        Ticket<Number> ticket1 = new Ticket<>(10);
        System.out.println(ticket1);
        changeFare(ticket1);

        Ticket<Object> ticket2 = new Ticket<>("Init value");
        System.out.println(ticket2);
        changeFare(ticket2);

        Ticket<Integer> ticket3 = new Ticket<>(20);
        // changeFare(ticket3);
        // error: incompatible types: Ticket<Integer> cannot be converted to Ticket<? super Number>
    }

    public static void changeFare(Ticket<? super Number> ticket) {
        ticket.setInformation(34.7);
        System.out.println(ticket.getInformation());

    }
}
