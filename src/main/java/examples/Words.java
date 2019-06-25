package examples;

public class Words {

    public String textWord;
    public String assertionMessage;

    public Words(String textWord, String assertionMessage){
        this.textWord = textWord;
        this.assertionMessage = assertionMessage;
    }

    public String getText() {
        return textWord;
    }

    public void setText(String type) {
        this.textWord = textWord;
    }

    public String getAssertionMessage() {
        return assertionMessage;
    }

    public void setAssertionMessage(String assertionMessage) {
        this.assertionMessage = assertionMessage;
    }
}
