package _05_10_2023;

import _05_10_2023.messages.EmailMessange;
import _05_10_2023.messages.Message;
import _05_10_2023.messages.MessangerMessage;
import _05_10_2023.messages.Status;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        Message message = new Message("Hi", "Maxim", "Adriana");
        MessangerMessage messangerMessage = new MessangerMessage(
                "Hi",
                "+3746465",
                "+354554",
                Status.NOT_SENT,
                LocalDate.now()
        );
        EmailMessange emailMessange = new EmailMessange(
                "Hi",
                "+ghhgv@gmail.com",
                "hjaskk@gmail.com",
                Status.NOT_SENT,
                LocalDate.now(),
                "Important",
                "hghg@gmai.com",
                null
        );
    }
}
