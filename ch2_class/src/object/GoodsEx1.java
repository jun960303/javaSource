package object;

public class GoodsEx1 {
    public static void main(String[] args) {
        GoodsStock goodsStock = new GoodsStock("p-0001", 35);
        GoodsStock goodsStock1 = new GoodsStock();
        goodsStock1.setName("p-0002");
        goodsStock1.setAmount(40);

        System.out.println(goodsStock);
        System.out.println(goodsStock1);

    }
}
