package Visual;

import Controller.GerenciarProdutos;
import models.Fornecedor;
import models.Produto;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaProduto {

    private JTabbedPane tabbedPane1;
    private JPanel panelTela;
    private JPanel produtosIn;
    private JPanel produtosCreate;
    private JTable table1;
    private JTextField codtxt;
    private JTextField destxt;
    private JComboBox forbox;
    private JTextField quatxt;
    private JTextField pretxt;
    private JButton cancelarButton;
    private JButton salvarButton;
    private JButton voltarButton;
    public TelaProduto(){
        DefaultTableModel tm = new DefaultTableModel(0,4);
        startComboBox();
        startList(tm);
        startTable(tm);
        salvarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Produto p = new Produto(Integer.parseInt(codtxt.getText()), destxt.getText(), Double.parseDouble(pretxt.getText()), Integer.parseInt(quatxt.getText()), GerenciarProdutos.getListf().get(forbox.getSelectedIndex()-1));
                    GerenciarProdutos.getListp().add(p);
                    zerar();
                    startTable(tm);
                }catch (NullPointerException ex){
                    System.out.println(ex.getMessage()+"\n");
                }catch (Exception ex){
                    System.out.println(ex.getMessage()+"\n");
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciarProdutos.getTp().setVisible(false);
                GerenciarProdutos.getTi().setVisible(true);
                zerar();
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciarProdutos.getTp().setVisible(false);
                GerenciarProdutos.getTi().setVisible(true);
                zerar();
            }
        });
    }
    public void startList(DefaultTableModel tm){
        String c[] = {"Código", "Descrição", "Preço", "Quantidade", "Fornecedor"};
        tm.setColumnIdentifiers(c);
    }
    public void startTable(DefaultTableModel tm) {
        if(table1.getRowCount() > 0){
            tm.setRowCount(0);
        }
        for(Produto p : GerenciarProdutos.getListp()){
            Object produtos[] = {p.getCodigo(), p.getDescricao(), p.getPreco(), p.getQuantidade(), p.getFornecedor().getRazaoSocial()};
            tm.addRow(produtos);
            table1.setModel(tm);
        }
    }

    public void zerar() {
        codtxt.setText(null);
        destxt.setText(null);
        pretxt.setText(null);
        quatxt.setText(null);
        forbox.setSelectedIndex(0);
    }

    public void telaProduto(JFrame tp) {
        tp.setContentPane(new TelaProduto().getPanelTela());
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp.setSize(600,600);
        tp.setTitle("Produtos");
        tp.setVisible(true);
    }

    public void startComboBox(){
        forbox.addItem(null);
        for(Fornecedor f : GerenciarProdutos.getListf()){
            forbox.addItem(f.getRazaoSocial());
        }
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JPanel getPanelTela() {
        return panelTela;
    }

    public void setPanelTela(JPanel panelTela) {
        this.panelTela = panelTela;
    }

    public JPanel getProdutosIn() {
        return produtosIn;
    }

    public void setProdutosIn(JPanel produtosIn) {
        this.produtosIn = produtosIn;
    }

    public JPanel getProdutosCreate() {
        return produtosCreate;
    }

    public void setProdutosCreate(JPanel produtosCreate) {
        this.produtosCreate = produtosCreate;
    }

    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JTextField getCodtxt() {
        return codtxt;
    }

    public void setCodtxt(JTextField codtxt) {
        this.codtxt = codtxt;
    }

    public JTextField getDestxt() {
        return destxt;
    }

    public void setDestxt(JTextField destxt) {
        this.destxt = destxt;
    }

    public JComboBox getForbox() {
        return forbox;
    }

    public void setForbox(JComboBox forbox) {
        this.forbox = forbox;
    }

    public JTextField getQuatxt() {
        return quatxt;
    }

    public void setQuatxt(JTextField quatxt) {
        this.quatxt = quatxt;
    }

    public JTextField getPretxt() {
        return pretxt;
    }

    public void setPretxt(JTextField pretxt) {
        this.pretxt = pretxt;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(JButton salvarButton) {
        this.salvarButton = salvarButton;
    }
}
