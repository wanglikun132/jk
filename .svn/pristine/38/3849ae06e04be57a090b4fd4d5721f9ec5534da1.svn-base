prompt PL/SQL Developer import file
prompt Created on 2014年10月21日 by Administrator
set feedback off
set define off
prompt Creating CONTRACT_C...
create table CONTRACT_C
(
  CONTRACT_ID     VARCHAR2(40) not null,
  OFFEROR         VARCHAR2(200),
  CONTRACT_NO     VARCHAR2(50),
  SIGNING_DATE    TIMESTAMP(6),
  INPUT_BY        VARCHAR2(30),
  CHECK_BY        VARCHAR2(30),
  INSPECTOR       VARCHAR2(30),
  TOTAL_AMOUNT    NUMBER(10,2),
  IMPORT_NUM      INTEGER,
  CREQUEST        VARCHAR2(2000),
  CUSTOM_NAME     VARCHAR2(200),
  DELIVERY_PERIOD TIMESTAMP(6),
  SHIP_TIME       TIMESTAMP(6),
  TRADE_TERMS     VARCHAR2(30),
  REMARK          VARCHAR2(600),
  PRINT_STYLE     CHAR(1),
  OLD_STATE       INTEGER,
  STATE           INTEGER,
  OUT_STATE       INTEGER,
  CREATE_BY       VARCHAR2(40),
  CREATE_DEPT     VARCHAR2(40),
  CREATE_TIME     TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table CONTRACT_C
  add constraint PK_CONTRACT_C primary key (CONTRACT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating CONTRACT_HIS_C...
create table CONTRACT_HIS_C
(
  CONTRACT_ID     VARCHAR2(40) not null,
  OFFEROR         VARCHAR2(200),
  CONTRACT_NO     VARCHAR2(50),
  SIGNING_DATE    TIMESTAMP(6),
  INPUT_BY        VARCHAR2(30),
  CHECK_BY        VARCHAR2(30),
  INSPECTOR       VARCHAR2(30),
  TOTAL_AMOUNT    NUMBER(10,2),
  IMPORT_NUM      INTEGER,
  CREQUEST        VARCHAR2(2000),
  CUSTOM_NAME     VARCHAR2(200),
  DELIVERY_PERIOD TIMESTAMP(6),
  SHIP_TIME       TIMESTAMP(6),
  TRADE_TERMS     VARCHAR2(30),
  REMARK          VARCHAR2(600),
  PRINT_STYLE     CHAR(1),
  OLD_STATE       INTEGER,
  STATE           INTEGER,
  OUT_STATE       INTEGER,
  CREATE_BY       VARCHAR2(40),
  CREATE_DEPT     VARCHAR2(40),
  CREATE_TIME     TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table CONTRACT_HIS_C
  add constraint PK_CONTRACT_HIS_C primary key (CONTRACT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating CONTRACT_PRODUCT_C...
create table CONTRACT_PRODUCT_C
(
  CONTRACT_PRODUCT_ID VARCHAR2(40) not null,
  CONTRACT_ID         VARCHAR2(40),
  FACTORY_ID          VARCHAR2(40),
  FACTORY_NAME        VARCHAR2(50),
  PRODUCT_NO          VARCHAR2(50),
  PRODUCT_IMAGE       VARCHAR2(200),
  PRODUCT_DESC        VARCHAR2(600),
  CNUMBER             INTEGER,
  OUT_NUMBER          INTEGER,
  LOADING_RATE        VARCHAR2(10),
  BOX_NUM             INTEGER,
  PACKING_UNIT        VARCHAR2(10),
  PRICE               NUMBER(10,2),
  AMOUNT              NUMBER(10,2),
  FINISHED            INTEGER,
  EXTS                VARCHAR2(50),
  ORDER_NO            INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table CONTRACT_PRODUCT_C
  add constraint PK_CONTRACT_PRODUCT_C primary key (CONTRACT_PRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating CONTRACT_PRODUCT_HIS_C...
create table CONTRACT_PRODUCT_HIS_C
(
  CONTRACT_PRODUCT_ID VARCHAR2(40) not null,
  CONTRACT_ID         VARCHAR2(40),
  FACTORY_ID          VARCHAR2(40),
  FACTORY_NAME        VARCHAR2(50),
  PRODUCT_NO          VARCHAR2(50),
  PRODUCT_IMAGE       VARCHAR2(200),
  PRODUCT_DESC        VARCHAR2(600),
  CNUMBER             INTEGER,
  OUT_NUMBER          INTEGER,
  LOADING_RATE        VARCHAR2(10),
  BOX_NUM             INTEGER,
  PACKING_UNIT        VARCHAR2(10),
  PRICE               NUMBER(10,2),
  AMOUNT              NUMBER(10,2),
  FINISHED            INTEGER,
  EXTS                VARCHAR2(50),
  ORDER_NO            INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table CONTRACT_PRODUCT_HIS_C
  add constraint PK_CONTRACT_PRODUCT_HIS_C primary key (CONTRACT_PRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating EXPORT_C...
create table EXPORT_C
(
  EXPORT_ID         VARCHAR2(40) not null,
  INPUT_DATE        TIMESTAMP(6),
  CONTRACT_IDS      VARCHAR2(500),
  CUSTOMER_CONTRACT VARCHAR2(200),
  LCNO              VARCHAR2(10),
  CONSIGNEE         VARCHAR2(100),
  MARKS             VARCHAR2(1000),
  REMARK            VARCHAR2(100),
  SHIPMENT_PORT     VARCHAR2(100),
  DESTINATION_PORT  VARCHAR2(100),
  TRANSPORT_MODE    VARCHAR2(10),
  PRICE_CONDITION   VARCHAR2(10),
  STATE             INTEGER,
  GROSS_WEIGHT      NUMBER(5,2),
  NET_WEIGHT        NUMBER(5,2),
  MEASUREMENT       NUMBER(8,2),
  CREATE_BY         VARCHAR2(40),
  CREATE_DEPT       VARCHAR2(40),
  CREATE_TIME       TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table EXPORT_C
  add constraint PK_EXPORT_C primary key (EXPORT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating EXPORT_PRODUCT_C...
create table EXPORT_PRODUCT_C
(
  EXPORT_PRODUCT_ID VARCHAR2(40) not null,
  EXPORT_ID         VARCHAR2(40),
  FACTORY_ID        VARCHAR2(40),
  FACTORY_NAME      VARCHAR2(50),
  PRODUCT_NO        VARCHAR2(50),
  PACKING_UNIT      VARCHAR2(10),
  CNUMBER           INTEGER,
  BOX_NUM           INTEGER,
  GROSS_WEIGHT      NUMBER(8,2),
  NET_WEIGHT        NUMBER(8,2),
  SIZE_LENGTH       NUMBER(8,2),
  SIZE_WIDTH        NUMBER(8,2),
  SIZE_HEIGHT       NUMBER(8,2),
  EX_PRICE          NUMBER(8,2),
  PRICE             NUMBER(10,2),
  TAX               NUMBER(8,2),
  ORDER_NO          INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table EXPORT_PRODUCT_C
  add constraint PK_EXPORT_PRODUCT_C primary key (EXPORT_PRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating EXT_CPRODUCT_C...
create table EXT_CPRODUCT_C
(
  EXT_CPRODUCT_ID     VARCHAR2(40) not null,
  CONTRACT_PRODUCT_ID VARCHAR2(40),
  FACTORY_ID          VARCHAR2(40),
  FACTORY_NAME        VARCHAR2(50),
  CTYPE               INTEGER,
  PRODUCT_NO          VARCHAR2(50),
  PRODUCT_IMAGE       VARCHAR2(200),
  PRODUCT_DESC        VARCHAR2(600),
  CNUMBER             INTEGER,
  PACKING_UNIT        VARCHAR2(10),
  PRICE               NUMBER(10,2),
  AMOUNT              NUMBER(10,2),
  PRODUCT_REQUEST     VARCHAR2(2000),
  ORDER_NO            INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table EXT_CPRODUCT_C
  add constraint PK_EXT_CPRODUCT_C primary key (EXT_CPRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating EXT_CPRODUCT_HIS_C...
create table EXT_CPRODUCT_HIS_C
(
  EXT_CPRODUCT_ID     VARCHAR2(40) not null,
  CONTRACT_PRODUCT_ID VARCHAR2(40),
  FACTORY_ID          VARCHAR2(40),
  FACTORY_NAME        VARCHAR2(50),
  CTYPE               INTEGER,
  PRODUCT_NO          VARCHAR2(50),
  PRODUCT_IMAGE       VARCHAR2(200),
  PRODUCT_DESC        VARCHAR2(600),
  CNUMBER             INTEGER,
  PACKING_UNIT        VARCHAR2(10),
  PRICE               NUMBER(10,2),
  AMOUNT              NUMBER(10,2),
  PRODUCT_REQUEST     VARCHAR2(2000),
  ORDER_NO            INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table EXT_CPRODUCT_HIS_C
  add constraint PK_EXT_CPRODUCT_HIS_C primary key (EXT_CPRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating EXT_EPRODUCT_C...
create table EXT_EPRODUCT_C
(
  EXT_EPRODUCT_ID   VARCHAR2(40) not null,
  EXPORT_PRODUCT_ID VARCHAR2(40),
  FACTORY_ID        VARCHAR2(40),
  FACTORY_NAME      VARCHAR2(50),
  CTYPE             INTEGER,
  PRODUCT_NO        VARCHAR2(50),
  PRODUCT_IMAGE     VARCHAR2(200),
  PRODUCT_DESC      VARCHAR2(600),
  CNUMBER           INTEGER,
  PACKING_UNIT      VARCHAR2(10),
  PRICE             NUMBER(10,2),
  AMOUNT            NUMBER(10,2),
  PRODUCT_REQUEST   VARCHAR2(2000),
  ORDER_NO          INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table EXT_EPRODUCT_C
  add constraint PK_EXT_EPRODUCT_C primary key (EXT_EPRODUCT_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating FACTORY_C...
create table FACTORY_C
(
  FACTORY_ID   VARCHAR2(40) not null,
  FULL_NAME    VARCHAR2(200),
  FACTORY_NAME VARCHAR2(50),
  CONTACTS     VARCHAR2(30),
  PHONE        VARCHAR2(20),
  MOBILE       VARCHAR2(20),
  FAX          VARCHAR2(20),
  CNOTE        VARCHAR2(2000),
  INSPECTOR    VARCHAR2(30),
  ORDER_NO     INTEGER,
  STATE        CHAR(1),
  CREATE_BY    VARCHAR2(40),
  CREATE_DEPT  VARCHAR2(40),
  CREATE_TIME  TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table FACTORY_C
  add constraint PK_FACTORY_C primary key (FACTORY_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating PACKING_LIST_C...
create table PACKING_LIST_C
(
  PACKING_LIST_ID VARCHAR2(40) not null,
  SELLER          VARCHAR2(200),
  BUYER           VARCHAR2(200),
  INVOICE_NO      VARCHAR2(30),
  INVOICE_DATE    TIMESTAMP(6),
  MARKS           VARCHAR2(200),
  DESCRIPTIONS    VARCHAR2(200),
  EXPORT_IDS      VARCHAR2(200),
  EXPORT_NOS      VARCHAR2(200),
  STATE           INTEGER,
  CREATE_BY       VARCHAR2(40),
  CREATE_DEPT     VARCHAR2(40),
  CREATE_TIME     TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table PACKING_LIST_C
  add constraint PK_PACKING_LIST_C primary key (PACKING_LIST_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating SYS_CODE_B...
create table SYS_CODE_B
(
  SYS_CODE_ID  VARCHAR2(40) not null,
  NAME         VARCHAR2(100),
  PARENT_ID    VARCHAR2(40),
  PARENT_NAME  VARCHAR2(100),
  LAYER_NUM    INTEGER,
  IS_LEAF      INTEGER,
  QUOTE_NUM    INTEGER,
  CNOTE        VARCHAR2(100),
  ICO          VARCHAR2(20),
  ORDER_NO     INTEGER,
  STATE        CHAR(1),
  CREATED_BY   VARCHAR2(40),
  CREATED_TIME TIMESTAMP(6),
  UPDATED_BY   VARCHAR2(40),
  UPDATED_TIME TIMESTAMP(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table SYS_CODE_B
  add constraint PK_SYS_CODE_B primary key (SYS_CODE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for CONTRACT_C...
alter table CONTRACT_C disable all triggers;
prompt Disabling triggers for CONTRACT_HIS_C...
alter table CONTRACT_HIS_C disable all triggers;
prompt Disabling triggers for CONTRACT_PRODUCT_C...
alter table CONTRACT_PRODUCT_C disable all triggers;
prompt Disabling triggers for CONTRACT_PRODUCT_HIS_C...
alter table CONTRACT_PRODUCT_HIS_C disable all triggers;
prompt Disabling triggers for EXPORT_C...
alter table EXPORT_C disable all triggers;
prompt Disabling triggers for EXPORT_PRODUCT_C...
alter table EXPORT_PRODUCT_C disable all triggers;
prompt Disabling triggers for EXT_CPRODUCT_C...
alter table EXT_CPRODUCT_C disable all triggers;
prompt Disabling triggers for EXT_CPRODUCT_HIS_C...
alter table EXT_CPRODUCT_HIS_C disable all triggers;
prompt Disabling triggers for EXT_EPRODUCT_C...
alter table EXT_EPRODUCT_C disable all triggers;
prompt Disabling triggers for FACTORY_C...
alter table FACTORY_C disable all triggers;
prompt Disabling triggers for PACKING_LIST_C...
alter table PACKING_LIST_C disable all triggers;
prompt Disabling triggers for SYS_CODE_B...
alter table SYS_CODE_B disable all triggers;
prompt Deleting SYS_CODE_B...
delete from SYS_CODE_B;
commit;
prompt Deleting PACKING_LIST_C...
delete from PACKING_LIST_C;
commit;
prompt Deleting FACTORY_C...
delete from FACTORY_C;
commit;
prompt Deleting EXT_EPRODUCT_C...
delete from EXT_EPRODUCT_C;
commit;
prompt Deleting EXT_CPRODUCT_HIS_C...
delete from EXT_CPRODUCT_HIS_C;
commit;
prompt Deleting EXT_CPRODUCT_C...
delete from EXT_CPRODUCT_C;
commit;
prompt Deleting EXPORT_PRODUCT_C...
delete from EXPORT_PRODUCT_C;
commit;
prompt Deleting EXPORT_C...
delete from EXPORT_C;
commit;
prompt Deleting CONTRACT_PRODUCT_HIS_C...
delete from CONTRACT_PRODUCT_HIS_C;
commit;
prompt Deleting CONTRACT_PRODUCT_C...
delete from CONTRACT_PRODUCT_C;
commit;
prompt Deleting CONTRACT_HIS_C...
delete from CONTRACT_HIS_C;
commit;
prompt Deleting CONTRACT_C...
delete from CONTRACT_C;
commit;
prompt Loading CONTRACT_C...
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33fc4e280133fd9f8b4e002f', '陕西杰信商务发展有限公司', '11JK1072', to_timestamp('20-10-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, null, 99918, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'BRISSI', to_timestamp('15-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('30-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('02-12-2011 16:31:28.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3420e78a013421a693730001', '陕西杰信商务发展有限公司', 'C/4040/11', to_timestamp('09-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '李春光', 114640, 1, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'HOME', to_timestamp('15-02-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('25-02-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('09-12-2011 16:16:29.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a353b8d8e01353d15008d0046', '陕西杰信商务发展有限公司', 'C/4104/11', to_timestamp('02-02-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, null, 37749, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'HOME', to_timestamp('15-02-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('25-02-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 'T/T', null, '2', null, 1, 0, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('02-02-2012 17:04:16.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3357462e01336d523195001a', '陕西杰信商务发展有限公司', 'C/3847/11', to_timestamp('02-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '李春光', 39240, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'HOME', to_timestamp('15-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('25-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('01-02-2012 12:18:47.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33812ffd0133813f25940001', '陕西杰信商务发展有限公司', 'C/3861/11', to_timestamp('08-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '吕晓波', 165378, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 包装：产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口；' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'HOME', to_timestamp('10-01-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('25-01-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('04-01-2012 14:22:12.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33fc4e280133fd81e7d7001d', '陕西杰信商务发展有限公司', '11JK1068', to_timestamp('14-10-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, null, 102711.8, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'ELAD', to_timestamp('15-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('30-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 0, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('02-12-2011 14:52:22.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33812ffd013382048ff80024', '陕西杰信商务发展有限公司', '11JK1082', to_timestamp('08-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '李春光', 40200, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 包装：产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口；' || chr(13) || '' || chr(10) || ' 交期：2011年12月30日/工厂。  ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'MSA', to_timestamp('30-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('15-01-2012 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('08-11-2011 17:25:18.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33812ffd0133821a8eb5002b', '陕西杰信商务发展有限公司', '11JK1084', to_timestamp('08-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '李春光', 10936, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月20日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'ONE WORLD', to_timestamp('20-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('30-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('01-12-2011 16:58:54.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33d4f8b40133d9878e88000d', '陕西杰信商务发展有限公司', '11JK1070', to_timestamp('20-10-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, null, 55789, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年11月5日/工厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', null, to_timestamp('05-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('20-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 1, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('25-11-2011 15:01:39.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33d4f8b40133d991a50d0019', '陕西杰信商务发展有限公司', '11JK1066', to_timestamp('25-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, '李春光', 146184, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月5日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', null, to_timestamp('05-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('20-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, '待样品确认后方可安排生产', '2', null, 0, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('25-11-2011 16:01:28.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into CONTRACT_C (CONTRACT_ID, OFFEROR, CONTRACT_NO, SIGNING_DATE, INPUT_BY, CHECK_BY, INSPECTOR, TOTAL_AMOUNT, IMPORT_NUM, CREQUEST, CUSTOM_NAME, DELIVERY_PERIOD, SHIP_TIME, TRADE_TERMS, REMARK, PRINT_STYLE, OLD_STATE, STATE, OUT_STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33d4f8b40133d9bea39b002f', '陕西杰信商务发展有限公司', '11JK1060', to_timestamp('25-11-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '杨丽', null, null, 152072, 3, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生成前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 'COACH HOUSE', to_timestamp('15-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), to_timestamp('30-12-2011 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null, '2', null, 0, null, 'ff80808131301abf0131303fe2e40038', '0001002', to_timestamp('02-12-2011 11:41:10.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
commit;
prompt 11 records loaded
prompt Loading CONTRACT_HIS_C...
prompt Table is empty
prompt Loading CONTRACT_PRODUCT_C...
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a590023', '4028817a3357462e01336d523195001a', '7', '天顺', '9227/6092', '0ffed7a5-6fd6-4b36-9387-7108bb408fdf.png', '海星盘，喷紫色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：30CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '包装包裹，中间垫隔板' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 408, 0, '4/8', 51, 'PCS', 11, 4488, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0036', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK018/J859100826', 'undefined', '套4全明料香槟杯，口部描2.5CM宽白金边' || chr(13) || '' || chr(10) || '尺寸：4.7X26.5CM高' || chr(13) || '' || chr(10) || '1套/五层内盒         6套/大箱', 300, 0, '1/6', 50, 'SETS', 40, 12000, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0037', '4028817a33d4f8b40133d9bea39b002f', '3', '会龙', 'JK041/JK1060339', 'undefined', '全明料蒙古包糖缸' || chr(13) || '' || chr(10) || '尺寸：9X11CM高' || chr(13) || '' || chr(10) || '1只/五层内盒          24只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包装', 3000, 0, '1/24', 125, 'PCS', 4, 12000, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0038', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK020/J859100825', 'undefined', '套4全明料马丁尼，口部描2.5CM白金边' || chr(13) || '' || chr(10) || '尺寸：11.8X20CM高' || chr(13) || '' || chr(10) || '1套/五层内盒           4套/大箱', 300, 0, '1/4', 75, 'SETS', 70, 21000, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33f7960d0133f8d912ba0005', '4028817a33812ffd0133821a8eb5002b', '9', '华艺', 'JK110102', null, '全明料钻石盘子' || chr(13) || '' || chr(10) || '盘子尺寸：29.5X11.5CM' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂', 150, 0, '1/2', 38, 'PCS', 10, 1500, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33f7960d0133f8d912ba0006', '4028817a33812ffd0133821a8eb5002b', '9', '华艺', 'JK110101', null, '全明料钻石盘子' || chr(13) || '' || chr(10) || '盘子尺寸：23X11.5CM' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂', 152, 0, '1/4', 38, 'PCS', 8.5, 1292, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b002b', '4028817a33d4f8b40133d991a50d0019', '9', '华艺', 'JK103209/JK209', null, '全明料2层钻石蛋糕盘，配喷塑铁架' || chr(13) || '' || chr(10) || '铁架我司供' || chr(13) || '' || chr(10) || '大盘尺寸：33X2.5CM' || chr(13) || '' || chr(10) || '小盘尺寸：21X2.5CM' || chr(13) || '' || chr(10) || '1套/内盒    6套/大箱', 1200, 0, '1/6', 200, 'SETS', 13, 15600, 0, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b002c', '4028817a33d4f8b40133d991a50d0019', '9', '华艺', 'JK1031007-LP/JK007/1', null, '全明料钻石蛋糕盘，粘底座' || chr(13) || '' || chr(10) || '尺寸：30X11.5CM高' || chr(13) || '' || chr(10) || '1只/白盒    4只/大箱' || chr(13) || '' || chr(10) || '白盒我司供', 600, 0, '1/4', 150, 'PCS', 10.5, 6300, 0, null, 13);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b002d', '4028817a33d4f8b40133d991a50d0019', '1', '宏艺', 'JK1050128/JK0128', null, '全明料三层糖缸，刻麦穗花' || chr(13) || '' || chr(10) || '尺寸：12X22.5CM' || chr(13) || '' || chr(10) || '1套/白盒    8套/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 600, 0, '1/8', 75, 'SETS', 18.5, 11100, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b002e', '4028817a33d4f8b40133d991a50d0019', '2', '光华', 'JK103176/JK176', null, '全明料糖缸，刻花，不带盖子' || chr(13) || '' || chr(10) || '尺寸：20X14.5CM高' || chr(13) || '' || chr(10) || '1只/白盒    4只/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 480, 0, '1/4', 120, 'PCS', 18.5, 8880, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0030', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK1050806/JK032', 'undefined', '套6全明料香槟杯，电镀渐变色' || chr(13) || '' || chr(10) || '尺寸：5.7X25CM高' || chr(13) || '' || chr(10) || '1套/五层内盒           4套/大箱', 320, 0, '1/4', 80, 'SETS', 31.8, 10176, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0031', '4028817a33d4f8b40133d9bea39b002f', '4', '精艺', 'JK045/JK1060426', 'undefined', '套6紫色碗明挺底香槟杯' || chr(13) || '' || chr(10) || '尺寸：8X17CM高' || chr(13) || '' || chr(10) || '1套/五层内盒          4套/大箱', 240, 0, '1/4', 60, 'SETS', 33.6, 8064, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0032', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK1050807/JK033', 'undefined', '套6全明料酒杯，电镀渐变色' || chr(13) || '' || chr(10) || '尺寸：8X24CM高' || chr(13) || '' || chr(10) || '1套/五层内盒          2套/大箱', 300, 0, '1/2', 150, 'SETS', 34.8, 10440, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0033', '4028817a33d4f8b40133d9bea39b002f', '4028817a33d4f8b40133d9989f5e0024', '民鑫', 'JK040/JK1060338', 'undefined', '全明料机压竖棱糖缸' || chr(13) || '' || chr(10) || '尺寸：15.5X15.5CM' || chr(13) || '' || chr(10) || '1只/内盒           12只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包装', 3000, 0, '1/12', 250, 'PCS', 8.04, 24120, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0034', '4028817a33d4f8b40133d9bea39b002f', '4', '精艺', 'JK044/JK1060425', 'undefined', '套6紫色碗明挺底红酒杯' || chr(13) || '' || chr(10) || '尺寸：8X20CM高' || chr(13) || '' || chr(10) || '1套/五层内盒           4套/大箱', 240, 0, '1/4', 60, 'SETS', 34.8, 8352, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fcdb13f4000e', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK052/JK1070691', null, '套4全明料马丁尼' || chr(13) || '' || chr(10) || '尺寸：12.5X19.5CM高' || chr(13) || '' || chr(10) || '1套/五层内盒          4套/大箱', 300, 0, '1/4', 75, 'SETS', 30, 9000, 0, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d523195001b', '4028817a3357462e01336d523195001a', '7', '天顺', '8708/6203', '1bab511c-4f4c-4de7-8b65-4ccdcd00a569.png', '怪虫小碗，喷紫色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：18CM' || chr(13) || '' || chr(10) || '4只/内盒           8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包裹，大箱用胶带纸工字封口', 600, 0, '4/8', 75, 'PCS', 6.5, 3900, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a59001c', '4028817a3357462e01336d523195001a', '7', '天顺', '9749/6525', '143a4aa8-894d-4226-a461-eac712567360.png', '怪虫碗，喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：18CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包装' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口；', 600, 0, '4/8', 75, 'PCS', 6.5, 3900, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a59001d', '4028817a3357462e01336d523195001a', '7', '天顺', '9226/6116', 'fcf3f5a9-a405-4f33-abb9-f317c60f1453.png', '海星盘，喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：31CM' || chr(13) || '' || chr(10) || '4只/内盒             8只/大箱' || chr(13) || '' || chr(10) || '白纸包装，中间垫隔板' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口；', 408, 0, '4/8', 51, 'PCS', 11, 4488, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a59001e', '4028817a3357462e01336d523195001a', '7', '天顺', '9748/6115', '657ac46a-bd23-4a2d-9abe-c552a8fc3727.png', '海星盘，喷蓝色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：31CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '白纸包裹，中间垫隔板' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口；', 408, 0, '4/8', 51, 'PCS', 11, 4488, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a59001f', '4028817a3357462e01336d523195001a', '7', '天顺', '9956/6308', '1ca7fc1c-aad2-4f1e-8c3b-9a1009e22c04.png', '竹节碗，喷蓝色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：31CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包裹' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 408, 0, '4/8', 51, 'PCS', 11.5, 4692, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a590020', '4028817a3357462e01336d523195001a', '7', '天顺', '9954/6309', '1e15e517-af2a-45c9-8c1e-1f1b592f5f79.png', '竹节碗，喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：31CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包裹' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 408, 0, '4/8', 51, 'PCS', 11.5, 4692, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a590021', '4028817a3357462e01336d523195001a', '7', '天顺', '8709/6204', '1a6770a7-033c-4b98-9e2a-60cd2a5081c3.png', '怪虫小碗，喷蓝色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：18CM' || chr(13) || '' || chr(10) || '4只/内盒          8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包装，大箱用胶带纸工字封口；', 600, 0, '4/8', 75, 'PCS', 6.5, 3900, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3357462e01336d5e8a590022', '4028817a3357462e01336d523195001a', '7', '天顺', '9955/6105', '15c6d6ad-3608-4d73-83f3-23f605123b90.png', '竹节碗，喷紫色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '直径：31CM' || chr(13) || '' || chr(10) || '4只/内盒            8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包裹' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口；', 408, 0, '4/8', 51, 'PCS', 11.5, 4692, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9bea39b0035', '4028817a33d4f8b40133d9bea39b002f', '1', '宏艺', 'JK019/J859100824', 'undefined', '套4全明料酒杯，口部描2.5CM宽白金边' || chr(13) || '' || chr(10) || '尺寸：8.4X22CM高' || chr(13) || '' || chr(10) || '1套/五层内盒     4套/大箱', 320, 0, '1/4', 80, 'SETS', 58, 18560, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fcdb13f4000f', '4028817a33d4f8b40133d9bea39b002f', '5', '汇越', 'JK050/JK1070690', null, '套4全明料白酒杯，钻石挺' || chr(13) || '' || chr(10) || '尺寸：8.6X23CM高' || chr(13) || '' || chr(10) || '1套/五层内盒            4套/大箱', 300, 0, '1/4', 75, 'SETS', 23.2, 6960, 0, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c1001d', '4028817a3420e78a013421a693730001', '2', '光华', '844MA', '19dd24a2-4eb2-4273-a46a-229d28aeee85.png', '全明料糖缸带盖子' || chr(13) || '' || chr(10) || '盖子：9.3X13.3CM高 壁厚3MM' || chr(13) || '' || chr(10) || '身子：10.5X28.4CM(全高)' || chr(13) || '' || chr(10) || '底径：13CM   壁厚不小于3MM' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒 4只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供' || chr(13) || '' || chr(10) || '此单数量出自C/3908/11', 600, 600, '1/4', 150, 'PCS', 16, 9600, 1, null, 24);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e53b8c001e', '4028817a3420e78a013421a693730001', '2', '光华', '9868', '6bf2fdf5-6d7e-4147-b40c-6eddf95abcd8.png', '全明料喇叭底糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：5-1/4"X17"H' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒 2只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供' || chr(13) || '' || chr(10) || '从数量出自订单C/3908/11', 600, 600, '1/2', 300, 'PCS', 16, 9600, 1, null, 29);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d0047', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5089', '2c991b9e-a14b-4f37-a2ca-5e7d01cba021.jpg', '全明料冰花风灯，电镀花银喷紫色。' || chr(13) || '' || chr(10) || '尺寸:12.5*20 CM H' || chr(13) || '' || chr(10) || '1只/五层内盒        6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 204, 204, '1/6', 34, 'PCS', 13, 2652, 1, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d0048', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5094', '7ae1ccaa-426b-4476-bc6a-28258d735fbd.jpg', '全明料冰花风灯，粘电镀底座  ' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 150, 150, '1/6', 25, 'PCS', 14.5, 2175, 1, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d0049', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5093', '796ec9af-d6bb-4511-a6c6-6d75bcc1f2e3.jpg', '全明料冰花风灯粘电镀底座， ' || chr(9) || '' || chr(13) || '' || chr(10) || '喷紫色，全喷，内电镀花银' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 102, 102, '1/6', 17, 'PCS', 16, 1632, 1, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004a', '4028817a353b8d8e01353d15008d0046', '7', '天顺', '5099', '9586c248-7796-4f99-b648-f913e65250f3.jpg', '全明料钻石蛋糕盘粘底座' || chr(9) || '' || chr(13) || '' || chr(10) || '喷蓝色，喷漆,喷珠光' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      4只/大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 152, 152, '1/4', 38, 'PCS', 11, 1672, 1, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004b', '4028817a353b8d8e01353d15008d0046', '7', '天顺', '5098', 'bb0e509f-ccb0-44f4-8320-df18ff6ac880.jpg', '全明料钻石蛋糕盘粘底座' || chr(9) || '' || chr(13) || '' || chr(10) || '喷紫色，喷漆,喷珠光' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      4只/大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 152, 152, '1/4', 38, 'PCS', 11, 1672, 1, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004c', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5090', '2ec05114-5c74-4211-b254-4d979218c05e.jpg', '全明料冰花风灯粘电镀底座， ' || chr(9) || '' || chr(13) || '' || chr(10) || '喷蓝色，全喷，内电镀花银' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 102, 102, '1/6', 17, 'PCS', 16, 1632, 1, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004d', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5088', '9488192b-fb0f-4aa5-9e29-86de71d05675.jpg', '全明料冰花风灯，电镀花银喷蓝色。' || chr(13) || '' || chr(10) || '尺寸:12.5*20 CM H' || chr(13) || '' || chr(10) || '1只/五层内盒        6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 204, 204, '1/6', 34, 'PCS', 13, 2652, 1, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004e', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5092', '289d254d-0f0d-4671-9376-d04cc36540d2.jpg', '全明料冰花风灯粘电镀底座， ' || chr(9) || '' || chr(13) || '' || chr(10) || '喷绿色，全喷，内电镀花银' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 102, 102, '1/6', 17, 'PCS', 16, 1632, 1, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d004f', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5095', '01349ede-bef9-4168-a346-e109e3111773.jpg', '全明料冰花风灯，粘明料底座 ' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒    6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 150, 150, '1/6', 25, 'PCS', 14, 2100, 1, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fcdb13f40010', '4028817a33d4f8b40133d9bea39b002f', '2', '光华', 'JK046/JK1050201', null, '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩子上烤蒙砂白花纸' || chr(13) || '' || chr(10) || '距口部1CM处，花纸我司供' || chr(13) || '' || chr(10) || '罩子：15X11CM高   重量不低于485克/只' || chr(13) || '' || chr(10) || '盘子：16X23.3CM高    底径：11.8CM' || chr(13) || '' || chr(10) || '重量不低于645克/只   全高：32CM' || chr(13) || '' || chr(10) || '1套/上中下保利龙垫/内盒      6套/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供', 600, 0, '1/6', 100, 'SETS', 19, 11400, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d7001e', '4028817a33fc4e280133fd81e7d7001d', '2', '光华', '169280', null, '全明料蛋糕盘+罩子' || chr(9) || '' || chr(13) || '' || chr(10) || '距离罩子口部3CM烤字母花纸' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子尺寸：22X15CM 壁厚3MM' || chr(9) || '' || chr(13) || '' || chr(10) || '盘子尺寸：24X20.8CM高 壁厚3.5CM  ' || chr(9) || '' || chr(13) || '' || chr(10) || '底径：13.5CM  沿高：3CM ' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/上中下保丽龙垫/五层内盒 ' || chr(9) || '' || chr(13) || '' || chr(10) || '2只/大箱', 100, 0, '1/2', 50, 'SETS', 32, 3200, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d7001f', '4028817a33fc4e280133fd81e7d7001d', '1', '宏艺', 'J859102682/113860', null, '全明料糖缸，烤字母白花纸' || chr(13) || '' || chr(10) || 'STORAGE ONLY' || chr(13) || '' || chr(10) || '尺寸：9.5X23CM高 最大径：14.5CM' || chr(13) || '' || chr(10) || '1只/五层内盒       6只/大箱' || chr(13) || '' || chr(10) || '花纸我司供', 300, 0, '1/6', 50, 'PCS', 16, 4800, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70020', '4028817a33fc4e280133fd81e7d7001d', '4', '精艺', 'JK1080435', null, '全明料球形瓶子，刻花，描亮油' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸:9.5X10.5CM（不含喷头高）  ' || chr(13) || '' || chr(10) || '底径：5.5CM' || chr(13) || '' || chr(10) || '1只/五层内盒    24只/五层大箱', 1008, 0, '1/24', 42, 'PCS', 9, 9072, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70021', '4028817a33fc4e280133fd81e7d7001d', '2', '光华', '123540', null, '全明料蛋糕盘子+罩子' || chr(13) || '' || chr(10) || '罩子上烤字母（HIGH TEA）花纸' || chr(13) || '' || chr(10) || '盘子尺寸：19.3X28CM高' || chr(13) || '' || chr(10) || '罩子尺寸：17X15.5CM高' || chr(13) || '' || chr(10) || '1只/上中下保利龙垫/五层内盒 ' || chr(13) || '' || chr(10) || '4只/大箱', 100, 0, '1/4', 25, 'SETS', 22, 2200, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70022', '4028817a33fc4e280133fd81e7d7001d', '3', '会龙', 'JK1052446/158080', null, '全明料酒壶，杯身烤白色字母花纸' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：7.8X22.5CM高  1400克/只' || chr(13) || '' || chr(10) || '1只/五层内盒    6只/五层大箱' || chr(13) || '' || chr(10) || '花纸我司安排', 702, 0, '1/6', 117, 'PCS', 16.5, 11583, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70023', '4028817a33fc4e280133fd81e7d7001d', 'ff808081301885760130189e47ca0013', '文水志远', '62145', null, '全明料蛋糕罩子' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸：30.3X11.5X15CM' || chr(13) || '' || chr(10) || '1只/五层内盒    8只/大箱', 504, 0, '1/8', 63, 'PCS', 27, 13608, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70024', '4028817a33fc4e280133fd81e7d7001d', 'ff808081301885760130189e47ca0013', '文水志远', '62146/F-57', null, '全明料蛋糕罩子，刻麦穗花' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸：30.3X11.5X15CM' || chr(13) || '' || chr(10) || '1只/五层内盒    8只/大箱', 504, 0, '1/8', 63, 'PCS', 28.5, 14364, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70025', '4028817a33fc4e280133fd81e7d7001d', 'ff808081301885760130189e47ca0013', '文水志远', 'JKF081342/62180', null, '全明料蛋糕罩子+盘子' || chr(13) || '' || chr(10) || '盘子我司安排' || chr(13) || '' || chr(10) || '尺寸：30.3X11.5X15CM' || chr(13) || '' || chr(10) || '1套/保丽龙/内盒    4套/大箱', 652, 0, '1/4', 163, 'SETS', 27, 17604, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70026', '4028817a33fc4e280133fd81e7d7001d', '1', '宏艺', 'JK10501218/160380', null, '全明料糖缸带盖子，糖缸身上烤' || chr(13) || '' || chr(10) || '白色字母花纸' || chr(13) || '' || chr(10) || '尺寸：12.5X22.5CM高' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '1套/五层内盒     12套/大箱' || chr(13) || '' || chr(10) || '花纸我司供', 600, 0, '1/12', 50, 'PCS', 15, 9000, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd81e7d70027', '4028817a33fc4e280133fd81e7d7001d', '1', '宏艺', 'JK1040009/141760', null, '全明料三层糖缸，烤字母花纸' || chr(13) || '' || chr(10) || '花纸我司安排' || chr(13) || '' || chr(10) || '尺寸：16.5X40CM高' || chr(13) || '' || chr(10) || '1套/五层内盒     2套/五层大箱' || chr(13) || '' || chr(10) || '花纸具体位置见我司封样', 300, 0, '1/2', 150, 'PCS', 35, 10500, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd89fcc00028', '4028817a33fc4e280133fd81e7d7001d', '7', '天顺', 'JKF081342/62180', null, '全明料蛋糕盘配罩子' || chr(13) || '' || chr(10) || '罩子由文水志远厂提供' || chr(13) || '' || chr(10) || '尺寸：33X13.5CM高' || chr(13) || '' || chr(10) || '1套/保丽龙/五层内盒 4套/大箱' || chr(13) || '' || chr(10) || '保丽龙由我司提供' || chr(13) || '' || chr(10) || '内盒，大箱由文水志远厂提供', 652, 0, '1/4', 163, 'SETS', 10.4, 6780.8, 0, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd9f8b4e0030', '4028817a33fc4e280133fd9f8b4e002f', '15', '南皮开发', 'JK1040158/12068', null, '明料灯宫细转棱蜡台' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸：6X26CM高' || chr(13) || '' || chr(10) || '4只/三层内盒      16只/大箱', 400, 0, '4/16', 25, 'PCS', 9.7, 3880, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd9f8b4e0031', '4028817a33fc4e280133fd9f8b4e002f', '2', '光华', 'JK1050317/12006', null, '明料糖缸配明料盖子' || chr(13) || '' || chr(10) || '缸身刻交叉麦穗花' || chr(13) || '' || chr(10) || '尺寸：10.5X14CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/五层大箱', 504, 0, '1/12', 42, 'PCS', 9.5, 4788, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd9f8b4e0032', '4028817a33fc4e280133fd9f8b4e002f', '2', '光华', 'JK1050316/12005', null, '明料糖缸配明料盖子' || chr(13) || '' || chr(10) || '缸身刻交叉麦穗花' || chr(13) || '' || chr(10) || '尺寸：15X15CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/五层大箱', 348, 0, '1/6', 58, 'PCS', 12.5, 4350, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fd9f8b4e0033', '4028817a33fc4e280133fd9f8b4e002f', '2', '光华', 'JK103233/11301', null, '全明料糖缸刻钻石，描亮油' || chr(13) || '' || chr(10) || '尺寸：11X30.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒    12只/大箱', 408, 0, '1/12', 34, 'PCS', 18, 7344, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133813f25a30002', '4028817a33812ffd0133813f25940001', '4', '精艺', '4993', '22.png', '全明料死模风灯，电镀花银喷绿色 ' || chr(13) || '' || chr(10) || '明料挺底' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/12', 25, 'PCS', 8.5, 2550, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133813f25a30003', '4028817a33812ffd0133813f25940001', '4', '精艺', '4994', '23.png', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '明料挺底' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/12', 25, 'PCS', 8.5, 2550, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f0037', '4028817a33fc4e280133fd9f8b4e002f', '2', '光华', 'JK1050201/12078', null, '全明料蛋糕罩配盘子,罩子上烤蒙砂白花纸' || chr(13) || '' || chr(10) || '盘子尺寸：16X13CM高' || chr(13) || '' || chr(10) || '罩子尺寸：15X11.5CM高' || chr(13) || '' || chr(10) || '全高：22CM  花纸我司供' || chr(13) || '' || chr(10) || '1套/保利龙垫/五层内盒' || chr(13) || '' || chr(10) || '6套/大箱  保利龙垫工厂供', 402, 0, '1/6', 67, 'PCS', 18, 7236, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f0038', '4028817a33fc4e280133fd9f8b4e002f', '13', '平遥鸿艺', 'JK1050198/12860', null, '全明料酒杯，' || chr(13) || '' || chr(10) || '距口部1.5CM烤蒙砂白花纸' || chr(13) || '' || chr(10) || '尺寸：11X19CM高' || chr(13) || '' || chr(10) || '4只/五层内盒       16只/大箱' || chr(13) || '' || chr(10) || '花纸我司供', 400, 0, '4/16', 25, 'PCS', 6.5, 2600, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f0039', '4028817a33fc4e280133fd9f8b4e002f', '2', '光华', 'JK169340/13076', null, '全明料蛋糕罩配盘子，罩子上烤蒙砂白花纸' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：25X26CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/保利龙垫/五层内盒' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '2套/大箱' || chr(9) || '此款样品确认后方可生产大货' || chr(9) || '' || chr(13) || '' || chr(10) || '花纸我司供，保利龙垫工厂提供', 200, 0, '1/2', 100, 'SETS', 36, 7200, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003a', '4028817a33fc4e280133fd9f8b4e002f', 'ff808081301885760130189e47ca0013', '文水志远', 'JK1400002/13077', null, '全明料竖棱酒壶，磨口抛光' || chr(13) || '' || chr(10) || '不可有碰口，棱要明显' || chr(13) || '' || chr(10) || '尺寸：10X24.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒   4只/大箱', 1200, 0, '1/4', 300, 'PCS', 13, 15600, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003b', '4028817a33fc4e280133fd9f8b4e002f', '15', '南皮开发', 'JK5100005-F/13079', null, '全明料竖棱香槟杯' || chr(13) || '' || chr(10) || '尺寸：5.5X24.5CM高' || chr(13) || '' || chr(10) || '4只/三层内盒     24只/大箱', 1200, 0, '4/24', 50, 'PCS', 10, 12000, 0, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003c', '4028817a33fc4e280133fd9f8b4e002f', '13', '平遥鸿艺', 'JK1050195/12859', null, '全明料香槟杯' || chr(13) || '' || chr(10) || '距口部1.5CM烤蒙砂白花纸' || chr(13) || '' || chr(10) || '尺寸：8X21CM高' || chr(13) || '' || chr(10) || '4只/五层内盒       16只/大箱' || chr(13) || '' || chr(10) || '花纸我司供', 400, 0, '4/16', 25, 'PCS', 6, 2400, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003d', '4028817a33fc4e280133fd9f8b4e002f', '15', '南皮开发', 'JK5100004/13078', null, '全明料直棱酒杯' || chr(13) || '' || chr(10) || '尺寸：9.5X18.5CM高' || chr(13) || '' || chr(10) || '4只/三层内盒      16只/大箱', 1200, 0, '4/16', 75, 'PCS', 8.8, 10560, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003e', '4028817a33fc4e280133fd9f8b4e002f', '15', '南皮开发', 'JK5300006/13080', null, '全明料竖棱糖缸，盖子上带圆头' || chr(13) || '' || chr(10) || '尺寸：9X8CM高' || chr(13) || '' || chr(10) || '1只/三层内盒     48只/大箱', 1200, 0, '1/48', 25, 'PCS', 8.5, 10200, 0, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fde6504f003f', '4028817a33fc4e280133fd9f8b4e002f', '15', '南皮开发', 'JK5300007/13081', null, '全明料竖棱糖缸，盖子上带圆头' || chr(13) || '' || chr(10) || '尺寸：9X12CM高' || chr(13) || '' || chr(10) || '1只/三层内盒     24只/大箱', 1200, 0, '1/24', 50, 'PCS', 9.8, 11760, 0, null, 13);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820002', '4028817a3420e78a013421a693730001', '4', '精艺', '4995', 'c7801815-993e-43f0-8ac5-d5d788f34e74.png', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '明料挺底，电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂电镀', 300, 300, '1/12', 25, 'PCS', 8.5, 2550, 1, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820003', '4028817a3420e78a013421a693730001', '4', '精艺', '4994', 'ae3e208e-8037-41dc-89d3-6727d1403c4c.png', '全明料死模风灯，电镀花银喷浅海蓝' || chr(13) || '' || chr(10) || '明料挺底,电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包装' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成厂电镀', 300, 300, '1/12', 25, 'PCS', 8.5, 2550, 1, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820004', '4028817a3420e78a013421a693730001', '4', '精艺', '4996', '09b2983e-67b1-4f42-b6ec-0efa99b90cae.png', '全明料死模风灯，电镀花银喷浅绿色' || chr(13) || '' || chr(10) || '明料挺底，电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂电镀', 300, 300, '1/6', 50, 'PCS', 10.5, 3150, 1, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820005', '4028817a3420e78a013421a693730001', '2', '光华', '5118', 'd2f2ab57-ca50-43ff-87fd-9b6b38d14adc.png', '全明料蛋糕盘+罩子' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子上烤白金字母花纸（SWEETS)' || chr(9) || '' || chr(13) || '' || chr(10) || '盘子口径16.4CM' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM  全高：26.7CM' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒 4套/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '花纸我司供，保利龙垫工厂供', 300, 300, '1/4', 75, 'SETS', 16, 4800, 1, null, 14);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820006', '4028817a3420e78a013421a693730001', '4', '精艺', '4993', '49a9221c-aa5d-42a6-997c-9671c69ebb96.png', '全明料死模风灯，电镀花银喷浅绿色 ' || chr(9) || '' || chr(13) || '' || chr(10) || '明料挺底，电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂电镀', 300, 300, '1/12', 25, 'PCS', 8.5, 2550, 1, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820007', '4028817a3420e78a013421a693730001', '2', '光华', '5117', '94744a94-9215-425c-8d7c-e6c27b74d47a.png', '全明料蛋糕盘+罩子' || chr(9) || '' || chr(13) || '' || chr(10) || '罩上烤白金字母花纸（SWEETS)' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM高' || chr(9) || '' || chr(13) || '' || chr(10) || '盘子尺寸：16.4X27CM高' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒' || chr(9) || '' || chr(13) || '' || chr(10) || '4套/大箱' || chr(9) || '保利龙垫工厂提供' || chr(13) || '' || chr(10) || '花纸我司供', 300, 300, '1/4', 75, 'SETS', 17, 5100, 1, null, 13);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820008', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5086', 'f9c8b767-01c1-47a1-816c-4203c229f765.png', '全明料冰花风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：12.5X20CM高' || chr(13) || '' || chr(10) || '1只/五层内盒    6只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹', 300, 300, '1/6', 50, 'PCS', 13, 3900, 1, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820009', '4028817a3420e78a013421a693730001', '1', '宏艺', '5190', 'b0d362a3-2044-4bb8-ad61-0d6228e94110.png', '全明料平光蛋糕罩配钻石盘子' || chr(13) || '' || chr(10) || '罩子上粘小鸟，小鸟和钻石盘我司供' || chr(13) || '' || chr(10) || '罩子尺寸：20X20.5CM高' || chr(13) || '' || chr(10) || '1套/上下保利龙盖/内盒' || chr(13) || '' || chr(10) || '4套/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供', 100, 100, '1/4', 25, 'SETS', 22, 2200, 1, null, 16);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000a', '4028817a3420e78a013421a693730001', '9', '华艺', '5190', 'de8f61ab-0ce5-4e66-862f-acc66140d77f.png', '全明料钻石蛋糕盘粘底座' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂', 100, 100, '1/4', 25, 'PCS', 8.5, 850, 1, null, 17);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000b', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5084', '4afac9ad-6f75-4186-95e2-0f3c992fd0a8.png', '全明料冰花风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：10X17.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒    12只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹', 300, 300, '1/12', 25, 'PCS', 11.5, 3450, 1, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000c', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5085', '11799ce4-7d8a-451b-8838-6b01f804b8ff.png', '全明料冰花风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：10X17.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹', 300, 300, '1/12', 25, 'PCS', 11.5, 3450, 1, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000d', '4028817a3420e78a013421a693730001', '7', '天顺', '5144', '978f44fd-492c-4209-8b4a-6dd58539a14f.png', '全明料钻石蛋糕盘粘底座' || chr(13) || '' || chr(10) || '喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      4只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 100, 100, '1/4', 25, 'PCS', 11, 1100, 1, null, 15);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000e', '4028817a3420e78a013421a693730001', '4', '精艺', '4998', '4c8991c6-227e-4c31-bcf7-539fd002cd12.png', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '明料挺底,电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成厂电镀', 300, 300, '1/6', 50, 'PCS', 10.5, 3150, 1, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a69382000f', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5088', '9926bf89-1345-4082-aeeb-a3f94d0dcc40.png', '全明料冰花风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：12.5X20CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹', 300, 300, '1/6', 50, 'PCS', 13, 3900, 1, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693820010', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5089', '22a26221-2c14-4ea4-b972-ebe9df1a27ab.png', '全明料冰花风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：12.5X20CM高' || chr(13) || '' || chr(10) || '1只/五层内盒    6只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 300, 300, '1/6', 50, 'PCS', 13, 3900, 1, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693920011', '4028817a3420e78a013421a693730001', '4', '精艺', '4997', 'f62db940-2432-4a7d-946c-22e2ba184d37.png', '全明料死模风灯，电镀花银喷浅海蓝' || chr(13) || '' || chr(10) || '明料挺底，电镀喷色我司安排' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包裹' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂电镀', 300, 300, '1/6', 50, 'PCS', 10.5, 3150, 1, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421a693920012', '4028817a3420e78a013421a693730001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5083', '65fe2446-a833-483a-ad34-dc5da6a7e28a.png', '全明料冰花风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：10X17.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/五层大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，汽泡纸包装', 300, 300, '1/12', 25, 'PCS', 11.5, 3450, 1, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421d2e3fe0013', '4028817a3420e78a013421a693730001', '4', '精艺', '5336', '422bfb7c-ad4e-4098-8953-beca57d6259c.png', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀缠，电镀喷色我司安排' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 300, 300, '1/12', 25, 'PCS', 8, 2400, 1, null, 20);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421d2e3fe0014', '4028817a3420e78a013421a693730001', '4', '精艺', '5331', 'c09ea297-bb5f-47a0-b8a0-0b4419f6e138.png', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂，我司安排电镀' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 300, 300, '1/6', 50, 'PCS', 11.5, 3450, 1, null, 19);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421d2e3fe0015', '4028817a3420e78a013421a693730001', '9', '华艺', '5190', 'aa3e7517-3227-41ff-b239-a5a6d5c00939.png', '机压小鸟,表面要光滑' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂' || chr(13) || '' || chr(10) || '请提供一定余量，以备损耗', 100, 100, '1/4', 25, 'PCS', 2.4, 240, 1, null, 18);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c10016', '4028817a3420e78a013421a693730001', '4', '精艺', '5400', 'f475d46e-733a-4220-8243-98ba76f09ddc.png', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 300, 300, '1/6', 50, 'PCS', 11.5, 3450, 1, null, 22);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c10017', '4028817a3420e78a013421a693730001', '7', '天顺', '9749', '3d52357d-71bf-4ac1-b7f0-38b640a2d349.png', '怪虫小碗，喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸:18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒        8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 600, 600, '4/8', 75, 'PCS', 6.5, 3900, 1, null, 28);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c10018', '4028817a3420e78a013421a693730001', '2', '光华', '8759', 'c5f0d6c6-275f-4fb4-b468-a9be38f85f02.png', '全明料糖缸带盖子' || chr(13) || '' || chr(10) || '尺寸：16.5X40CM高' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒 2只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供' || chr(13) || '' || chr(10) || '此数量出自订单C/3908/11', 600, 600, '1/2', 300, 'PCS', 15, 9000, 1, null, 27);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c10019', '4028817a3420e78a013421a693730001', '7', '天顺', '8709', '2720f819-b111-4aeb-b5e8-abc262dc5a7b.png', '怪虫小碗，喷蓝色，喷漆，喷珠光' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒        8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 600, 600, '4/8', 75, 'PCS', 6.5, 3900, 1, null, 26);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c1001a', '4028817a3420e78a013421a693730001', '4', '精艺', '5337', 'c2ff4999-1ea3-479d-8859-3302bb0e9d77.png', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(13) || '' || chr(10) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '1月30日送祁县瑞成电镀厂，电镀喷色我司安排' || chr(9) || '' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸包裹', 300, 300, '1/12', 25, 'PCS', 8, 2400, 1, null, 21);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c1001b', '4028817a3420e78a013421a693730001', '7', '天顺', '8708', 'cd89d279-e040-4647-a89f-59bfee1d6db9.png', '怪虫小碗，喷紫色，喷漆，喷珠光' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒        8只/大箱' || chr(13) || '' || chr(10) || '白纸，瓦楞纸，气泡纸', 600, 600, '4/8', 75, 'PCS', 6.5, 3900, 1, null, 25);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a3420e78a013421e2e3c1001c', '4028817a3420e78a013421a693730001', '2', '光华', '843MA', '6b4da997-ad8c-4101-90cb-1c554c356bb1.png', '全明料喇叭底糖缸，带盖子' || chr(9) || '' || chr(13) || '' || chr(10) || '盖子：10CMX10.3CM高 壁厚3MM' || chr(9) || '' || chr(13) || '' || chr(10) || '身子：11.2X31.7CM(全高） 底径12CM' || chr(9) || '' || chr(13) || '' || chr(10) || '壁厚不小于3MM  重量不低于950克' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒   4只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '保利龙垫工厂提供' || chr(9) || '' || chr(13) || '' || chr(10) || '此数量出自订单C/3908/11', 600, 600, '1/4', 150, 'PCS', 16, 9600, 1, null, 23);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd013382048ff80025', '4028817a33812ffd013382048ff80024', '1', '宏艺', '20-37-264/JK1051087', 'ef1348ed-d11c-4acf-ae57-4a0600e4ff0f.png', '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩子烤蒙砂白花纸，花纸我司供' || chr(13) || '' || chr(10) || '尺寸：12.3X22.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒       12只/大箱', 1200, 0, '1/12', 100, 'SETS', 9.5, 11400, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd013382048ff80026', '4028817a33812ffd013382048ff80024', '1', '宏艺', '20-37-265/JK1050163', 'e96667ee-d5e9-43d1-bac0-758593c56629.png', '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩子烤蒙砂白花纸，花纸我司供' || chr(13) || '' || chr(10) || '尺寸：13.5X29.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒       6只/大箱', 1200, 0, '1/6', 200, 'SETS', 11, 13200, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd013382048ff80027', '4028817a33812ffd013382048ff80024', '1', '宏艺', '20-37-266/JK1050164', '6b8d7276-1de9-40d8-9cf8-dabc7a8d853d.png', '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩子烤蒙砂白花纸，花纸我司供' || chr(13) || '' || chr(10) || '尺寸：14.5X33CM高' || chr(13) || '' || chr(10) || '1只/五层内盒       6只/大箱', 1200, 0, '1/6', 200, 'SETS', 13, 15600, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133821a8eb5002c', '4028817a33812ffd0133821a8eb5002b', '1', '宏艺', 'JK110102', 'e4df38d5-f0d9-4f91-99c6-240addaa36a3.png', '全明料平光蛋糕罩配钻石盘子' || chr(13) || '' || chr(10) || '罩子上粘小鸟，小鸟和钻石盘我司供' || chr(13) || '' || chr(10) || '罩子尺寸：26X36CM高' || chr(13) || '' || chr(10) || '1套/上下保利龙盖/内盒' || chr(13) || '' || chr(10) || '2套/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供', 150, 0, '1/2', 75, 'SETS', 32, 4800, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133821a8eb5002d', '4028817a33812ffd0133821a8eb5002b', '1', '宏艺', 'JK110101', 'bfd61df4-61b5-492c-b11c-7d19b63f5cf1.png', '全明料平光蛋糕罩配钻石盘子' || chr(13) || '' || chr(10) || '罩子上粘小鸟，小鸟和钻石盘我司供' || chr(13) || '' || chr(10) || '罩子尺寸：20X20.5CM高' || chr(13) || '' || chr(10) || '1套/上下保利龙盖/内盒' || chr(13) || '' || chr(10) || '4套/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供', 152, 0, '1/4', 38, 'SETS', 22, 3344, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e88000e', '4028817a33d4f8b40133d9878e88000d', '13', '平遥鸿艺', 'JK1060019/11990', 'undefined', '全明料密直棱低口杯' || chr(13) || '' || chr(10) || '尺寸：9X10.5CM高' || chr(13) || '' || chr(10) || '4只/五层内盒            24只/大箱', 696, 0, '4/24', 29, 'PCS', 5, 3480, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e88000f', '4028817a33d4f8b40133d9878e88000d', '13', '平遥鸿艺', 'JK103134/11989', 'undefined', '全明料密直棱香槟杯' || chr(13) || '' || chr(10) || '尺寸：9X21CM高' || chr(13) || '' || chr(10) || '4只/五层内盒            16只/大箱', 832, 0, '4/16', 52, 'PCS', 6, 4992, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880010', '4028817a33d4f8b40133d9878e88000d', '1', '宏艺', 'JK1050152/11306', 'undefined', '全明料酒杯，口部描1CM白金边' || chr(13) || '' || chr(10) || '尺寸：7X26CM高' || chr(13) || '' || chr(10) || '4只/五层内盒           16只/大箱', 608, 0, '4/16', 38, 'PCS', 8.5, 5168, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880011', '4028817a33d4f8b40133d9878e88000d', '2', '光华', 'JK103233/11301', 'undefined', '全明料糖缸配盖子，糖缸刻钻石描亮油' || chr(13) || '' || chr(10) || '尺寸：11X30.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒        12只/大箱', 12, 0, '1/12', 12, 'PCS', 18, 216, 0, null, 11);
commit;
prompt 100 records committed...
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880012', '4028817a33d4f8b40133d9878e88000d', '1', '宏艺', 'JK1050068/11314', 'undefined', '全明料马丁尼，口部描1CM白金边' || chr(13) || '' || chr(10) || '尺寸：12X19CM高' || chr(13) || '' || chr(10) || '4只/五层内盒           16只/大箱', 608, 0, '4/16', 38, 'PCS', 11.2, 6809.6, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880013', '4028817a33d4f8b40133d9878e88000d', '2', '光华', 'JK1050317/12006', 'undefined', '全明料糖缸配盖子，糖缸刻交叉麦穗花' || chr(13) || '' || chr(10) || '尺寸：10.5X14CM高' || chr(13) || '' || chr(10) || '1只/五层内盒          12只/大箱', 168, 0, '1/12', 14, 'PCS', 9.5, 1596, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880014', '4028817a33d4f8b40133d9878e88000d', '2', '光华', 'JK169340/13076', 'undefined', '全明料蛋糕罩配盘子，罩子烤白花纸' || chr(13) || '' || chr(10) || '尺寸：25X26CM高' || chr(13) || '' || chr(10) || '1套/上下保丽龙垫/内盒    2套/大箱' || chr(13) || '' || chr(10) || '白花纸我司供', 464, 0, '1/2', 232, 'SETS', 36, 16704, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880015', '4028817a33d4f8b40133d9878e88000d', '2', '光华', 'JK1050316/12005', 'undefined', '全明料糖缸配盖子，糖缸刻交叉麦穗花' || chr(13) || '' || chr(10) || '尺寸：15X15CM高' || chr(13) || '' || chr(10) || '1只/五层内盒        6只/大箱', 162, 0, '1/6', 27, 'PCS', 12.5, 2025, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880016', '4028817a33d4f8b40133d9878e88000d', '2', '光华', 'JK1050201/12078', 'undefined', '全明料蛋糕罩配盘子，罩子上烤花纸' || chr(13) || '' || chr(10) || '罩子尺寸：15X11.5CM高' || chr(13) || '' || chr(10) || '盘子尺寸：16X13CM高' || chr(13) || '' || chr(10) || '全高：22CM' || chr(13) || '' || chr(10) || '1套/上下保丽龙垫/内盒     6套/大箱', 204, 0, '1/6', 34, 'SETS', 18, 3672, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880017', '4028817a33d4f8b40133d9878e88000d', '1', '宏艺', 'JK1050154/11308', 'undefined', '全明料香槟杯，口部描1CM白金边' || chr(13) || '' || chr(10) || '尺寸：5X29CM高' || chr(13) || '' || chr(10) || '4只/五层内盒           16只/大箱', 704, 0, '4/16', 44, 'PCS', 7.5, 5280, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9878e880018', '4028817a33d4f8b40133d9878e88000d', '13', '平遥鸿艺', 'JK103136/11988', 'undefined', '全明料密直棱酒杯，底厚要求5MM' || chr(13) || '' || chr(10) || '尺寸：9X17.5CM高' || chr(13) || '' || chr(10) || '4只/五层内盒            16只/大箱', 928, 0, '4/16', 58, 'PCS', 6.3, 5846.4, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001a', '4028817a33d4f8b40133d991a50d0019', 'ff808081301885760130189e47ca0013', '文水志远', 'JK1040446/JK446', 'undefined', '全明料糖缸配盖子，普通底' || chr(13) || '' || chr(10) || '尺寸：16.5X50CM高' || chr(13) || '' || chr(10) || '1只/上下保丽龙垫/白盒' || chr(13) || '' || chr(10) || '2只/大箱' || chr(13) || '' || chr(10) || '保丽龙垫工厂供', 600, 0, '1/2', 300, 'PCS', 25, 15000, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001b', '4028817a33d4f8b40133d991a50d0019', '2', '光华', 'JK1040364/JK364', 'undefined', '全明料糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：19X39CM高' || chr(13) || '' || chr(10) || '1只/上下保丽龙垫/白盒' || chr(13) || '' || chr(10) || '2只/大箱' || chr(13) || '' || chr(10) || '保丽龙工厂供', 600, 0, '1/2', 300, 'PCS', 25, 15000, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001c', '4028817a33d4f8b40133d991a50d0019', '2', '光华', 'JK1050316/JK316', 'undefined', '全明料糖缸，刻麦穗花不描亮油。' || chr(13) || '' || chr(10) || '盖子电镀，电镀我司安排。' || chr(13) || '' || chr(10) || '尺寸：15X15CM 高' || chr(13) || '' || chr(10) || '1只/白盒    6只/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 600, 0, '1/6', 100, 'PCS', 12, 7200, 0, null, 2);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001d', '4028817a33d4f8b40133d991a50d0019', '1', '宏艺', 'JK1050166/JK166', 'undefined', '全明料糖缸，刻花不描亮油。' || chr(13) || '' || chr(10) || '尺寸：12.5X26.5CM高' || chr(13) || '' || chr(10) || '1只/白盒    6只/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 600, 0, '1/6', 100, 'PCS', 16, 9600, 0, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001e', '4028817a33d4f8b40133d991a50d0019', '4', '精艺', 'JK103694/JK694', 'undefined', '套6全明料死模低口杯' || chr(13) || '' || chr(10) || '尺寸：8X12.5CM高' || chr(13) || '' || chr(10) || '1套/白盒    4套/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 480, 0, '1/4', 120, 'SETS', 24, 11520, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d001f', '4028817a33d4f8b40133d991a50d0019', 'ff808081301885760130189e47ca0013', '文水志远', 'JK103956/JK956', 'undefined', '全明料蛋糕罩配盘子' || chr(13) || '' || chr(10) || '盘子我司安排' || chr(13) || '' || chr(10) || '罩子尺寸：33X14X15' || chr(13) || '' || chr(10) || '1套/保丽龙/五层内盒  2套/大箱' || chr(13) || '' || chr(10) || '2011年11月15日送天顺厂', 480, 0, '1/2', 240, 'SETS', 27, 12960, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d991a50d0020', '4028817a33d4f8b40133d991a50d0019', '4', '精艺', 'JK103693/JK693', 'undefined', '套6全明料死模低口杯' || chr(13) || '' || chr(10) || '尺寸：7.3X10.5CM高' || chr(13) || '' || chr(10) || '1套/白盒    8套/大箱' || chr(13) || '' || chr(10) || '产品用白纸、瓦纸、气泡纸包装入白盒，入大箱。大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '白盒我司供', 184, 0, '1/8', 23, 'SETS', 21, 3864, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b0029', '4028817a33d4f8b40133d991a50d0019', '9', '华艺', 'J859101549/JK549', null, '全明料蛋糕盘' || chr(13) || '' || chr(10) || '尺寸：直径33.5CM' || chr(13) || '' || chr(10) || '2只/五层内盒    8只/大箱', 1200, 0, '2/8', 150, 'PCS', 10, 12000, 0, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33d4f8b40133d9be557b002a', '4028817a33d4f8b40133d991a50d0019', '4028817a33d4f8b40133d9989f5e0024', '民鑫', 'JK1060338/JK338', null, '全明料机压直棱糖缸' || chr(13) || '' || chr(10) || '尺寸：15.5X15.5CM 高' || chr(13) || '' || chr(10) || '1只/白盒  12只/五层大箱' || chr(13) || '' || chr(10) || '白盒我司供', 2400, 0, '1/12', 200, 'PCS', 7.15, 17160, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d15008d0050', '4028817a353b8d8e01353d15008d0046', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5086', '3c77a543-f2f2-4cf3-b173-8ef1d1a1f8be.jpg', '全明料冰花风灯，电镀花银喷绿色。' || chr(13) || '' || chr(10) || '尺寸:12.5*20 CM H' || chr(13) || '' || chr(10) || '1只/五层内盒        6只/五层大箱' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 204, 204, '1/6', 34, 'PCS', 13, 2652, 1, null, 1);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0051', '4028817a353b8d8e01353d15008d0046', '2', '光华', '5117', 'aec0cd7f-795e-4c5f-b8c5-532b6479c4be.jpg', '全明料蛋糕盘+罩子' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '罩上烤白金字母花纸（SWEETS)' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '盘子尺寸：16.4X27CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒' || chr(9) || '' || chr(13) || '' || chr(10) || '4套/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '产品配套合适后用保丽龙垫包装，入内盒，大箱用胶带纸工字封口。' || chr(13) || '' || chr(10) || '花纸我司供，保利龙垫工厂供', 100, 100, '1/4', 25, 'SETS', 17, 1700, 1, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0052', '4028817a353b8d8e01353d15008d0046', '9', '华艺', '5191', '5a77aec3-1299-4b75-8ff4-5c7232d0a8c6.jpg', '机压小鸟,表面要光滑' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '请提供一定余量，以备损耗', 100, 100, '1/2', 50, 'PCS', 2.4, 240, 1, null, 19);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0053', '4028817a353b8d8e01353d15008d0046', '7', '天顺', '5144', '91d36961-2e9e-44cc-94ed-44ab4d6a24e4.jpg', '全明料钻石蛋糕盘粘底座' || chr(9) || '' || chr(13) || '' || chr(10) || '喷绿色，喷漆，喷珠光' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      4只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 152, 152, '1/4', 38, 'PCS', 11, 1672, 1, null, 13);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133813f25a30004', '4028817a33812ffd0133813f25940001', '4', '精艺', '4995', '24.png', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/12', 25, 'PCS', 8.5, 2550, 0, null, 3);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc40005', '4028817a33812ffd0133813f25940001', '2', '光华', '9868', '01.png', '全明料喇叭底糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：16X40CM高' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '泡沫垫工厂供，入内盒' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 600, 0, '1/2', 300, 'PCS', 16, 9600, 0, null, 27);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc40006', '4028817a33812ffd0133813f25940001', '7', '天顺', '5099', '14.png', '全明料钻石蛋糕盘粘底座' || chr(13) || '' || chr(10) || '喷蓝色，喷漆' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     4只/大箱', 300, 0, '1/4', 75, 'PCS', 11, 3300, 0, null, 9);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fdb370df0036', '4028817a33812ffd0133813f25940001', '7', '天顺', '9749', '19.png', '怪虫小碗喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒             8只/大箱', 304, 0, '4/8', 38, 'PCS', 6.5, 1976, 0, null, 31);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc40007', '4028817a33812ffd0133813f25940001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5094', '20.png', '全明料冰花风灯，粘电镀底座  ' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(13) || '' || chr(10) || '1只/五层内盒     6只/五层大箱', 300, 0, '1/6', 50, 'PCS', 14.5, 4350, 0, null, 7);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc40008', '4028817a33812ffd0133813f25940001', '2', '光华', '5189', '02.png', '全明料竖棱风灯，粘电镀底座' || chr(13) || '' || chr(10) || '底座由我司提供' || chr(13) || '' || chr(10) || '尺寸：20X35CM高' || chr(13) || '' || chr(10) || '1只/上下泡沫垫/内盒  4只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂供', 300, 0, '1/4', 75, 'PCS', 14, 4200, 0, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc40009', '4028817a33812ffd0133813f25940001', '4', '精艺', '5331', '25.png', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/6', 50, 'PCS', 11.5, 3450, 0, null, 13);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacc4000a', '4028817a33812ffd0133813f25940001', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5095', '21.png', '全明料冰花风灯，粘明料底座 ' || chr(13) || '' || chr(10) || '尺寸：15.8X32CM高' || chr(13) || '' || chr(10) || '1只/五层内盒    6只/五层大箱', 300, 0, '1/6', 50, 'PCS', 14, 4200, 0, null, 8);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0054', '4028817a353b8d8e01353d15008d0046', '9', '华艺', '5191', '06191cc8-a932-4f7a-a951-eabbd4336f13.jpg', '全明料钻石蛋糕盘粘底座' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：29.5X11.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂', 100, 100, '1/2', 50, 'PCS', 10, 1000, 1, null, 18);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0055', '4028817a353b8d8e01353d15008d0046', '2', '光华', '5118', 'b76467e5-21b5-4102-8085-f0d14189e257.jpg', '全明料蛋糕盘+罩子' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子上烤白金字母花纸（SWEETS)' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM ' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '盘子尺寸：16.4X16.5CM高' || chr(13) || '' || chr(10) || '全高：26.7CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒   4套/大箱' || chr(13) || '' || chr(10) || '产品配套合适后用保丽龙垫包装，入内盒，大箱用胶带纸工字封口。' || chr(9) || '' || chr(13) || '' || chr(10) || '花纸我司供，保利龙垫工厂供', 152, 152, '1/4', 38, 'SETS', 16, 2432, 1, null, 12);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0056', '4028817a353b8d8e01353d15008d0046', '9', '华艺', '5190', '9a6203d7-01b0-4ebe-bc08-d390b5ecd46a.jpg', '机压小鸟,表面要光滑' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '请提供一定余量，以备损耗', 100, 100, '1/4', 25, 'PCS', 2.4, 240, 1, null, 16);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0057', '4028817a353b8d8e01353d15008d0046', '4', '精艺', '5337', 'ecc411bc-b3ce-4175-9e96-17014661c601.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '电镀喷色我司安排' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 156, 156, '1/12', 13, 'PCS', 8, 1248, 1, null, 22);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0058', '4028817a353b8d8e01353d15008d0046', '9', '华艺', '5190', '9196fdca-db89-42a3-99d8-6a168479344c.jpg', '全明料钻石蛋糕盘粘底座' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：23X11.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '安全包装送祁县宏艺厂', 100, 100, '1/4', 25, 'PCS', 8.5, 850, 1, null, 15);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d0059', '4028817a353b8d8e01353d15008d0046', '1', '宏艺', '5190', 'a3c28393-5d85-4ab5-8f9b-c10d8becf945.jpg', '全明料平光蛋糕罩配钻石盘子' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子上粘小鸟，小鸟和钻石盘我司供' || chr(13) || '' || chr(10) || '罩子尺寸：20X20.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙盖/内盒' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '4套/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '保利龙垫工厂供' || chr(13) || '' || chr(10) || '产品用保丽龙包装后入内盒，大箱，大箱用胶带纸工字封口。', 100, 100, '1/4', 25, 'PCS', 22, 2200, 1, null, 14);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d005a', '4028817a353b8d8e01353d15008d0046', '4', '精艺', '5330', '75849bf7-f9a2-4f74-853e-baefef078d93.jpg', '全明料死模风灯，电镀花银喷紫色' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '电镀喷色我司安排' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 156, 156, '1/12', 13, 'PCS', 8, 1248, 1, null, 20);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32350d005b', '4028817a353b8d8e01353d15008d0046', '4', '精艺', '5336', '5fe32315-0fb6-4a84-bb82-61b27ef3a8e3.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '电镀喷色我司安排' || chr(13) || '' || chr(10) || '产品用白纸，瓦楞纸，气泡纸包裹后入内盒，大箱，大箱用胶带纸工字封口。', 156, 156, '1/12', 13, 'PCS', 8, 1248, 1, null, 21);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a353b8d8e01353d32353c005c', '4028817a353b8d8e01353d15008d0046', '1', '宏艺', '5191', '135fbc3e-1c1d-4188-91e0-6a54cb0e2901.jpg', '全明料平光蛋糕罩配钻石盘子' || chr(9) || '' || chr(13) || '' || chr(10) || '罩子上粘小鸟，小鸟和钻石盘我司供' || chr(13) || '' || chr(10) || '罩子尺寸：26X36CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1套/上下保利龙盖/内盒' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '2套/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '保利龙垫工厂供' || chr(13) || '' || chr(10) || '产品用保丽龙包装后入内盒，大箱，大箱用胶带纸工字封口。', 100, 100, '1/2', 50, 'PCS', 32, 3200, 1, null, 17);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4000b', '4028817a33812ffd0133813f25940001', '2', '光华', '843MA', '03.png', '全明料喇叭底糖缸，带盖子' || chr(9) || '' || chr(13) || '' || chr(10) || '盖子：10CMX10.3CM高 壁厚3MM' || chr(9) || '' || chr(13) || '' || chr(10) || '身子：11.2X31.7CM(全高） 底径12CM' || chr(9) || '' || chr(13) || '' || chr(10) || '壁厚不小于3MM  重量：950克' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒   4只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '保利龙垫工厂提供' || chr(9) || '' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 600, 0, '1/4', 150, 'PCS', 16, 9600, 0, null, 21);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4000c', '4028817a33812ffd0133813f25940001', '4', '精艺', '4997', '27.png', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/6', 50, 'PCS', 10.5, 3150, 0, null, 5);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4000d', '4028817a33812ffd0133813f25940001', '4', '精艺', '4996', '26.png', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '明料挺底' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/6', 50, 'PCS', 10.5, 3150, 0, null, 4);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4000e', '4028817a33812ffd0133813f25940001', '2', '光华', '600MA', '05.png', '全明料蛋糕盘+罩子,磨口抛光' || chr(13) || '' || chr(10) || '蛋糕罩子尺寸：17.5X15.5CM高' || chr(13) || '' || chr(10) || '蛋糕盘子尺寸：19.2X18CM高' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒   4只/大箱' || chr(13) || '' || chr(10) || '保丽龙垫工厂提供，大箱用胶带纸工字封口', 600, 0, '1/4', 150, 'SETS', 18, 10800, 0, null, 17);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4000f', '4028817a33812ffd0133813f25940001', '2', '光华', '602MA', '06.png', '全明平光蛋糕盘+罩子,磨口抛光' || chr(13) || '' || chr(10) || '蛋糕罩子尺寸：17.5X15.5CM高' || chr(13) || '' || chr(10) || '蛋糕盘子尺寸：19.2X28CM高' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂提供' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 600, 0, '1/2', 300, 'SETS', 19, 11400, 0, null, 18);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40010', '4028817a33812ffd0133813f25940001', '2', '光华', '8759', '07.png', '全明料竖棱糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：16.5X40CM高' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '泡沫垫工厂供，大箱用胶带工字封口', 600, 0, '1/2', 300, 'PCS', 15, 9000, 0, null, 25);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40011', '4028817a33812ffd0133813f25940001', '2', '光华', '6998', '04.png', '全明料蛋糕盘+蛋糕罩 ' || chr(13) || '' || chr(10) || '盘子沿电镀，罩子上珠描白金。' || chr(13) || '' || chr(10) || '尺寸：6-1/2" X 12-1/2" CM H' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒  4只/大箱' || chr(13) || '' || chr(10) || '产品用中上下泡沫垫包装入内盒，' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口。电镀我司安排，泡沫垫工厂提供。' || chr(13) || '' || chr(10) || '盘子请于12月25日送祁县喜福来厂电镀', 300, 0, '1/4', 75, 'SETS', 19, 5700, 0, null, 20);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40012', '4028817a33812ffd0133813f25940001', '2', '光华', '5118', '08.png', '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩子上烤白金字母花纸（SWEETS)' || chr(13) || '' || chr(10) || '盘子口径16.4CM' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM  全高：26.7CM' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒 4套/大箱' || chr(13) || '' || chr(10) || '花纸我司供，保利龙垫工厂供', 300, 0, '1/4', 75, 'SETS', 16, 4800, 0, null, 11);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40013', '4028817a33812ffd0133813f25940001', '7', '天顺', '8708', '15.png', '怪虫小碗，喷紫色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：18CX9CM高' || chr(13) || '' || chr(10) || '4只/内盒           8只/大箱 ' || chr(13) || '' || chr(10) || '白纸，瓦楞纸包裹', 600, 0, '1/8', 75, 'PCS', 6.5, 3900, 0, null, 23);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40014', '4028817a33812ffd0133813f25940001', '4', '精艺', '5336', '29.png', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/12', 25, 'PCS', 8, 2400, 0, null, 14);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40015', '4028817a33812ffd0133813f25940001', '4', '精艺', '5337', '28.png', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/12', 25, 'PCS', 8, 2400, 0, null, 15);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40016', '4028817a33812ffd0133813f25940001', '2', '光华', '603MA', '09.png', '全明平光蛋糕盘+罩子,磨口抛光' || chr(13) || '' || chr(10) || '蛋糕罩子尺寸：17.5X15.5CM高' || chr(13) || '' || chr(10) || '蛋糕盘子尺寸：19.2X38CM高' || chr(13) || '' || chr(10) || '此单数量出自C/1440/11' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '保丽龙垫工厂提供，大箱用胶带纸工字封口', 600, 0, '1/2', 300, 'SETS', 20, 12000, 0, null, 19);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40017', '4028817a33812ffd0133813f25940001', '2', '光华', '5117', '10.png', '全明料蛋糕盘+罩子' || chr(13) || '' || chr(10) || '罩上烤白金字母花纸（SWEETS)' || chr(13) || '' || chr(10) || '罩子尺寸：15X13CM高' || chr(13) || '' || chr(10) || '盘子尺寸：16.4X27CM高' || chr(13) || '' || chr(10) || '1套/上下保利龙垫/五层内盒' || chr(13) || '' || chr(10) || '4套/大箱' || chr(13) || '' || chr(10) || '花纸我司供', 300, 0, '1/4', 75, 'SETS', 17, 5100, 0, null, 10);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40018', '4028817a33812ffd0133813f25940001', '4', '精艺', '5400', '31.png', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/6', 50, 'PCS', 11.5, 3450, 0, null, 16);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd40019', '4028817a33812ffd0133813f25940001', '4', '精艺', '4998', '30.png', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(13) || '' || chr(10) || '电镀喷色我司安排', 300, 0, '1/6', 50, 'PCS', 10.5, 3150, 0, null, 6);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4001a', '4028817a33812ffd0133813f25940001', '2', '光华', '8760', '11.png', '全明料竖棱糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：16.5X51CM高' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '泡沫垫工厂供，大箱用胶带工字封口', 600, 0, '1/2', 300, 'PCS', 16, 9600, 0, null, 26);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4001b', '4028817a33812ffd0133813f25940001', '2', '光华', '844MA', '12.png', '全明料糖缸带盖子' || chr(13) || '' || chr(10) || '盖子：9.3X13.3CM高 壁厚3MM' || chr(13) || '' || chr(10) || '身子：10.5X28.4CM(全高)' || chr(13) || '' || chr(10) || '底径：13CM   壁厚不小于3MM' || chr(13) || '' || chr(10) || '1只/上下保利龙垫/内盒 4只/大箱' || chr(13) || '' || chr(10) || '保利龙垫工厂提供，大箱用胶带纸工字封口', 600, 0, '1/4', 150, 'PCS', 16, 9600, 0, null, 22);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4001c', '4028817a33812ffd0133813f25940001', '2', '光华', '9869', '13.png', '全明料喇叭底糖缸配盖子' || chr(13) || '' || chr(10) || '尺寸：19X40CM高' || chr(13) || '' || chr(10) || '1只/上中下泡沫垫/内盒  2只/大箱' || chr(13) || '' || chr(10) || '泡沫垫工厂供， ' || chr(13) || '' || chr(10) || '大箱用胶带纸工字封口', 600, 0, '1/2', 300, 'PCS', 16, 9600, 0, null, 28);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33812ffd0133816aacd4001d', '4028817a33812ffd0133813f25940001', '7', '天顺', '8709', '16.png', '怪虫小碗，喷蓝色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：18CMX9CM高' || chr(13) || '' || chr(10) || '4只/内盒          8只/大箱', 600, 0, '1/8', 75, 'PCS', 6.5, 3900, 0, null, 24);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fdb370c00034', '4028817a33812ffd0133813f25940001', '7', '天顺', '9749', '17.png', '怪虫小碗喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒             8只/大箱', 304, 0, '4/8', 38, 'PCS', 6.5, 1976, 0, null, 29);
insert into CONTRACT_PRODUCT_C (CONTRACT_PRODUCT_ID, CONTRACT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, OUT_NUMBER, LOADING_RATE, BOX_NUM, PACKING_UNIT, PRICE, AMOUNT, FINISHED, EXTS, ORDER_NO)
values ('4028817a33fc4e280133fdb370cf0035', '4028817a33812ffd0133813f25940001', '7', '天顺', '9749', '18.png', '怪虫小碗喷绿色，喷漆，喷珠光' || chr(13) || '' || chr(10) || '尺寸：18X9CM高' || chr(13) || '' || chr(10) || '4只/内盒             8只/大箱', 304, 0, '4/8', 38, 'PCS', 6.5, 1976, 0, null, 30);
commit;
prompt 158 records loaded
prompt Loading CONTRACT_PRODUCT_HIS_C...
prompt Table is empty
prompt Loading EXPORT_C...
insert into EXPORT_C (EXPORT_ID, INPUT_DATE, CONTRACT_IDS, CUSTOMER_CONTRACT, LCNO, CONSIGNEE, MARKS, REMARK, SHIPMENT_PORT, DESTINATION_PORT, TRANSPORT_MODE, PRICE_CONDITION, STATE, GROSS_WEIGHT, NET_WEIGHT, MEASUREMENT, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', to_timestamp('23-10-2014 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '4028817a3357462e0133591b86ec0002,4028817a3357462e01336cc0877b0010', 'C/3817/11 11JK1080', 'L/C1', '11', '41', '51', '21', '31', 'AIR', 'FOB', 2, null, null, null, null, null, null);
insert into EXPORT_C (EXPORT_ID, INPUT_DATE, CONTRACT_IDS, CUSTOMER_CONTRACT, LCNO, CONSIGNEE, MARKS, REMARK, SHIPMENT_PORT, DESTINATION_PORT, TRANSPORT_MODE, PRICE_CONDITION, STATE, GROSS_WEIGHT, NET_WEIGHT, MEASUREMENT, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('0b727c71-8d53-4b94-b1d1-18e925c50a01', null, '4028817a33812ffd0133813f25940001,4028817a3420e78a013421a693730001,4028817a353b8d8e01353d15008d0046', 'C/3861/11 C/4040/11 C/4104/11', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
insert into EXPORT_C (EXPORT_ID, INPUT_DATE, CONTRACT_IDS, CUSTOMER_CONTRACT, LCNO, CONSIGNEE, MARKS, REMARK, SHIPMENT_PORT, DESTINATION_PORT, TRANSPORT_MODE, PRICE_CONDITION, STATE, GROSS_WEIGHT, NET_WEIGHT, MEASUREMENT, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('11f83852-8811-417f-8d12-e6bb9b03670a', null, '4028817a3357462e01336d3a0be10014', '11JK1078', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
insert into EXPORT_C (EXPORT_ID, INPUT_DATE, CONTRACT_IDS, CUSTOMER_CONTRACT, LCNO, CONSIGNEE, MARKS, REMARK, SHIPMENT_PORT, DESTINATION_PORT, TRANSPORT_MODE, PRICE_CONDITION, STATE, GROSS_WEIGHT, NET_WEIGHT, MEASUREMENT, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('d6df3c32-3ff1-4120-9072-7db7fa7a7221', null, '4028817a3357462e01336cc0877b0010', '11JK1080', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
commit;
prompt 4 records loaded
prompt Loading EXPORT_PRODUCT_C...
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('e0f95727-ab55-48a6-9cfa-9b45c14d6a96', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5089', 'PCS', 300, 50, null, null, null, null, null, null, 13, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('137024a5-042f-479f-8805-0a313fd7d852', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5084', 'PCS', 300, 25, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('da62485a-a3a5-40a4-8db9-1da4c993953a', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5190', 'PCS', 100, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('cda82a57-eb55-46e2-bb22-ededb376f9af', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5117', 'SETS', 100, 25, null, null, null, null, null, null, 17, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('aef37a75-b856-4eb0-82e4-52815487e111', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5336', 'PCS', 156, 13, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('20cba979-cd73-40af-85f3-bac442991dcc', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5089', 'PCS', 204, 34, null, null, null, null, null, null, 13, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ec30e94d-424f-4113-981d-7b37d8bd2941', '11f83852-8811-417f-8d12-e6bb9b03670a', '1', '宏艺', 'JK1014005', 'PCS', 1800, 75, null, null, null, null, null, null, 5.3, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('c26d6cd2-7f4a-47cd-b209-613d50bcdfbc', '11f83852-8811-417f-8d12-e6bb9b03670a', '1', '宏艺', 'JK1080766-3', 'PCS', 1800, 75, null, null, null, null, null, null, 5.3, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('5e75fb77-33d6-4702-9b21-398fbc32b514', '11f83852-8811-417f-8d12-e6bb9b03670a', '1', '宏艺', 'JK1014006', 'PCS', 1800, 75, null, null, null, null, null, null, 5.3, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ba595324-440a-4104-a85d-b6d0f09e46e3', '11f83852-8811-417f-8d12-e6bb9b03670a', '1', '宏艺', 'JK1014001', 'PCS', 1000, 250, null, null, null, null, null, null, 16.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('55fdd3be-ee68-46f8-ad47-52444674ed54', '11f83852-8811-417f-8d12-e6bb9b03670a', '7', '天顺', 'JK1014003', 'PCS', 1200, 75, null, null, null, null, null, null, 7.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('02aedd1f-61c7-4f1e-869a-f5d0e8f21777', 'd6df3c32-3ff1-4120-9072-7db7fa7a7221', '3', '会龙', 'JK1700011', 'SETS', 504, 21, null, null, null, null, null, null, 4.6, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('2f53f581-4b6b-4eec-ac32-121f6dd12d4c', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5330', 'PCS', 156, 13, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('39edb875-7c09-4d40-ac72-37c3dbd04708', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5118', 'SETS', 152, 38, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('f6bdd7bd-4ae7-48d0-b95e-709dfd8d6838', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5337', 'PCS', 156, 13, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('184607a0-6fbd-4ad9-bf8e-bcf48bedaa31', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '5144', 'PCS', 152, 38, null, null, null, null, null, null, 11, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('0677599d-6078-4850-a296-7183060d84e4', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '5099', 'PCS', 152, 38, null, null, null, null, null, null, 11, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('7abd8f74-437a-4f5e-ae03-d624544860cf', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '1', '宏艺', '5190', 'PCS', 100, 25, null, null, null, null, null, null, 22, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('c4e9753c-a51b-4995-b01e-3e0a31702393', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5093', 'PCS', 102, 17, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('27a5f393-b6a2-4ecb-8397-6bb1b4a8cc3a', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5092', 'PCS', 102, 17, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('a084197d-b88c-4c62-814b-428146280e2f', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5190', 'PCS', 100, 25, null, null, null, null, null, null, 2.4, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('8e389ac0-a249-43b7-9dd8-59c103b6d965', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5094', 'PCS', 150, 25, null, null, null, null, null, null, 14.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('fe29a25d-5d7d-4c4f-ac56-bf43d18ba172', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5090', 'PCS', 102, 17, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('85a3cd04-bec8-4465-94b5-76c4b26bdb1f', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5086', 'PCS', 204, 34, null, null, null, null, null, null, 13, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('05de02b4-2045-4567-b59a-9d470ccfbb9e', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5095', 'PCS', 150, 25, null, null, null, null, null, null, 14, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('90ca98b7-5583-4f83-81ff-ae2a3af15060', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5190', 'PCS', 100, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('02c05fa3-f4b5-4ee7-85ec-78b31f1c51b9', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '5098', 'PCS', 152, 38, null, null, null, null, null, null, 11, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('371d506c-5211-4cfb-b2ee-169843bcdab4', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5191', 'PCS', 100, 50, null, null, null, null, null, null, 10, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('e2e7b1d5-4872-4c0c-9d19-53f972c06d16', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '1', '宏艺', '5191', 'PCS', 100, 50, null, null, null, null, null, null, 32, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('168ab200-af6c-4f3d-9412-1ddc93f25fb2', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5191', 'PCS', 100, 50, null, null, null, null, null, null, 2.4, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('74ce062d-df07-4e9a-96b7-101e24b79060', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5088', 'PCS', 204, 34, null, null, null, null, null, null, 13, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('a8dfcd10-977c-4934-b8e6-b053afd46381', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', '2', '光华', '2965', 'PCS', 144, 24, 33, 3, 4, null, null, 7, 17, 999, 1);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('8206cf71-f24e-44e9-ba59-26674669659e', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', '2', '光华', '2964', 'PCS', 144, 36, null, 2, null, null, null, null, 24, 8, 2);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('fbd73cf8-2481-4874-98d7-3a0b174efe06', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', '2', '光华', '2976', 'PCS', 144, 36, null, null, 3, null, null, null, 17, null, 3);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('255e4cac-cf47-44f7-8416-4d87b1437531', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', '2', '光华', '2977', 'PCS', 144, 72, null, null, null, 4, null, null, 17, null, 4);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('67062a63-3d47-4ad4-bd35-20657d4a4a19', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', '3', '会龙', 'JK1700011', 'SETS', 504, 21, null, null, null, null, 5, null, 4.6, null, 5);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('3f73d099-df91-4c64-a151-5fdb91fbd451', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4998', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('6a20e4cf-41c8-4a2e-a9dc-208b8447edbb', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5117', 'SETS', 300, 75, null, null, null, null, null, null, 17, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('fea293f8-7b34-49a1-b494-33e6d265ae52', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4993', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('0a87fc28-9473-4607-8a90-314bcc9ed289', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5400', 'PCS', 300, 50, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ebe39aed-9af7-4141-b5a6-324e5d47e70c', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4996', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('87c6195e-4063-45d2-9257-9d4e531ff4c1', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5336', 'PCS', 300, 25, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('a9d6c16e-785f-4d6b-b879-df857f2760b7', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4994', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('467b7db4-5ca4-455a-9b34-178de835994f', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '6998', 'SETS', 300, 75, null, null, null, null, null, null, 19, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('d8fbe029-a3fb-4c12-8b1f-bbb7be42333b', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4997', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('85b756a8-7590-4263-ba51-10c60f6ee8d1', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5118', 'SETS', 300, 75, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('0f933c1b-4473-46d6-8b2d-8bea9e2d5c47', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5337', 'PCS', 300, 25, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('db43077b-6b86-4dee-b2eb-b04761ffd67d', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5331', 'PCS', 300, 50, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('1757787a-6570-493f-a419-f859e78a9d92', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4995', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('fdd6c6b0-f349-4ab4-a88a-1255cdc99143', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '8708', 'PCS', 600, 75, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('6d18911f-86d3-4404-8003-89aff43b2d08', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '603MA', 'SETS', 600, 300, null, null, null, null, null, null, 20, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('da125df7-3345-4312-a715-76f48a22d9e7', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '5099', 'PCS', 300, 75, null, null, null, null, null, null, 11, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('8b94964b-927f-4565-8977-02d424b9bafa', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '8760', 'PCS', 600, 300, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('dd2dc3ea-3532-4b8a-8b03-85f9520524d8', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5094', 'PCS', 300, 50, null, null, null, null, null, null, 14.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('6de3e60d-9429-4c09-92d0-2aea6e55bdcf', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '602MA', 'SETS', 600, 300, null, null, null, null, null, null, 19, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('b19f0e96-1195-44f6-a02d-6000a6fa1a5a', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '8759', 'PCS', 600, 300, null, null, null, null, null, null, 15, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('af726f64-1fcb-4d52-a6cc-5f4358b0b6c5', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '843MA', 'PCS', 600, 150, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('26715775-69ec-4de5-886c-bfc86f36d865', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '844MA', 'PCS', 600, 150, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('28093552-1fda-4659-9555-366055f1f629', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '8709', 'PCS', 600, 75, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('64ec658c-9420-4985-bdf6-cd0399b652dc', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '600MA', 'SETS', 600, 150, null, null, null, null, null, null, 18, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('f5fab8b1-46c4-4616-ba30-35268ea78ac1', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '9869', 'PCS', 600, 300, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('5929fb70-070f-4742-87da-3ff948929fc7', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5189', 'PCS', 300, 75, null, null, null, null, null, null, 14, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('3af5a539-f965-4fc8-90bf-469ddd2d3c5d', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '9868', 'PCS', 600, 300, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('4a3bed16-298c-47cb-adfb-ca29ad8a3254', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '9749', 'PCS', 304, 38, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ab4399dc-665c-44b0-a955-ee30a2a54a5b', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '9749', 'PCS', 304, 38, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('08608de7-61d9-413c-b110-1634ce742243', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5095', 'PCS', 300, 50, null, null, null, null, null, null, 14, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('699eb1b1-7695-46c1-839d-1e08732ea3f4', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '9749', 'PCS', 304, 38, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('5abbca1e-3888-4fbf-800f-1562950c0a44', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5117', 'SETS', 300, 75, null, null, null, null, null, null, 17, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('975f7588-91e5-42b0-9b76-1baf843f5df5', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5337', 'PCS', 300, 25, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ee689198-ff5d-456e-b5d4-57255cd813b8', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4995', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('2eae4747-1b05-4885-bcdc-b774368bdbb6', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4996', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('de5f4d2d-d128-4e15-9d60-278e2b924591', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4993', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('b477ef8a-3a94-49e8-830a-9c4b56080283', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5331', 'PCS', 300, 50, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('adf2af9d-6b68-455e-b447-322670fde26b', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4994', 'PCS', 300, 25, null, null, null, null, null, null, 8.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('59891f8e-47e6-430b-a79c-5fc2876de52a', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4997', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('b0af860f-98ff-4c78-9de4-4a8dc5f6ac11', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '5118', 'SETS', 300, 75, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('11f986e6-9d0c-4f75-937e-01414f22ae52', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5336', 'PCS', 300, 25, null, null, null, null, null, null, 8, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('b9cb5297-a564-4112-a88f-fb2723e156e1', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '4998', 'PCS', 300, 50, null, null, null, null, null, null, 10.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('220892e3-6a9f-4699-9548-1f6423558447', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4', '精艺', '5400', 'PCS', 300, 50, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('ca426bb1-6983-4573-a0aa-94424003c999', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '9', '华艺', '5190', 'PCS', 100, 25, null, null, null, null, null, null, 2.4, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('043a081f-f06d-432e-a4be-51befcdcc7b9', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '8709', 'PCS', 600, 75, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('810988e9-8ba8-4822-9374-fea7b7cf8e8c', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '844MA', 'PCS', 600, 150, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('953be239-fbf8-40b8-936d-03ef2ecaa16d', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '9868', 'PCS', 600, 300, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('e013b8ee-e9d1-41d9-9237-6da0036c41dd', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '8759', 'PCS', 600, 300, null, null, null, null, null, null, 15, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('31cf8191-1788-49f1-9220-60d7729bc0d7', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '2', '光华', '843MA', 'PCS', 600, 150, null, null, null, null, null, null, 16, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('416971e1-7e3c-4c0d-ac91-a48f8629b741', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '5144', 'PCS', 100, 25, null, null, null, null, null, null, 11, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('38de303b-9f7d-46cf-8a45-c65c3c77476e', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '1', '宏艺', '5190', 'SETS', 100, 25, null, null, null, null, null, null, 22, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('465bc072-04da-482f-ac1d-34126c8c545e', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5086', 'PCS', 300, 50, null, null, null, null, null, null, 13, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('92d926bd-54e2-4b33-bd92-0197a6a85f05', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5083', 'PCS', 300, 25, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('263da453-a315-43c4-8694-21b9e39a14cf', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '8708', 'PCS', 600, 75, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('7bb7f525-f1cf-4fd7-8c15-b579b7b93db1', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5085', 'PCS', 300, 25, null, null, null, null, null, null, 11.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('589cb3a3-b791-47c6-9df2-302540ed7d4f', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '7', '天顺', '9749', 'PCS', 600, 75, null, null, null, null, null, null, 6.5, null, null);
insert into EXPORT_PRODUCT_C (EXPORT_PRODUCT_ID, EXPORT_ID, FACTORY_ID, FACTORY_NAME, PRODUCT_NO, PACKING_UNIT, CNUMBER, BOX_NUM, GROSS_WEIGHT, NET_WEIGHT, SIZE_LENGTH, SIZE_WIDTH, SIZE_HEIGHT, EX_PRICE, PRICE, TAX, ORDER_NO)
values ('0099fc20-c894-4313-98d8-7c5c23cf70a9', '0b727c71-8d53-4b94-b1d1-18e925c50a01', '4028817a33d4f8b40133d9989f5e0024', '民鑫', '5088', 'PCS', 300, 50, null, null, null, null, null, null, 13, null, null);
commit;
prompt 93 records loaded
prompt Loading EXT_CPRODUCT_C...
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b730027', '4028817a3420e78a013421a693820002', '4028817a33ecdbf70133ee202e49000b', null, 4, '4995', 'b232e729-a02f-48b2-987b-2c6311827816.jpg', '全明料死模风灯，电镀花银喷浅紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b730029', '4028817a3420e78a013421a693820004', '4028817a33ecdbf70133ee202e49000b', null, 4, '4996', '987692c0-6e47-4117-b6c8-3dbbeaca1b0c.jpg', '全明料死模风灯，电镀花银喷浅绿色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b73002a', '4028817a3420e78a013421a693820006', '4028817a33ecdbf70133ee202e49000b', null, 4, '4993', 'a803fa9e-dda1-476a-a822-a51b226aca39.jpg', '全明料死模风灯，电镀花银喷浅绿色 ' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b73002b', '4028817a3420e78a013421d2e3fe0014', '4028817a33ecdbf70133ee202e49000b', null, 4, '5331', '51902cb9-1650-480b-8373-2da4c3f2338b.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 7);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b73002d', '4028817a3420e78a013421a693820003', '4028817a33ecdbf70133ee202e49000b', null, 4, '4994', '05b37ddc-8904-4df3-8167-b98129c600de.jpg', '全明料死模风灯，电镀花银喷浅蓝色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cadeab80031', '4028817a3420e78a013421a693920011', '4028817a33ecdbf70133ee202e49000b', null, 4, '4997', '7dbc495e-a12c-4eec-9975-c93c1b3f4297.jpg', '全明料死模风灯，电镀花银喷浅蓝色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cadeab80037', '4028817a3420e78a013421a693820005', '19', null, 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年1月15日。', 12);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cadec6d003a', '4028817a3420e78a013421d2e3fe0013', '4028817a33ecdbf70133ee202e49000b', null, 4, '5336', 'c8350cd2-47ae-4054-ad81-70004fe4eb44.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' 尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3, 900, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 8);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fcdff5490012', '4028817a33d4f8b40133d9bea39b0032', '20', null, 4, 'JK1050807/JK033', 'undefined', '套6全明料酒杯' || chr(13) || '' || chr(10) || '杯碗电镀渐变色，挺底电镀' || chr(13) || '' || chr(10) || '尺寸：8X24CM高', 300, 'SETS', 21, 6300, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。                          没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cadec6d0042', '4028817a3420e78a013421a69382000e', '4028817a33ecdbf70133ee202e49000b', null, 4, '4998', '44fc2f77-af8a-42d3-8d9b-fa2bafa8f47a.jpg', '全明料死模风灯，电镀花银喷浅紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 6);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cadec6d0044', '4028817a3420e78a013421e2e3c10016', '4028817a33ecdbf70133ee202e49000b', null, 4, '5400', '601585a1-ba16-42bb-9ffb-d187b521be1f.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 10);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353d39f06c005d', '4028817a353b8d8e01353d32350d0051', '19', null, 2, '5117', 'aec0cd7f-795e-4c5f-b8c5-532b6479c4be.jpg', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '安全包装送祁县光华厂', 100, 'PCS', 3, 300, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年2月5日。', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353d39f06c005e', '4028817a353b8d8e01353d32350d005b', '4028817a33ecdbf70133ee202e49000b', null, 4, '5336', '4436f9d7-b0e2-4926-9cd4-f6c66333c290.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353d39f06c005f', '4028817a353b8d8e01353d32350d005a', '4028817a33ecdbf70133ee202e49000b', null, 4, '5330', 'be775015-234a-4504-ad52-af6af53d2a9c.jpg', '全明料死模风灯，电镀花银喷紫色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353d39f06c0060', '4028817a353b8d8e01353d32350d0055', '19', null, 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '安全包装送祁县光华厂', 100, 'PCS', 3, 300, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年2月5日。', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353d39f06c0061', '4028817a353b8d8e01353d32350d0057', '4028817a33ecdbf70133ee202e49000b', null, 4, '5337', '673a4e11-3706-4beb-b958-ee1d7c564b3b.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f000a', '4028817a33812ffd0133816aacd40012', '19', null, 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 600, 'PCS', 3, 1800, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月30日；', 13);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f000b', '4028817a33812ffd0133816aacd40015', '22', null, 4, '5337', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高', 300, 'PCS', 2, 600, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 9);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f000c', '4028817a33812ffd0133816aacc40009', '22', null, 4, '5331', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：17X23CM高', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 7);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f000d', '4028817a33812ffd0133813f25a30004', '22', null, 4, '4995', 'undefined', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd3200001', '4028817a33812ffd0133816aacd40019', '22', null, 4, '4998', 'undefined', '全明料死模风灯 ，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 6);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0002', '4028817a33812ffd0133816aacd40017', '19', null, 2, '5117', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月30日；', 12);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0003', '4028817a33812ffd0133813f25a30002', '22', null, 4, '4993', null, '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '毛坯1月25日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0004', '4028817a33812ffd0133816aacd40018', '22', null, 4, '5400', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：17X23CM高', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 10);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0005', '4028817a33812ffd0133816aacd4000d', '22', null, 4, '4996', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0006', '4028817a33812ffd0133816aacd40014', '22', null, 4, '5336', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高', 300, 'PCS', 2, 600, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 8);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0007', '4028817a33812ffd0133813f25a30003', '22', null, 4, '4994', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0008', '4028817a33812ffd0133816aacd40011', '20', null, 4, '6998', 'undefined', '全明料蛋糕盘，盘沿电镀' || chr(13) || '' || chr(10) || '尺寸：6-1/2"X12-1/2"高', 300, 'PCS', 6, 1800, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 11);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a343a5c9101343a6fd35f0009', '4028817a33812ffd0133816aacd4000c', '22', null, 4, '4997', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33d4f8b40133d994c45e0021', '4028817a33d4f8b40133d9878e880014', '19', null, 2, 'JK169340/13076', 'undefined', '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在蛋糕罩上' || chr(13) || '' || chr(10) || '送祁县光华厂', 464, 'PCS', 1.02, 473.28, '1.产品的颜色、造型、尺寸、务必同我司提供样稿一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日。', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33d4f8b40133d994c45e0022', '4028817a33d4f8b40133d9878e880016', '19', null, 2, 'JK1050201/12078', null, '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在蛋糕罩上' || chr(13) || '' || chr(10) || '送祁县光华厂', 204, 'PCS', .8, 163.2, '1.产品的颜色、造型、尺寸、务必同我司提供的样稿一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日送指定工厂。', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fcdff5490011', '4028817a33fc4e280133fcdb13f40010', '19', null, 2, 'JK046/JK1050201', 'undefined', '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在蛋糕罩子上' || chr(13) || '' || chr(10) || '送祁县光华厂', 600, 'PCS', .8, 480, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月15日；', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fcdff5490013', '4028817a33d4f8b40133d9bea39b0030', '20', null, 4, 'JK1050806/JK032', null, '套6全明料香槟杯' || chr(13) || '' || chr(10) || '杯碗电镀渐变色，挺底电镀' || chr(13) || '' || chr(10) || '尺寸：5.7X25CM高', 320, 'SETS', 21, 6720, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2011年12月15日/工厂。                          没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33812ffd0133820c0a460028', '4028817a33812ffd013382048ff80027', '19', null, 2, '20-37-266/JK1050164', '73be2c8a-b961-4ae9-899a-2d259ecd152b.png', '蒙砂白花纸' || chr(13) || '' || chr(10) || '配全明料蛋糕罩' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 1200, 'PCS', .4, 480, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月05日；', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33812ffd0133820c0a460029', '4028817a33812ffd013382048ff80026', '19', null, 2, '20-37-265/JK1050163', '1af851ab-98ff-4227-ba39-1175dca33c6f.png', '蒙砂白花纸' || chr(13) || '' || chr(10) || '配全明料蛋糕罩' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 1200, 'PCS', .38, 456, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月05日；', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33812ffd0133820c0a46002a', '4028817a33812ffd013382048ff80025', '19', null, 2, '20-37-264/JK1051087', 'bdf6ff59-ab4c-4218-a554-361ec409a04f.png', '蒙砂白花纸' || chr(13) || '' || chr(10) || '配全明料蛋糕罩' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 1200, 'PCS', .35, 420, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月05日；', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d0029', '4028817a33fc4e280133fd81e7d70027', '19', null, 2, 'JK1040009/141760', 'undefined', '白色字母花纸 ' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 300, 'PCS', .9, 270, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d002a', '4028817a33fc4e280133fd81e7d7001f', '19', null, 2, 'J859102682/113860', null, '白色字母花纸' || chr(13) || '' || chr(10) || 'STORAGE ONLY' || chr(13) || '' || chr(10) || '祁县宏艺厂', 300, 'PCS', .4, 120, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d002b', '4028817a33fc4e280133fd81e7d70026', '19', null, 2, 'JK10501218/160380', 'undefined', '白色字母花纸 ' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 600, 'PCS', .4, 240, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 4);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d002c', '4028817a33fc4e280133fd81e7d70021', '19', null, 2, '123540', 'undefined', '白色字母花纸(HIGH TEA)' || chr(13) || '' || chr(10) || '字体：ENGLISH SCRIPT' || chr(13) || '' || chr(10) || '尺寸：18X5.5CM' || chr(13) || '' || chr(10) || '祁县光华厂', 100, 'PCS', .3, 30, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 5);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d002d', '4028817a33fc4e280133fd81e7d70022', '19', null, 2, 'JK1052446/158080', 'undefined', '白色字母花纸' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || ' ' || chr(13) || '' || chr(10) || '祁县会龙厂', 702, 'PCS', .25, 175.5, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fd906b0d002e', '4028817a33fc4e280133fd81e7d7001e', '19', null, 2, '169280', 'undefined', '白色字母花纸(HIGH TEA)' || chr(13) || '' || chr(10) || '字体：ENGLISH SCRIPT' || chr(13) || '' || chr(10) || '尺寸：18X5.5CM' || chr(13) || '' || chr(10) || '祁县光华厂', 100, 'PCS', .3, 30, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月25日；', 6);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fded2e6d0040', '4028817a33fc4e280133fde6504f0039', '19', null, 2, 'JK169340/13076', 'undefined', '蒙砂白花纸' || chr(13) || '' || chr(10) || '"烤在蛋糕罩子上(25X26CM)' || chr(13) || '' || chr(10) || '"' || chr(13) || '' || chr(10) || '祁县光华厂', 200, 'PCS', 1.02, 204, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日', 4);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fded2e6d0041', '4028817a33fc4e280133fde6504f0038', '19', null, 2, 'JK1050198/12860', 'undefined', '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在红酒杯（11X19CM)上' || chr(13) || '' || chr(10) || '送平遥鸿艺', 400, 'PCS', .49, 196, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日', 3);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fded2e6d0042', '4028817a33fc4e280133fde6504f003c', '19', null, 2, 'JK1050195/12859', 'undefined', '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在香槟杯(8X21CM)上' || chr(13) || '' || chr(10) || '送平遥鸿艺', 400, 'PCS', .4, 160, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日', 2);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a33fc4e280133fded2e6d0043', '4028817a33fc4e280133fde6504f0037', '19', null, 2, 'JK1050201/12078', null, '蒙砂白花纸' || chr(13) || '' || chr(10) || '烤在蛋糕罩子上' || chr(13) || '' || chr(10) || '祁县光华厂', 402, 'PCS', .8, 321.6, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月20日；', 1);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b730023', '4028817a3420e78a013421a693820007', '19', null, 2, '5117', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年1月15日。', 11);
insert into EXT_CPRODUCT_C (EXT_CPRODUCT_ID, CONTRACT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4028817a353b8d8e01353cad7b730024', '4028817a3420e78a013421e2e3c1001a', '4028817a33ecdbf70133ee202e49000b', null, 4, '5337', 'e877a4e2-2e48-4b06-91a8-3fb64f150a0f.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3, 900, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 9);
commit;
prompt 48 records loaded
prompt Loading EXT_CPRODUCT_HIS_C...
prompt Table is empty
prompt Loading EXT_EPRODUCT_C...
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('2396053f-fe09-4608-858a-64bbc9dca577', '467b7db4-5ca4-455a-9b34-178de835994f', '20', '喜福来', 4, '6998', 'undefined', '全明料蛋糕盘，盘沿电镀' || chr(13) || '' || chr(10) || '尺寸：6-1/2"X12-1/2"高', 300, 'PCS', 6, 1800, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 11);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('e10e185c-a983-4c91-becf-0ced9675e87a', 'd8fbe029-a3fb-4c12-8b1f-bbb7be42333b', '22', '瑞成', 4, '4997', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('616fbff1-5af5-4852-91bb-bcc2406f48af', '85b756a8-7590-4263-ba51-10c60f6ee8d1', '19', '综艺花纸', 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 600, 'PCS', 3, 1800, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月30日；', 13);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('f519bdb4-a213-4d21-9adb-265d696f6f9f', '0f933c1b-4473-46d6-8b2d-8bea9e2d5c47', '22', '瑞成', 4, '5337', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高', 300, 'PCS', 2, 600, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 9);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('3c67b481-2ce9-4fce-b768-3aa71c7f13cc', 'db43077b-6b86-4dee-b2eb-b04761ffd67d', '22', '瑞成', 4, '5331', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：17X23CM高', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 7);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('227f611c-5859-4346-b41e-f1da45cd1c51', '1757787a-6570-493f-a419-f859e78a9d92', '22', '瑞成', 4, '4995', 'undefined', '全明料死模风灯，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('02861122-b4fd-417b-9f93-cb54c28b3f74', '5abbca1e-3888-4fbf-800f-1562950c0a44', '19', '综艺花纸', 2, '5117', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年1月15日。', 11);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('522e001a-67e2-4c7c-bc98-4db271720ace', '975f7588-91e5-42b0-9b76-1baf843f5df5', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5337', 'e877a4e2-2e48-4b06-91a8-3fb64f150a0f.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3, 900, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 9);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('b43d7572-8267-402f-85f9-22a8d51021c5', 'ee689198-ff5d-456e-b5d4-57255cd813b8', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4995', 'b232e729-a02f-48b2-987b-2c6311827816.jpg', '全明料死模风灯，电镀花银喷浅紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('b363b6fc-268a-4a9a-9263-6652044163c3', 'de5f4d2d-d128-4e15-9d60-278e2b924591', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4993', 'a803fa9e-dda1-476a-a822-a51b226aca39.jpg', '全明料死模风灯，电镀花银喷浅绿色 ' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 1);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4887ebfe-6f23-45b9-bae6-6cc7b7f7b289', 'b477ef8a-3a94-49e8-830a-9c4b56080283', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5331', '51902cb9-1650-480b-8373-2da4c3f2338b.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 7);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('301eefc9-1827-4106-809a-8dbc573bee62', 'adf2af9d-6b68-455e-b447-322670fde26b', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4994', '05b37ddc-8904-4df3-8167-b98129c600de.jpg', '全明料死模风灯，电镀花银喷浅蓝色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒     12只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 2);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('175ae95b-56dd-49b5-89b3-414c9fbf5e5c', '59891f8e-47e6-430b-a79c-5fc2876de52a', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4997', '7dbc495e-a12c-4eec-9975-c93c1b3f4297.jpg', '全明料死模风灯，电镀花银喷浅蓝色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('40e4b5f9-8587-4a49-be85-22306e5fd413', 'b0af860f-98ff-4c78-9de4-4a8dc5f6ac11', '19', '综艺花纸', 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年1月15日。', 12);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('64c0e04e-4e2b-4cec-b8f5-a9a337e2d9db', '11f986e6-9d0c-4f75-937e-01414f22ae52', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5336', 'c8350cd2-47ae-4054-ad81-70004fe4eb44.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' 尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3, 900, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 8);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('f46a6085-3b3a-4464-b589-77bf37eb813f', '2eae4747-1b05-4885-bcdc-b774368bdbb6', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4996', '987692c0-6e47-4117-b6c8-3dbbeaca1b0c.jpg', '全明料死模风灯，电镀花银喷浅绿色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('9742a1ba-4227-4401-8dc2-273b2c02f612', 'b9cb5297-a564-4112-a88f-fb2723e156e1', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '4998', '44fc2f77-af8a-42d3-8d9b-fa2bafa8f47a.jpg', '全明料死模风灯，电镀花银喷浅紫色' || chr(13) || '' || chr(10) || '明料挺底' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。毛坯送至祁县瑞成玻璃镀膜厂。 ' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 6);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('741cbd0c-149c-457a-a8ac-536f2650b8db', '220892e3-6a9f-4699-9548-1f6423558447', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5400', '601585a1-ba16-42bb-9ffb-d187b521be1f.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：17X23CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      6只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 10);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('f313a45a-82d7-4da1-b7f5-2a94ae1e82de', 'cda82a57-eb55-46e2-bb22-ededb376f9af', '19', '综艺花纸', 2, '5117', 'aec0cd7f-795e-4c5f-b8c5-532b6479c4be.jpg', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '安全包装送祁县光华厂', 100, 'PCS', 3, 300, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年2月5日。', 1);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('b82e49d5-0ef3-400a-b6ae-96de7c1f3bf4', 'aef37a75-b856-4eb0-82e4-52815487e111', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5336', '4436f9d7-b0e2-4926-9cd4-f6c66333c290.jpg', '全明料死模风灯，电镀花银喷绿色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('ee825b1f-0e5a-4c73-a31a-b71b8c767d05', '2f53f581-4b6b-4eec-ac32-121f6dd12d4c', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5330', 'be775015-234a-4504-ad52-af6af53d2a9c.jpg', '全明料死模风灯，电镀花银喷紫色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 3);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('72691bb3-5089-49cb-aa67-431cafbf7ea8', '39edb875-7c09-4d40-ac72-37c3dbd04708', '19', '综艺花纸', 2, '5118', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '安全包装送祁县光华厂', 100, 'PCS', 3, 300, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2012年2月5日。', 2);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('6dc70a94-998c-4fbb-80ba-473f18f2478a', 'f6bdd7bd-4ae7-48d0-b95e-709dfd8d6838', '4028817a33ecdbf70133ee202e49000b', '瑞成电镀厂', 4, '5337', '673a4e11-3706-4beb-b958-ee1d7c564b3b.jpg', '全明料死模风灯，电镀花银喷蓝色' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || ' ' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '1只/五层内盒      12只/大箱' || chr(9) || '' || chr(9) || '' || chr(9) || '' || chr(13) || '' || chr(10) || '毛坯1月30日送', 156, 'PCS', 3, 468, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年2月15日/工厂。       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 5);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('29c935eb-a2eb-4e71-b4e8-630f86105528', 'ec30e94d-424f-4113-981d-7b37d8bd2941', '19', '综艺花纸', 2, 'JK1014005', '94d2d773-24b6-412e-b0e3-0fc9dddf0955.png', '低温鱼花纸' || chr(13) || '' || chr(10) || '明料低口杯' || chr(13) || '' || chr(10) || '祁县宏艺厂', 1800, 'PCS', 1.2, 2160, '1.产品的颜色、造型、尺寸、务必同提供的样品一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月10；', 4);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4a2522cf-f513-4ba2-b760-5e3fded89acc', 'c26d6cd2-7f4a-47cd-b209-613d50bcdfbc', '19', '综艺花纸', 2, 'JK1080766-3', '29bb909d-d527-475d-bfbe-e5e05a02349c.png', '套3白花纸' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 600, 'SETS', .6, 360, '1.产品的颜色、造型、尺寸、务必同提供的样品一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月10；', 1);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('82af4e10-b49d-4a18-96fe-258dff30468b', '5e75fb77-33d6-4702-9b21-398fbc32b514', '19', '综艺花纸', 2, 'JK1014006', '7be85008-7652-4995-aaca-3ade8405eca9.png', '套6彩色花纸' || chr(13) || '' || chr(10) || '明料低口杯' || chr(13) || '' || chr(10) || '祁县宏艺厂', 300, 'SETS', 9, 2700, '1.产品的颜色、造型、尺寸、务必同提供的样品一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月10；', 5);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('3c92f3c1-34f6-44fe-8e6d-c98a93dcef21', 'ba595324-440a-4104-a85d-b6d0f09e46e3', '19', '综艺花纸', 2, 'JK1014001', '7a3d341f-f473-44ce-9bd4-c7f2b87343ca.png', '低温鱼花纸' || chr(13) || '' || chr(10) || '明料大碗' || chr(13) || '' || chr(10) || '送祁县宏艺厂', 1000, 'PCS', 2.4, 2400, '1.产品的颜色、造型、尺寸、务必同提供的样品一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月10；', 2);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('34b3defa-7418-47dc-bf65-53e3da0b5802', '55fdd3be-ee68-46f8-ad47-52444674ed54', '19', '综艺花纸', 2, 'JK1014003', '73980c53-44f6-4232-8c04-9d08a66eeccb.png', '低温鱼花纸' || chr(13) || '' || chr(10) || '明料盘子' || chr(13) || '' || chr(10) || '' || chr(13) || '' || chr(10) || '送祁县天顺厂', 1200, 'PCS', 3.8, 4560, '1.产品的颜色、造型、尺寸、务必同提供的样品一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年12月10；', 3);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('c001f116-0018-4a48-b794-1d78d784d4ff', 'a8dfcd10-977c-4934-b8e6-b053afd46381', '16', '康达', 1, '2965', 'undefined', '彩盒，新菲林' || chr(13) || '' || chr(10) || '配全明料糖缸带盖子' || chr(13) || '' || chr(10) || '彩盒尺寸：20X20X41CM', 144, 'PCS', 3.2, 460.8, '1.彩盒要求350克面纸；' || chr(13) || '' || chr(10) || '2.工厂待用安全包装，待我司运至工厂；' || chr(13) || '' || chr(10) || '3.工厂免费提供1%余量，以防划伤，破损；' || chr(13) || '' || chr(10) || '4.交期:2011年11月05日。', 2);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('8d91d6bd-5f0e-4004-9141-4098ab43f5d7', '8206cf71-f24e-44e9-ba59-26674669659e', '16', '康达', 1, '2964', null, '彩盒，新菲林' || chr(13) || '' || chr(10) || '配全明料糖缸带盖子' || chr(13) || '' || chr(10) || '彩盒尺寸：22.5X22.5X48.5CM', 144, 'PCS', 4, 576, '1.彩盒要求350克面纸；' || chr(13) || '' || chr(10) || '2.工厂待用安全包装，待我司运至工厂；' || chr(13) || '' || chr(10) || '3.工厂免费提供1%余量，以防划伤，破损；' || chr(13) || '' || chr(10) || '4.交期:2011年11月05日。', 1);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('5646366a-6900-43e1-b304-f249e96d5f4b', 'fbd73cf8-2481-4874-98d7-3a0b174efe06', '16', '康达', 1, '2976', 'undefined', '彩盒，新菲林' || chr(13) || '' || chr(10) || '配明料糖缸带盖子' || chr(13) || '' || chr(10) || '彩盒尺寸：25.7X25.7X35.7CM', 144, 'PCS', 3.9, 561.6, '1.彩盒要求350克面纸；' || chr(13) || '' || chr(10) || '2.工厂待用安全包装，待我司运至工厂；' || chr(13) || '' || chr(10) || '3.工厂免费提供1%余量，以防划伤，破损；' || chr(13) || '' || chr(10) || '4.交期:2011年11月05日。', 4);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('abaaf941-8017-482a-88f3-a86253753706', 'fbd73cf8-2481-4874-98d7-3a0b174efe06', '16', '康达', 2, '2976', 'undefined', '彩盒，新菲林' || chr(13) || '' || chr(10) || '配全明料糖缸带盖子' || chr(13) || '' || chr(10) || '彩盒尺寸：21.5X21.5X41CM', 144, 'PCS', 3.3, 475.2, '1.彩盒要求350克面纸；' || chr(13) || '' || chr(10) || '2.工厂待用安全包装，待我司运至工厂；' || chr(13) || '' || chr(10) || '3.工厂免费提供1%余量，以防划伤，破损；' || chr(13) || '' || chr(10) || '4.交期:2011年11月05日。', 3);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('6330a197-9c5f-4b92-af6c-0a06811585a6', '3f73d099-df91-4c64-a151-5fdb91fbd451', '22', '瑞成', 4, '4998', 'undefined', '全明料死模风灯 ，电镀花银喷紫色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 6);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('6cc45a03-334d-4e91-9024-11af09ec27aa', '6a20e4cf-41c8-4a2e-a9dc-208b8447edbb', '19', '综艺花纸', 2, '5117', 'undefined', '白金字母花纸' || chr(13) || '' || chr(10) || 'SWEETS' || chr(13) || '' || chr(10) || '送祁县光华厂', 300, 'PCS', 3, 900, '1.产品的颜色、造型、尺寸、重量务必同我司封样一致；' || chr(13) || '' || chr(10) || '2.工厂免费提供2% 余量，以防损耗，代用包装送至指定工厂；请在外包装上注明相对应的合同号及货号；' || chr(13) || '' || chr(10) || '3.交期:2011年11月30日；', 12);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('2da64340-e206-4417-bc07-0cee16d49391', 'fea293f8-7b34-49a1-b494-33e6d265ae52', '22', '瑞成', 4, '4993', null, '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM' || chr(13) || '' || chr(10) || '毛坯1月25日送', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 1);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('8d9adac4-9663-49a6-a9f4-1c3dfb819e3d', '0a87fc28-9473-4607-8a90-314bcc9ed289', '22', '瑞成', 4, '5400', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：17X23CM高', 300, 'PCS', 3.5, 1050, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 10);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('4b42002d-6406-4a46-9879-a57bf4852cd8', 'ebe39aed-9af7-4141-b5a6-324e5d47e70c', '22', '瑞成', 4, '4996', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：11.5X30.5CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 4);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('49a92974-060e-4599-9b4d-e65106183774', '87c6195e-4063-45d2-9257-9d4e531ff4c1', '22', '瑞成', 4, '5336', 'undefined', '全明料死模风灯，电镀花银喷绿色' || chr(13) || '' || chr(10) || '尺寸：14.5X20CM高', 300, 'PCS', 2, 600, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 8);
insert into EXT_EPRODUCT_C (EXT_EPRODUCT_ID, EXPORT_PRODUCT_ID, FACTORY_ID, FACTORY_NAME, CTYPE, PRODUCT_NO, PRODUCT_IMAGE, PRODUCT_DESC, CNUMBER, PACKING_UNIT, PRICE, AMOUNT, PRODUCT_REQUEST, ORDER_NO)
values ('085f502b-9f77-46db-9e8f-543c949dbd48', 'a9d6c16e-785f-4d6b-b879-df857f2760b7', '22', '瑞成', 4, '4994', 'undefined', '全明料死模风灯，电镀花银喷蓝色' || chr(13) || '' || chr(10) || '尺寸：11.5X20.3CM高', 300, 'PCS', 1.7, 510, '★   产品与封样无明显差异，唛头、标签及包装质量务必符合公司要求。 ' || chr(13) || '' || chr(10) || ' ★★  产品生产前期、中期、后期抽验率不得少于10%，质量和封样一致， ' || chr(13) || '' || chr(10) || '       并将验货照片传回公司。 ' || chr(13) || '' || chr(10) || '★★★ 重点客人的质量标准检验，产品抽验率不得少于50%，务必做到入箱前检查。 ' || chr(13) || '' || chr(10) || ' 交期：2012年1月10日/工厂。' || chr(13) || '' || chr(10) || '       没有经过我司同意无故延期交货造成严重后果的，按照客人的相关要求处理。 ' || chr(13) || '' || chr(10) || ' 开票：出货后请将增值税发票、验货报告、合同复印件及出库单一并寄至我司，以便我司安排付款。', 2);
commit;
prompt 39 records loaded
prompt Loading FACTORY_C...
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('1', '祁县宏艺厂', '宏艺', '杰诚', '0354-5041999', null, null, null, '高琴', null, '0', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('10', '祁县晶晨厂', '晶晨', '续贵', '0354-5271999', null, null, null, '吕波', null, '0', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('11', '祁县浩丰厂', '浩丰', '建生', '13935499967', null, null, null, '吕波', null, '0', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('12', '平遥远江厂', '平遥远江', '宏远', '13935499967', '13935499967', null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('13', '平遥鸿艺厂', '平遥鸿艺', '雄飞', '0354-5940888', null, null, null, '吕波', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('15', '南皮开发玻璃制品厂', '南皮开发', '舒东', '0317-8863999', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('16', '陕西康达彩印厂', '康达', '袁喜', '029-84528015', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('17', '陕西众鑫印务包装有限公司', '众鑫', '赵毅', '029-84341858', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('18', '翰林彩印厂', '翰林', '孙财', '029-88917456', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('19', '祁县综艺玻璃花纸厂', '综艺花纸', '王棕', '0354-5278918', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('2', '祁县光华厂', '光华', '薛成', '0354-5298981', null, null, null, '吕波', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('20', '祁县喜福来玻璃加工厂', '喜福来', '王卫', '0354-5328850', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('21', '祁县美晶泡沫厂', '美晶', '范长', '0354-5071387', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('22', '祁县瑞成玻璃镀膜厂', '瑞成', '温明', '13834809374', '13834809374', null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('3', '祁县会龙厂', '会龙', '李伟', '0354-5248696', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4', '祁县精艺厂', '精艺', '闫强', '0354-5047289', null, null, null, '高琴', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33d4f8b40133d99621cb0023', '祁县海洋厂', '升华', '刘生', '0354-5299987', null, null, null, '吕波', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33d4f8b40133d9989f5e0024', '闻喜民鑫厂', '民鑫', '李民', '0359-7472727', null, null, null, '吕波', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33de41d80133e982a18a001c', '太谷四通PVC厂', '太谷PVC', '张海', '0354-6226591', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a33ecdbf70133ee202e49000b', '祁县瑞成电镀厂', '瑞成电镀厂', '温民', '13835926900', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a34f93be50134f9df84470001', '神舟玻璃制品有限公司', '神舟厂', '申定', '0356-3961959', '13935672348', '0356-3991304', null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a353b8d8e0135415bf0a90070', '陕西宇津进出口有限公司', '宇津水龙头厂', '任宁', '029-62990818', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a35e0895e0135ec7a4dbe0087', '西安方圆工贸有限公司', '西安方圆工贸', '许涛', '029-86539568', null, '029-86590565', null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3632e86601363344d16d0001', '淄博雷波陶瓷花纸厂', '淄博花纸厂', '吴璇', '0533-5176946', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a371a8d7f01372a74451f0068', '山西大德成工贸有限公司', '铁架厂', '高辉', '0354-5288919', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a37583d45013758d152450038', '祁县顺驰厂', '顺驰', '王明', '0354-5109398', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a38024a04013803e3a8a2004b', '祁县欣欣泡沫有限公司', '祁县欣欣泡沫厂', '许杰', '0354-3939793', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a382b4fd401382b9aad2a0008', '祁县仲玉玻璃厂', '仲玉', '吕军', '0354-5018888', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a38736298013874c51a800036', '汇融玻璃有限公司', '展鹏厂', '厂长', '0354-5326986', '13834893800', '0354-5826197', null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a389cc7b701389d1efd940001', '宇虹包装彩印厂', '宇虹包装厂', '翟帅', '0358-3099923', '19033470988', '0358-3098183', null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a39b2b37f0139b46268c40025', '祁县馨艺玻璃厂', '馨艺', '袁长', '0354-5041938', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3aa9f950013ab0b6c98d0050', '祁县一先厂', '一先厂', '李刚', '0654-9018444', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3aa9f950013ab97f64110053', '温县致远玻璃制品有限公司', '温县致远厂', '红升', '18936896666', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3abe8f15013ac019a61f0031', '祁县喜福来电镀厂', '喜福来电镀厂', '王卫', '0154-5282888', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('4028817a3ae2ac42013ae3550357000d', '临潼华清蜡厂', '临潼华清蜡厂', '吴波', '13791903888', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('5', '祁县汇越厂', '汇越', '建忠', '0354-5019656', null, null, null, '吕波', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('6', '祁县泰宇厂', '泰宇', '立东', '0354-5299160', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('7', '祁县天顺厂', '天顺', '渠海', '0354-5299499', null, null, null, '李光', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('8', '祁县天诚厂', '天诚', '庞正', '0354-5299539', null, null, null, null, null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('9', '祁县华艺厂', '华艺', '史国', '0354-5041927', null, null, null, '高琴', null, '1', null, null, null);
insert into FACTORY_C (FACTORY_ID, FULL_NAME, FACTORY_NAME, CONTACTS, PHONE, MOBILE, FAX, CNOTE, INSPECTOR, ORDER_NO, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('ff808081301885760130189e47ca0013', '文水志远厂', '文水志远', '志远', '0358-3934083', null, null, null, '李光', null, '1', null, null, null);
commit;
prompt 41 records loaded
prompt Loading PACKING_LIST_C...
insert into PACKING_LIST_C (PACKING_LIST_ID, SELLER, BUYER, INVOICE_NO, INVOICE_DATE, MARKS, DESCRIPTIONS, EXPORT_IDS, EXPORT_NOS, STATE, CREATE_BY, CREATE_DEPT, CREATE_TIME)
values ('ceeeaa09-75ab-4c56-b333-26191a3db1ee', '11', '41', '21', to_timestamp('10-10-2014 00:00:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '老师，可不可以在DivData中再加一个name为exportNos的input隐藏域，' || chr(13) || '' || chr(10) || '是不就不用拼字符串来啊？', '51', 'a81f5a3f-386d-4b31-a03f-e81a8fe28a1d', 'C/3817/11 11JK1080', 0, null, null, null);
commit;
prompt 1 records loaded
prompt Loading SYS_CODE_B...
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('01', '系统代码', '-1', 'root', 0, 0, 1, null, null, 0, '1', null, to_timestamp('11-03-2010 09:34:38.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('11-03-2010 09:34:38.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('0101', '人员级别', '01', '系统代码', 1, 0, 0, null, null, 1, null, '001', to_timestamp('16-07-2011 07:43:41.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010102', '管理员', '0101', '人员级别', 2, 1, 0, null, null, 1, null, '001', to_timestamp('16-07-2011 07:44:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010103', '总经理', '0101', '人员级别', 2, 1, 0, null, null, 2, null, '001', to_timestamp('16-07-2011 07:44:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010104', '部门经理', '0101', '人员级别', 2, 1, 0, null, null, 3, null, '001', to_timestamp('16-07-2011 07:44:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '001', to_timestamp('16-07-2011 07:44:59.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010105', '组长', '0101', '人员级别', 2, 1, 0, null, null, 4, null, '001', to_timestamp('16-07-2011 07:44:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010106', '员工', '0101', '人员级别', 2, 1, 0, null, null, 5, null, '001', to_timestamp('16-07-2011 07:44:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('0102', '栏目', '01', '系统代码', 1, 0, 0, null, null, 2, null, '001', to_timestamp('05-08-2011 15:21:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010202', '新闻报道', '0102', '栏目', 2, 1, 0, null, null, 1, null, '001', to_timestamp('05-08-2011 15:24:17.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010203', '通知公告', '0102', '栏目', 2, 1, 0, null, null, 2, null, '001', to_timestamp('05-08-2011 15:24:17.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010204', '公司制度', '0102', '栏目', 2, 1, 0, null, null, 3, null, '001', to_timestamp('05-08-2011 15:24:17.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010205', '行业报道', '0102', '栏目', 2, 1, 0, null, null, 4, null, '001', to_timestamp('05-08-2011 15:24:17.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010206', '大事记', '0102', '栏目', 2, 1, 0, null, null, 5, null, '001', to_timestamp('05-08-2011 15:24:17.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('0103', '厂家类型', '01', '系统代码', 1, 0, 1, null, null, 3, null, '001', to_timestamp('05-08-2011 15:21:43.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '001', to_timestamp('04-10-2011 08:13:04.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010302', '玻璃', '0103', '厂家类型', 2, 1, 1, null, null, 1, null, '001', to_timestamp('18-08-2011 16:10:22.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '001', to_timestamp('04-10-2011 08:14:20.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010303', '彩盒', '0103', '厂家类型', 2, 1, 1, null, null, 2, null, '001', to_timestamp('18-08-2011 16:10:22.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), '001', to_timestamp('04-10-2011 08:14:20.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010304', 'PVC', '0103', '厂家类型', 2, 1, 1, null, null, 3, null, '001', to_timestamp('20-01-2012 15:16:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010305', '花纸', '0103', '厂家类型', 2, 1, 1, null, null, 4, null, '001', to_timestamp('20-01-2012 15:16:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010306', '保丽龙', '0103', '厂家类型', 2, 1, 1, null, null, 5, null, '001', to_timestamp('20-01-2012 15:16:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010307', '电镀', '0103', '厂家类型', 2, 1, 1, null, null, 6, null, '001', to_timestamp('20-01-2012 15:16:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010308', '水龙头', '0103', '厂家类型', 2, 1, 1, null, null, 7, null, '001', to_timestamp('20-01-2012 15:16:07.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010309', '蜡', '0103', '厂家类型', 2, 1, 1, null, null, 8, null, '001', to_timestamp('09-11-2012 11:59:26.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('0104', '附件类型', '01', '系统代码', 1, 0, 1, null, null, 4, null, '001', to_timestamp('04-10-2011 08:13:04.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010402', '彩盒', '0104', '附件类型', 2, 1, 1, null, null, 1, '1', '001', to_timestamp('04-10-2011 08:14:10.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010403', '花纸', '0104', '附件类型', 2, 1, 1, null, null, 2, '1', '001', to_timestamp('04-10-2011 08:14:10.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010404', '保丽龙', '0104', '附件类型', 2, 1, 1, null, null, 3, '1', '001', to_timestamp('04-10-2011 08:14:10.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010405', '电镀', '0104', '附件类型', 2, 1, 1, null, null, 4, '1', '001', to_timestamp('04-10-2011 08:14:11.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('26-11-2011 13:08:59.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010407', 'PVC', '0104', '附件类型', 2, 1, 0, null, null, 6, '1', '001', to_timestamp('06-12-2011 12:54:52.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010408', '喷头', '0104', '附件类型', 2, 1, 0, null, null, 7, '1', '001', to_timestamp('06-12-2011 12:54:52.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('010409', '不锈钢勺子', '0104', '附件类型', 2, 1, 0, null, null, 8, '1', '001', to_timestamp('01-04-2012 14:24:24.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('01-04-2012 14:24:24.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('a', '系统代码', '-1', 'root', 0, 0, 1, null, null, 0, '1', null, to_timestamp('11-03-2010 09:34:38.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, to_timestamp('11-03-2010 09:34:38.000000', 'dd-mm-yyyy hh24:mi:ss.ff'));
insert into SYS_CODE_B (SYS_CODE_ID, NAME, PARENT_ID, PARENT_NAME, LAYER_NUM, IS_LEAF, QUOTE_NUM, CNOTE, ICO, ORDER_NO, STATE, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME)
values ('b', '人员级别', '01', '系统代码', 1, 0, 0, null, null, 1, null, '001', to_timestamp('16-07-2011 07:43:41.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), null, null);
commit;
prompt 32 records loaded
prompt Enabling triggers for CONTRACT_C...
alter table CONTRACT_C enable all triggers;
prompt Enabling triggers for CONTRACT_HIS_C...
alter table CONTRACT_HIS_C enable all triggers;
prompt Enabling triggers for CONTRACT_PRODUCT_C...
alter table CONTRACT_PRODUCT_C enable all triggers;
prompt Enabling triggers for CONTRACT_PRODUCT_HIS_C...
alter table CONTRACT_PRODUCT_HIS_C enable all triggers;
prompt Enabling triggers for EXPORT_C...
alter table EXPORT_C enable all triggers;
prompt Enabling triggers for EXPORT_PRODUCT_C...
alter table EXPORT_PRODUCT_C enable all triggers;
prompt Enabling triggers for EXT_CPRODUCT_C...
alter table EXT_CPRODUCT_C enable all triggers;
prompt Enabling triggers for EXT_CPRODUCT_HIS_C...
alter table EXT_CPRODUCT_HIS_C enable all triggers;
prompt Enabling triggers for EXT_EPRODUCT_C...
alter table EXT_EPRODUCT_C enable all triggers;
prompt Enabling triggers for FACTORY_C...
alter table FACTORY_C enable all triggers;
prompt Enabling triggers for PACKING_LIST_C...
alter table PACKING_LIST_C enable all triggers;
prompt Enabling triggers for SYS_CODE_B...
alter table SYS_CODE_B enable all triggers;
set feedback on
set define on
prompt Done.
