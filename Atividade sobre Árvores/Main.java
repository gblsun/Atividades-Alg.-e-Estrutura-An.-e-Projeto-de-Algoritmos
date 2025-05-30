import java.io.*; // importa todo o pacote que contém classes para entrada e saída (input/output).

import java.util.*; // importa todo o pacote java.util, que contém classes utilitárias  estruturas de dados.


    /* Criado por: profa. Divani Barbosa Gavinier
   Curriculo Lattes: http://lattes.cnpq.br/8503400830635447
   divanibarbosa@gmail.com

   ----------------------
*/

/**
 *     Atividade de Análise sobre Árvores do Professor Odair Gabriel da Silva
 *
 *     Nomes dos Integrantes:
 *     Gabriel Muchon Pavanelli
 *     Guilherme Pinheiro dos Santos
 *     Richard Bernadino
 *     Gabriel Macedo
 *
 *     O que é uma Árvore Genérica?
 *
 *     Uma árvore genérica é uma estrutura de dados não linear que organiza elementos de forma hierárquica, onde cada elemento (nó) pode ter um número variável de filhos. Essa estrutura permite representar relações complexas entre dados, sendo amplamente utilizada em diversas aplicações, como organização de pastas em sistemas operacionais, árvores de decisão e representação de dados em bancos de dados.
 *
 *     O código será comentado e análisado a seguir:
 */


