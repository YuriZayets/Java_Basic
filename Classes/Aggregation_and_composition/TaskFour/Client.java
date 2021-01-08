package Classes.Aggregation_and_composition.TaskFour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Client {
    String name;
    Account[] accounts;
    private int size;

    public Client(String name, Account... accounts) {
        this.name = name;
        this.accounts = accounts;
        size = accounts.length;
    }

    public void add(Account account) {
        size++;
        accounts = Arrays.copyOf(accounts, size);
        accounts[size-1] = account;
    }

    public void remove(int index) {
        if (index > 0 && index < size-1) {
            size--;
            System.arraycopy(accounts, index + 1, accounts, index, accounts.length - index - 1);
            accounts[accounts.length-1] = new Account(0); //думаю что в большинстве случаев это плохая идея, как собственно и пересоздавать массив поменьше при каждом удалении
        }

    }

    public void remove(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].equals(account)) {
                remove(i);
            }
        }
    }

    public void blockAccounts () {
        for (Account account : accounts) {
            account.isBlocked = true;
        }
    }

    public void getAccountsSummary () {
        int summary = 0;
        for (Account account : accounts) {
            summary += account.balance;
        }
        System.out.println("Суммарный баланс всех счетов равен : " + summary);
    }

    public void getSeparatedAccountsSummary () {
        int summaryPos = 0;
        int summaryNeg = 0;
        for (Account account : accounts) {
            if (account.balance > 0){
                summaryPos += account.balance;
            } else summaryNeg +=account.balance;
        }
        System.out.println("Суммарный баланс положительных счетов равен : " + summaryPos);
        System.out.println("Суммарный баланс отрицательных счетов равен : " + summaryNeg);
    }

    public void printAccountsSortedByFunds () {
        ArrayList<Account> sortedAccounts = new ArrayList<>(Arrays.asList(accounts));
        sortedAccounts.sort(Comparator.comparing(account ->  account.balance));
        System.out.println(sortedAccounts.toString());
    }
}
