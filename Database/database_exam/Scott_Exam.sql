CREATE TABLE tblBoard(
b_num number,
b_name varchar2(20),
b_email varchar2(50),
b_homepage varchar2(50),
b_subject varchar2(50),
b_content varchar2(4000),
b_pass varchar2(10),
b_count number,
b_ip varchar2(50),
b_regdate date,
pos number,
depth number,
CONSTRAINT pk_b_num PRIMARY KEY(b_num)
);

CREATE SEQUENCE seq_b_num;

INSERT INTO tblboard VALUES(seq_b_num.nextVal, 'ȫ�浿', 'hong@gil.net', 'http://hong.com',
'ù ��° ���Դϴ�.', 'ù ��° ���� �����Դϴ�.', '1111', 0, '111.111.111.111', sysdate, 0, 0);

INSERT INTO tblboard VALUES(seq_b_num.nextVal, '�Ӳ���', 'lim@jung.net', 'http://lim.com',
'�ȳ��ϼ���', '�� �����Դϴ�.', '1111', 0, '111.111.111.222', sysdate, 0, 0);

select * from tblboard;