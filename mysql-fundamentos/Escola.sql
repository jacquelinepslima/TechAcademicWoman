use escola;

create table aluno(
nome varchar(20),
sobrenome varchar(30),
data_de_nascimento date, 
endereço varchar(50)
);

select * from aluno;

drop table aluno;

create table aluno(
nome varchar(20) not NULL,
sobrenome varchar(30),
nome_pai varchar (50),
nome_mae varchar (50),
data_de_nascimento date, 
endereço varchar(50),
numero_casa int,
nome_cidade varchar(30),
sigla_estado char(2)
);

select * from aluno;

create table INSTITUICAO_ENSINO (
nome varchar (50) not null,
endereco varchar (100) not null,
razao_social varchar(50) not null,
telefone varchar(20) not null,
observacao varchar(150) not null
);

select * from INSTITUICAO_ENSINO;

alter table INSTITUICAO_ENSINO drop column observacao;

alter table INSTITUICAO_ENSINO add column reitor varchar (50);
alter table INSTITUICAO_ENSINO add column vice_reitor varchar (50);

alter table INSTITUICAO_ENSINO add column data_inauguracao timestamp not null;

desc INSTITUICAO_ENSINO;

alter table INSTITUICAO_ENSINO drop column reitor;
alter table INSTITUICAO_ENSINO drop column vice_reitor;

create table professor(
nome varchar(50) not null,
titularidade varchar(100) not null,
endereco varchar (100) not null
);

desc professor;

alter table professor drop column endereco;

alter table professor add column cidade_reside varchar (50) not null;
alter table professor add column cidade_natal varchar (50) not null;
alter table professor add column salario float (10,2) not null;

alter table professor modify salario decimal (8,2) not null;

rename table INSTITUICAO_ENSINO to FACULDADE;

desc FACULDADE;

create table DEPARTAMENTO(
nome varchar (50) not null,
nome_presidente varchar (50) not null,
localizacao varchar(150) not null,
orcamento_mensal numeric
);

desc DEPARTAMENTO;

rename table DEPARTAMENTO to CENTRO;

desc CENTRO;

create table LIVRO(
nome varchar (100),
ano_lancamento char(4),
autor varchar (50),
quantidade_paginas int
);


insert into LIVRO values ('Dom Quixote', '1605', 'Miguel de Cervantes', 378);
insert into LIVRO values ('Guerra e Paz', '1869', 'Liev Tolstói', 652);
insert into LIVRO values ('A Montanha Mágica', '1924', 'Thomas Mann', 847);
insert into LIVRO values ('Ulisses', '1922', 'James Joyce', 65);
insert into LIVRO values ('Cem Anos de Solidão', '1967',' Gabriel García Márquez ', 987)
insert into LIVRO values ('A Divina Comédia', '1321','Dante Alighieri ', 587);
insert into LIVRO values ('Em Busca do Tempo Perdido', '1913','Marcel Proust ', 872);
insert into LIVRO values ('O Som e a Fúria', '1929','William Faulkner ', 254);

-- (nome, ano_lancamento, autor, quantidade_paginas)

update LIVRO set autor = 'Marcel Proust' where ano_lancamento = '1913';
update LIVRO set autor = 'Gabriel García Márquez' where ano_lancamento = '1967';

select * from LIVRO;

select * from livro where ano_lancamento > '1900';
select * from livro where ano_lancamento < '1605';
select * from livro where ano_lancamento >= '1967';
select * from livro where autor = 'Liev Tolstói';


SELECT * from LIVRO WHERE autor='James Joyce' OR autor='Marcel Proust';

SELECT * from LIVRO WHERE quantidade_paginas >= 600  AND  quantidade_paginas <= 1000;
SELECT * from LIVRO WHERE quantidade_paginas between 600 AND 1000;

SELECT * from LIVRO WHERE quantidade_paginas > 367  OR ano_lancamento = '1605';

SELECT * from LIVRO WHERE nome = 'Ulisses'  AND  quantidade_paginas >= 65;

select nome, ano_lancamento from LIVRO;

select autor from LIVRO WHERE quantidade_paginas > 400;

select nome, autor from LIVRO WHERE nome like '%anos%' or autor like '%Liev%';

select nome from LIVRO WHERE autor like '%w%';

select nome from LIVRO WHERE nome like 'g%';

select nome as 'NOME DO LIVRO', autor as 'AUTOR', ano_lancamento as 'ANO DO LANÇAMENTO' from LIVRO;

alter table LIVRO modify ano_lancamento int;

select * from LIVRO;

select nome, SUM(2000 - ano_lancamento) as 'IDADE DO LIVRO' from LIVRO group by nome;

select nome as 'NOME', ano_lancamento as 'ANO DO LANÇAMENTO', SUM(2000 - ano_lancamento) as 'IDADE DO LIVRO' from LIVRO 
    where (2000 - ano_lancamento) between 60 and 300 group by nome;
    
insert into LIVRO values ('Chapeuzinho vermelho', 1899, 'Miguel de Cervantes', 12);
insert into LIVRO values ('Dona Florinda', 1968, 'Miguel de Cervantes', 59);

select nome, autor, ano_lancamento from LIVRO order by ano_lancamento desc;

alter table LIVRO add column numero_volume int;

update LIVRO set numero_volume = 1;

