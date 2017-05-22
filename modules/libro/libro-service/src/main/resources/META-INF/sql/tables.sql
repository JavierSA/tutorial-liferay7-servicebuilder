create table LIBRO_Escritor (
	uuid_ VARCHAR(75) null,
	escritorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null
);

create table LIBRO_Libro (
	uuid_ VARCHAR(75) null,
	libroId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	titulo VARCHAR(200) null,
	publicacion DATE null,
	genero VARCHAR(60) null,
	escritorId LONG
);