// Cada nó armazena um valor (item) e dois ponteiros para os nós filhos: esquerdo (esq) e direito (dir).

    class No {
        public long item;
        public No dir;
        public No esq;

    }
    ////////////////////////////////////////////////
    class Tree {
        private No root; // raiz (ou seja: Raiz da árvore. Começa como null.)

        public Tree() { root=null; } // inicializa arvore (Construtor da árvore: inicializa a raiz como vazia.)

        public void inserir(long v) {
            No novo = new No(); // cria um novo Nó
            novo.item = v; // atribui o valor recebido ao item de dados do Nó
            novo.dir = null;
            novo.esq = null;
            /***
             * Cria e inicializa um novo nó.
             */

            if (root == null) root = novo; // Se a árvore está vazia, o novo nó vira a raiz.
            else  { // se nao for a raiz
                No atual = root;
                No anterior;
                while(true) {
                    anterior = atual;
                    if (v <= atual.item) { // ir para esquerda
                        atual = atual.esq;
                        if (atual == null) {
                            anterior.esq = novo;
                            return;
                        }
                    }  // fim da condição ir a esquerda
                    else { // ir para direita
                        atual = atual.dir;
                        if (atual == null) {
                            anterior.dir = novo;
                            return;
                        }
                    } // fim da condição ir a direita
                } // fim do laço while
                /***
                 * Caso contrário, percorre a árvore para encontrar a posição correta de inserção, indo à esquerda se o valor for menor ou igual ao atual e à direita se for maior.
                 */
            } // fim do else não raiz


        }

        public No buscar(long chave) {
            if (root == null) return null; // se arvore vazia
            No atual = root;  // começa a procurar desde raiz
            while (atual.item != chave) { // enquanto nao encontrou
                if(chave < atual.item ) atual = atual.esq; // caminha para esquerda
                else atual = atual.dir; // caminha para direita
                if (atual == null) return null; // encontrou uma folha -> sai
            } // fim laço while
            return atual; // terminou o laço while e chegou aqui é pq encontrou item

            /***
             * Percorre a árvore comparando a chave com os itens, e retorna o nó correspondente ou null se não encontrar.
             */
        }


        public boolean remover(long v) {

            /***
             * Remove um nó da árvore com base em três casos: sem filhos, com um filho, ou com dois filhos.
             */
            if (root == null) return false; // se arvore vazia
            /***
             * Busca do nó a ser removido
             */
            No atual = root;
            No pai = root;
            boolean filho_esq = true;

            // ****** Buscando o valor **********
            while (atual.item != v) { // enquanto nao encontrou
                pai = atual;
                if(v < atual.item ) { // caminha para esquerda
                    atual = atual.esq;
                    filho_esq = true; // é filho a esquerda? sim
                }
                else { // caminha para direita
                    atual = atual.dir;
                    filho_esq = false; // é filho a esquerda? NAO
                }
                if (atual == null) return false; // encontrou uma folha -> sai
            } // fim laço while de busca do valor

            // **************************************************************
            // se chegou aqui quer dizer que encontrou o valor (v)
            // "atual": contem a referencia ao No a ser eliminado
            // "pai": contem a referencia para o pai do No a ser eliminado
            // "filho_esq": é verdadeiro se atual é filho a esquerda do pai
            // **************************************************************

            // Se nao possui nenhum filho (é uma folha), elimine-o
            if (atual.esq == null && atual.dir == null) {
                if (atual == root ) root = null; // se raiz
                else if (filho_esq) pai.esq = null; // se for filho a esquerda do pai
                else pai.dir = null; // se for filho a direita do pai
            }

            // Se é pai e nao possui um filho a direita, substitui pela subarvore a direita
            else if (atual.dir == null) {
                if (atual == root) root = atual.esq; // se raiz
                else if (filho_esq) pai.esq = atual.esq; // se for filho a esquerda do pai
                else pai.dir = atual.esq; // se for filho a direita do pai
            }

            // Se é pai e nao possui um filho a esquerda, substitui pela subarvore a esquerda
            else if (atual.esq == null) {
                if (atual == root) root = atual.dir; // se raiz
                else if (filho_esq) pai.esq = atual.dir; // se for filho a esquerda do pai
                else pai.dir = atual.dir; // se for  filho a direita do pai
            }

            // Se possui mais de um filho, se for um avô ou outro grau maior de parentesco
            else {
                No sucessor = no_sucessor(atual);
                // Usando sucessor que seria o Nó mais a esquerda da subarvore a direita do No que deseja-se remover
                if (atual == root) root = sucessor; // se raiz
                else if(filho_esq) pai.esq = sucessor; // se for filho a esquerda do pai
                else pai.dir = sucessor; // se for filho a direita do pai
                sucessor.esq = atual.esq; // acertando o ponteiro a esquerda do sucessor agora que ele assumiu
                // a posição correta na arvore
            }

            return true;
        }

        // O sucessor é o Nó mais a esquerda da subarvore a direita do No que foi passado como parametro do metodo
        public No no_sucessor(No apaga) { // O parametro é a referencia para o No que deseja-se apagar
            /***
             * Percorre a árvore comparando a chave com os itens, e retorna o nó correspondente ou null se não encontrar.
             */
            No paidosucessor = apaga;
            No sucessor = apaga;
            No atual = apaga.dir; // vai para a subarvore a direita

            while (atual != null) { // enquanto nao chegar no Nó mais a esquerda
                paidosucessor = sucessor;
                sucessor = atual;
                atual = atual.esq; // caminha para a esquerda
            }
            // *********************************************************************************
            // quando sair do while "sucessor" será o Nó mais a esquerda da subarvore a direita
            // "paidosucessor" será o o pai de sucessor e "apaga" o Nó que deverá ser eliminado
            // *********************************************************************************
            if (sucessor != apaga.dir) { // se sucessor nao é o filho a direita do Nó que deverá ser eliminado
                paidosucessor.esq = sucessor.dir; // pai herda os filhos do sucessor que sempre serão a direita
                // lembrando que o sucessor nunca poderá ter filhos a esquerda, pois, ele sempre será o
                // Nó mais a esquerda da subarvore a direita do Nó apaga.
                // lembrando também que sucessor sempre será o filho a esquerda do pai

                sucessor.dir = apaga.dir; // guardando a referencia a direita do sucessor para
                // quando ele assumir a posição correta na arvore
            }
            return sucessor;
        }

        /***
         * imprime informações:
         */
        public void caminhar() {
            System.out.print("\n Exibindo em ordem: ");
            inOrder(root);
            System.out.print("\n Exibindo em pos-ordem: ");
            posOrder(root);
            System.out.print("\n Exibindo em pre-ordem: ");
            preOrder(root);
            System.out.print("\n Altura da arvore: " + altura(root));
            System.out.print("\n Quantidade de folhas: " + folhas(root));
            System.out.print("\n Quantidade de Nós: " + contarNos(root));
            if (root != null ) {  // se arvore nao esta vazia
                System.out.print("\n Valor minimo: " + min().item);
                System.out.println("\n Valor maximo: " + max().item);
            }
        }

        /**
         * Conjunto de métodos para percorrer e analisar uma árvore binária.
         *
         * - inOrder(No atual): realiza a travessia em ordem (esquerda, raiz, direita),
         *   útil para exibir os elementos em ordem crescente em uma árvore binária de busca.
         *
         * - preOrder(No atual): realiza a travessia pré-ordem (raiz, esquerda, direita),
         *   útil para copiar a estrutura da árvore ou analisá-la desde a raiz.
         *
         * - posOrder(No atual): realiza a travessia pós-ordem (esquerda, direita, raiz),
         *   útil para excluir a árvore ou calcular valores agregados de forma recursiva.
         *
         * - altura(No atual): calcula recursivamente a altura da árvore a partir de um nó.
         *   A altura é a maior profundidade entre o nó atual e as folhas abaixo dele.
         *
         * Esses métodos são fundamentais para o funcionamento e análise de árvores binárias,
         * como árvores de busca binária (BST).
         */

        public void inOrder(No atual) {
            if (atual != null) {
                inOrder(atual.esq);
                System.out.print(atual.item + " ");
                inOrder(atual.dir);
            }
        }

        public void preOrder(No atual) {
            if (atual != null) {
                System.out.print(atual.item + " ");
                preOrder(atual.esq);
                preOrder(atual.dir);
            }
        }

        public void posOrder(No atual) {
            if (atual != null) {
                posOrder(atual.esq);
                posOrder(atual.dir);
                System.out.print(atual.item + " ");
            }
        }

        public int altura(No atual) {
            if(atual == null || (atual.esq == null && atual.dir == null))
                return 0;
            else {
                if (altura(atual.esq) > altura(atual.dir))
                    return ( 1 + altura(atual.esq) );
                else
                    return ( 1 + altura(atual.dir) );
            }
        }

        /**
         *  Método recursivo responsável por contar a quantidade total de nós
         *  em uma árvore binária a partir de um determinado nó.
         *
         * O método funciona somando 1 (referente ao nó atual) com a quantidade
         * de nós da subárvore esquerda e da subárvore direita, chamadas de forma recursiva.
         *
         * @param atual o nó a partir do qual a contagem será feita.
         * @return o total de nós existentes na subárvore que começa em 'atual'.
         */
        public int folhas(No atual) {
            if(atual == null) return 0;
            if(atual.esq == null && atual.dir == null) return 1;
            return folhas(atual.esq) + folhas(atual.dir);
        }

        public int contarNos(No atual) {
            if(atual == null)  return 0;
            else return ( 1 + contarNos(atual.esq) + contarNos(atual.dir));
        }

        /**
         *  Método responsável por encontrar e retornar o nó com o menor valor
         *  armazenado na árvore binária de busca.
         *
         * Como em uma árvore binária de busca todos os valores menores ficam
         * à esquerda, o método percorre os nós a partir da raiz seguindo
         * apenas os ponteiros para a subárvore esquerda, até encontrar o
         * nó mais à esquerda, que contém o menor valor.
         *
         */
        public No min() {
            No atual = root;
            No anterior = null;
            while (atual != null) {
                anterior = atual;
                atual = atual.esq;
            }
            return anterior;
        }

        /**
         *  Método responsável por encontrar e retornar o nó com o maior valor
         *  armazenado na árvore binária de busca.
         *
         * Como em uma árvore binária de busca todos os valores maiores ficam
         * à direita, o método percorre os nós a partir da raiz seguindo
         * apenas os ponteiros para a subárvore direita, até encontrar o
         * nó mais à direita, que contém o maior valor.
         *
         */
        public No max() {
            No atual = root;
            No anterior = null;
            while (atual != null) {
                anterior = atual;
                atual = atual.dir;
            }
            return anterior;
        }

    }
    ////////////////////////////////////////////////
    class ArvoreBinariaApp { //Inicializa a árvore e o leitor.
        /** imprime e mostra a interface de usuário.**/
        public static void main(String[] args) {
            Scanner le = new Scanner(System.in);
            Tree arv = new Tree();
            int opcao;
            long x;
            System.out.print("\n Programa Arvore binaria de long");
            do {
                System.out.print("\n*");
                System.out.print("\nEntre com a opcao:");
                System.out.print("\n ----1: Inserir");
                System.out.print("\n ----2: Excluir");
                System.out.print("\n ----3: Pesquisar");
                System.out.print("\n ----4: Exibir");
                System.out.print("\n ----5: Sair do programa");
                System.out.print("\n*");
                System.out.print("\n-> ");
                opcao = le.nextInt();
                switch(opcao) {
                    case 1: {
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        arv.inserir(x);
                        break;
                    }
                    case 2: {
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        if ( !arv.remover(x) )
                            System.out.print("\n Valor nao encontrado!");;
                        break;
                    }
                    case 3: {
                        System.out.print("\n Informe o valor (long) -> ");
                        x = le.nextLong();
                        if( arv.buscar(x) != null )
                            System.out.print("\n Valor Encontrado");
                        else
                            System.out.print("\n Valor nao encontrado!");
                        break;
                    }
                    case 4: {
                        arv.caminhar();
                        break;
                    }
                } // fim switch
            } while(opcao!= 5);

}
    }
