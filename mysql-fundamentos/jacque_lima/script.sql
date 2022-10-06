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

alter table cliente add column cidade varchar(30);
alter table cliente add column estado char(2);

--teste

create table t2 (b blob default ('abc'), estado char(2));
insert t2 (estado) values ('SP');
insert t2 (estado, b) values ('SP', 'jacqueline');
select * from t2

create table t3 (situacao boolean default true, nome varchar(5), data_cadastro datetime default now());
insert into t3(nome) values('bota');
insert into t3(nome, situacao) values ('bota3', false);
select * from t3;

delete from fornecedor where id in (6);

--correcao tabela venda

update venda set id_fornecedor = 4 where id_fornecedor = 1;
update venda set id_fornecedor = 5 where id_fornecedor = 2;

--correcao tabela item_venda

update item_venda set id_produto = 8 where id_produto = 1;
update item_venda set id_produto = 9 where id_produto = 2;
update item_venda set id_produto = 10 where id_produto = 3;
update item_venda set id_produto = 11 where id_produto = 4;
update item_venda set id_produto = 12 where id_produto = 5;

#consultar tudo dentro de uma tabela
select * from venda;

select * from item_venda;

select * from produto;

--consulta apresentando somente alguns campos

select descricao, codigo_produto, valor from produto;

#ordenacao da instrucao | query | consulta por padrao é asc => ascendente
select descricao, codigo_produto, valor from produto order by descricao desc;
select descricao, codigo_produto, valor from produto order by codigo_produto desc;
select descricao, codigo_produto, valor from produto order by valor desc;

#ordenacao da instrucao usando o index da coluna da tabela
select * from produto order by 3 desc;

#ordenacao da instrucao usando o index da coluna da query
select descricao, codigo_produto, valor from produto order by 3 desc;

#query | consulta com filtro | restricao | condicao --> clausula where
select descricao, codigo_produto, valor 
from produto 
-- where id = 10 -- por id | descricao
where id = 10
order by 3 desc;

#query filtrando qq registro que possui NO em qq lugar da string
select descricao, codigo_produto, valor 
from produto 
where descricao like '%no%';

#query filtrando qq registro que inicia com a descricao SA
select descricao, codigo_produto, valor 
from produto 
where descricao like 'sa%';

#query filtrando qq registro que termina com a descricao NE
select descricao, codigo_produto, valor 
from produto 
where descricao like '%ne';

#contar total de linhas da tabela
select count(*) from item_venda;
select count(id) from item_venda;

#aliases nas colunas --apelidos|alias
select count(*) as 'Total de linhas na tabela' from item_venda;
select id as 'Código do produto',
		descricao as 'Descrição',
		codigo_produto as 'Código interno',
		valor 'Valor'
from produto order by id desc;

#funcao de formatacao --> ter essa saida R$ 2325.32 --> 2,325.320
select id as 'Código do produto',
		descricao as 'Descrição',
		codigo_produto as 'Código interno',
		concat('R$', format(valor, 2)) 'Valor'
from produto order by id desc;

#max - pea o maior valor de uma coluna
select max(valor)
from produto;

#min - pega o menor valor de uma coluna
select min(valor)
from produto;

-- Aassociar descrição com valor min ou max
select descricao, valor from produto 
where valor = (select min(valor) from produto);

# funcao de somatoria SUM de uma coluna
select SUM(valor)
from produto;

#funcao de somatoria valores max com valor min
select max(valor) + min(valor)
from produto;

#juncao de tabelas JOINS
select * from produto;
select * from fornecedor;

#INNER JOIN - juncao obrigatorio
select *
from produto p 
inner join fornecedor f on f.id = p.id_fornecedor;

select p.descricao as 'Produto', f.nome as 'Fornecedor'
from produto p 
inner join fornecedor f on f.id = p.id_fornecedor;


select codigo_produto as 'Cod. Interno', descricao as 'Produto', valor as 'Preço unitário',
		f.nome as 'fornecedor', f.telefone 'Contato fornec'
from produto p 
inner join fornecedor f on p.id_fornecedor = f.id;

#NAO FACA ISSO
select codigo_produto as 'Cod. Interno', 
		descricao as 'Produto', 
		valor as 'Preço unitário',
		f.nome as 'fornecedor', 
		f.telefone 'Contato fornec'
from produto p, fornecedor f
where p.id_fornecedor = f.id
and p.id_fornecedor is not null;

select codigo_produto as 'Cod. Interno', 
		descricao as 'Produto', 
		valor as 'Preço unitário',
		f.nome as 'fornecedor', 
		f.telefone 'Contato fornec'
from produto p 
inner join fornecedor f on p.id_fornecedor = f.id
where valor > 1000
;
-- where f.nome = 'arezzo' -- evitar condicao string | varchar | texto
-- where 1 = 1 -- f.id = 1 -- query sendo restrita a fornecedor

# usando o IN apresento somente os valores que estao dentro dos parenteses
select * from cliente
where id in(1,2);

# usando o operador < ESSA query apresenta todo os valores menor que a restricao
select * from cliente 
where id < 5;

# usando o operador < ESSA query apresenta todo os valores menor e igual que a restricao
select * from cliente 
where id <= 5;

# usando o NOT IN apresenta somente os valores que não estao dentro dos parenteses
select * from cliente 
where id not in(2,6);

# sub consultas

