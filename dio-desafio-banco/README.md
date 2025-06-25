# 💰 Banco Digital em Java (POO)

Este é um projeto prático para reforçar os conhecimentos de **Programação Orientada a Objetos (POO)** em Java. O sistema simula as funcionalidades básicas de um banco digital, permitindo a criação de clientes, contas correntes e contas poupança com operações de saque, depósito e transferência entre contas da mesma instituição.

---

## 📌 Descrição

Neste projeto, aplicamos os quatro pilares da POO:

- **Abstração**: Generalização de comportamentos na classe `Conta`;
- **Encapsulamento**: Controle de acesso aos atributos com modificadores `private` e `protected`;
- **Herança**: `ContaCorrente` e `ContaPoupanca` herdam de `Conta`;
- **Polimorfismo**: O método `imprimirExtrato()` é implementado de forma diferente em cada tipo de conta.

Além disso, foi implementada uma **validação para impedir saldo negativo**, garantindo mais segurança nas operações bancárias.

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **IDE recomendada**: IntelliJ IDEA ou Eclipse
- **Paradigma**: Programação Orientada a Objetos (POO)
- **JDK**: Oracle ou OpenJDK

---

## 🚀 Como utilizar

### 1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/banco-digital-java-poo.git
cd banco-digital-java-poo
```

### 2. Compile e execute o projeto:
- **Abra em sua IDE preferida (IntelliJ, Eclipse ou VS Code com extensão Java);**

- **Execute a classe Main.java.**

---

## 📋 Funcionalidades Implementadas
- **Cadastro de cliente**
- **Criação de conta corrente e conta poupança**
- **Depósito**
- **Saque com validação de saldo**
- **Transferência entre contas**
- **Impressão de extrato da conta**

---

## 🧩 Melhorias Futuras

- **Implementar exceções personalizadas** `(SaldoInsuficienteException)`
- **Armazenar histórico de transações**
- **Persistência em banco de dados**
- **Interface gráfica com JavaFX ou Swing**
- **API REST com Spring Boot**

---

## 👩‍💻 Autor

- Desenvolvido por Nayane Costa
- 📧 nayanecosilva@gmail.com
- 🔗 https://www.linkedin.com/in/nayanecosta/
- 🔗 https://github.com/nayanesilv4

---

## 📄 Licença

---

## 📄 Licença

Este projeto está licenciado sob os termos da [Licença MIT](LICENSE).  
Você tem permissão para usar, copiar, modificar, mesclar, publicar, distribuir, sublicenciar e/ou vender cópias do software, desde que mantenha os avisos de copyright.

---


