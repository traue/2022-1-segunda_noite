-- Sript do BD do projeto

-- tabela que representa a entidade "curso"
CREATE TABLE tb_curso(
    id INT PRIMARY KEY 
        GENERATED ALWAYS AS IDENTITY 
        (START WITH 1 INCREMENT BY 1),
    nome_curso VARCHAR(90) NOT NULL,
    tipo_curso VARCHAR(50) NOT NULL
);


-- tablea que representa a entidade "aluno":
CREATE TABLE tb_aluno(
    id INT PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY
    (START WITH 1, INCREMENT BY 1),
    ra INT NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    id_curso INT,
        CONSTRAINT fk_aluno_curso
        FOREIGN KEY(id_curso)
        REFERENCES tb_curso
);