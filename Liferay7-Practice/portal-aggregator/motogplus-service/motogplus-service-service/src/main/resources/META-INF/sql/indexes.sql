create index IX_F222F977 on moto_Khaliq (name[$COLUMN_LENGTH:75$]);
create index IX_6F7A57AC on moto_Khaliq (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A8CCD92E on moto_Khaliq (uuid_[$COLUMN_LENGTH:75$], groupId);