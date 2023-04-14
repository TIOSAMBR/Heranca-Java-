public class UsuarioEspecial extends Usuario {
    
    public UsuarioEspecial(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }
    
    
    public int getMaxEmprestimos() {
        return Integer.MAX_VALUE; // usuário especial não tem limite de empréstimos
    }
}
