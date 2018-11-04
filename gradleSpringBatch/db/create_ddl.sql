-- Project Name : GradleTest
-- Date/Time    : 2018/10/28 18:46:25
-- Author       : Nopooh
-- RDBMS Type   : Microsoft SQL Server 2008 �`
-- Application  : A5:SQL Mk-2

-- ���[�U��񗚗�
drop table h_user_info;

create table h_user_info (
  user_mng_number CHAR(10) not null
  , revision_number DECIMAL(8) not null
  , user_id VARCHAR(50) not null
  , password VARCHAR(16) not null
  , user_disp_name VARCHAR(60) not null
  , kanji_family_name VARCHAR(25) not null
  , kanji_first_name VARCHAR(25) not null
  , kana_family_name VARCHAR(25) not null
  , kana_first_name VARCHAR(25) not null
  , mail_address VARCHAR(255) not null
  , postal_code VARCHAR(7) not null
  , address VARCHAR(300) not null
  , address_romaji VARCHAR(300)
  , birth_date VARCHAR(8)
  , age VARCHAR(3)
  , sex CHAR(1)
  , phone_number CHAR(15)
  , cellphone_number CHAR(15)
  , fax_number CHAR(15)
  , history_reg_user_mng_number CHAR(10) not null
  , history_reg_date DATETIME not null
  , history_reg_func_ID CHAR(10) not null
  , history_update_user_mng_number CHAR(10) not null
  , history_update_date DATETIME not null
  , history_update_func_ID CHAR(10) not null
  , reg_user_mng_number CHAR(10) not null
  , reg_date DATETIME not null
  , reg_func_ID CHAR(10) not null
  , update_user_mng_number CHAR(10) not null
  , update_date DATETIME not null
  , update_func_ID CHAR(10) not null
  , constraint h_user_info_PKC primary key (user_mng_number,revision_number)
) ;

-- ���[�U���
drop table t_user_info;

create table t_user_info (
  user_mng_number CHAR(10) not null
  , revision_number DECIMAL(8) not null
  , user_id VARCHAR(50) not null
  , password VARCHAR(16) not null
  , user_disp_name VARCHAR(60) not null
  , kanji_family_name VARCHAR(25) not null
  , kanji_first_name VARCHAR(25) not null
  , kana_family_name VARCHAR(25) not null
  , kana_first_name VARCHAR(25) not null
  , mail_address VARCHAR(255) not null
  , postal_code VARCHAR(7) not null
  , address VARCHAR(300) not null
  , address_romaji VARCHAR(300)
  , birth_date VARCHAR(8)
  , age VARCHAR(3)
  , sex CHAR(1)
  , phone_number CHAR(15)
  , cellphone_number CHAR(15)
  , fax_number CHAR(15)
  , reg_user_mng_number CHAR(10) not null
  , reg_date DATETIME not null
  , reg_func_ID CHAR(10) not null
  , update_user_mng_number CHAR(10) not null
  , update_date DATETIME not null
  , update_func_ID CHAR(10) not null
  , constraint t_user_info_PKC primary key (user_mng_number)
) ;

EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U��񗚗�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', NULL, NULL;
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Ő�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'revision_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�UID', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'user_id';
EXECUTE sp_addextendedproperty N'MS_Description', N'�p�X���[�h', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'password';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U�\����', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'user_disp_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�����j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'kanji_family_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�����j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'kanji_first_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�J�i�j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'kana_family_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�J�i�j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'kana_first_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[���A�h���X', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'mail_address';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�֔ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'postal_code';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Z���i�����j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'address';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Z���i���[�}���j', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'address_romaji';
EXECUTE sp_addextendedproperty N'MS_Description', N'���N����', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'birth_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�N��', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'age';
EXECUTE sp_addextendedproperty N'MS_Description', N'����', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'sex';
EXECUTE sp_addextendedproperty N'MS_Description', N'�d�b�ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'phone_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�g�єԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'cellphone_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'FAX', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'fax_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'����o�^���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_reg_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'����o�^��', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_reg_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'����o�^�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_reg_func_ID';
EXECUTE sp_addextendedproperty N'MS_Description', N'�����X�V���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_update_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�����X�V��', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_update_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�����X�V�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'history_update_func_ID';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'reg_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^��', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'reg_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'reg_func_ID';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'update_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V��', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'update_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N'h_user_info', N'COLUMN', N'update_func_ID';

EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U���', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', NULL, NULL;
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Ő�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'revision_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�UID', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'user_id';
EXECUTE sp_addextendedproperty N'MS_Description', N'�p�X���[�h', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'password';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[�U�\����', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'user_disp_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�����j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'kanji_family_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�����j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'kanji_first_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�J�i�j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'kana_family_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���i�J�i�j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'kana_first_name';
EXECUTE sp_addextendedproperty N'MS_Description', N'���[���A�h���X', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'mail_address';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�֔ԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'postal_code';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Z���i�����j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'address';
EXECUTE sp_addextendedproperty N'MS_Description', N'�Z���i���[�}���j', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'address_romaji';
EXECUTE sp_addextendedproperty N'MS_Description', N'���N����', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'birth_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�N��', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'age';
EXECUTE sp_addextendedproperty N'MS_Description', N'����', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'sex';
EXECUTE sp_addextendedproperty N'MS_Description', N'�d�b�ԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'phone_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�g�єԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'cellphone_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'FAX', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'fax_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'reg_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^��', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'reg_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�o�^�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'reg_func_ID';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V���[�U�Ǘ��ԍ�', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'update_user_mng_number';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V��', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'update_date';
EXECUTE sp_addextendedproperty N'MS_Description', N'�X�V�@�\ID', N'SCHEMA', N'dbo', N'TABLE', N't_user_info', N'COLUMN', N'update_func_ID';

