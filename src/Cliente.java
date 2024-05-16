import java.io.Serializable;

public class Cliente  {
    public String nome;
    public String email;


    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

