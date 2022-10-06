-- Cria um banco de dados
create schema loja;

use loja;

-- excluir uma tabela
drop table contato;

-- cria uma tabela
-- preto = atributos, azul= tipos dedados

create table cliente(
id int not null auto_increment, -- os atributos | colunas
	codigo_cliente varchar(10),
	nome varchar(100),
	razao_social varchar(100),
	data_cadastro date,
	cnpj varchar(20),
	telefone varchar(20),
	primary key(id)
);


-- insercao de registros
insert into cliente (nome) values('Jacqueline');
insert into cliente(data_cadastro) values(now());
insert into cliente(telefone) values('19989075075');
insert into cliente(nome, data_cadastro, telefone) values('Jacqueline', now(), '(19) 9 8907 5075');
insert into cliente(razao_social) values('jacqueline p s lima');
insert into cliente(cnpj) values('75512742191');

-- pesquisar o conteudo da tabela
select * from cliente;

-- mostra a estrutura da tabela
describe contato;

-- atualizar um registro ** dar preferencia para ser feito por id ***
update cliente set cnpj = '999' where id = 1;

-- exclusao de registro ** dar preferencia para ser feito por id ***
delete from cliente where id = 2;

insert into cliente(id,nome, data_cadastro) values(9, 'Val', now());
insert into cliente(nome, data_cadastro) values('Luana', now());
insert into cliente(id,nome, data_cadastro) values(15,'Ambrosia', now());
insert into cliente(nome, data_cadastro) values('Byanca', now());

create table fornecedor(
id int not null auto_increment,
	codigo_fornecedor varchar(10),
	nome varchar(100),
	razao_social varchar(100),
	telefone varchar(20),
	primary key(id)
);

create table produto(
id int not null auto_increment,
	codigo_produto varchar(20),
	descricao varchar(100),
	valor float(10,2),
	situacao varchar(1),
	id_fornecedor int, -- foreign key | CHAVE ESTRANGEIRA
	primary key(id)
);

create table vendedor(
id int not null auto_increment,
	codigo_Vendedor varchar(10),
	nome varchar(100),
	razao_vende varchar(100),
	telefone varchar(20),
	n_porcvende float(10,2),
	primary key(id)
);

create table item_venda(
id int not null auto_increment,
	codigo_item_venda int not null,
	id_produto int not null,
	valor float(10,2),
	qtde int,
	desconto float(10,2),
	primary key(id)
);

create table venda(
id int not null auto_increment,
	codigo_venda varchar(10),
	id_cliente int not null,
	id_fornecedor int not null,
	id_vendedor int not null,
	valor float(10,2),
	desconto float(10,2),
	total float(10,2),
	data_venda date,
	primary key(id)
);

delete from cliente;
select * from cliente;


desc produto;

