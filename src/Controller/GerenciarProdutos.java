package Controller;

import Visual.TelaFornecedor;
import Visual.TelaInicio;
import com.sun.net.httpserver.Headers;
import models.Cesta;
import models.Contato;
import models.Fornecedor;
import models.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Handler;

public class GerenciarProdutos {
    private JFrame ti = new JFrame();
    private JFrame tf = new JFrame();
    JFrame tp = new JFrame();
    JFrame tc = new JFrame();
    public static void main(String[] args) throws InterruptedException {
//        Contato c = new Contato("El Pablo", "(17)98880-2522", "elpablo@tabako.com");
//        Fornecedor f = new Fornecedor(1,"El Pablo Tabakos", "Rua ComiNoMuro", "Mogi Mirim", "SP", c);
//        Produto p = new Produto(1,"Nargas", 150.00, 1000, f);
//        Produto p2 = new Produto(2, "Fumo", 10, 60, f);
//
//        Cesta cesta = new Cesta();
//        cesta.addLista(p, 10);
//        cesta.addLista(p2, 5);
//        cesta.exibirLista();
        GerenciarProdutos gp = new GerenciarProdutos();
        TelaFornecedor telaFornecedor = new TelaFornecedor();

        TelaInicio telaInicio = new TelaInicio();

        telaInicio.telaInicio(gp.getTi());

    }

    public JFrame getTi() {
        return ti;
    }

    public void setTi(JFrame ti) {
        this.ti = ti;
    }

    public JFrame getTf() {
        return tf;
    }

    public void setTf(JFrame tf) {
        this.tf = tf;
    }
}
