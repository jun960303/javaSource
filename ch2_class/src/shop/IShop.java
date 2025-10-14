package shop;

public interface IShop {

    // 첫 메뉴 화면 제공
    void start();

    // 상품 출력
    void productList();

    // 결제처리
    void checkOut();

    // 사용자 등록
    void genUser();

    // 상품등록
    void genProduct();

}