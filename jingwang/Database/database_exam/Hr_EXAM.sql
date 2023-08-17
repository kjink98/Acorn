--**** HR 계정 활용 **** 
--1. countries 테이블에서 country_id와 country_name 컬럼만 조회
SELECT country_id, country_name FROM countries;
--2. countries 테이블에서 컬럼명 country_id를 국가 ID, country_name을 국가명으로 조회
SELECT country_id AS "국가 ID", country_name AS 국가명 FROM countries;
--3. countries 테이블에서 region_id를 중복 제외하고 조회
SELECT DISTINCT region_id FROM countries;
--4. locations 테이블에서 street_address와 city 컬럼만 조회
SELECT street_address, city FROM locations;
--5. jobs 테이블에서 job_id와 job_title 컬럼만 조회
SELECT job_id, job_title FROM jobs;
--6. jobs 테이블에서 job_title, min_salary, max_salary 컬럼을 최소 연봉과 최대 연봉을 10% 인상된 상태로 조회
SELECT job_title, MIN(min_salary * 1.1) AS "최소 연봉", MAX(max_salary * 1.1) AS "최대 연봉" FROM jobs GROUP BY job_title;
--7. employees 테이블에서 job_id를 중복 제외하고 조회
SELECT DISTINCT job_id FROM employees;
--8. employees 테이블에서 first_name이 ‘David’인 직원 조회
SELECT * FROM employees WHERE first_name = 'David';
--9. jobs 테이블에서 최소 월급이 4000 달러인 직업 조회
SELECT * FROM jobs WHERE min_salary = 4000;
--10. jobs 테이블에서 최소 월급이 4000 이상이고 최대 월급이 10000 이하인 직업 조회
SELECT * FROM jobs WHERE min_salary >= 4000 AND max_salary < 10000;
--11. employees 테이블에서 job_id가 ‘IT_PROG’ 이면서 salary가 5000 초과인 직원 조회
SELECT * FROM employees WHERE job_id = 'IT_PROG' AND salary > 5000;
--12. jobs 테이블에서 job_title 기준으로 정렬하여 직업 조회
SELECT * FROM jobs ORDER BY job_title;
--13. employees 테이블에서 salary가 10000에서 12000사이인 직원 조회
SELECT * FROM employees WHERE salary BETWEEN 10000 AND 12000;
--14. employees 테이블에서 job_id가 ‘IT_PROG’와 ‘ST_MAN’인 직원 조회
SELECT * FROM employees WHERE job_id IN ('IT_PROG', 'ST_MAN');
--15. departments 테이블에서 manager_id가 NULL이 아닌 부서 조회
SELECT * FROM departments WHERE manager_id IS NOT NULL;
--16. employees 테이블에서 job_id가 ‘AD’로 시작하는 직원 조회
SELECT * FROM employees WHERE job_id LIKE 'AD%';
--17. employees 테이블의 first_name에서 ‘ni’를 포함하는 직원 조회
SELECT * FROM employees WHERE first_name LIKE '%ni%';