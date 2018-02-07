
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
'��װ�䵥һ��һ';

comment on column INVOICE_C.INVOICE_ID is
'PACKING_LIST_IDֵ';

comment on column INVOICE_C.SC_NO is
'packing.getExportNos S/C���Ǳ��˵ĺ�ͬ��';

comment on column INVOICE_C.STATE is
'0�ݸ� 1���ϱ�';

alter table INVOICE_C
   add constraint FK_INVOICE__REFERENCE_PACKING_ foreign key (INVOICE_ID)
      references PACKING_LIST_C (PACKING_LIST_ID);
