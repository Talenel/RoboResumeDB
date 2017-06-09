
use ResumeInfo;

Drop table if exists Duty;
Drop table if exists Skills;
Drop table if exists Schooling;
Drop table if exists Employment;
Drop table if exists Person;



Create table Person(
persID int not null auto_increment,
persName varchar(40) unique,
email varchar(40),
primary key(persID)


);

Create table Schooling
(
degID int not null auto_increment,
persID int,
degType varchar(10),
degMajor varchar(20),
college varchar(40),
yearGrad int,

primary key(degID, persID),
foreign key(persID) references Person(persID)
);

Create table Employment
(
empID int not null auto_increment,
persID int,
title varchar(25),
startDate varchar(20),
endDate varchar(20),
company varchar(40),

primary key(empID, persID),
foreign key(persID) references Person(persID)
);

Create table Duty
(
dutyID int not null auto_increment,
empID int,
dutyDesc varchar(50),
primary key(dutyID, empID),
foreign key(empID) references Employment(empID)
);

Create table Skill
(
skillID int not null auto_increment,
persID int,
skillName varchar(20),
skillRating varchar(20),
primary key(skillID,persID),
foreign key(persID) references Person(persID)
);



