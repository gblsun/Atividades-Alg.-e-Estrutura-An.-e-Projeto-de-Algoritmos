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

# Função de busca em largura com exibição da fila e conexões visitadas
def busca_em_largura(grafo, primeiro_elemento):
    conexoes = []
    fila = [primeiro_elemento]
    visitados = {primeiro_elemento}

    while len(fila) > 0:
        print("Fila atual:", fila)  # Exibe o estado da fila
        v = fila.pop(0)  # Remove o primeiro elemento da fila
        
        for w in grafo[v]:
            if w not in visitados:
                fila.append(w)
                visitados.add(w)
                conexoes.append((v, w))  # Insere a conexão
        
    print("Conexões visitadas (BFS):", ', '.join(f'({v}, {w})' for v, w in conexoes))  # Exibe conexões em uma linha
    return conexoes

# Executando a busca em largura
conexoes_bfs = busca_em_largura(grafo, 0)

# Criando o grafo para visualização
G = nx.Graph()
G.add_edges_from(conexoes_bfs)

# Plotando o grafo
plt.figure(figsize=(8, 6))
nx.draw(G, with_labels=True, node_color="lightgray", edge_color="black", font_weight="bold")
plt.title("Busca em Largura (BFS)")
plt.show()
