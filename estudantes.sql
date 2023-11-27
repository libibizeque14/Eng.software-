create database estudantes;
use estudantes;
create table login (
usuario varchar(12),
senha varchar(6)
);
insert into login values ("Admin","1234");

create table estudantes (
id int,
Nome_do_aluno varchar(30),
Idade int,
Data_de_cadastro varchar(15),
Sexo varchar(15),
Nome_de_encarregado varchar(30),
Conctato int(9),
Endereco varchar(40)

);

insert into estudantes values (1,"Carlos",9,"20/02/2019",
"Masculino","Oliveira",841234567,"Rua da acacias");