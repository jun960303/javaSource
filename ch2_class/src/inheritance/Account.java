package inheritance;

import java.util.Scanner;

public class Account {
    // 은행계좌 클래스
    // 계좌번호(120-12-111) , 계좌주(홍길동),잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;
    Scanner sc = new Scanner(System.in);

    // 입금한다 (잔액 = 잔액 + 입금액) => 입금액을 인자로 받아서 처리 , 리턴타입없음 , deposit
    void deposit(long amount) {
        balance = balance + amount;
    };

    // 출금한다 (잔액 = 잔액 - 출금액)
    long withdraw(long amount) throws Exception { //
        // 잔액 안에서 출금 허용
        if (amount > balance) {
            throw new Exception("잔액부족");
        }
        balance = balance - amount;
        return balance;
    }

    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 속성 값 조희 : get ~~
    public long getBalance() {
        return balance;
    }

    private String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
