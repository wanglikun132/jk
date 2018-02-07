
/*==============================================================*/
/* Table: INVOICE_C                                             */
/*==============================================================*/
create table INVOICE_C  (
   INVOICE_ID           VARCHAR2(40)                    not null,
   SC_NO                VARCHAR2(100),
   BL_NO                VARCHAR2(100),
   TRADE_TERMS          VARCHAR2(100),
   STATE                INT,
   CREATE_BY            VARCHAR2(40),
   CREATE_DEPT          VARCHAR2(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_INVOICE_C primary key (INVOICE_ID)
) tablespace USERS;

comment on table INVOICE_C is
'和装箱单一对一';

comment on column INVOICE_C.INVOICE_ID is
'PACKING_LIST_ID值';

comment on column INVOICE_C.SC_NO is
'packing.getExportNos S/C就是报运的合同号';

comment on column INVOICE_C.STATE is
'0草稿 1已上报';

alter table INVOICE_C
   add constraint FK_INVOICE__REFERENCE_PACKING_ foreign key (INVOICE_ID)
      references PACKING_LIST_C (PACKING_LIST_ID);
