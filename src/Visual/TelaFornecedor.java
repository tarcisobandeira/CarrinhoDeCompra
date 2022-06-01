package Visual;

import Controller.GerenciarProdutos;
import models.Contato;
import models.Fornecedor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.Normalizer;

public class TelaFornecedor {
    private JPanel panelForn;
    private JTextField codtxt;
    private JTextField rstxt;
    private JTextField endtxt;
    private JTextField cidtxt;
    private JTextField esttxt;
    private JTextField nometxt;
    private JTextField teltxt;
    private JTextField ematxt;
    private JButton salvarButton;
    private JButton cancelarButton;

    private TelaInicio telaInicio;

    public TelaFornecedor() {
        salvarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Contato c = new Contato(nometxt.getText(), teltxt.getText(), ematxt.getText());
                    Fornecedor f = new Fornecedor(Integer.parseInt(codtxt.getText()), rstxt.getText(), endtxt.getText(), cidtxt.getText(), esttxt.getText(), c);
                    GerenciarProdutos.getListf().add(f);
                    zerar();
                }catch (NullPointerException np){
                    System.out.printf(np.getMessage()+"\n");
                }catch (Exception np){
                    System.out.printf(np.getMessage()+"\n");
                }
            }
        });

        cancelarButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciarProdutos.getTf().setVisible(false);
                GerenciarProdutos.getTi().setVisible(true);
                zerar();
            }
        });
    }

    public void telaFornecedor(JFrame tf){
        tf.setContentPane(new TelaFornecedor().getPanelForn());
        tf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tf.setSize(600,600);
        tf.setTitle("Fornecedor");
        tf.setVisible(true);
    }

    public void zerar(){
        cidtxt.setText(null);
        teltxt.setText(null);
        codtxt.setText(null);
        ematxt.setText(null);
        endtxt.setText(null);
        esttxt.setText(null);
        nometxt.setText(null);
        rstxt.setText(null);
    }

    public JPanel getPanelForn() {
        return panelForn;
    }

    public void setPanelForn(JPanel panelForn) {
        this.panelForn = panelForn;
    }

    public JTextField getTextField1() {
        return codtxt;
    }

    public void setTextField1(JTextField textField1) {
        this.codtxt = textField1;
    }

    public JTextField getTextField2() {
        return rstxt;
    }

    public void setTextField2(JTextField textField2) {
        this.rstxt = textField2;
    }

    public JTextField getTextField3() {
        return endtxt;
    }

    public void setTextField3(JTextField textField3) {
        this.endtxt = textField3;
    }

    public JTextField getTextField4() {
        return cidtxt;
    }

    public void setTextField4(JTextField textField4) {
        this.cidtxt = textField4;
    }

    public JTextField getTextField5() {
        return esttxt;
    }

    public void setTextField5(JTextField textField5) {
        this.esttxt = textField5;
    }

    public JTextField getTextField6() {
        return nometxt;
    }

    public void setTextField6(JTextField textField6) {
        this.nometxt = textField6;
    }

    public JTextField getTextField7() {
        return teltxt;
    }

    public void setTextField7(JTextField textField7) {
        this.teltxt = textField7;
    }

    public JTextField getTextField8() {
        return ematxt;
    }

    public void setTextField8(JTextField textField8) {
        this.ematxt = textField8;
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
