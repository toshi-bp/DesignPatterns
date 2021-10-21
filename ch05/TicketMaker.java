package ch05;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
        System.out.println("インスタンスの生成");
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
