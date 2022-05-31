package models;

public class Fornecedor{
    private int codigo;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private Contato contato;

    public Fornecedor(int codigo, String razaoSocial, String endereco, String cidade, String estado, Contato contato) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.contato = contato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Contato getContrato() {
        return contato;
    }

    public void setContrato(Contato contato) {
        this.contato = contato;
    }
}
