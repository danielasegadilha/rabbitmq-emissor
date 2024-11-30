# Projeto Detran - Emissor de Requisições RabbitMQ

Este projeto é o emissor das requisições para remoção de multas do Detran. Ele envia mensagens para a fila RabbitMQ, que são processadas pelo receptor para realizar as deleções no banco de dados.

## 🛠 Tecnologias Utilizadas

| Tecnologia      | Descrição                                           |
|-----------------|-----------------------------------------------------|
| 🐇 RabbitMQ     | Sistema de mensageria usado para enviar requisições para remoção de multas. |
| 💻 Java         | Linguagem de programação usada para implementar o emissor. |
| 🧩 Spring Boot  | Framework utilizado para construir a aplicação backend. |
| 🌐 REST API     | API REST para enviar requisições de remoção de multas. |
| 📑 Swagger      | Ferramenta para documentação automática da API REST. |
| 🐳 Docker       | Contêinerização da aplicação para facilitar a implantação. |
| 🏗 Jenkins      | Integração contínua e automação de builds. |

## ⚙ Funcionalidades

- 📤 **Envio de Requisições:** Envia requisições para a fila RabbitMQ contendo os dados das multas a serem removidas.
- 📝 **API REST com Swagger:** Exposição de endpoints REST para receber solicitações de remoção de multas e enviar para a fila, com documentação automática via Swagger.
- ✅ **Validação de Dados:** Valida as informações das multas antes de enviá-las para a fila.
- 🔄 **Monitoramento de Status:** Acompanha o status das requisições enviadas e fornece feedback sobre o processo.

