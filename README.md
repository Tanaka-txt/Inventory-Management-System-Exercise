<div align="center">

# 📦 Sistema de Gestão de Estoque (Java)
### POO • Encapsulamento • Sobrecarga de Métodos

<img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge">

</div>

---

## 📌 Visão Geral

Este projeto é uma aplicação de console desenvolvida em **Java** para gerenciar o estoque de produtos de forma dinâmica. O objetivo principal foi consolidar conceitos fundamentais da **Programação Orientada a Objetos**, garantindo que a lógica de negócio esteja protegida e bem estruturada.

O foco principal está no uso de:
- **Encapsulamento:** Proteção dos atributos (`private`) e acesso via métodos `get` e `set`.
- **Construtores & Sobrecarga:** Diferentes formas de instanciar um produto.
- **Interação via Console:** Menu interativo para operações em tempo real.
- **Lógica de Negócio:** Cálculos automáticos de valor total e atualização de saldo.

---

## 🛠️ Tecnologias & Conceitos

| Recurso | Descrição |
|----------|----------|
| ☕ **Java JDK** | Linguagem principal utilizada (Versão 17+) |
| 🏗️ **POO** | Programação Orientada a Objetos |
| 🔒 **Encapsulamento** | Segurança de dados com modificadores de acesso |
| 🔄 **Sobrecarga** | Flexibilidade na criação de objetos (Constructors) |



---

## 📱 Funcionalidades do Sistema

O sistema oferece um menu completo para manipulação do estoque:

✔ **Cadastro Inicial:** Nome e preço do produto (quantidade inicia em zero ou via sobrecarga).
✔ **Entrada de Estoque:** Adiciona unidades ao saldo atual.
✔ **Saída de Estoque:** Remove unidades (venda/baixa).
✔ **Consulta de Dados:** Visualização individual de Nome, Preço ou Quantidade.
✔ **Edição Dinâmica:** Permite alterar o nome ou o preço do produto a qualquer momento.
✔ **Cálculo de Valor Total:** Exibe o valor total investido no estoque daquele item.

---

## 🧩 Estrutura do Código

O projeto está dividido em dois pacotes principais para separar a execução da lógica de negócio:

### 📦 `entities` (A Entidade)
- **Classe Stock:** Contém os atributos privados, construtores sobrecarregados e métodos de cálculo.
- **Override toString():** Personalizado para exibir os dados formatados (ex: `Product, $10.00, 5 units, Total:$ 50.00`).

### 📦 `application` (O Motor)
- **Classe Main:** Contém o método principal, o menu interativo `do-while` e a lógica de entrada de dados via `Scanner`.

---

## 📂 Estrutura de Pastas

Para manter a organização sugerida pelo uso de pacotes em Java:

```text
📁 sistema-estoque-java
│
└── 📁 src
    ├── 📁 application
    │   └── 📄 Main.java
    └── 📁 entities
        └── 📄 Stock.java
```
---

## 🚀 Como Executar
Certifique-se de ter o JDK instalado.

Clone o repositório, https://github.com/Tanaka-txt/Inventory-Management-System-Exercise.git 

No terminal, compile os arquivos:

```
javac src/entities/Stock.java src/application/Main.java -d bin
```

Execute o programa:

```
java -cp bin application.Main
```