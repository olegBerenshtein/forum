package entities;

public class Message {
    private long id;
    private User author;
    private String text;

    public Message(long id, User author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public Message(User author, String text) {
        this.id = (long) (999 + Math.random() * 9000);
        this.author = author;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", author=" + author +
                ", text='" + text + '\'' +
                '}';
    }
}
