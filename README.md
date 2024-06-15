# Praticando Spring Boot: Challenge LiterAlura
**Objetivo:** Desenvolver um Catálogo de Livros que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 5 opções de interação. Os livros serão buscados através de uma API específica.

## Tecnologias
- **Java 17**
- **Maven**
- **Spring Boot**
- **Spring JPA**
- **Biblioteca Jackson**
- **PostgreSQL**
- **Gutendex API**



## Funcionalidades da Aplicação

1.  Buscar livro por título

    ![Captura de tela 2024-06-07 201352](https://github.com/KayllaneGPina/literalura-challenge/assets/124215230/c6232696-9380-4266-b073-5126cf45fcd2)


2. Listar livros registrados

   ![Captura de tela 2024-06-07 201558](https://github.com/KayllaneGPina/literalura-challenge/assets/124215230/f1979cbd-5ecd-4c9c-8ce0-4c00665dd1f5)


3. Listar autores registrados

   ![Captura de tela 2024-06-07 201615](https://github.com/KayllaneGPina/literalura-challenge/assets/124215230/e9e5fbb8-be31-42c1-99b9-631bfa3738eb)


4. Listar autores vivos em um determinado ano

   ![Captura de tela 2024-06-07 201754](https://github.com/KayllaneGPina/literalura-challenge/assets/124215230/7e177736-c377-4ce9-bb2d-a3e8c412a37e)


5. Listar livros em um determinado idioma

   ![Captura de tela 2024-06-07 201825](https://github.com/KayllaneGPina/literalura-challenge/assets/124215230/b57d2201-524c-49ba-a428-83a9a4622631)




## Como rodar o projeto

1. Clone este repositório

   ``````
   https://github.com/KayllaneGPina/literalura-challenge.git
   ``````

2. Entre no diretório principal

   ``` 
   cd literalura
   ```

3. Configure o seu banco de dados no arquivo ***application.properties***:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

4. Execute a aplicação na classe principal ***LiteraluraApplication***
