use demo1;


create table Pessoa(
	id integer not null auto_increment primary key,
	nome varchar(100) not null,
	sobrenome varchar(100)
);

insert into Pessoa values(null, 'Jacqueline', 'Lima');

