public class main {

    public static void main(String[] args) {

        // 1. Create bank, customer, and two accounts
        Bank bank = new Bank();
        Customer customer = new Customer("Ruza");
        Customer customer1 = new Customer("Alikhan");

        Account acc1 = bank.openAccount(customer, 1000);
        Account acc2 = bank.openAccount(customer1, 200);

        // Print balances before
        System.out.println("Before transfer:");
        System.out.println(acc1);
        System.out.println(acc2);

        // 2. Successful transfer
        bank.transfer(acc1, acc2, 300);

        // Print balances after successful transfer
        System.out.println("\nAfter successful transfer:");
        System.out.println(acc1);
        System.out.println(acc2);

        // 3. Failed transfer (insufficient funds)
        bank.transfer(acc1, acc2, 2000);

        // 4. Final balances
        System.out.println("\nFinal balances:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}