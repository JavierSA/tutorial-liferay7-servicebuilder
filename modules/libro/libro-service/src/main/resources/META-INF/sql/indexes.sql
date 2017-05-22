create index IX_413820B8 on LIBRO_Libro (titulo[$COLUMN_LENGTH:75$]);
create index IX_CDBBFF on LIBRO_Libro (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BE433641 on LIBRO_Libro (uuid_[$COLUMN_LENGTH:75$], groupId);