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

