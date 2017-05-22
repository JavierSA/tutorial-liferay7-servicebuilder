create table LIBRO_Libro (
	uuid_ VARCHAR(75) null,
	libroId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	titulo VARCHAR(75) null,
	escritor VARCHAR(75) null,
	publicacion DATE null
);