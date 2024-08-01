public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(5); // Cria uma pilha com capacidade para 5 elementos

        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.insere(4);
        pilha.insere(5);
        pilha.insere(6); // Tentativa de inserir em pilha cheia (deve exibir mensagem de erro)

        pilha.imprime(); // Imprime os elementos da pilha

        pilha.remove(); // Remove o elemento do topo
        pilha.imprime(); // Imprime os elementos restantes

        pilha.remove();
        pilha.remove();
        pilha.remove();
        pilha.remove();
        pilha.remove(); // Tentativa de remover de pilha vazia (deve exibir mensagem de erro)

        pilha.imprime(); // Imprime os elementos restantes (nenhum, pois a pilha está vazia)



    }
}