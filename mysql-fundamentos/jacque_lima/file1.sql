use loja;
call gerar_comissao('2015-01-01','2015-05-30' ,@a);
select @a;

select * from venda;