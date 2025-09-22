
public class AccountListTest {

    public static void main(String[] args) {
        AccountList al = new AccountList(3);

        // success should be true
        boolean success = al.appendAccount(new Account("Oak", 1.0));
        System.out.println("Append Oak -> " + success);

        success = al.appendAccount(new Account("Two", 0.1));
        System.out.println("Append Two -> " + success);

        // It should print “Input index exceeds the number of appended elements”
        Account account = al.getAccount(2);
        System.out.println(account); // should print null

        account = al.getAccount(1);
        // It should print 0.1 (balance of account at index 1)
        if (account != null) {
            System.out.println(account.getBalance());
        }

        // Append account with 0 balance (balance will be 0 because constructor fixes it)
        success = al.appendAccount(new Account("tmp", 0));
        System.out.println("Append tmp -> " + success);

        // This should fail because list is now full
        success = al.appendAccount(new Account("tmp2", 0));
        System.out.println("Append tmp2 -> " + success); // should print false
    }
}
