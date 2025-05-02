import matplotlib.pyplot as plt
import networkx as nx

# Definição do grafo
grafo = {
    0: [1],
    1: [0, 2],
    2: [1, 3, 4, 5],
    3: [2, 4, 5, 6],
    4: [2, 3, 5, 6],
    5: [2, 3, 4, 6],
    6: [3, 4, 5, 8],
    7: [8, 10],
    8: [6, 7, 9],
    9: [8, 10],
    10: [7, 9]
}

# Função de busca em profundidade
def busca_em_profundidade(grafo, primeiro_elemento):
    conexoes = []
    pilha = [primeiro_elemento]
    visitados = {primeiro_elemento}

    while len(pilha) > 0:
        print("Pilha atual:", pilha)
        v = pilha.pop()  # Remove o último elemento da pilha

        for w in grafo[v]:
            if w not in visitados:
                pilha.append(w)
                visitados.add(w)
                conexoes.append((v, w))
                
    print("Conexões visitadas (DFS):", ', '.join(f'({v}, {w})' for v, w in conexoes))
    return conexoes

# Executando a busca em profundidade
conexoes_dfs = busca_em_profundidade(grafo, 0)

# Criando o grafo para visualização
G = nx.Graph()
G.add_edges_from(conexoes_dfs)

# Plotando o grafo
plt.figure(figsize=(8, 6))
nx.draw(G, with_labels=True, node_color="lightgray", edge_color="black", font_weight="bold")
plt.title("Busca em Profundidade (DFS)")
plt.show()