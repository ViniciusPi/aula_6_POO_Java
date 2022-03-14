package aula_6;

public class Lutador implements Interface_lutador {

    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade;
    private double altura;
    private float peso;
    private int vitorias, derrotas, empates;


    //Construtor


    public Lutador(String nome, String nacionalidade, int idade, double altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);

    }

    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <= 65) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 82) {
            this.categoria = "Peso Médio";
        } else {
            this.categoria = "Peso Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public String apresentar() {
        return "No ringue, teremos o lutador: " + getNome() + " Vindo de: " + getNacionalidade();
    }

    @Override
    public String status() {
        return "Lutador: " + getNome() +
                " Categoria: " + getCategoria() +
                " Vitórias: " + getVitorias() +
                " Derrotas: " + getDerrotas() +
                " Empates: " + getEmpates();
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);

    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);

    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
