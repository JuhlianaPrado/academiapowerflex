CREATE DATABASE powerflexdb; 
USE powerflexdb; 
  DROP DATABASE powerflexdb

  
 
--Cadastro do Aluno 
CREATE TABLE aluno( 
id BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY, 
nome VARCHAR(100) NOT NULL, 
cpf INT NOT NULL, 
email VARCHAR(60) NOT NULL, 
password VARCHAR(250) NOT NULL, 
id_plano BIGINT NOT NULL 
) 
  
 
 
  
--Cadastro de Planos 
CREATE TABLE plano( 
id BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY, 
plano VARCHAR(50) NOT NULL, 
valor DECIMAL(5,2) NOT NULL, 
descricao VARCHAR(100) NOT NULL 
) 
  

  
--Cadastro de Telefone de Aluno 
CREATE TABLE telefone_aluno( 
id_aluno BIGINT NOT NULL, 
numero INT NOT NULL 
) 
 

--Aluno  
ALTER TABLE aluno ADD CONSTRAINT fk_aluno_plano FOREIGN KEY (id_plano) REFERENCES plano (id); 
  
  
ALTER TABLE telefone_aluno ADD CONSTRAINT fk_telefone_aluno_aluno FOREIGN KEY (id_aluno) REFERENCES aluno (id); 
