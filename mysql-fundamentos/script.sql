use loja;

create table fornecedor(
id int not null auto_increment,
	nome varchar(100),
	primary key(id)
);

create table produto(
id int not null auto_increment,
	descricao varchar(100),
	id_fornecedor int, -- foreign key | CHAVE ESTRANGEIRA
	primary key(id)
);

insert into produto(descricao) values('scarpin');
insert into produto(descricao) values('sapato');
insert into produto(descricao) values('tenis');
insert into produto(descricao) values('bota');
insert into produto(descricao) values('sapato social');
insert into produto(descricao) values('sapato social com bico fino');
select * from produto;


insert into fornecedor (nome) values ('arezzo');
insert into fornecedor (nome) values ('mizuno');
insert into fornecedor (nome) values ('capodarte s/a');
select * from fornecedor;

alter table produto add constraint fk_produto_fornecedor foreign key (id_fornecedor) references fornecedor(id);

update produto set id_fornecedor = 1 where id= 1;
update produto set id_fornecedor = 3 where id= 2;
update produto set id_fornecedor = 1 where id= 3;
update produto set id_fornecedor = 2 where id= 4;
update produto set id_fornecedor = 3 where id= 5;
update produto set id_fornecedor = 3 where id= 6;
update produto set id_fornecedor = 1 where id= 7;

select * from produto;

-- altera o atributo para colocar como OBRIGATORIO
alter table produto modify id_fornecedor int not null;

desc produto;

select * from produto;

alter table fornecedor add column codigo_fornecedor varchar(10);
alter table fornecedor add column razao_social varchar(100);
alter table fornecedor add column telefone varchar(20);
desc fornecedor;

alter table produto add column codigo_produto varchar(20);
alter table produto add column valor float(10, 2);
alter table produto add column situacao varchar(1);
desc produto;

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


alter table item_venda add constraint fk_item_venda_produto foreign key (id_produto) references produto (id);
alter table item_venda modify id_produto int not null;

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

alter table venda add constraint fk_venda_cliente foreign key (id_cliente) references cliente (id);
alter table venda add constraint fk_venda_fornecedor foreign key (id_fornecedor) references fornecedor (id);
alter table venda add constraint fk_venda_vendedor foreign key (id_vendedor) references vendedor (id);

alter table venda modify id_cliente int not null;
alter table venda modify id_vendedor int not null;



