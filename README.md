⚽ SoccerScore – Simulador de Placar

Aplicativo Android desenvolvido para a disciplina de desenvolvimento móvel no IFSP, utilizando Kotlin, Jetpack Compose e Navigation Compose. O objetivo é simular o placar de uma partida de futebol com navegação entre telas e validação de dados.

📱 Visão Geral

O SoccerScore permite que o usuário insira informações de uma partida, revise os dados e veja o resultado final com base no placar informado.

O fluxo do aplicativo é dividido em três telas principais:

Configuração da partida
Resumo da partida
Resultado final
🧩 Funcionalidades
Cadastro do nome dos times
Inserção de gols de cada equipe
Validação de campos obrigatórios
Verificação de empate ou vitória
Navegação entre telas com parâmetros
Reinício do jogo com um único botão
Persistência de dados com rememberSaveable
🖥️ Telas do Aplicativo
1. Tela de Configuração da Partida

Objetivo: Capturar os dados iniciais do jogo.

Campos:

Nome do Time A
Nome do Time B
Gols do Time A
Gols do Time B

Validações:

Todos os campos devem estar preenchidos
Gols devem ser valores inteiros não negativos
2. Tela de Resumo da Partida

Objetivo: Exibir os dados para conferência antes da confirmação.

Exibição:

Nome dos times
Placar formatado (ex: 2 x 1)

Ações:

Confirmar resultado
Voltar para edição dos dados
3. Tela de Resultado Final

Objetivo: Exibir o resultado da partida.

Regras:

Time A vence → "Time A venceu!"
Time B vence → "Time B venceu!"
Empate → "Empate emocionante!"

Ação:

Botão "Novo Jogo" para reiniciar o fluxo
🛠️ Tecnologias Utilizadas
Kotlin
Android Studio
Jetpack Compose
Navigation Compose
rememberSaveable
🧱 Arquitetura e Organização

O projeto foi estruturado com foco em manutenção e clareza:

Componentização com @Composable
Separação por telas
Passagem de parâmetros via rotas de navegação
Estado gerenciado com Compose State + rememberSaveable
▶️ Como Executar o Projeto
Clone ou importe o repositório no Android Studio
Aguarde a sincronização do Gradle
Verifique as dependências do Jetpack Compose e Navigation Compose
Execute em um emulador ou dispositivo físico Android
🎓 Informações Acadêmicas
Professor: Pedro Northon Nobile
Instituição: IFSP
Disciplina: Desenvolvimento de Aplicações Móveis
