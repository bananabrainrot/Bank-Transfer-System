public class main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Customer customer = new Customer("Ruza");
        Customer customer1 = new Customer("Alikhan");

        Account acc1 = bank.openAccount(customer, 1000);
        Account acc2 = bank.openAccount(customer1, 200);

        System.out.println("Before transfer:");
        System.out.println(acc1);
        System.out.println(acc2);

        bank.transfer(acc1, acc2, 300);

        System.out.println("\nAfter successful transfer:");
        System.out.println(acc1);
        System.out.println(acc2);

        bank.transfer(acc1, acc2, 2000);

        System.out.println("\nFinal balances:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}