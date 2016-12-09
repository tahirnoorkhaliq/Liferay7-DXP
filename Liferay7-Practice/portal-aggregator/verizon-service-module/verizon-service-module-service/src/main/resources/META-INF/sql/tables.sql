create table NC__TestServiceModule (
	uuid_ VARCHAR(75) null,
	testServiceModuleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	age INTEGER,
	profession VARCHAR(75) null,
	dob DATE null
);