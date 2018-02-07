
/*==============================================================*/
/* Table: AUTH_USER_P                                           */
/*==============================================================*/
create table AUTH_USER_P  (
   AUTH_USER_ID         VARCHAR2(40)                    not null,
   USERNAME             VARCHAR2(50),
   PASSWORD             VARCHAR2(20),
   SALARY               NUMBER(8,2),
   BIRTHDAY             TIMESTAMP,
   GENDER               CHAR(2),
   STATION              VARCHAR2(20),
   TELEPHONE            VARCHAR2(20),
   REMARK               VARCHAR2(600),
   DEGREE               VARCHAR2(20),
   MANAGER_ID           VARCHAR2(40),
   CREATE_BY            VARCHAR2(40),
   CREATE_DEPT          VARCHAR2(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_AUTH_USER_P primary key (AUTH_USER_ID)
);
