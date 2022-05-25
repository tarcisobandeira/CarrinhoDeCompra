package models;

public class GerenciarProdutos {

    public static void main(String[] args) {
        Contato c = new Contato("El Pablo", "(17)98880-2522", "elpablo@tabako.com");
        Fornecedor f = new Fornecedor(1,"El Pablo Tabakos", "Rua ComiNoMuro", "Mogi Mirim", "SP", c);
        Produto p = new Produto(1,"Nargas", 150.00, 1000, f);
        Produto p2 = new Produto(2, "Fumo", 10, 60, f);

        Cesta cesta = new Cesta();
        cesta.addLista(p, 10);
        cesta.addLista(p2, 5);
        cesta.exibirLista();
    }
}
