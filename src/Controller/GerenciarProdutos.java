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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class GerenciarProdutos {
    private static JFrame ti = new JFrame();
    private static JFrame tf = new JFrame();
    private static JFrame tp = new JFrame();
    private static JFrame tc = new JFrame();
    private static List<Fornecedor> listf = new ArrayList<>();
    private static List<Produto> listp = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Contato c = new Contato("El Pablo", "(17)98880-2522", "elpablo@tabako.com");
        Fornecedor f = new Fornecedor(1,"El Pablo Tabakos", "Rua ComiNoMuro", "Mogi Mirim", "SP", c);
        listf.add(f);
        Produto p = new Produto(1,"Nargas", 150.00, 1000, f);
        Produto p2 = new Produto(2, "Fumo", 10, 60, f);
        listp.add(p);
        listp.add(p2);
//
//        Cesta cesta = new Cesta();
//        cesta.addLista(p, 10);
//        cesta.addLista(p2, 5);
//        cesta.exibirLista();
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.telaInicio(ti);
    }

    public static JFrame getTi() {
        return ti;
    }

    public static void setTi(JFrame ti) {
        GerenciarProdutos.ti = ti;
    }

    public static JFrame getTf() {
        return tf;
    }

    public static void setTf(JFrame tf) {
        GerenciarProdutos.tf = tf;
    }

    public static JFrame getTp() {
        return tp;
    }

    public static void setTp(JFrame tp) {
        GerenciarProdutos.tp = tp;
    }

    public static JFrame getTc() {
        return tc;
    }

    public static void setTc(JFrame tc) {
        GerenciarProdutos.tc = tc;
    }

    public static List<Fornecedor> getListf() {
        return listf;
    }

    public static void setListf(List<Fornecedor> listf) {
        GerenciarProdutos.listf = listf;
    }

    public static List<Produto> getListp() {
        return listp;
    }

    public static void setListp(List<Produto> listp) {
        GerenciarProdutos.listp = listp;
    }
}
