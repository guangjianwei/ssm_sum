package test_Practice.day05Test;

public class NoScoreException extends RuntimeException {
    public NoScoreException() {
        super();
    }

    // 有参构造
    public NoScoreException(String message) {
        super(message);
    }
}
