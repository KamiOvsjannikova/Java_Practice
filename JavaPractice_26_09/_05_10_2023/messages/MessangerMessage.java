package _05_10_2023.messages;

import java.time.LocalDate;

public class MessangerMessage extends Message{ //nazvanie predka
    private Status status;
    private LocalDate date; //data

    public MessangerMessage(String text, String recipient, String sender, Status status, LocalDate date) {
        super(text, recipient, sender);
        this.status = status;
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }
}
