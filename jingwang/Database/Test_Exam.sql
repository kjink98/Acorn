
CREATE TABLE classroom
(
	classroom_id          NUMBER  NOT NULL ,
	computer_amount       NUMBER  NULL ,
	project_device        VARCHAR2(10)  NULL ,
	classroom_name        VARCHAR2(18)  NULL 
);



ALTER TABLE classroom
	ADD CONSTRAINT  XPK강의실 PRIMARY KEY (classroom_id);



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
	ADD CONSTRAINT  XPK과정 PRIMARY KEY (course_code);



CREATE TABLE employee
(
	employee_jomin        VARCHAR2(20)  NOT NULL ,
	name                  VARCHAR(18)  NOT NULL ,
	residence             VARCHAR(20)  NOT NULL 
);



ALTER TABLE employee
	ADD CONSTRAINT  XPK직원 PRIMARY KEY (employee_jomin);



CREATE TABLE employee_wage
(
	employee_jomin        VARCHAR2(20)  NOT NULL ,
	salary                NUMBER  NOT NULL 
);



ALTER TABLE employee_wage
	ADD CONSTRAINT  XPK직원_임금_지급 PRIMARY KEY (employee_jomin);



CREATE TABLE instructor
(
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	name                  VARCHAR2(18)  NULL ,
	residence             VARCHAR(18)  NULL ,
	license_number        NUMBER  NULL ,
	license_name          VARCHAR2(18)  NULL 
);



ALTER TABLE instructor
	ADD CONSTRAINT  XPK강사 PRIMARY KEY (instructor_jumin);



CREATE TABLE instructor_wage
(
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	academy_exists        VARCHAR2(10)  NULL ,
	hourly_wage           NUMBER  NOT NULL 
);



ALTER TABLE instructor_wage
	ADD CONSTRAINT  XPK강사_임금_지급 PRIMARY KEY (instructor_jumin);



CREATE TABLE lecture
(
	course_code           NUMBER  NOT NULL ,
	instructor_jumin      VARCHAR2(20)  NOT NULL ,
	lecture_code          NUMBER  NOT NULL 
);



ALTER TABLE lecture
	ADD CONSTRAINT  XPK강의 PRIMARY KEY (lecture_code);



CREATE TABLE registers
(
	student_jumin         VARCHAR2(20)  NOT NULL ,
	course_code           NUMBER  NOT NULL ,
	class_code            NUMBER  NOT NULL ,
	class_date            DATE  NOT NULL 
);



ALTER TABLE registers
	ADD CONSTRAINT  XPK수강등록 PRIMARY KEY (class_code);



CREATE TABLE student
(
	student_jumin         VARCHAR2(20)  NOT NULL ,
	register_date         DATE  NOT NULL ,
	name                  VARCHAR2(18)  NOT NULL ,
	residence             VARCHAR2(20)  NOT NULL ,
	tuition_date          DATE  NULL 
);



ALTER TABLE student
	ADD CONSTRAINT  XPK수강생 PRIMARY KEY (student_jumin);



CREATE TABLE supplier
(
	supplier_id           NUMBER  NOT NULL ,
	name                  VARCHAR2(18)  NOT NULL ,
	pament_date           DATE  NULL 
);



ALTER TABLE supplier
	ADD CONSTRAINT  XPK공급자 PRIMARY KEY (supplier_id);



CREATE TABLE textbook
(
	textbook_id           NUMBER  NOT NULL ,
	publisher             VARCHAR2(18)  NOT NULL ,
	bookcost              NUMBER  NOT NULL 
);



ALTER TABLE textbook
	ADD CONSTRAINT  XPK교재 PRIMARY KEY (textbook_id);



CREATE TABLE textbook_order
(
	order_id              NUMBER  NOT NULL ,
	order_volume          NUMBER  NOT NULL ,
	order_date            DATE  NOT NULL ,
	supplier_id           NUMBER  NULL ,
	textbook_id           NUMBER  NULL 
);



ALTER TABLE textbook_order
	ADD CONSTRAINT  XPK주문 PRIMARY KEY (order_id);



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



-- 학생, 강사, 직원 테이블 먼저 작성 사람 먼저 집어넣고 나머지

