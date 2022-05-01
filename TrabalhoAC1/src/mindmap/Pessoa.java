package mindmap;

public class Pessoa {

    private String nome;
    private String email;
    private String bairro;
    private String estado;
    private int rg;
    private int cpf;
    private int nResidencia;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRG() {
        return this.rg;
    }

    public void setRG(int rg) {
        this.rg = rg;
    }

    public int getCPF() {
        return this.cpf;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    public int getNResidencia() {
        return this.nResidencia;
    }

    public void setNResidencia(int nResidencia) {
        this.nResidencia = nResidencia;
    }
}
