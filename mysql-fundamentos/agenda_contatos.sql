create database agenda_contato;

use agenda_contato;

create table pessoa(
    id int not null auto_increment primary key,
    nome varchar (100),
    data_cadastro date,
    cpf varchar (20),
    data_nascimento date,
    genero char(2)
);

drop table pessoa;

create table formacao(
    id int not null auto_increment primary key,
    nivel varchar (50),
    data_conclusao date
);

create table localidade(
    id int not null auto_increment primary key,
    rua varchar (50),
    numero int,
    bairro varchar(50),
    cidade varchar(50),
    estado char(2),
    cep varchar(10)
);

create table contato(
    id int not null auto_increment primary key,
    email varchar(100),
    telefone varchar(20)
);

--adicionando FK_formacao_pessoa

alter table pessoa add column id_formacao int;
alter table pessoa add constraint fk_formacao_pessoa foreign key (id_formacao) references formacao (id);

alter table pessoa add column id_localidade int;
alter table pessoa add constraint fk_localidade_pessoa foreign key (id_localidade) references localidade (id);

alter table pessoa add column id_contato int;
alter table pessoa add constraint fk_contato_pessoa foreign key (id_contato) references contato (id);


--insercao de dados

insert into pessoa (nome, cpf, data_nascimento, genero, data_cadastro, id_formacao, id_localidade, id_contato) values ('Jacqueline Lima', '755.127.421-91', '1990-08-01', 'F', now(), 1, 1, 1);
insert into pessoa (nome, data_cadastro, cpf, data_nascimento, genero, id_formacao, id_localidade, id_contato) values ('Amanda Alves', now(), '109.512.516-86', '1993-05-31', 'F', 2, 2, 2);
insert into pessoa (nome, data_cadastro, cpf, data_nascimento, genero, id_formacao, id_localidade, id_contato) values ('Fátima Melo', now(), '772.716.792-43', '2001/06/15', 'F', 3, 3, 3);
insert into pessoa (nome, data_cadastro, cpf, data_nascimento, genero, id_formacao, id_localidade, id_contato) values ('Helena Pinto', now(), '572.259.502-07', '2001/05/16', 'F', 4, 4, 4);
insert into pessoa (nome, data_cadastro, cpf, data_nascimento, genero, id_formacao, id_localidade, id_contato) values ('Sebastiana Cardoso', now(), '545.388.862-89', '2001/02/17', 'F', 5, 5, 5);

desc pessoa;

select * from pessoa;

insert into formacao (nivel, data_conclusao) values ('Fundamental', '2005-07-30');
insert into formacao (nivel, data_conclusao) values ('Medio', '2008-06-24');
insert into formacao (nivel, data_conclusao) values ('Superior', '2000-08-27');
insert into formacao (nivel, data_conclusao) values ('Pós-Graduação', '2019-11-13');
insert into formacao (nivel, data_conclusao) values ('Mestrado', '2020-12-24');


insert into localidade (rua, numero, bairro, cidade, estado, cep) values ('Rua Margarida', 2000, 'Alto São João', 'Belo Horizonte', 'MG', '39300-00');
insert into localidade (rua, numero, bairro, cidade, estado, cep) values ('Rua Honorio de Almeida', 1232, 'Centro', 'Mococa', 'SP', '41200-00');
insert into localidade (rua, numero, bairro, cidade, estado, cep) values ('Avenida das Américas', 600, 'Independecia', 'Curitiba', 'PR', '19300-00');
insert into localidade (rua, numero, bairro, cidade, estado, cep) values ('Rua Pedro Alvares', 22, 'Pedra Grande', 'Vitoria da Conquista', 'BA', '22300-00');
insert into localidade (rua, numero, bairro, cidade, estado, cep) values ('Rua Gaivota', 654, 'Alcides Rabelo', 'Montes Claros', 'MG', '39300-00');

insert into contato (email, telefone) values ('zac_lima@hotmail.com', '(19) 3656-1500');
insert into contato (email, telefone) values ('amanda@gmail.com','(38) 99143-5538');
insert into contato (email, telefone) values ('fatimapmelo@gmail.com', '(19) 3656-1997');
insert into contato (email, telefone) values ('helena@gmail.com','(21) 99345-8765');
insert into contato (email, telefone) values ('sebastiana@gmail.com','(11) 2101-0978');

