package shop;

import java.util.Scanner;

public class MyShop implements IShop {
    private String title;
    Product[] products = new Product[5];
    // 장바구니
    Product[] carts = new Product[5];
    // User
    User[] users = new User[2];
    Scanner sc = new Scanner(System.in);
    // 선택된 사용자 index 만 보관하는 함수
    private int selUser;

    public void setTitle(String title) {
        this.title = title;
    }

    // 첫 메뉴 화면 제공
    @Override
    public void start() {
        System.out.println(title + " : 메인화면 - 계정선택 ");
        System.out.println("===============================");
        int i = 0; // for each 로 할때는 바깥에 I변수값 하나 생성할것.
        for (User users : users) {
            // System.out.println(users); 내가 한 코드 실행시 주소값이 나옴..
            System.out.printf("[%d]%s(%s)\n", i++, users.getName(), users.getPayType());
        }

        // for (int j = 0; j < users.length; j++) { for i 로 썼을때는 이런식으로
        // System.out.printf("[%d]%s(%s)\n", j, users[j].getName(),
        // users[j].getPayType());
        // }

        System.out.println("[X] 종료");
        System.out.print("선택 : ");
        String sel = sc.nextLine();
        switch (sel) {
            case "x":
            case "X":
                System.out.println("프로그램 종료 * *");
                System.exit(0);
                break;
            default:
                selUser = Integer.parseInt(sel);
                break;
        }
        System.out.printf("## %s 선택##\n", sel);
        // 상품 출력
        productList();
    }

    // 상품 출력
    @Override
    public void productList() {
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("===============================");
        // for (int i = 0; i < products.length; i++) {
        // System.out.println();
        // }
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i);
            product.printDetail();
            i++;
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("선택 : ");
        // 상품번호 0 선택 시 => cart 담기(1. 비어있는 위치를 찾아야함. , 2. 빈곳에 담아야함.)
        // 사용자 입력 : 상품번호 , h , c
        String sel = sc.nextLine();
        System.out.printf("## %s 선택##\n", sel);
        switch (sel) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;
            default:
                int menu2 = Integer.parseInt(sc.nextLine());
                // carts[0] = products[menu2];
                for (int j = 0; j < carts.length; j++) {
                    if (carts[j] == null) {
                        carts[j] = products[menu2];
                        break;
                    }
                }
                // 상품목록 보여주기
                productList();
                break;
        }
        // sc.close();
        // 상품번호 1선택 시 => cart 담기

        // 상품목록 보여주기 => c => 결제처리 메소드 호출
        // 상품목록 보여주기 => h => 계정 선택
    }

    // 결제처리
    @Override
    public void checkOut() {
        System.out.println(title + " : 체크아웃");
        System.out.println("===============================");
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("===============================");
        System.out.println("결제방법 : " + users[selUser].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전 , [q] 결제 완료");
        System.out.println("선택 : ");
        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다. ###");
                System.exit(0);
                break;
            case "p":
                productList();
                break;

            default:
                checkOut();
                break;
        }
    }

    // 사용자 등록
    @Override
    public void genUser() {
        // 2명 사용자 등록
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    // 상품등록
    @Override
    public void genProduct() {
        products[0] = new TV("삼성TV", 2300000, "4K");
        products[1] = new TV("LGTV", 1700000, "4K");
        products[2] = new CellPhone("갤럭시Z폴드", 12000000, "SKT");
        products[3] = new CellPhone("갤럭시Z플립", 8000000, "U+");
        products[4] = new CellPhone("갤럭시울트라", 9000000, "KT");
    }

}
