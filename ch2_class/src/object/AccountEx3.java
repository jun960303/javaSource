package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        //배열 선언()
        Account[] accounts = new Account[100];

        boolean run =true;
        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
            System.out.print("선택 : ");
            int no = Integer.parseInt(sc.nextLine());
            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:
                    deposit(accounts);
                    break;
                case 4:
                    withdraw(accounts);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            
                default:
                    System.out.println("메뉴 번호 확인 해주세요");
                break;
            }
        }

        // accounts[0] = new Account("111", "홍길동", 10000);
        // accounts[1] = new Account("222", "성춘향", 20000);
        // accounts[2] = new Account("333", "이순신", 30000);


        // 성춘향 계좌에 입금
        // accounts[1].deposit(1000000);
        // System.out.println(accounts[1].getOwner()+" : "+accounts[1].getBalance());
    }
    static void createAccount(Account[] accounts){
        // 계좌생성담당 
        // Account accounts = new Account(null, null, 0);
        System.out.print("계좌번호를 입력해주세요 : ");
            String accountNo = sc.nextLine();
            System.out.print("계좌주를를 입력해주세요 : ");
            String owner = sc.nextLine();
            System.out.print("잔액을 입력해주세요 : ");
            int balance = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < accounts.length; i++) {
                if(accounts[i] == null){
                    accounts[i] = new Account(accountNo, owner, balance);
                    break;
                }
            }

            // accounts[i] = new Account(accountNo, owner, balance);
    }
    static void deposit(Account[] accounts){
        // 입금 담당
            Account account = findAccount(accounts);

            if(account == null){
                System.out.println("계좌번호 확인");
            }else{
                // 입금액 입력 받아 계좌 잔액 추가
                System.out.println("입금액 입력해주세요 : ");
                int amount = Integer.parseInt(sc.nextLine());
                // deposit() 호출 
                account.deposit(amount);
            }
    }
    
    static void withdraw(Account[] accounts){
        Account account = findAccount(accounts);
        // 출금 담당
        if(account == null){
            
        }
        System.out.println(" 출금액 입력해주세요 : ");
        int amount1 = Integer.parseInt(sc.nextLine());
        long balance = account.withdraw(amount1);

    }

    static Account findAccount(Account[] accounts){
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 :");
        String accountNo = sc.nextLine();


        //찾으면 실행하는 코드 
        for (Account account : accounts) {
            if(account != null){
                if(account.getAccountNo().equals(accountNo)){
                    return account;
                }
            }
        }
        return null;
    }

    static void accountList(Account[] accounts){
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("==========");
            System.out.println("1. 계좌번호 : " + account.getAccountNo());
            System.out.println("2. 계좌주 : " + account.getOwner());
            System.out.println("3. 잔액 : " + account.getBalance());
            System.out.println("==========");
            System.out.println(account.getAccountNo());
            }
        
        }
    }
}   
