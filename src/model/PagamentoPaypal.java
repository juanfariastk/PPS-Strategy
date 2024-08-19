package model;

public class PagamentoPaypal implements Pagamento {
    private String email;
    private String senha;

    public PagamentoPaypal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    @Override
    public boolean validarPagamento(){
        return "usuario@gmail.com".equals(email) && "1234".equals(senha);
    }

    @Override
    public String realizarPagamento(Pedido pedido){
        if (validarPagamento()){
            return "Realizado pagamendo de $"+ pedido.getValorTotal();
        }
        return "Falha ao realizar pagamento no método Paypal";
    }
}
