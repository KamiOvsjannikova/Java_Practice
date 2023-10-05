package _05_10_2023.messages;

import java.time.LocalDate;

public class EmailMessange extends MessangerMessage {
    private final String subject; // dobovlaem «статус», «дата отправки», «тема», «копия» и «скрытая копия»
    private final String copy;
    private final String hiddenCopy;

    public EmailMessange(String text, String recipient, String sender, Status status, LocalDate date, String subject, String copy, String hiddenCopy) {
        super(text, recipient, sender, status, date);
        this.subject = subject;
        this.copy = copy;
        this.hiddenCopy = hiddenCopy;
    }

    public String getSubject() {
        return subject;
    }

    public String getCopy() {
        return copy;
    }

    public String getHiddenCopy() {
        return hiddenCopy;
    }
}
