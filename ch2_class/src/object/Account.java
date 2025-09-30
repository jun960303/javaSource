package object;

public class Account {
    // 은행계좌 클래스
    // 계좌번호(120-12-111) , 계좌주(홍길동),잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;

    // 입금한다 (잔액 = 잔액 + 입금액) => 입금액을 인자로 받아서 처리 , 리턴타입없음 , deposit
    void deposit(long amount) {
        balance = balance + amount;
    };

    // 출금한다 (잔액 = 잔액 - 출금액) => 출금액으 ㄹ인자로 받아서 처리 , 잔액리턴 , withdraw
    long withdraw(long amount) {
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

    public String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }

}
