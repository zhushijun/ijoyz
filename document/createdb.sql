drop table if exists TB_GANG;

drop table if exists TB_GANG_MEMBER;

drop table if exists TB_LEAGUE;

drop table if exists TB_LEAGUE_DATA;

drop table if exists TB_Sequence;

drop table if exists TB_USER;

drop table if exists TB_USER_GANG;
/*==============================================================*/
/* Table: TB_USER                                               */
/*==============================================================*/
create table TB_USER
(
   ID                   bigint not null,
   USER_NAME            varchar(60) not null,
   PASS                 varchar(128) not null,
   GAME_USER_ID         bigint,
   ROLE                 int not null,
   primary key (ID)
)
engine = InnoDB;
alter table TB_USER comment '用户表';

/*==============================================================*/
/* Table: TB_GANG                                               */
/*==============================================================*/
create table TB_GANG
(
   ID                   bigint not null,
   GANG_ID              bigint,
   GANG_NAME            varchar(30) not null,
   primary key (ID)
)
engine = InnoDB;
alter table TB_GANG comment '����';

/*==============================================================*/
/* Table: TB_USER_GANG                                          */
/*==============================================================*/
create table TB_USER_GANG
(
   USER_ID              bigint not null,
   GANG_ID              bigint not null,
   primary key (USER_ID, GANG_ID)
);

/*==============================================================*/
/* Table: TB_GANG_MEMBER                                        */
/*==============================================================*/
create table TB_GANG_MEMBER
(
   ID                   bigint not null,
   GANG_ID              bigint,
   MEMBER_ID            bigint,
   NAME                 varchar(30) not null,
   PROF                 int,
   LEVEL                int,
   POSITION             int,
   IS_LEAVE             int,
   primary key (ID)
)
engine = InnoDB;
alter table TB_GANG_MEMBER comment '����Ա��';

/*==============================================================*/
/* Table: TB_LEAGUE                                             */
/*==============================================================*/
create table TB_LEAGUE
(
   ID                   bigint not null,
   GANG_ID              bigint,
   LEAGUE_DATE          datetime not null,
   RIVAL                varchar(30) not null,
   RIVAL_GANG_ID        bigint,
   IS_WIN               int not null,
   primary key (ID)
)
engine = InnoDB;
alter table TB_LEAGUE comment '�����';

/*==============================================================*/
/* Table: TB_LEAGUE_DATA                                        */
/*==============================================================*/
create table TB_LEAGUE_DATA
(
   ID                   bigint not null,
   LEAGUE_ID            bigint,
   MEMBER_NAME          varchar(30) not null,
   MEMBER_ID            bigint,
   PROF                 int,
   LEVEL                int,
   HEADS                int,
   ASSIST               int,
   REPAIR               int,
   DIECOUNT             int,
   CORPSE               int,
   REVIVE               int,
   DAMAGE               int,
   DAMAGE_PERCENT       int,
   BEAR_DAMAGE          int,
   BEAR_DAMAGE_PERCENT  int,
   CURE                 int,
   CURE_PERCENT         int,
   DRIVE_CHARIOT_COUNT  int,
   CHARIOT_HEADS        int,
   primary key (ID)
)
engine = InnoDB;
alter table TB_LEAGUE_DATA comment '�������';

/*==============================================================*/
/* Table: TB_Sequence                                           */
/*==============================================================*/
create table TB_Sequence
(
   TableName            varchar(30) not null,
   CurrentValue         bigint not null,
   Increment            int not null,
   primary key (TableName)
)
engine = InnoDB;

delimiter //

CREATE  FUNCTION `nextval`(`Table_name` VARCHAR(50))
	RETURNS bigint(20)
	LANGUAGE SQL
	NOT DETERMINISTIC
	CONTAINS SQL
	SQL SECURITY DEFINER
	COMMENT ''
BEGIN
         UPDATE TB_Sequence
                   SET CurrentValue= CurrentValue+Increment
                   WHERE TableName= Table_name;
         RETURN currval(Table_name);
END;
//

CREATE FUNCTION `currval`(`Table_name` VARCHAR(50))
	RETURNS bigint(20)
	LANGUAGE SQL
	NOT DETERMINISTIC
	CONTAINS SQL
	SQL SECURITY DEFINER
	COMMENT ''
BEGIN
         DECLARE value bigint;
         SET value = 0;
         SELECT CurrentValue INTO value
                   FROM TB_Sequence
                   WHERE TableName= Table_name;
         RETURN value;
END;
//
delimiter ;

