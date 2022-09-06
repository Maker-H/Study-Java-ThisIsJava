import java.util.Scanner;

public class Ch6_BankApplication {
    private static Lib_BankApplication[] accountArray = new Lib_BankApplication[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("----------------------");
            System.out.println("1.계좌입력 2.계좌리스트 3.입금 4.출금 5.종료");
            System.out.println("----------------------");
            System.out.print(">");
            
            int selcetNo;
            selcetNo = scanner.nextInt();

            if(selcetNo == 1) {
                inputAccount();
            } else if(selcetNo ==2) {
                accountList();
            } else if(selcetNo ==3) {
                deposit();
            } else if(selcetNo ==4) {
                withdraw();
            } else if(selcetNo ==5) {
                run =false;
            }
            
        }//end of loop
        System.out.println("End");
    }//end of main

    private static void inputAccount() {
        String accountnum;
        String owner;
        int balance;
        
        System.out.print("Enter account number : ");
        accountnum = scanner.next();
        
        System.out.print("Enter owner : ");
        owner = scanner.next();

        System.out.print("Enter balance : ");
        balance = scanner.nextInt();

        Lib_BankApplication acc = new Lib_BankApplication(accountnum, owner, balance);

        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i]==null) {
                accountArray[i] = acc;
                System.out.println("계좌 입력 성공");
                return;
            }
        }

    }//end of method

    private static void accountList() {
        
        for(int i=0; i<accountArray.length; i++) {
            Lib_BankApplication acc = accountArray[i];
            if(acc!=null) {
                System.out.println(acc.getAno()+'\t'+acc.getOwner()+'\t'+acc.getBalance());
            }
        }
    } //end of method
    
    private static void deposit() {
        String accountnum;
        int deposit;
        System.out.print("Enter Account number : ");
        accountnum = scanner.next();
        Lib_BankApplication acc = findAccount(accountnum);

        System.out.print("Enter deposit amount  : ");
        deposit = scanner.nextInt();

        acc.setBalance(acc.getBalance()+deposit);
        System.out.println("입금성공");
        
        
    }
    
    private static void withdraw() {
        String accountnum;
        int withdraw;
        System.out.print("Enter Account number : ");
        accountnum = scanner.next();
        Lib_BankApplication acc = findAccount(accountnum);

        System.out.print("Enter deposit amount  : ");
        withdraw = scanner.nextInt();

        acc.setBalance(acc.getBalance()-withdraw);
        
    }

    private static Lib_BankApplication findAccount(String accountnum) {
        Lib_BankApplication acc = null;
        for(int i=0; i<accountArray.length; i++) {
             acc = accountArray[i];
            if(acc != null) {
                if((acc.getAno()).equals(accountnum)) {
                    break;
                }
            }
        }
        return acc;
    }
}//end of class