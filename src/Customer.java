public class Customer {
    private ShoppingCard card;

    private int balance;

    public Customer(int balance) {
        this.card = new ShoppingCard();
        this.balance = balance;
    }

    public void purchase() {
        if (balance < card.getTotalPrice()) {
            System.out.println("Your card balance is not enough for purchase!");
        } else {
            balance -= card.getTotalPrice();
        }
    }

    public void addProductToCart(Product product) {
        card.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        card.removeProduct(product);
    }

    public int getBalance(){
        return balance;
    }
}
