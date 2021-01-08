package Classes.Aggregation_and_composition.TaskFour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(105);
        Account account1 = new Account(-150);
        Account account2 = new Account(528);
        Account account3 = new Account(4523);
        Account account4 = new Account(-543);
        Account account5 = new Account(-828);
        Client client = new Client("Petr", account, account1, account2, account3, account4);
        client.add(account5);
        System.out.println(Arrays.toString(client.accounts));
        client.remove(account3);
        System.out.println(Arrays.toString(client.accounts));
        client.blockAccounts();
        System.out.println(Arrays.toString(client.accounts));
        client.getAccountsSummary();
        client.getSeparatedAccountsSummary();

    }
}
