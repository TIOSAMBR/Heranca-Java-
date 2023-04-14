import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private ArrayList<Emprestimo> emprestimos;
    
    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimos = new ArrayList<Emprestimo>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    public void addEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    
    public void removeEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }
    
}
