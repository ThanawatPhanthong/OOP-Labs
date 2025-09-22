public class AccountTest {
    public static void main(String[] args) {
        // Create account with positive balance
        Account account = new Account("Vincent", 12);

        // Change name
        account.setName("Van Gogh");
        System.out.println("Account name: " + account.getName());
        System.out.println("Initial balance: " + account.getBalance() + " $");

        // Deposit a valid amount
        account.deposit(13);
        System.out.println("Balance after depositing 13: " + account.getBalance() + " $");

        // Deposit invalid (negative amount) -> no change
        account.deposit(-11.5);
        System.out.println("Balance after invalid deposit: " + account.getBalance() + " $");

        // Test with non-positive constructor balance
        Account empty = new Account("Zero Account", -50);
        System.out.println(empty.getName() + " starts with " + empty.getBalance() + " $");
    }
}