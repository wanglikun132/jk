/*==============================================================*/
/* Table: SHIPPING_ORDER_C                                      */
/*==============================================================*/
create table SHIPPING_ORDER_C  (
   SHIPPING_ORDER_ID    VARCHAR2(40)                    not null,
   ORDER_TYPE           CHAR(6),
   SHIPPER              VARCHAR2(200),
   CONSIGNEE            VARCHAR2(200),
   NOTIFY_PARTY         VARCHAR2(200),
   LC_NO                VARCHAR2(30),
   PORT_OF_LOADING      VARCHAR2(30),
   PORT_OF_TRANS        VARCHAR2(30),
   PORT_OF_DISCHARGE    VARCHAR2(30),
   LOADING_DATE         TIMESTAMP,
   LIMIT_DATE           TIMESTAMP,
   IS_BATCH             CHAR(1),
   IS_TRANS             CHAR(1),
   COPY_NUM             VARCHAR2(20),
   CNOTE                VARCHAR2(200),
   SPECIAL_CONDITION    VARCHAR2(200),
   FREIGHT              VARCHAR2(200),
   CHECK_BY             VARCHAR2(30),
   STATE                INT,
   CREATE_BY            VARCHAR2(40),
   CREATE_DEPT          VARCHAR2(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_SHIPPING_ORDER_C primary key (SHIPPING_ORDER_ID)
) tablespace USERS;

comment on table SHIPPING_ORDER_C is
'一个委托来自一个装箱';

comment on column SHIPPING_ORDER_C.SHIPPING_ORDER_ID is
'等于PACKING_LIST_ID';

comment on column SHIPPING_ORDER_C.ORDER_TYPE is
'SEA海运AIR空运';

comment on column SHIPPING_ORDER_C.IS_BATCH is
'1是0否';

comment on column SHIPPING_ORDER_C.IS_TRANS is
'1是0否';

comment on column SHIPPING_ORDER_C.STATE is
'0草稿 1已上报';

alter table SHIPPING_ORDER_C
   add constraint FK_SHIPPING_REFERENCE_PACKING_ foreign key (SHIPPING_ORDER_ID)
      references PACKING_LIST_C (PACKING_LIST_ID);
