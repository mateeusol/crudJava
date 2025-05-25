# 📋 CRUD Java com Interface Gráfica (Swing)

Este projeto é uma aplicação Java com interface gráfica (**Swing**) que realiza operações básicas de **CRUD** — Criar, Ler, Atualizar e Deletar — de usuários. O projeto foi desenvolvido com fins acadêmicos, aplicando os conceitos de orientação a objetos, estruturação em camadas e manipulação de interface gráfica em Java.

🔗 Repositório: [github.com/mateeusol/crud.java](https://github.com/mateeusol/crud.java)

---

## ✨ Funcionalidades

- ✅ Cadastrar novos usuários
- 🔍 Consultar usuários pelo ID
- 🔄 Atualizar dados de um usuário
- ❌ Excluir um usuário
- 📋 Listar todos os usuários registrados

---

## 🛠 Tecnologias Utilizadas

- [x] Java 17+
- [x] Swing (biblioteca nativa do Java para GUIs)
- [x] Programação Orientada a Objetos
- [x] IntelliJ IDEA (IDE recomendada)

---

## 📁 Estrutura do Projeto

crud.java/
│
├── src/
│ └── crud/
│ ├── User.java // Classe que representa o modelo de usuário
│ ├── UserDAO.java // Simula um banco de dados com ArrayList
│ ├── UserForm.java // Interface gráfica e lógica do sistema
│ └── Main.java // Classe principal (executa o programa)


---

## ▶️ Como Executar

1. Clone o repositório:
``bash
git clone https://github.com/mateeusol/crud.java.git

2. Abra o projeto no IntelliJ IDEA ou outra IDE Java.

3. Execute a classe Main.java.

4. A janela da aplicação será exibida com os campos e botões para realizar o CRUD.

# 📚 Explicação Técnica
Os dados são armazenados em memória (sem banco de dados por enquanto), usando ArrayList<User>.

A estrutura do projeto separa as responsabilidades em camadas:

Model: User

DAO: UserDAO

View/Controlador: UserForm

Main: inicia a aplicação

A interface usa componentes Swing como JTextField, JTextArea, JLabel, JButton.
