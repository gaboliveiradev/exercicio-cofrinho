# Cofrinho em Java

Este projeto implementa um exercício simples de um cofrinho em Java, utilizado para praticar conceitos de Programação Orientada a Objetos (POO), encapsulamento e visibilidade.

## Descrição

O objetivo do exercício é simular um cofrinho onde podemos adicionar moedas e verificar o total acumulado.

### 📌 Classes

#### Moeda.java
Define a estrutura e comportamento de uma moeda.

- **Atributos**:
  - `nome`: Armazena o nome/tipo da moeda. (Euro, Dolar, Real)
  - `valor`: Armazena o valor da moeda.

- **Métodos**:
  - `getNome()`: Retorna o nome da moeda.
  - `setVNome()`: Define o nome da moeda.
  - `getValor()`: Retorna o valor da moeda.
  - `setValor()`: Define o valor da moeda.

#### Cofrinho.java
Implementa o cofrinho propriamente dito.

- **Atributos**:
  - `moedas<Moedas>`: ArrayList da classe Moedas.

- **Métodos**:
  - `add(Moeda m)`: Adiciona moedas ao cofrinho.
  - `calcularTotal()`: Calcula o valor total acumulado no cofrinho.

## 🚀 Como executar

Para utilizar o projeto:

1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/gaboliveiradev/exercicio-cofrinho.git
   ```

2. Abra o projeto em sua IDE preferida.

3. Compile e execute a classe `Main.java` para testar o funcionamento do cofrinho.

## 📌 Exemplo de Uso

```java
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Euro", 0.5));
		c.add(new Moeda("Euro", 1));
		c.add(new Moeda("Euro", 0.25));
		c.add(new Moeda("Euro", 0.1));
		c.add(new Moeda("Euro", 0.05));
		c.add(new Moeda("Euro", 0.01));
		c.add(new Moeda("Euro", 0.01));
		c.add(new Moeda("Euro", 1));
		
		System.out.printf("Total do Cofrinho: R$ %.2f", c.calcularTotal());
```

Saída esperada:
```
Total do Cofrinho: R$ 2,92
```

## 📌 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue para discutir melhorias ou fazer um pull request diretamente.

## 📌 Autor

👤 **Gabriel Oliveira**  
🔗 [LinkedIn](https://www.linkedin.com/in/gabrielszoliveira/)

## 📌 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
