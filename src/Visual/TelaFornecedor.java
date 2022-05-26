package Visual;

import Controller.GerenciarProdutos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaFornecedor {
    private JPanel panelForn;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton salvarButton;
    private JButton cancelarButton;

    public TelaFornecedor() {

    }

    public void telaFornecedor(JFrame tf){
        tf.setContentPane(new TelaFornecedor().getPanelForn());
        tf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tf.setSize(600,600);
        tf.setTitle("Fornecedor");
        tf.setVisible(true);
    }

    public JPanel getPanelForn() {
        return panelForn;
    }

    public void setPanelForn(JPanel panelForn) {
        this.panelForn = panelForn;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JTextField getTextField5() {
        return textField5;
    }

    public void setTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }

    public JTextField getTextField6() {
        return textField6;
    }

    public void setTextField6(JTextField textField6) {
        this.textField6 = textField6;
    }

    public JTextField getTextField7() {
        return textField7;
    }

    public void setTextField7(JTextField textField7) {
        this.textField7 = textField7;
    }

    public JTextField getTextField8() {
        return textField8;
    }

    public void setTextField8(JTextField textField8) {
        this.textField8 = textField8;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(JButton salvarButton) {
        this.salvarButton = salvarButton;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }
}
