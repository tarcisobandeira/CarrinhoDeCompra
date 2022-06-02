package Visual;

import Controller.GerenciarProdutos;
import models.ItensCesta;
import models.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarrinho {
    private JPanel panelTela;
    private JTable table1;
    private JButton removerButton;
    private JTextField quatxt;
    private JLabel itemlb;
    private JButton adicionarNoCarrinhoButton;
    private JButton finalizarCompraButton;
    private JButton voltarButton;
    private JComboBox probox;
    public TelaCarrinho() {
        DefaultTableModel tm = new DefaultTableModel(0,3);
        startCombobox();
        startList(tm);
        startTable(tm);
        adicionarNoCarrinhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int j = 0;
                boolean b = false;
                try {
                    int i = probox.getSelectedIndex()-1;
                    int quant = Integer.parseInt(quatxt.getText());
                    Produto p = GerenciarProdutos.getListp().get(i);
                    ItensCesta ic = new ItensCesta(p, quant);
                    if(GerenciarProdutos.getListic().size() > 0){
                        for(ItensCesta icesta : GerenciarProdutos.getListic()){
                            if(icesta.getProduto() == p){
                                quant = quant + icesta.getQuantidade();
                                ic = new ItensCesta(p, quant);
                                GerenciarProdutos.getListic().set(j, ic);
                                b = true;
                            }
                            if(b == true){
                                break;
                            }
                            j++;
                        }
                        if(b == false){
                            GerenciarProdutos.getListic().add(ic);
                        }
                    }else{
                        GerenciarProdutos.getListic().add(ic);
                    }
                    zerar();
                    startTable(tm);
                }catch (NullPointerException ex){
                    System.out.println(ex.getMessage()+"\n");
                    JOptionPane.showMessageDialog(null, "Você não preencheu todos os campos.");
                }catch (Exception ex){
                    System.out.println(ex.getMessage()+"\n");
                    JOptionPane.showMessageDialog(null, "Tente fazer a ação mais uma vez ou contate um administrador.");
                }
            }
        });
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int i = table1.getSelectedRow();
                    GerenciarProdutos.getListic().remove(i);
                    startTable(tm);
                    JOptionPane.showMessageDialog(null, "Produto removido do carrinho.");
                }catch (NullPointerException ex){
                    System.out.println(ex.getMessage()+"\n");
                    JOptionPane.showMessageDialog(null, "Você não selecionou o produto na lista.");
                }catch (Exception ex){
                    System.out.println(ex.getMessage()+"\n");
                    JOptionPane.showMessageDialog(null, "Tente fazer a ação mais uma vez ou contate um administrador.");
                }
            }
        });
        finalizarCompraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                Double total = 0.0;
                try {
                    if(GerenciarProdutos.getListic().size() > 0){
                        for(ItensCesta ic : GerenciarProdutos.getListic()){
                            s = s + ic.toString();
                            total = total + (ic.getQuantidade() * ic.getProduto().getPreco());
                        }
                        JOptionPane.showMessageDialog(null, "Você comprou: \n" + s + "\n Total da compra: R$" + total);
                        GerenciarProdutos.getListic().clear();
                        startTable(tm);
                    }else{
                        JOptionPane.showMessageDialog(null, "Você não colocou nenhum item na lista.");
                    }
                }catch (Exception ex){
                    System.out.println(ex.getMessage()+"\n");
                    JOptionPane.showMessageDialog(null, "Tente fazer a ação mais uma vez ou contate um administrador.");
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciarProdutos.getTc().setVisible(false);
                GerenciarProdutos.getTi().setVisible(true);
                zerar();
            }
        });
    }

    public void zerar() {
        quatxt.setText(null);
        probox.setSelectedIndex(0);
    }

    public void startTable(DefaultTableModel tm) {
        if(table1.getRowCount() > -1){
            tm.setRowCount(0);
        }
        for(ItensCesta ic : GerenciarProdutos.getListic()){
            double d = ic.getQuantidade() * ic.getProduto().getPreco();
            Object produtos[] = {ic.getProduto().getDescricao(), ic.getQuantidade(), ic.getProduto().getPreco(), d};
            tm.addRow(produtos);
            table1.setModel(tm);
        }
    }

    public void startList(DefaultTableModel tm) {
        String c[] = {"Produto", "Quantidade", "Valor", "Total"};
        tm.setColumnIdentifiers(c);
    }

    public void startCombobox() {
        probox.addItem(null);
        for(Produto p : GerenciarProdutos.getListp()){
            probox.addItem(p.getDescricao());
        }
    }

    public void telaCarrinho(JFrame tc) {
        tc.setContentPane(new TelaCarrinho().getPanelTela());
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tc.setSize(800,600);
        tc.setTitle("Carrinho de Compra");
        tc.setVisible(true);
    }

    public JPanel getPanelTela() {
        return panelTela;
    }

    public void setPanelTela(JPanel panelTela) {
        this.panelTela = panelTela;
    }

    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JButton getRemoverButton() {
        return removerButton;
    }

    public void setRemoverButton(JButton removerButton) {
        this.removerButton = removerButton;
    }

    public JTextField getTextField1() {
        return quatxt;
    }

    public void setTextField1(JTextField textField1) {
        this.quatxt = textField1;
    }

    public JLabel getItemlb() {
        return itemlb;
    }

    public void setItemlb(JLabel itemlb) {
        this.itemlb = itemlb;
    }

    public JButton getAdicionarNoCarrinhoButton() {
        return adicionarNoCarrinhoButton;
    }

    public void setAdicionarNoCarrinhoButton(JButton adicionarNoCarrinhoButton) {
        this.adicionarNoCarrinhoButton = adicionarNoCarrinhoButton;
    }

    public JButton getFinalizarCompraButton() {
        return finalizarCompraButton;
    }

    public void setFinalizarCompraButton(JButton finalizarCompraButton) {
        this.finalizarCompraButton = finalizarCompraButton;
    }

    public JButton getVoltarButton() {
        return voltarButton;
    }

    public void setVoltarButton(JButton voltarButton) {
        this.voltarButton = voltarButton;
    }

    public JComboBox getProbox() {
        return probox;
    }

    public void setProbox(JComboBox probox) {
        this.probox = probox;
    }
}