alter table LIVRO add column data_edicao timestamp;
alter table LIVRO modify data_edicao date;

update LIVRO set data_edicao = "2016-06-23" where nome = 'Dom Quixote';
update LIVRO set data_edicao = "1989-02-28" where nome = 'Guerra e Paz';
update LIVRO set data_edicao = "2015-02-01" where nome = 'A Montanha Mágica';
update LIVRO set data_edicao = "1989-12-09" where nome = 'Ulisses';
update LIVRO set data_edicao = "1902-08-29" where nome = 'Cem Anos de Solidão';
update LIVRO set data_edicao = "1806-09-28" where nome = 'A Divina Comédia';

desc LIVRO;

select * from LIVRO;

update LIVRO set data_edicao = "2005-09-08" where data_edicao is null;

select nome, autor from LIVRO  order by data_edicao desc;

select nome, date_format(data_edicao, '%m/%Y') from LIVRO;

select autor from LIVRO where data_edicao between '1989-01-01' and '1989-12-31';

alter table LIVRO modify nome varchar(100) not null;
alter table LIVRO modify autor varchar(50) not null;
alter table LIVRO modify data_edicao date not null;


insert into LIVRO (nome, autor) values ('Cem Anos de Solidão', 'Gabriel García Márquez');

-- SQL Error [1364] [HY000]: Field 'data_edicao' doesn't have a default value

insert into LIVRO (nome, autor, data_edicao) values ('Cem Anos de Solidão','Gabriel García Márquez', "1879-06-03");

insert into LIVRO (nome, autor, data_edicao) values ('A volta dos que não foram', 'Liev Tolstói', '1789-00-00');
insert into LIVRO (nome, autor, data_edicao) values ('Poeira em alto mar', 'Thomas Mann', '1809-00-00');
insert into LIVRO (nome, autor, data_edicao) values ('Grande visões de um cego', 'James Joyce', '1968-00-00');
insert into LIVRO (nome, autor, data_edicao) values ('Lucidez de um louco', 'Gabriel García Márquez', '1709-00-00');

select * from LIVRO;

select nome, date_format(data_edicao, '%Y') from LIVRO order by data_edicao desc;

select nome, date_format(data_edicao, '%Y') from LIVRO where ano_lancamento is null;

update LIVRO set ano_lancamento = date_format(data_edicao, '%Y') where ano_lancamento is null;

update LIVRO set quantidade_paginas = 100 where quantidade_paginas is null;

select count(distinct autor) as 'Qt autores diferentes' from LIVRO;

select count(distinct nome) as 'Qt livros' from LIVRO WHERE nome like '%A%';

select SUM(quantidade_paginas) as 'Soma de páginas' from livro where data_edicao > "2005-01-01";

alter table LIVRO add column valor decimal(3,2);
alter table LIVRO modify valor float(5,2);

desc LIVRO;

update LIVRO set valor = 35.99 where autor = 'Miguel Cervantes';
update LIVRO set valor = 35.99 where autor = 'Liev Tolstói';
update LIVRO set valor = 35.99 where autor = 'Thomas Mann';

update LIVRO set valor = 12.89 where nome = 'Em Busca do Templo Perdido';
update LIVRO set valor = 12.89 where nome = 'O Som e a Fúria';
update LIVRO set valor = 12.89 where nome = 'Chapeuzinho vermelho';
update LIVRO set valor = 12.89 where nome = 'Dona florinda';

select * from LIVRO;

update LIVRO set valor = 19.70 where data_edicao < '2006-01-01' and valor is null;

update LIVRO set valor = 9.99 where valor is null;

select SUM(valor)/count(*) as 'media dos precos' from livro;

select nome as 'O livro é de no máximo dois anos' from livro where data_edicao > "2015-01-01";

select nome, data_edicao,
case
 when data_edicao > "2015-01-01" then "O livro é de no máximo dois anos"
 else "O livro é mais velho que dois anos"
 end
 from LIVRO;
 

select count(numero_volume) from LIVRO;

select nome, date_format(data_edicao, '%M') from LIVRO order by data_edicao desc;

select date_format(data_edicao, '%M'), count(date_format(data_edicao, ' ')) from livro 
    group by date_format(data_edicao, '%M');
   
select nome,
case
when nome like '%a%' then 'Possui vogal no nome'
 when nome like '%e%' then 'Possui vogal no nome'
 when nome like '%i%' then 'Possui vogal no nome'
 when nome like '%o%' then 'Possui vogal no nome'
 when nome like '%u%' then 'Possui vogal no nome'
 else 'Não possui vogal no nome'
 end, sum(valor)/count(*)
 from LIVRO;
select nome,
case
when nome like '%A%' then 'Possui vogal no nome'
 when nome like '%E%' then 'Possui vogal no nome'
 when nome like '%I%' then 'Possui vogal no nome'
 when nome like '%O%' then 'Possui vogal no nome'
 when nome like '%U%' then 'Possui vogal no nome'
 else 'Não possui vogal no nome'
 end, sum(valor)/count(*)
 from LIVRO;

---------------------------------------------------------------------- REGEX

select nome,
case 
when nome regexp '[aeiouAEIOU]' then 'Possui vogal no nome'
else 'Não possui vogal no nome'
end as 'vogal'
from LIVRO;



   
