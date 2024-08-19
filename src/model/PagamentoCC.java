package model;

public class PagamentoCC implements Pagamento{
    private String numero;
    private String dataExpiração;
    private String cvv;

    public PagamentoCC(String numero, String dataExpiração, String cvv) {
        this.numero = numero;
        this.dataExpiração = dataExpiração;
        this.cvv = cvv;
    }

    public boolean validarPagamento(){
        return numero.length() == 16 && dataExpiração.contains("/") && cvv.length() == 3;
    }

    @Override
    public String realizarPagamento (Pedido pedido){
        if(validarPagamento()){
            return "Realizado pagamento de R$" + pedido.getValorTotal();
        }

        return "Falha ao realizar pagamento no Cartão de Crédito";
    }
}
