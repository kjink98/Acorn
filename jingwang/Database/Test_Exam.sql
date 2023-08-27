
CREATE TABLE classroom
(
	classroom_id          NUMBER  NOT NULL ,
	computer_amount       NUMBER  NULL ,
	project_device        VARCHAR2(10)  NULL ,
	classroom_name        VARCHAR2(18)  NULL 
);



ALTER TABLE classroom
	ADD CONSTRAINT  XPK���ǽ� PRIMARY KEY (classroom_id);



CREATE TABLE course
(
	course_code           NUMBER  NOT NULL ,
	course_instructor     VARCHAR2(20)  NULL ,
	assignment_classroom  VARCHAR2(18)  NULL ,
	tuition               NUMBER  NULL ,
	classroom_id          NUMBER  NULL ,
	textbook_id           NUMBER  NULL 
);



ALTER TABLE course
	ADD CONSTRAINT  XPK���� PRIMARY KEY (course_code);



CREATE TABLE employee
(
	employee_jomin        VARCHAR2(20)  NOT NULL ,
	name                  VARCHAR(18)  NOT NULL ,
	residence             VARCHAR(20)  NOT NULL 
);



ALTER TABLE employee
	ADD CONSTRAINT  XPK���� PRIMARY KEY (employee_jomin);



CREATE TABLE employee_wage
(
	employee_jomin        VARCHAR2(20)  NOT NULL ,
	salary                NUMBER  NOT NULL 
);



ALTER TABLE employee_wage
	ADD CONSTRAINT  XPK����_�ӱ�_���� PRIMARY KEY (employee_jomin);



CREATE TABLE instructor
(
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	name                  VARCHAR2(18)  NULL ,
	residence             VARCHAR(18)  NULL ,
	license_number        NUMBER  NULL ,
	license_name          VARCHAR2(18)  NULL 
);



ALTER TABLE instructor
	ADD CONSTRAINT  XPK���� PRIMARY KEY (instructor_jumin);



CREATE TABLE instructor_wage
(
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	academy_exists        VARCHAR2(10)  NULL ,
	hourly_wage           NUMBER  NOT NULL 
);



ALTER TABLE instructor_wage
	ADD CONSTRAINT  XPK����_�ӱ�_���� PRIMARY KEY (instructor_jumin);



CREATE TABLE lecture
(
	course_code           NUMBER  NOT NULL ,
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	lecture_code          NUMBER  NOT NULL 
);



ALTER TABLE lecture
	ADD CONSTRAINT  XPK���� PRIMARY KEY (lecture_code);



CREATE TABLE registers
(
	student_jumin         VARCHAR2(20)  NOT NULL ,
	course_code           NUMBER  NOT NULL ,
	class_code            NUMBER  NOT NULL ,
	class_date            DATE  NOT NULL 
);



ALTER TABLE registers
	ADD CONSTRAINT  XPK������� PRIMARY KEY (class_code);



CREATE TABLE student
(
	student_jumin         VARCHAR2(20)  NOT NULL ,
	register_date         DATE  NOT NULL ,
	name                  VARCHAR2(18)  NOT NULL ,
	residence             VARCHAR2(20)  NOT NULL ,
	tuition_date          DATE  NULL 
);



ALTER TABLE student
	ADD CONSTRAINT  XPK������ PRIMARY KEY (student_jumin);



CREATE TABLE supplier
(
	supplier_id           NUMBER  NOT NULL ,
	name                  VARCHAR2(18)  NOT NULL ,
	pament_date           DATE  NULL 
);



ALTER TABLE supplier
	ADD CONSTRAINT  XPK������ PRIMARY KEY (supplier_id);



CREATE TABLE textbook
(
	textbook_id           NUMBER  NOT NULL ,
	publisher             VARCHAR2(18)  NOT NULL ,
	bookcost              NUMBER  NOT NULL 
);



ALTER TABLE textbook
	ADD CONSTRAINT  XPK���� PRIMARY KEY (textbook_id);



