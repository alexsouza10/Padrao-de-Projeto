# Projeto Strategy em Java

Este é um projeto simples que demonstra a implementação do padrão de projeto Strategy em Java. O padrão Strategy é um padrão comportamental que permite que um conjunto de algoritmos seja encapsulado em classes separadas e intercambiáveis, permitindo que o algoritmo seja selecionado dinamicamente em tempo de execução.

## Estrutura do Projeto

O projeto consiste em diversos arquivos Java:

- `DriveBehavior.java`: Interface que define o comportamento de dirigir.
- `DriveCar.java`, `DriveMotorcycle.java`, `DriveBicycle.java`: Implementações concretas dos comportamentos de dirigir para carros, motos e bicicletas, respectivamente.
- `Vehicle.java`: Classe abstrata que representa um veículo e possui uma referência para um comportamento de dirigir.
- `Car.java`, `Motorcycle.java`, `Bicycle.java`: Implementações concretas das classes de veículo.
- `Main.java`: Classe principal para testar a implementação.

## Como Usar

1. Clone este repositório para o seu ambiente de desenvolvimento local.
2. Compile os arquivos Java usando o seu IDE preferido ou através da linha de comando.
3. Execute a classe `Main` para testar a implementação.
4. Observe a saída para ver como cada tipo de veículo é dirigido usando seu comportamento correspondente.

## Contribuição

Contribuições são bem-vindas! Se você tiver alguma sugestão de melhoria, correção de bugs ou novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
