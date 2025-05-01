import matplotlib.pyplot as plt
import numpy as np

# -------------------------------
# Definição dos dados do grafo
# -------------------------------

# Conjunto de vértices
vertices = {'A', 'B', 'C', 'D', 'E', 'F'}

# Conjunto de arestas
arestas = {
    ('A', 'B'),
    ('B', 'C'),
    ('C', 'D'),
    ('D', 'E'),
    ('E', 'F'),
    ('A', 'F'),
    ('A', 'D'),
    ('C', 'E')
}

# Posições dos vértices
posicoes = {
    'A': (0, 2),
    'B': (1, 3),
    'C': (2, 2),
    'D': (3, 3),
    'E': (4, 2),
    'F': (5, 3)
}

# -------------------------------
# Criação do gradiente de fundo
# -------------------------------

fig, ax = plt.subplots()

# Criar gradiente vertical azul-claro para branco
gradient = np.linspace(1, 0.7, 256)  # 256 tons de azul
gradient = np.vstack([gradient]*256)  # vertical

# Exibir o gradiente no fundo da área do gráfico
ax.imshow(gradient, extent=[-1, 6, 1, 4], origin='lower', cmap='Blues', alpha=0.3)

# -------------------------------
# Visualização do grafo
# -------------------------------

# Desenhar as arestas
for origem, destino in arestas:
    x_vals = [posicoes[origem][0], posicoes[destino][0]]
    y_vals = [posicoes[origem][1], posicoes[destino][1]]
    ax.plot(x_vals, y_vals, color='gray', linestyle='-', marker='o', markersize=10, linewidth=2)

# Desenhar os vértices (rótulos)
for vertice, (x, y) in posicoes.items():
    ax.text(x, y, vertice, fontsize=12, ha='center', va='center',
            color='black', fontweight='bold', bbox=dict(facecolor='white', edgecolor='none', boxstyle='circle,pad=0.3'))

# Ajustes visuais
ax.set_xticks([])
ax.set_yticks([])
ax.set_frame_on(False)
plt.title('Visualização de Grafo com Fundo em Gradiente', fontsize=14, weight='bold')
plt.tight_layout()
plt.show()