CREATE TABLE textbook_order
(
	order_id              NUMBER  NOT NULL ,
	order_volume          NUMBER  NOT NULL ,
	order_date            DATE  NOT NULL ,
	supplier_id           NUMBER  NULL ,
	textbook_id           NUMBER  NULL 
);



ALTER TABLE textbook_order
	ADD CONSTRAINT  XPK�ֹ� PRIMARY KEY (order_id);



ALTER TABLE course
	ADD (CONSTRAINT  R_24 FOREIGN KEY (classroom_id) REFERENCES classroom(classroom_id) ON DELETE SET NULL);



ALTER TABLE course
	ADD (CONSTRAINT  R_59 FOREIGN KEY (textbook_id) REFERENCES textbook(textbook_id) ON DELETE SET NULL);



ALTER TABLE employee_wage
	ADD (CONSTRAINT  R_53 FOREIGN KEY (employee_jomin) REFERENCES employee(employee_jomin));



ALTER TABLE instructor_wage
	ADD (CONSTRAINT  R_51 FOREIGN KEY (instructor_jumin) REFERENCES instructor(instructor_jumin));



ALTER TABLE lecture
	ADD (CONSTRAINT  R_14 FOREIGN KEY (course_code) REFERENCES course(course_code));



ALTER TABLE lecture
	ADD (CONSTRAINT  R_20 FOREIGN KEY (instructor_jumin) REFERENCES instructor(instructor_jumin));



ALTER TABLE registers
	ADD (CONSTRAINT  R_13 FOREIGN KEY (student_jumin) REFERENCES student(student_jumin));



ALTER TABLE registers
	ADD (CONSTRAINT  R_18 FOREIGN KEY (course_code) REFERENCES course(course_code));



ALTER TABLE textbook_order
	ADD (CONSTRAINT  R_35 FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id) ON DELETE SET NULL);



ALTER TABLE textbook_order
	ADD (CONSTRAINT  R_58 FOREIGN KEY (textbook_id) REFERENCES textbook(textbook_id) ON DELETE SET NULL);



-- �л�, ����, ���� ���̺� ���� �ۼ� ��� ���� ����ְ� ������

