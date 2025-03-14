import java.util.ArrayList;
import java.util.List;

public class TicketTest {
    public static void main(String[] args) {
        List<Ticket>tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket("Concert", "A1", 50.00);
        Ticket ticket2 = new Ticket("Movie", "B3", 15.00);
        Ticket ticket3 = new Ticket("Play", "C2", 30.00);
        Ticket ticket4 = new Ticket("Football Match", "D4", 40.00);
        Ticket ticket5 = new Ticket("Music Festival", "E5", 60.00);
        Ticket ticket6 = new Ticket("Movie", "F6", 12.00);
        Ticket ticket7 = new Ticket("Theater", "G7", 25.00);
        Ticket ticket8 = new Ticket("Comedy Show", "H8", 20.00);
        Ticket ticket9 = new Ticket("Sports Event", "I9", 35.00);
        Ticket ticket10 = new Ticket("Festival", "J10", 70.00);
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        tickets.add(ticket7);
        tickets.add(ticket8);
        tickets.add(ticket9);
        tickets.add(ticket10);

        System.out.println(tickets);
    }
}
