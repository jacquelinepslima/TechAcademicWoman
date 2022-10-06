use escola;

select * from FILHO;

select NOME,
(case when MAE_CODIGO then "Tem mãe" else "Não tem mãe"
 end),
 (case when PAI_CODIGO then "Tem pai" else "Não tem pai" end)
 from FILHO;

select f.nome as 'NOME DO FILHO',
            case when f.MAE_CODIGO is null then 'Não tem mãe' else 'Possui Mãe'
            end as 'NOME DA MAE',
            case when f.PAI_CODIGO is null then 'Não tem pai' else 'Possui Pai'
            end as 'NOME DO PAI'
from filho f
;
 
select f.nome as 'Nome do filho', m.NOME as 'Nome da mãe' 
    from filho f 
    left join mae m on f.MAE_CODIGO = m.CODIGO;
   
select f.nome as 'NOME DO FILHO', m.nome as 'NOME DA MAE', 
			case when f.PAI_CODIGO is null then 'Não tem pai'
			else p.nome end as 'NOME DO PAI'
from filho f
inner join mae m on m.CODIGO = f.MAE_CODIGO
left join pai p on p.CODIGO = f.PAI_CODIGO;
   
select count(codigo) from filho where PAI_CODIGO is null or MAE_CODIGO is null;

select p.NOME as 'Nome do pai', count(f.CODIGO) 
    from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO
   group by p.nome;
  
select f.nome as 'Nome do filho', m.NOME as 'Nome da mãe' 
    from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO order by m.NOME;

select f.nome as 'Nome do filho', m.NOME as 'Nome da mãe' 
    from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO 
    WHERE m.NOME = 'Gabriela' or m.NOME = 'Juliana';
   
select f.nome as 'Nome do filho', p.NOME as 'Nome do pai' 
    from filho f left join pai p on f.PAI_CODIGO = p.CODIGO 
    WHERE p.NOME != 'Juca' and p.NOME != 'Juliano';
   
select f.nome as 'Nome do filho', p.NOME as 'Nome do pai' 
    from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO 
    where p.NOME not in('Juca','Juliano');
   
select p.nome as 'Nome do pai' from filho f inner join pai p 
on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

select m.nome as 'Nome dos pais' from filho f inner join mae m 
on f.MAE_CODIGO = m.CODIGO  group by m.NOME having count(m.nome)>1
union 
select p.nome as 'Nome dos pais' from filho f inner join pai p 
on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

###
-- O union executa a junção dos selects com o distinct entre as tabelas
select m.nome as 'Nome dos pais' from filho f inner join mae m 
on f.MAE_CODIGO = m.CODIGO  group by m.NOME having count(m.nome)>1
union
select p.nome as 'Nome dos pais' from filho f inner join pai p 
on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

-- O union all traz todos os resultados independente das repetições
select m.nome as 'Nome dos pais' from filho f inner join mae m 
on f.MAE_CODIGO = m.CODIGO  group by m.NOME having count(m.nome)>1
union all
select p.nome as 'Nome dos pais' from filho f inner join pai p 
on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;
###

select p.nome as 'Nome do pai', m.nome as 'Nome da mãe', count(f.codigo) as 'Qtd de filhos' from filho f 
inner join mae m on m.CODIGO = f.MAE_CODIGO
inner join pai p on p.CODIGO = f.PAI_CODIGO
group by m.codigo, p.codigo
having count(f.codigo)>1;

select p.nome as 'Nome do pai', m.nome as 'Nome da mãe', count(f.codigo), 
case when count(f.codigo)=1 then 'Tem um filho'
when count(f.codigo)=2 then 'Tem um casal'
else 'Eles não dormem' end
from filho f
inner join mae m on m.CODIGO = f.MAE_CODIGO
inner join pai p on p.CODIGO = f.PAI_CODIGO
group by p.nome, m.nome;

###

select p.nome as 'Nome do pai', m.nome as 'Nome da mãe', count(f.codigo) 'Qtd', 
    case when count(f.codigo)=1 then 'Tem um filho' 
         when count(f.codigo)=2 then 'Tem um casal' 
         when count(f.codigo)=3 then 'Eles não dormem'
         else 'Eles não tem filhos' end as 'Filhos'
            from filho f inner join mae m on m.CODIGO = f.MAE_CODIGO inner join pai p on p.CODIGO = f.PAI_CODIGO
                group by p.nome, m.nome;

###

select count(codigo) from filho where mae_codigo is null and pai_codigo is null;

select count(f.codigo) from filho f 
left join mae m on m.CODIGO = f.MAE_CODIGO
where mae_codigo is null
group by m.nome;

select f.nome, p.nome from filho f
inner join pai p on p.CODIGO = f.PAI_CODIGO
where f.nome like '%ri%'
order by p.nome desc;

select nome, length(nome) as 'qt' from pai;

select * from FILHO;

insert into mae (codigo, nome) values (6, 'mae sem filho');


###
create or replace view v_mae_pai_filho as
select 	p.nome as 'pai',				
		count(f.codigo) as 'qtd_filhos_casal',
		f.nome as 'filho'		
from 	filho f
inner join pai p on f.pai_codigo = p.codigo
group by  p.nome 
having  count(f.codigo) > 1 
union all
select 	m.nome as 'mae',		
		count(f.codigo) as 'qtd_filhos_casal',
		f.nome as 'filho'
from 	filho f
inner join mae m on f.mae_codigo = m.codigo
group by  m.nome
having  count(f.codigo) > 1 ;

select * from v_mae_pai_filho;

