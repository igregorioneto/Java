select CONVERT (date, GETDATE()); 
select MONTH (GETDATE()); 
select MONTH (de.nascimento) from dbo_empregado de ;
--Resposta:
select de.nome , dl.descricao
from dbo_empregado de 
inner join dbo_lotacao dl on dl.id = de.lotacaoId 
where MONTH (de.nascimento) = (select MONTH (GETDATE()));

--Resposta 2:
select * from dbo_empregado de ;
select * from dbo_lotacao dl ;
select * from dbo_folha df where df.periodo = 202009;
select * from dbo_rubrica dr ;
select * from dbo_prepara_calculo dpc ;

select dl.descricao as 'Nome da Lotação', SUM(dpc.geraFalta) as 'Quantidade Lançamento de falta'  from dbo_empregado de 
inner join dbo_lotacao dl on dl.id = de.lotacaoId 
INNER join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id 
where dpc.periodo = 202009
GROUP BY dl.descricao , dpc.geraFalta ;

select DISTINCT  dl.descricao as 'Nome da Lotação'  from dbo_empregado de 
inner join dbo_lotacao dl on dl.id = de.lotacaoId 
INNER join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id 
where dpc.periodo = 202009 and dpc.geraFalta > 25
GROUP BY dl.descricao , dpc.geraFalta ;

-- Resposta 4:
select * from dbo_calculo dc ;
select * from dbo_empregado de ;
select * from dbo_folha df where df.periodo = 202009;
select * from dbo_prepara_calculo dpc where dpc.periodo = 202010;
select DATEDIFF(year, de.admissao, GETDATE()) as 'tempo' from dbo_empregado de;

select
	CASE 
		when de.salario != null then de.salario * 0.03
		else dc.salario * 0.03
	END	as salario_usar
from dbo_empregado de 
	inner join dbo_lotacao dl on dl.id = de.lotacaoId 
	INNER join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id 
	INNER join dbo_cargo dc on dc.id = de.cargoId 
	where dpc.periodo = 202010 and DATEDIFF(year, de.admissao, GETDATE()) > '1'
	GROUP BY de.salario, de.admissao, dc.salario ;

select * from dbo_cargo dc ;

INSERT into dbo_prepara_calculo (geraGratificacao)
	select
	CASE 
		when de.salario != null then de.salario * 0.03
		else dc.salario * 0.03
	END	as salario_usar
	from dbo_empregado de 
	inner join dbo_lotacao dl on dl.id = de.lotacaoId 
	INNER join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id 
	INNER join dbo_cargo dc on dc.id = de.cargoId 
	where dpc.periodo = 202010 and DATEDIFF(year, de.admissao, GETDATE()) > '1'
	GROUP BY de.salario, de.admissao, dc.salario;


-- Resposta:
select TOP(10) de.nome ,dpc.geraComissao from 
dbo_empregado de 
inner join dbo_cargo dc on dc.id = de.cargoId
inner join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id
where dc.descricao = 'Vendedor' and dpc.periodo BETWEEN 202001 and 202006
order by dpc.geraComissao desc;


-- Resposta:
select DISTINCT (dpc.idEmpregado) , de.nome , dpc.geraGratificacao, dpc.geraFalta FROM 
dbo_empregado de 
inner join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id
where dpc.periodo = 202008 and dpc.geraGratificacao > 0;

-- Resposta:
select de.id, de.nome, dl.descricao, dpc.periodo
from dbo_calculo dc
inner join dbo_empregado de on de.id = dc.empregadoId
inner join dbo_prepara_calculo dpc on dpc.idEmpregado = de.id
inner join dbo_lotacao dl on dl.id = de.lotacaoId
inner join dbo_cargo dc2 on dc2.id = de.cargoId
where dpc.periodo = 202005;

select * from dbo_calculo dc ;