-- employee ���̺� ������ ����
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('960405-2205454', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('801212-1234567', '�̹���', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('920301-2345677', '�ڼ���', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('751101-1345597', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('880123-2314545', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('970528-2312123', '���μ�', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('980421-2310415', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('710103-2231202', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('660301-1313545', '���ؿ�', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('600101-2312151', '�ۼ���', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('920404-2331511', 'Ȳ����', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('990413-1325196', '�����', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('930913-2231564', '�̼���', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('001231-2315683', '�ڹμ�', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('010628-2165488', '�ֹμ�', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('880510-1351585', '������', '��õ');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('940817-1359848', '������', '��õ');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('930303-2015894', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('860218-2754321', '������', '����');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('890920-2851848', '������', '����');

-- instructor ���̺� ������ ����
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('900117-2151850', '�۹μ�', '�ϳ�', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890208-2118515', 'Ȳ����', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('580606-1235458', '�迹��', '����', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('920713-1357004', '�̼���', '��⵵ ����', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('910920-1507404', '�ڹ���', '����', 123456, '����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('901101-2851848', '�ּ���', '����', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('700823-2154034', '���־�', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890421-2351401', '������', '��õ', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('940220-2240804', '���μ�', '��õ', 123456, '����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('951030-2158100', '������', '����', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('770620-2480748', '���־�', '��õ', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('820530-2013220', '���־�', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('870130-1201303', 'Ȳ����', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('910321-2113048', '������', '����', 001, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('900703-1324854', '���ֿ�', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('800430-1310502', '������', '��õ', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890201-2385401', '������', '��õ', 100100, '����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('810303-2101854', '������', '����', 002, '�����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('880130-1301054', '������', '����', 100100, '����ڰ���');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('870212-1232121', '������', '����', 002, '�����ڰ���');


-- student ���̺� ������ ����
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050607-2218574', TO_DATE('2023-07-29', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('061224-2012122', TO_DATE('2022-07-15', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050310-2045748', TO_DATE('2021-02-22', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070122-1385788', TO_DATE('2023-03-03', 'YYYY-MM-DD'), 'Ȳ����', '����', TO_DATE('2023-07-20', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('071001-1238785', TO_DATE('2023-03-03', 'YYYY-MM-DD'), '�����', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050401-1385848', TO_DATE('2021-01-29', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-27', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050812-1385484', TO_DATE('2022-12-13', 'YYYY-MM-DD'), '���ֿ�', '����', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060424-1248534', TO_DATE('2022-01-10', 'YYYY-MM-DD'), '���ֿ�', '����', TO_DATE('2023-08-03', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070203-1011302', TO_DATE('2023-02-24', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-25', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070223-1385488', TO_DATE('2023-04-23', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-23', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('051203-1018772', TO_DATE('2021-09-19', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060607-1354874', TO_DATE('2022-03-20', 'YYYY-MM-DD'), '���ֿ�', '��õ', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('051102-2321857', TO_DATE('2023-06-03', 'YYYY-MM-DD'), '���ֿ�', '����', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050401-1010205', TO_DATE('2021-01-05', 'YYYY-MM-DD'), '�۹���', '����', TO_DATE('2023-08-05', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050505-2202055', TO_DATE('2022-08-02', 'YYYY-MM-DD'), 'Ȳ����', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060606-2121213', TO_DATE('2023-06-01', 'YYYY-MM-DD'), '������', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070707-2315487', TO_DATE('2023-04-10', 'YYYY-MM-DD'), '�̴ٿ�', '����', TO_DATE('2023-08-10', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050524-2321587', TO_DATE('2023-07-01', 'YYYY-MM-DD'), '�ڹ���', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050430-2158873', TO_DATE('2021-10-30', 'YYYY-MM-DD'), '�ֹ���', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050202-1011012', TO_DATE('2023-07-29', 'YYYY-MM-DD'), '���ؿ�', '����', TO_DATE('2023-07-29', 'YYYY-MM-DD'));

-- classroom ���̺� ������ ����
INSERT INTO classroom (classroom_id, computer_amount, project_device, classroom_name)
VALUES (1, 20, 'Projector', 'A101');

-- course ���̺� ������ ����
INSERT INTO course (course_code, course_instructor, assignment_classroom, tuition, classroom_id, textbook_id)
VALUES (1, '����A', 'A101', 100000, 1, 1);

-- employee_wage ���̺� ������ ����
INSERT INTO employee_wage (employee_jomin, salary)
VALUES ('050607-2218574', 3000000);



-- instructor_wage ���̺� ������ ����
INSERT INTO instructor_wage (instructor_jumin, academy_exists, hourly_wage)
VALUES ('890920-2851848', 'Y', 25000);

-- lecture ���̺� ������ ����
INSERT INTO lecture (course_code, instructor_jumin, lecture_code)
VALUES (1, '890920-2851848', 1);

-- registers ���̺� ������ ����
INSERT INTO registers (student_jumin, course_code, class_code, class_date)
VALUES ('050607-2218574', 1, 1, TO_DATE('2023-08-20', 'YYYY-MM-DD'));



-- supplier ���̺� ������ ����
INSERT INTO supplier (supplier_id, name, pament_date)
VALUES (1, '������A', TO_DATE('2023-08-15', 'YYYY-MM-DD'));

-- textbook ���̺� ������ ����
INSERT INTO textbook (textbook_id, publisher, bookcost)
VALUES (1, '���ǻ�A', 25000);

-- textbook_order ���̺� ������ ����
INSERT INTO textbook_order (order_id, order_volume, order_date, supplier_id, textbook_id)
VALUES (1, 10, TO_DATE('2023-08-10', 'YYYY-MM-DD'), 1, 1);
