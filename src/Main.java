import model.*;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(150.0);

        // PayPal
        Pagamento paypal = new PagamentoPaypal("usuario@gmail.com", "1234");
        ProcessarPedido processador = new ProcessarPedido();
        processador.definirMetodoPagamento(paypal);
        System.out.println(processador.processarPagamento(pedido));

        //Cartão de Crédito
        Pagamento cartao = new PagamentoCC("1234567812345678", "12/24", "123");
        processador.definirMetodoPagamento(cartao);
        System.out.println(processador.processarPagamento(pedido));
    }
}