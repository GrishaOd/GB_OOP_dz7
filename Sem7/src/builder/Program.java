package builder;

public class Program {

    public static void main(String[] args) {
        Order order1 = new OrderBuilder()
                .setClientName("Client #1")
                .setPrice(200.5)
                .setQnt(4)
                .setProductId(12454)
                .setSign(true)
                .build();

    }

}
