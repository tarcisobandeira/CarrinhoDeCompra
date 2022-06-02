package models;

public class ItensCesta {
    private Produto produto;
    private int quantidade;

    public ItensCesta(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItensCesta() {

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + produto.getDescricao() + " | Valor: R$" + produto.getPreco() + " | Quantidade: " + getQuantidade() + " | Total: R$" + (getQuantidade() * produto.getPreco()) + "\n";
    }
}
