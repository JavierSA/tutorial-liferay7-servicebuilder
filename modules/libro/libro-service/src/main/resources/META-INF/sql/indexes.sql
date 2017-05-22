create index IX_55420C8B on LIBRO_Escritor (nombre[$COLUMN_LENGTH:75$]);
create index IX_99CED002 on LIBRO_Escritor (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_716F6F04 on LIBRO_Escritor (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_659A1525 on LIBRO_Libro (escritorId);
create index IX_413820B8 on LIBRO_Libro (titulo[$COLUMN_LENGTH:200$]);
create index IX_CDBBFF on LIBRO_Libro (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BE433641 on LIBRO_Libro (uuid_[$COLUMN_LENGTH:75$], groupId);