package inheritance;

public class AccountEx {
    public static void main(String[] args) throws Exception {
        // 체크카드 
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 10000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        //입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());
        //직불카드 사용 
        
        try {
            System.out.println(+checkingAccount.pay("체크카드 지불 후 잔액 : "+"111-22", 300000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
