package com.assignment;

/**
 * Done - Take input as 6 digit ticket number. Eg : 123454T
 * Done - Then remove the last digit in this case 4 remaining is 12345
 * This no 12345 if divided by 7 should give the remainder 4 (the last no that we removed).
 * Then compare the remainder with the last digit of the 6 digit ticket no.
 * Display the result if no is valid or not
 * Try for no’s : 147103(should give valid) and 154123 should give invalid
 */


public class Ticket {

    private int ticketNumber;
    private int remainder;
    private int lastDigit;



    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void removeLast(){
        this.ticketNumber = ticketNumber/10;
    }

    public void setLastDigit() {
        this.lastDigit = ticketNumber%10;
    }

    public int getLastDigit() {
        return lastDigit;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getRemainder() {
        this.remainder = this.ticketNumber%7;

        return this.remainder;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", remainder=" + remainder +
                ", lastDigit=" + lastDigit +
                '}';
    }
}