-- employee 테이블에 데이터 삽입
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('960405-2205454', '김지영', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('801212-1234567', '이민준', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('920301-2345677', '박서연', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('751101-1345597', '최현우', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('880123-2314545', '정서연', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('970528-2312123', '강민서', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('980421-2310415', '윤하은', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('710103-2231202', '임지원', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('660301-1313545', '한준우', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('600101-2312151', '송서윤', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('920404-2331511', '황은서', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('990413-1325196', '김민준', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('930913-2231564', '이서연', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('001231-2315683', '박민서', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('010628-2165488', '최민서', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('880510-1351585', '정현우', '인천');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('940817-1359848', '강서준', '인천');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('930303-2015894', '윤지원', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('860218-2754321', '임지윤', '서울');
INSERT INTO employee (employee_jomin, name, residence)
VALUES ('890920-2851848', '한지윤', '서울');

-- instructor 테이블에 데이터 삽입
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('900117-2151850', '송민서', '하남', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890208-2118515', '황지윤', '서울', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('580606-1235458', '김예준', '울진', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('920713-1357004', '이서준', '경기도 광주', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('910920-1507404', '박민준', '서울', 123456, '언어자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('901101-2851848', '최서준', '시흥', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('700823-2154034', '정주아', '서울', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890421-2351401', '강하윤', '인천', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('940220-2240804', '윤민서', '부천', 123456, '언어자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('951030-2158100', '임하윤', '제주', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('770620-2480748', '한주아', '인천', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('820530-2013220', '송주아', '속초', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('870130-1201303', '황현우', '서울', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('910321-2113048', '김하윤', '서울', 001, '교육자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('900703-1324854', '이주원', '서울', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('800430-1310502', '박현우', '인천', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('890201-2385401', '최지윤', '인천', 100100, '상담자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('810303-2101854', '정지원', '서울', 002, '교사자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('880130-1301054', '강민준', '서울', 100100, '상담자격증');
INSERT INTO instructor (instructor_jumin, name, residence, license_number, license_name)
VALUES ('870212-1232121', '윤현우', '서울', 002, '교사자격증');


-- student 테이블에 데이터 삽입
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050607-2218574', TO_DATE('2023-07-29', 'YYYY-MM-DD'), '임지유', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('061224-2012122', TO_DATE('2022-07-15', 'YYYY-MM-DD'), '한지유', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050310-2045748', TO_DATE('2021-02-22', 'YYYY-MM-DD'), '이지은', '서울', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070122-1385788', TO_DATE('2023-03-03', 'YYYY-MM-DD'), '황민준', '서울', TO_DATE('2023-07-20', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('071001-1238785', TO_DATE('2023-03-03', 'YYYY-MM-DD'), '김민준', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050401-1385848', TO_DATE('2021-01-29', 'YYYY-MM-DD'), '이현우', '서울', TO_DATE('2023-07-27', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050812-1385484', TO_DATE('2022-12-13', 'YYYY-MM-DD'), '박주원', '서울', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060424-1248534', TO_DATE('2022-01-10', 'YYYY-MM-DD'), '박주원', '서울', TO_DATE('2023-08-03', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070203-1011302', TO_DATE('2023-02-24', 'YYYY-MM-DD'), '정민준', '서울', TO_DATE('2023-07-25', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070223-1385488', TO_DATE('2023-04-23', 'YYYY-MM-DD'), '강민재', '서울', TO_DATE('2023-07-23', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('051203-1018772', TO_DATE('2021-09-19', 'YYYY-MM-DD'), '윤현준', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060607-1354874', TO_DATE('2022-03-20', 'YYYY-MM-DD'), '임주영', '인천', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('051102-2321857', TO_DATE('2023-06-03', 'YYYY-MM-DD'), '한주영', '서울', TO_DATE('2023-07-28', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050401-1010205', TO_DATE('2021-01-05', 'YYYY-MM-DD'), '송민준', '가평', TO_DATE('2023-08-05', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050505-2202055', TO_DATE('2022-08-02', 'YYYY-MM-DD'), '황지영', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('060606-2121213', TO_DATE('2023-06-01', 'YYYY-MM-DD'), '이하이', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('070707-2315487', TO_DATE('2023-04-10', 'YYYY-MM-DD'), '이다영', '서울', TO_DATE('2023-08-10', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050524-2321587', TO_DATE('2023-07-01', 'YYYY-MM-DD'), '박민주', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050430-2158873', TO_DATE('2021-10-30', 'YYYY-MM-DD'), '최민주', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));
INSERT INTO student (student_jumin, register_date, name, residence, tuition_date)
VALUES ('050202-1011012', TO_DATE('2023-07-29', 'YYYY-MM-DD'), '정준우', '서울', TO_DATE('2023-07-29', 'YYYY-MM-DD'));

-- classroom 테이블에 데이터 삽입
INSERT INTO classroom (classroom_id, computer_amount, project_device, classroom_name)
VALUES (1, 20, 'Projector', 'A101');

-- course 테이블에 데이터 삽입
INSERT INTO course (course_code, course_instructor, assignment_classroom, tuition, classroom_id, textbook_id)
VALUES (1, '강사A', 'A101', 100000, 1, 1);

-- employee_wage 테이블에 데이터 삽입
INSERT INTO employee_wage (employee_jomin, salary)
VALUES ('050607-2218574', 3000000);



-- instructor_wage 테이블에 데이터 삽입
INSERT INTO instructor_wage (instructor_jumin, academy_exists, hourly_wage)
VALUES ('890920-2851848', 'Y', 25000);

-- lecture 테이블에 데이터 삽입
INSERT INTO lecture (course_code, instructor_jumin, lecture_code)
VALUES (1, '890920-2851848', 1);

-- registers 테이블에 데이터 삽입
INSERT INTO registers (student_jumin, course_code, class_code, class_date)
VALUES ('050607-2218574', 1, 1, TO_DATE('2023-08-20', 'YYYY-MM-DD'));



-- supplier 테이블에 데이터 삽입
INSERT INTO supplier (supplier_id, name, pament_date)
VALUES (1, '공급자A', TO_DATE('2023-08-15', 'YYYY-MM-DD'));

-- textbook 테이블에 데이터 삽입
INSERT INTO textbook (textbook_id, publisher, bookcost)
VALUES (1, '출판사A', 25000);

-- textbook_order 테이블에 데이터 삽입
INSERT INTO textbook_order (order_id, order_volume, order_date, supplier_id, textbook_id)
VALUES (1, 10, TO_DATE('2023-08-10', 'YYYY-MM-DD'), 1, 1);
