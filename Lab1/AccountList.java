public class AccountList {
    @SuppressWarnings("FieldMayBeFinal")
    private Account[] accounts;

    public AccountList(int maxSize) {
        accounts = new Account[maxSize];
    }

    public boolean appendAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }

    public Account getAccount(int idx) {
        int actualCount = 0;
        for (Account a : accounts) {
            if (a != null) {
                actualCount++;
            }
        }

        if (idx >= 0 && idx < actualCount) {
            return accounts[idx];
        } else {
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}