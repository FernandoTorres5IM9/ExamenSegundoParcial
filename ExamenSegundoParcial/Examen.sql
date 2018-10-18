create database Examen;
use Examen;

create table Info(
`id_Info` int(11) not null auto_increment,
`Nombre` varchar(45) default null,
`ApePater` varchar(45) default null,
`ApeMater` varchar(45) default null,
`Escuela` varchar(45) default null,
`MatFav` varchar(45) default null,
`DepFav` varchar(45) default null,
primary key (`id_Info`)
);

insert into Info values (1,'Fernando','Torres','Pantoja','CECyT9','Matematicas','Futbol');
insert into Info values (2,'Frida','Granados','Ranchos','CECyT9','Calculo','Basquetbol');
insert into Info values (3,'Celeste','Juarez','Garcia','CECyT9','Matematicas','Natacion');

select * from Info;