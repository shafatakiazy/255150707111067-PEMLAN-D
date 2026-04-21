public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() { return productName; }
    public int getQuantity()       { return quantity; }
    public int getPricePerItem()   { return pricePerItem; }

    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void tampilkanDetail() {
        System.out.println("  Produk      : " + productName);
        System.out.println("  Jumlah      : " + quantity + " pcs");
        System.out.println("  Harga/item  : Rp" + pricePerItem);
        System.out.println("  Subtotal    : Rp" + getPayableAmount());
        System.out.println("  ----------------------------");
    }
}
