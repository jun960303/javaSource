package object;

public class AccountEx {
    public static void main(String[] args) {
        // Account 인스턴스 생성
        Account ac = new Account("120-12-111", "홍길동", 100000);

        // 입금한다 호출
        ac.deposit(40);
        // 입금 후 잔액
        // System.out.println("잔액 : " + ac.balance);
        System.out.println("잔액 : " + ac.getBalance());
        // 출금한다 호출
        ac.withdraw(20);
        System.out.println("잔액 : ");

        Account ac2 = new Account("121-11-2222", "성춘향", 1500000);
        // 잔액조회
        // System.out.println("성춘향 잔액 : " + ac2.getBalance());
        System.out.println("==========");
        System.out.println("1. 계좌번호 : " + ac2.getAccountNo());
        System.out.println("2. 계좌주 : " + ac2.getOwner());
        System.out.println("3. 잔액 : " + ac2.getBalance());
        System.out.println("==========");
    }
}
