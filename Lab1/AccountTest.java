public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Vincent", 12);
        account.setName("Van Gogh");
        System.out.println(account.getName());
        System.out.println("You're balance is : " + account.getBalance() + " $");
        account.deposit(13);
        account.deposit(11.5);
    }
}
