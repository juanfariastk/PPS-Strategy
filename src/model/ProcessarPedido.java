package model;

public class ProcessarPedido {
    private Pagamento formaPagamento;

    public void definirMetodoPagamento(Pagamento pagamento){
        this.formaPagamento = pagamento;
    }

    public String processarPagamento(Pedido pedido){
        if (formaPagamento ==null){
            return "Metodo não definido, escolher um método compativel";
        }
        return formaPagamento.realizarPagamento(pedido);
    }
}
