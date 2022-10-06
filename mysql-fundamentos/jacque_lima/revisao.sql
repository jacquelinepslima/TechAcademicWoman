-- criar o banco
create database revisao;

-- marcar o banco que ira ser usado
use revisao;

-- criar uma tabela
create table pessoa(
--	NOME DA COLUNA	| TIPO DE DADOS DA COLUNA/ATRIBUTOS/PROPRIEDADE
	nome 			varchar(10), -->(10) TAMANHO MAXIMO DO ALFANUMERICO QUE PODE SER INSERIDO
	sobrenome 		varchar(30),
	idade 			int, --> TIPO INTEIRO NAO PRECISA IDENTIFICAR TAMANHO
	sexo 			char, -- F | M | G -- QUAIS as POSSIVEIS OPCOES DE DADOS INSERIDOS
	altura 			decimal(3,2), --1,73 --> formato do valor que será inserido
	peso			decimal(5,2)
);

-- mostrar a estrutura da tabela
desc pessoa;

-- gravar informações na tabela | registros da tabela
insert into pessoa(nome, sobrenome, idade, sexo, altura, peso) values('Jacqueline', 'de Paula Souza e Lima', 31, 'F', 1.63, 70);

-- verificar o conteudo de uma tabela
select * from pessoa;

--modelar e criar a tabela de endereco para a revisao

create table endereco(
	nome_rua varchar(100),
	numero int,
	complemento varchar (50),
	bairro varchar (50),
	cidade varchar (50),
	estado varchar (30),
	cep varchar (10),
	ponto_referencia varchar(20),
	observacao varchar (100)
);

-- excluir a tabela que foi criada erroneamente
drop table pessoa;


-- criar novamente a tabela
create table pessoa(
	id				int not null auto_increment primary key,
	nome 			varchar(10), 
	sobrenome 		varchar(30),
	idade 			int, 
	sexo 			char, 
	altura 			decimal(3,2), 
	peso			decimal(5,2)
);

select * from pessoa;

--após ter feito a definicao do identificado unico(id), tenho a possibilidade de
--manipular ás informações

--atualizar um registro por id
update pessoa
	set nome = 'info qq',
		sobrenome = 'mudei o valor do sobrenome',
		idade = 10
		where id = 9;
	
--deletar um registro por id
delete from pessoa where id = 9;

drop table endereco;

create table endereco(
	id int not null auto_increment primary key,
	nome_rua varchar(100),
	numero int,
	complemento varchar (50),
	bairro varchar (50),
	cidade varchar (50),
	estado varchar (30),
	cep varchar (10),
	ponto_referencia varchar(20),
	observacao varchar (100),
	id_pessoa int
);

select * from endereco;

--a cardinalidade dessa ligação entre endereco e pessoa é: um para muitos
--uma pessoa pode possuir varios enderecos
--chave estrangeira --> e a chave primaria vinda de outra tabela

alter table endereco add column id_pessoa int;
alter table endereco add constraint fk_endereco_pessoa foreign key (id_pessoa) references pessoa(id);

insert into endereco (nome_rua, cidade, observacao, id_pessoa) values ('Rua dos zeros', 'Mococa', 'na madruga', 1);
select * from endereco;

--modificar o atributo para torna-lo obrigatorio

alter table endereco modify nome_rua varchar(100) not null;
alter table endereco modify bairro varchar(50) not null;

update endereco set bairro = 'padrao';

select * from endereco e;

desc endereco;