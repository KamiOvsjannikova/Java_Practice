package _05_10_2023.messages;
//Создайте класс «Сообщение» с полями «текст», «получатель», «отправитель». Создайте несколько наследников:
//сообщение мессенджера – содержит дополнительно поле «статус» (отправлено, доставлено) и дату отправки;
//сообщение email - содержит дополнительно поля «статус», «дата отправки», «тема», «копия» и «скрытая копия»;
public class Message {
    private String text; //поля «текст», «получатель», «отправитель»
    private String recipient;
    private String sender;

    public Message(String text, String recipient, String sender) {
        this.text = text;
        this.recipient = recipient;
        this.sender = sender;
    }

    // sozdaem getter

    public String getText() {
        return text;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
}
