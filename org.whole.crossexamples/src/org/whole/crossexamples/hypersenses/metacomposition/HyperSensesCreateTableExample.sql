CREATE TABLE Project
{
  Project_ID NUMBER(10) NOT NULL,
  Name VARCHAR2(400),
  CONSTRAINT Project_PK PRIMARY KEY (Project_ID)
};


CREATE TABLE Repository
{
  Repository_ID NUMBER(10) NOT NULL,
  CONSTRAINT Repository_PK PRIMARY KEY (Repository_ID)
};

CREATE TABLE Person
{
  Person_ID NUMBER(10) NOT NULL,
  Name VARCHAR2(400),
  ProjectRole VARCHAR2(400),
  CONSTRAINT Person_PK PRIMARY KEY (Person_ID)
};

CREATE TABLE WorkItem
{
  WorkItem_ID NUMBER(10) NOT NULL,
  Opened DATE,
  Closed DATE,
  Description VARCHAR2(400),
  CONSTRAINT WorkItem_PK PRIMARY KEY (WorkItem_ID)
};

CREATE Table FileAttachement
{
  FileAttachemend_ID NUMBER(10) NOT NULL,
  Path VARCHAR2(400),
  CONSTRAINT FileAttachement_PK PRIMARY KEY(FileAttachement_ID)
};
