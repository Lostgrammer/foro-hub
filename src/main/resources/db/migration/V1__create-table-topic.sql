CREATE TABLE topic(

    user_id bigint not null auto_increment,
    nombre_curso varchar(100) not null,
    titulo varchar(100) not null,
    autor varchar(100) not null,
    fecha_creacion varchar(100) not null,
    mensaje varchar(100) not null,
    primary key(user_id)

);