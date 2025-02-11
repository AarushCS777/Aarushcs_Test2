public class MessagePrinter
{
    // Method to print the message
    public void printMessage(String name) {
        System.out.println("hello" + name);
    }

    // Main method for testing
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();
        printer.printMessage("CAPTIAN AMERICA"); // Example usage
    }
}
