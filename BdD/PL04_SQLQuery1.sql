CREATE TABLE Cliente (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    morada VARCHAR(250),
    estado BIT
);

CREATE TABLE Produto (
    id INT IDENTITY(1,1) PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    preco DECIMAL(12,2)
);

CREATE TABLE Venda (
    prod INT,
    cli INT,
    data DATETIME,
    qtd INT
    PRIMARY KEY (prod, cli, data),
    FOREIGN KEY (prod) REFERENCES Produto(id),
    FOREIGN KEY (cli) REFERENCES Cliente(id)
);

INSERT INTO Cliente (nome,morada,estado)
VALUES ('Helena Monteiro','Perafita-Freixieiro',1),
('Raul Simas','Palmela',0);

INSERT INTO Produto (descricao,preco)
VALUES ('Rato Logitec XPTO 1',10),
('Monitor Sony Vaio XPTO',120)

INSERT INTO Venda (cli,prod,qtd,data)
VALUES (1,1,1,'2012-04-05'),
(2,1,5,'2012-04-05')

UPDATE Venda
SET qtd = 10
WHERE prod=1 and cli = 2 and data='2012-04-05 00:00:00.000';

select *
from Venda

UPDATE Cliente
SET morada = 'Porto'
WHERE nome = 'Raul Simas'

UPDATE Produto
SET preco = 100
WHERE id = 2;

/* 5.a */
SELECT descricao
FROM Produto

/* 5.b */
SELECT nome
FROM Cliente
WHERE estado = 1;

/* View */
create view clientesAtivos As
SELECT nome
FROM Cliente
WHERE estado = 1;
go

select * from clientesAtivos

/* Stored Procedure */
go
create procedure alteraMorada(
@morada varchar(100), @cli int
)
as
    update Cliente
    set morada=@morada
    where id=@cli;
go

Exec alteraMorada
@morada='Porto', @cli = 2;

go

/* 5.e */
/* Stored Procedure */
go
create procedure quantasVendas( 
@cli int)
as
    select COUNT(v.cli) as contagem
    from venda v
    where v.cli=@cli
go

Exec quantasVendas @cli=2
go

/* 5.f */
/* View */
create view produtoMaisCaro As
select MAX(preco) 
from Produto
go

create view nomeProdMaisCaro As
select descricao, preco 
from Produto
where preco=(select max(preco) from Produto)
go

select * from nomeProdMaisCaro

/* 5.h */
create view clientesNuncaCompraram As
select nome 
from Cliente 
where id not in (select cli from Venda)
go

select * from clientesNuncaCompraram
go



