package model;

public interface Pagamento {
    String realizarPagamento(Pedido pedido);
    boolean validarPagamento();
}
