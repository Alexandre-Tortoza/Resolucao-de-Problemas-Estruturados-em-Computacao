public class Pilha {
    private int capacidade;  // Capacidade máxima da pilha
    private int topo;        // Índice do topo da pilha
    private int[] dados;     // Array para armazenar os elementos da pilha

    // Construtor para inicializar a pilha com uma capacidade específica
    public Pilha(int capacidade) {
        this.capacidade = capacidade; // Define a capacidade da pilha
        this.topo = -1;               // Inicializa o topo como -1, indicando que a pilha está vazia
        this.dados = new int[capacidade]; // Inicializa o array de dados com a capacidade especificada
    }

    // Método para inserir um novo elemento na pilha
    public void insere(int elemento) {
        if (cheia()) { // Verifica se a pilha está cheia
            System.out.println("A pilha está cheia. Não é possível inserir o elemento.");
        } else {
            dados[++topo] = elemento; // Incrementa o topo e insere o elemento no índice do topo
        }
    }

    // Método para verificar se a pilha está cheia
    public boolean cheia() {
        return topo == capacidade - 1; // Retorna verdadeiro se o topo for igual à capacidade menos 1
    }

    // Método para verificar se a pilha está vazia
    public boolean vazia() {
        return topo == -1; // Retorna verdadeiro se o topo for -1
    }

    // Método para remover um elemento da pilha
    public int remove() {
        if (vazia()) { // Verifica se a pilha está vazia
            System.out.println("A pilha está vazia. Não é possível remover um elemento.");
            return -1; // Retorna -1 como indicador de erro
        } else {
            return dados[topo--]; // Retorna o elemento do topo e decrementa o índice do topo
        }
    }

    // Método para imprimir todos os elementos da pilha
    public void imprime() {
        if (vazia()) { // Verifica se a pilha está vazia
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Elementos da pilha: ");
            for (int i = 0; i <= topo; i++) { // Itera do início da pilha até o topo
                System.out.print(dados[i] + " "); // Imprime cada elemento
            }
            System.out.println(); // Nova linha após imprimir todos os elementos
        }
    }}
