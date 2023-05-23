package brewMe;

public class ArgumentNumberException extends Exception{

    private int argumentsReceived;
    private int argumentsAccepted;
    public ArgumentNumberException(int argumentsReceived, int argumentsAccepted) {
        this.argumentsReceived = argumentsReceived;
        this.argumentsAccepted = argumentsAccepted;
    }

    @Override
    public String toString() {
        return "ArgumentNumberException: Arguments expected: " + argumentsAccepted  + "Arguments Received: " + argumentsReceived;
    }

}
