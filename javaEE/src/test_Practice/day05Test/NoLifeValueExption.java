package test_Practice.day05Test;

public class NoLifeValueExption extends RuntimeException {
    public NoLifeValueExption() {
        super();
    }

    public NoLifeValueExption(String message) {
        super(message);
    }
}
