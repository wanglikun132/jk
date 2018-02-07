

/*==============================================================*/
/* Table: FINANCE_C                                             */
/*==============================================================*/
create table FINANCE_C  (
   FINANCE_ID           VARCHAR2(40)                    not null,
   INPUT_DATE           TIMESTAMP,
   INPUT_BY             VARCHAR2(30),
   STATE                INT,
   CREATE_BY            VARCHAR2(40),
   CREATE_DEPT          VARCHAR2(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_FINANCE_C primary key (FINANCE_ID)
) tablespace USERS;

comment on table FINANCE_C is
'和装箱单一对一';

comment on column FINANCE_C.STATE is
'0草稿 1已上报';

alter table FINANCE_C
   add constraint FK_FINANCE__REFERENCE_PACKING_ foreign key (FINANCE_ID)
      references PACKING_LIST_C (PACKING_LIST_ID);
