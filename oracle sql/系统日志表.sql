

/*==============================================================*/
/* Table: LOGIN_LOG_P                                           */
/*==============================================================*/
create table LOGIN_LOG_P  (
   LOGIN_LOG_ID         VARCHAR2(40)                    not null,
   LOGIN_NAME           VARCHAR2(50),
   IP_ADDRESS           VARCHAR2(20),
   LOGIN_TIME           TIMESTAMP,
   constraint PK_LOGIN_LOG_P primary key (LOGIN_LOG_ID)
);
