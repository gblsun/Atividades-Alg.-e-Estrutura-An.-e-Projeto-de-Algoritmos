import networkx as nx
import matplotlib.pyplot as plt

def busca_profundidade(grafo, ponto_inicial):
    visitados = set()
    arvore_dfs = nx.Graph()

    def dfs(no):
        visitados.add(no)
        for vizinho in sorted(grafo[no]):
            if vizinho not in visitados:
                arvore_dfs.add_edge(no, vizinho)
                dfs(vizinho)

    dfs(ponto_inicial)
    return arvore_dfs

# Criar o grafo
G = nx.Graph()
arestas = [
    ('A', 'B'), ('B', 'C'), ('C', 'D'),
    ('D', 'E'), ('E', 'F'), ('A', 'F'),
    ('A', 'D'), ('C', 'E')
]
G.add_edges_from(arestas)

# Executar DFS e obter a árvore
ponto_inicial = 'A'
arvore_dfs = busca_profundidade(G, ponto_inicial)

# Visualização
pos = nx.spring_layout(G, seed=42)
plt.figure(figsize=(8, 6))
nx.draw_networkx(G, pos, with_labels=True, node_color='lightgray', edge_color='red')
nx.draw_networkx_edges(arvore_dfs, pos, edge_color='black', width=2)
plt.title("Busca em Profundidade Grafo 2")
plt.axis('off')
plt.show()
