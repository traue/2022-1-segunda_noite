CREATE TABLE usuario(
    idusuario INT PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY
    (START WITH 1 INCREMENT BY 1),
    usuario VARCHAR(20),
    senha VARCHAR(20)
);

CREATE TABLE tb_eleicao(
    idEleicao INT PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY
    (START WITH 1 INCREMENT BY 1),
    nomeEleicao VARCHAR(50),
    descricao VARCHAR(100)
);

CREATE TABLE tb_candidato(
    idcandidato INT PRIMARY KEY
    GENERATED ALWAYS AS IDENTITY
    (START WITH 1 INCREMENT BY 1),
    nome VARCHAR(80) NOT NULL,
    idEleicao INT,
    CONSTRAINT fk_candidato_eleicao FOREIGN KEY (idEleicao)
    REFERENCES tb_eleicao
);

CREATE TABLE tb_votos(
    idUsuario INT,    
    idEleicao INT,
    idCandidato INT,
    CONSTRAINT fk_voto_usuario FOREIGN KEY (idUsuario)
        REFERENCES usuario,
    CONSTRAINT fk_voto_eleicao FOREIGN KEY (idEleicao)
        REFERENCES tb_eleicao,
    CONSTRAINT fk_voto_candidato FOREIGN KEY (idCandidato)
        REFERENCES tb_candidato 
);