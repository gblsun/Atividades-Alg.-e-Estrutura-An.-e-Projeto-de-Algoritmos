import matplotlib.pyplot as plt
import networkx as nx

# Função de busca em largura (mantida conforme exigido)
def busca_largura(grafo, ponto_inicial):
    fila = [ponto_inicial]
    conexoes = []
    visitados = [ponto_inicial]

    i = 0
    while i < len(fila):
        v = fila[i]
        vizinhos = grafo[v]

        for j in range(len(vizinhos)):
            w = vizinhos[j]

            # Verifica se w já foi visitado
            ja_foi = False
            for k in range(len(visitados)):
                if visitados[k] == w:
                    ja_foi = True
                    break

            if not ja_foi:
                fila.append(w)
                visitados.append(w)
                conexoes.append((v, w))

        i += 1

    return conexoes

# Grafo com TODAS as conexões fornecidas
grafo_completo = {
    'A': ['B', 'F', 'D'],
    'B': ['C'],
    'C': ['D', 'E'],
    'D': ['E'],
    'E': ['F'],
    'F': []
}

# Conjunto original de arestas fornecido
arestas_originais = [('A','B'), ('B','C'), ('C','D'), ('D','E'), ('E','F'), ('A','F'), ('A','D'), ('C','E')]

# Executar BFS
conexoes_bfs = busca_largura(grafo_completo, 'A')
print("Conexões da Árvore de Busca em Largura:", conexoes_bfs)

# Criar grafos para desenhar
G_todas = nx.DiGraph()
G_todas.add_edges_from(arestas_originais)

G_bfs = nx.DiGraph()
G_bfs.add_edges_from(conexoes_bfs)

# Layout fixo para comparação clara
pos = nx.spring_layout(G_todas, seed=42)

# Desenhar grafo completo
plt.figure(figsize=(10, 6))
nx.draw(G_todas, pos, with_labels=True, node_color='lightgray', node_size=2000, font_size=14, edge_color='gray', arrows=True)
nx.draw_networkx_edges(G_bfs, pos, edge_color='blue', width=2.5, arrows=True)
plt.title("Grafo Completo com a Árvore de Busca em Largura (BFS) Destacada")
plt.show()
