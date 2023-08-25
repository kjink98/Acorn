
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





-- classroom ���̺� ������ ����
INSERT INTO classroom (classroom_id, computer_amount, project_device, classroom_name)
VALUES (1, 20, 'Projector', 'A101');

-- course ���̺� ������ ����
INSERT INTO course (course_code, course_instructor, assignment_classroom, tuition, classroom_id, textbook_id)
VALUES (1, '����A', 'A101', 100000, 1, 1);

-- employee ���̺� ������ ����
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('12345678901234567890', '����A', '�����');

-- employee_wage ���̺� ������ ����
INSERT INTO employee_wage (employee_jomin, salary)
VALUES ('12345678901234567890', 3000000);

-- instructor ���̺� ������ ����
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('09876543210987654321', '����A', '��⵵', 123456, '�����ڰ���');

-- instructor_wage ���̺� ������ ����
INSERT INTO instructor_wage (instructor_jumin, academy_exists, hourly_wage)
VALUES ('09876543210987654321', 'Y', 25000);

-- lecture ���̺� ������ ����
INSERT INTO lecture (course_code, instructor_jumin, lecture_code)
VALUES (1, '09876543210987654321', 1);

-- registers ���̺� ������ ����
INSERT INTO registers (student_jumin, course_code, class_code, class_date)
VALUES ('12345678901234567890', 1, 1, TO_DATE('2023-08-20', 'YYYY-MM-DD'));

-- student ���̺� ������ ����
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('12345678901234567890', TO_DATE('2023-08-01', 'YYYY-MM-DD'), '�л�A', '�����', TO_DATE('2023-08-01', 'YYYY-MM-DD'));

-- supplier ���̺� ������ ����
INSERT INTO supplier (supplier_id, name, pament_date)
VALUES (1, '������A', TO_DATE('2023-08-15', 'YYYY-MM-DD'));

-- textbook ���̺� ������ ����
INSERT INTO textbook (textbook_id, publisher, bookcost)
VALUES (1, '���ǻ�A', 25000);

-- textbook_order ���̺� ������ ����
INSERT INTO textbook_order (order_id, order_volume, order_date, supplier_id, textbook_id)
VALUES (1, 10, TO_DATE('2023-08-10', 'YYYY-MM-DD'), 1, 1);
