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

- Comitar um arquivo: ``` "git commit meu_arquivo.txt" ```

- Comitar vários arquivos: ``` "git commit meu_arquivo.txt meu_outro_arquivo.txt"```
- Comitar informando mensagem: ```"git commit meuarquivo.txt -m "minha mensagem de commit" ```

### git clone
Serve para Clonar um repositório remoto já existente
- git clone git@github.com:leocomelli/curso-git.git


### status
Lista todos os arquivos novos ou modificados para serem commitados
``` bash
$ git status
```

### add
Faz o snapshot de um arquivo na preparação para versionamento
```bash
$ git add
```

### push

```bash
git push
```
- Utilizado para enviar as modificações para o servidor do github

### pull

```bash
git pull
```
- Usado para receber possíveis modificações feitas do servidor do Github
