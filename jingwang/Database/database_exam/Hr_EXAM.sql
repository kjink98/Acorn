--**** HR ���� Ȱ�� **** 
--1. countries ���̺��� country_id�� country_name �÷��� ��ȸ
SELECT country_id, country_name FROM countries;
--2. countries ���̺��� �÷��� country_id�� ���� ID, country_name�� ���������� ��ȸ
SELECT country_id AS "���� ID", country_name AS ������ FROM countries;
--3. countries ���̺��� region_id�� �ߺ� �����ϰ� ��ȸ
SELECT DISTINCT region_id FROM countries;
--4. locations ���̺��� street_address�� city �÷��� ��ȸ
SELECT street_address, city FROM locations;
--5. jobs ���̺��� job_id�� job_title �÷��� ��ȸ
SELECT job_id, job_title FROM jobs;
--6. jobs ���̺��� job_title, min_salary, max_salary �÷��� �ּ� ������ �ִ� ������ 10% �λ�� ���·� ��ȸ
SELECT job_title, MIN(min_salary * 1.1) AS "�ּ� ����", MAX(max_salary * 1.1) AS "�ִ� ����" FROM jobs GROUP BY job_title;
--7. employees ���̺��� job_id�� �ߺ� �����ϰ� ��ȸ
SELECT DISTINCT job_id FROM employees;
--8. employees ���̺��� first_name�� ��David���� ���� ��ȸ
SELECT * FROM employees WHERE first_name = 'David';
--9. jobs ���̺��� �ּ� ������ 4000 �޷��� ���� ��ȸ
SELECT * FROM jobs WHERE min_salary = 4000;
--10. jobs ���̺��� �ּ� ������ 4000 �̻��̰� �ִ� ������ 10000 ������ ���� ��ȸ
SELECT * FROM jobs WHERE min_salary >= 4000 AND max_salary < 10000;
--11. employees ���̺��� job_id�� ��IT_PROG�� �̸鼭 salary�� 5000 �ʰ��� ���� ��ȸ
SELECT * FROM employees WHERE job_id = 'IT_PROG' AND salary > 5000;
--12. jobs ���̺��� job_title �������� �����Ͽ� ���� ��ȸ
SELECT * FROM jobs ORDER BY job_title;
--13. employees ���̺��� salary�� 10000���� 12000������ ���� ��ȸ
SELECT * FROM employees WHERE salary BETWEEN 10000 AND 12000;
--14. employees ���̺��� job_id�� ��IT_PROG���� ��ST_MAN���� ���� ��ȸ
SELECT * FROM employees WHERE job_id IN ('IT_PROG', 'ST_MAN');
--15. departments ���̺��� manager_id�� NULL�� �ƴ� �μ� ��ȸ
SELECT * FROM departments WHERE manager_id IS NOT NULL;
--16. employees ���̺��� job_id�� ��AD���� �����ϴ� ���� ��ȸ
SELECT * FROM employees WHERE job_id LIKE 'AD%';
--17. employees ���̺��� first_name���� ��ni���� �����ϴ� ���� ��ȸ
SELECT * FROM employees WHERE first_name LIKE '%ni%';