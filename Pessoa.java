public class Pessoa {
    // Atributos private String nome; private int idade;
    private String nome; 
    private int idade;
    
    //Construtor
    
    public Pessoa(String nome, int idade){
    
        this.nome =nome;
        this.idade =idade;
    
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibirInformacoes(){
    
        System.out.println("Nome:"+ nome);
        System.out.println("Idade:"+idade);
    }
    
    
    // Método principal para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("joao",25
        
        );
        pessoa.exibirInformacoes();
      }
    }