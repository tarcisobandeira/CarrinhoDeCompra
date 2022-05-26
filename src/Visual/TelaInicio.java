package Visual;

import Controller.GerenciarProdutos;

import javax.swing.*;
import java.awt.event.*;

public class TelaInicio{
    private JButton fornecedorButton;
    private JButton produtoButton;
    private JButton carrinhoButton;
    private JPanel panelTela;

    public TelaInicio(){
        fornecedorButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciarProdutos gp = new GerenciarProdutos();
                TelaFornecedor telaFornecedor = new TelaFornecedor();
                if(gp.getTi() == null){
                    System.out.println("AAAAAAAA");
                }else{
                    System.out.println("BBBBBBBB");
                }
                gp.getTi().setVisible(false);
                telaFornecedor.telaFornecedor(gp.getTf());
            }
        });
    }

    public void telaInicio(JFrame ti){
        ti.setContentPane(new TelaInicio().getPanelTela());
        ti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ti.setSize(600,600);
        ti.setTitle("Carrinho de Compras");
        ti.setVisible(true);
    }

    public JButton getFornecedorButton() {
        return fornecedorButton;
    }

    public void setFornecedorButton(JButton fornecedorButton) {
        this.fornecedorButton = fornecedorButton;
    }

    public JButton getProdutoButton() {
        return produtoButton;
    }

    public void setProdutoButton(JButton produtoButton) {
        this.produtoButton = produtoButton;
    }

    public JButton getCarrinhoButton() {
        return carrinhoButton;
    }

    public void setCarrinhoButton(JButton carrinhoButton) {
        this.carrinhoButton = carrinhoButton;
    }

    public JPanel getPanelTela() {
        return panelTela;
    }

    public void setPanelTela(JPanel panelTela) {
        this.panelTela = panelTela;
    }
}