-- apresenta SOMENTE os id de clientes que possuem venda 'compra'
select c.nome, c.data_cadastro
from cliente c 
where id in (select id_cliente from venda where id);

select id_cliente from venda v ; -- order by id_cliente asc
select id, nome from cliente;

-- apresenta SOMENTE os id de clientes que nao possuem venda 'compra'
select c.nome, c.data_cadastro
from cliente c 
where id not in (select id_cliente from venda where id);

#sub consulta dentro do Select -- só trouxe o nome do cliente para a tabela venda
select (select c.nome from cliente c where c.id = v.id_cliente) as 'Nome cliente',v.* from venda v;

select c.nome, v.*
from venda v 
inner join cliente c on c.id = v.id_cliente;

# agrupamento de inf Group By

-- apresentar a quantidade de vendas por cliente

select * from produto p ;
select * from venda v ;

select c.id, c.nome, count(codigo_venda) as 'qtd compras'
from venda v 
inner join cliente c on c.id = v.id_cliente
group by c.id, v.id_cliente 
order by c.nome;

select * from venda v where id_cliente = 1;
select * from cliente where id = 9;


-- saber quantas vezes um cliente comprou em um determinado fornecedor

select f.id, count(codigo_venda)
from   venda v 
inner join fornecedor f on f.id = v.id_cliente 
group by f.id, v.id_cliente 
order by id_cliente, id_fornecedor ;


select * from fornecedor f ;
select * from cliente c ;
select id_cliente from venda v ;

-- OR

select c.id as 'codigo interno', 
        c.nome as 'Cliente',
        id_fornecedor,
        count(id_fornecedor) 'qtde de compra em de cada fornecedor'
from     venda v
inner join cliente c on c.id = v.id_cliente
 -- where id_cliente  = 1
group by id_fornecedor, id_cliente
order by id_cliente;

-- OR

select     c.id as 'Codigo cliente',
        c.nome as 'Nome cliente',
        count(codigo_venda) as 'Qtd compras',
        f.id as 'Codigo Fornecedor',
        f.nome as 'Nome fornecedor'
from     venda v 
inner join fornecedor f on v.id_fornecedor = f.id
inner join cliente c on c.id = v.id_cliente 
group by c.id, v.id_fornecedor 
order by id_cliente, id_fornecedor ;


#UCASE - maiuscula / lCASE - minuscula
select  nome, UCASE(nome) 'as', lCASE(nome)'ds' 
from cliente;

--                 ALICIO                alicio
select UCASE('alicio') 'as', lCASE('ALICIO')'ds';

#procedures - procedimentos

-- sintaxe
delimiter $$
create procedure nome(in p_1 int, in p_2 int, in p_3 int, out p_1 int)
begin
	-- aqui vai a regra de negocio
end
delimiter;

alter table venda add column vl_comissao float(5,2);

delimiter $$

create procedure gerar_comissao(in data_inicial date,     -- parametro de entrada

                                in data_final date    ,    -- parametro de entrada

                                out total_processado int) -- parametro de saida

    begin        

        

        declare venda         int default 0;

        declare total_venda float(10,2) default 0;

        declare vendedor     int default 0;

        declare    vl_comissao float(5,2) default 0;

        declare    valor_total_comissao float(10,2) default 0;

        declare aux         int default 0;

        declare fimloop     int default 0;

        

        -- declaro que o query é cursor "vai virar um laco de repeticao"

        declare buscar_pedido cursor for

        select     codigo_venda,

                total,

                id_vendedor

        from     venda v 

        where     data_venda between data_inicial and data_final

        and v.total > 0;

    



        -- Faço aqui um tratamento para o banco não 

        -- executar o loop quando ele terminar

        -- evitando que retorne qualquer erro
  		declare 

        continue handler 

        for sqlstate '02000' 

        set fimloop  = 1;   
       

        

        -- cursor É USADO PARA PERCORRER UMA LISTA igual ao for do java

        open buscar_pedido;    

            ## inicio do loop

            vendas: loop

            

            

            -- Aqui verifico que se o loop terminou

            -- e saio do loop

            if fimloop  = 1 then 

              leave  vendas;

            end if;

            

            -- atribuir o retorno do select para as variaveis abaixo

            fetch buscar_pedido into venda, total_venda, vendedor;

    

            -- busco o valor do percentual de cada vendedor

            select     n_porcvende

            into    vl_comissao 

            from     vendedor

            where     id = vendedor;

            

            if(vl_comissao > 0 ) then

                -- calcula a comissao do vendedor em cima do total buscado

                set valor_total_comissao = ((total_venda * vl_comissao) / 100);

                    

                update     venda 

                set     vl_comissao = valor_total_comissao

                where     codigo_venda = venda;

                

                commit;

            

            elseif (vl_comissao = 0 ) then

            

                update     venda 

                set     vl_comissao = 0

                where     codigo_venda = venda;

                commit;

        

            else 

                set vl_comissao = 1;

                set valor_total_comissao = ((total_venda * vl_comissao) / 100);

    

                update     venda 

                set     vl_comissao = valor_total_comissao

                where     codigo_venda = venda;

                commit;            

            

            end if;

                set vl_comissao = 0;

                -- utilizo a variável aux para contar a quantidade

                set  aux      = aux +1 ;

        end loop vendas;

                -- atribuo o total de vendas para a variável de

                -- saída

        set total_processado = aux;

        -- fecho o cursor

        close buscar_pedido;        

    end$$

delimiter ;



select * from vendedor;
select * from venda;
