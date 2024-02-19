# Aula de POO

Alunos:
- Luan de Barros
- Jamilly
- Daniel
- Joana da Silva

### log 

Exibir histórico:
```java
git log
``````
Exibir histórico com diff das duas últimas alterações:

```java
git log -p -2
``````
Exibir resumo do histórico (hash completa, autor, data, comentário e qtde de alterações (+/-)):

```java
git log --stat
``````

Exibir informações resumidas em uma linha (hash completa e comentário):

```java
git log --pretty=oneline
``````

Exibir histórico com formatação específica (hash abreviada, autor, data e comentário):

```java
git log --pretty=format:"%h - %an, %ar : %s"
``````
%h: Abreviação do hash;

%an: Nome do autor;

%ar: Data;

%s: Comentário.

### git commit
Serve para comitar um arquivo/diretório

- Comitar um arquivo: ```bash
  "git commit meu_arquivo.txt" ```

- Comitar vários arquivos: ```bash
  "git commit meu_arquivo.txt meu_outro_arquivo.txt"```
- Comitar informando mensagem: ```bash
  "git commit meuarquivo.txt -m "minha mensagem de commit" ```

### git clone
Serve para Clonar um repositório remoto já existente
- git clone git@github.com:leocomelli/curso-git.git

