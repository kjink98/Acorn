--1. 1981년에 입사한 사람의 이름, 업무, 입사일자를 조회
SELECT ename, job, hiredate FROM emp WHERE hiredate LIKE '81%';
--2. 사번이 7902, 7788, 7566인 사원의 이름, 업무, 급여, 입사일자 조회
SELECT ename, job, sal, hiredate FROM emp WHERE empno IN (7902, 7788, 7566);
--3. 업무가 manager, clerk, anaylst가 아닌 직원의 이름, 업무, 급여, 부서번호 조회
SELECT ename, job, sal, deptno FROM emp WHERE job NOT IN ('MANAGER', 'CLERK', 'ANALYST');
--4. 업무가 president 또는 salesman이고 급여가 1500인 직원의 이름, 급여, 업무, 부서번호 조회
SELECT ename, sal, job, deptno FROM emp WHERE job IN ('PRESIDENT', 'SALESMAN') AND sal = 1500;
--5. 가장 최근에 입사한 직원의 이름, 부서, 업무, 입사일자 조회
SELECT ename, deptno, job, hiredate FROM emp ORDER BY hiredate DESC;
--6. 같은 부서내에서 같은 업무를 하는 직원의 급여가 많은 순으로 조회
SELECT ename, deptno, sal FROM emp ORDER BY deptno, sal DESC;
--7. 커미션이 급여보다 10%이상 많은 직원의 급여가 많은 순으로 조회
SELECT ename, comm, sal FROM emp WHERE comm >= sal*1.1 ORDER BY sal DESC;
--8. 이름에 L가 2개 있고 30번 부서이거나 직속상사가 7782인 직원의 이름, 부서, 직속상사 조회
SELECT ename, deptno, mgr FROM emp WHERE (ename LIKE '%LL%' AND deptno = 30) OR mgr = 7782;

--************************* 함수 문제 ******************************
--1. 오늘부터 12월 25일까지 몇일이 남았는가?
SELECT TO_DATE('2023-12-25', 'YYYY-MM-DD') - TO_DATE(sysdate) FROM dual;
--2. 현재까지 근무한 직원들의 근무일수를 몇주 몇일로 조회.(단, 근무일수가 많은 사람 순으로 조회)
SELECT ename, hiredate, TRUNC((sysdate - hiredate) / 7) AS 주, TRUNC(mod((sysdate - hiredate), 7)) AS 일 
FROM emp
ORDER BY TRUNC(sysdate - hiredate) ASC;
--3. 10번 부서 직원들 중 현재까지의 근무월수를 계산해서 조회
SELECT deptno, ename, hiredate, TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS 근무월수 
FROM emp 
WHERE deptno = 10;
--4. 20번 부서 직원들 중 입사일자로부터 13개월이 지난 후의 날짜를 조회
SELECT deptno, ename, hiredate, TRUNC(ADD_MONTHS(hiredate, 13)) AS "13개월후"
FROM emp
WHERE deptno = 20;
--5. 모든 직원에 대해 입사한 달의 근무일수를 조회
SELECT deptno, ename, hiredate, LAST_DAY(hiredate) - hiredate AS "입사달 근무일수"
FROM emp;
--6. 현재 급여에 15%가 증가된 급여를 계산하여 사번, 이름, 급여, 증가된 급여를 조회
--(단, 급여는 반올림하여 적용한다.)
SELECT empno, ename, sal, round(sal * 1.15) FROM emp;
--7. 이름, 입사일, 입사일로부터 현재까지의 월수, 급여, 급여 총계를 조회
SELECT ename, hiredate, TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS "현재까지 개월 수",
        sal, sal * TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS "급여 총계"
FROM emp;
--8. 업무가 analyst이면 급여를 10%증가시키고 clerk이면 15%, manager이면 20%증가 시켜서 이름, 업무, 급여, 증가된 급여를 조회
SELECT ename, job, sal, nvl(DECODE(job, 'ANALYST', sal * 1.1, 'CLERK', sal * 1.15, 'MANAGER', sal * 1.2), sal) AS "증가된 급여"
FROM emp;
--9. 이름의 첫글자가 k보다 크고 y보다 작은 직원의 이름, 부서, 업무를 조회하시오.
SELECT ename, deptno, job FROM emp WHERE ename BETWEEN 'L' AND 'X';

--1. 인원수, 보너스에 null이 아닌 인원수, 보너스의 평균(보너스가 null이아닌 평균, null을 포함한 평균), 
--등록되어 있는 부서의 수(중복 제외)를 구하여 조회
SELECT COUNT(empno) AS 인원수, COUNT(comm) AS "보너스 인원수 null제외", AVG(comm) AS "보너스 null 평균",
    AVG(NVL(comm,0)) AS "보너스 평균(NULL 포함)", COUNT(DISTINCT (deptno)) AS "부서의 수"
FROM emp;

--2.	년도	count	  min		  max		  avg		sum
--	-------------------------------------------------------------------------
--	80	   1	     800		  800		  800		800
--	81	   10	     950		  5000	  	  2282.5	22825
--	82	   2	     1300	      3000	  	  2150	  	4300
--	83	   1	     1100	      1100	  	  1100	  	1100
SELECT EXTRACT(year from hiredate) AS 년도, COUNT(hiredate) AS "count", MIN(sal) AS "min", 
    MAX(sal) AS "max", AVG(sal) AS "avg", SUM(sal) AS "sum"
FROM emp 
GROUP BY EXTRACT(year from hiredate)
ORDER BY EXTRACT(year from hiredate);

--3. Total	  1980	  1981	  1982	  1983
--	---------------------------------------------------
--	14	       1       10       2	    1
SELECT hiredate from emp where hiredate LIKE '80%';
SELECT COUNT(empno) AS "Total", 
    SUM(
FROM emp
group by 1980;
--4. 업무		   10	      20	     30	      Total
--	-------------------------------------------------------------------------------
--	ANALYST			     6000		           6000
--	CLERK	    1300	 1900  	     950	   4150
--	MANAGE		2450	 2975  	    2850	   8275
--	PRESIDEN  	5000			               5000
--	SALESMAN			 5600	               5600


--1. Blake와 같은 부서에 있는 모든 직원의 사번, 이름, 입사일자 조회
SELECT empno, ename, hiredate FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename='BLAKE');
--2. SELECT empno, ename, deptno, sal, comm FROM emp
--WHERE (sal, comm) IN(SELECT sal, comm FROM emp WHERE deptno=30);
--이 쿼리에서 보너스가 null인 사람도 출력될 수 있도록 수정하시오.
SELECT empno, ename, deptno, sal, comm FROM emp
WHERE (sal, comm) IN (SELECT sal, comm FROM emp WHERE deptno=30 OR comm IS NULL);
--
--3. 평균 급여 이상을 받는 직원들의  사번, 이름을 조회. 단, 급여가 많은 순으로 정렬
SELECT empno, ename FROM emp WHERE sal > (SELECT AVG(sal) FROM emp) ORDER BY sal DESC;
--
--4. 이름에 T자가 들어가는 직원이 근무하는 부서에서 근무하는 직원의 사번, 이름, 급여 조회
SELECT empno, ename, sal FROM emp WHERE ename IN (SELECT ename FROM emp WHERE ename LIKE '%T%');
--5. 부서의 위치가 dallas인 모든 직원에 대해 사번, 이름, 급여, 업무조회
SELECT empno, ename, sal, job FROM emp WHERE deptno IN (SELECT deptno FROM dept WHERE loc = 'DALLAS');
--6. King에게 보고하는 모든 직원의 이름과 부서, 업무, 급여를 조회
SELECT ename, deptno, job, sal FROM emp WHERE mgr IN (SELECT mgr FROM emp WHERE mgr = 7839);
--7. 급여가 30번 부서의 최저급여보다 높은 직원의 사번, 이름, 급여 조회
SELECT empno, ename, sal FROM emp WHERE sal > (SELECT MIN(sal) FROM emp WHERE deptno = 30);
--
--8. 10번부서에서 30번 부서의 직원과 같은 업무를 하는 직원의 이름과 업무를 조회
SELECT ename, job FROM emp WHERE deptno = 10 AND job IN (SELECT job FROM emp WHERE deptno = 30); 
--9. 가장 최근에 입사한 직원의 이름과 부서, 업무, 급여를 조회
SELECT ename, deptno, job, sal FROM (SELECT * FROM emp  ORDER BY hiredate DESC) WHERE ROWNUM = 1; 

--************************** JOIN 문제 *********************************
--1. Newyork에서 근무하는 직원의 사번, 이름, 업무, 부서명을 조회
select * from dept;
SELECT empno, ename, job, dname FROM emp e JOIN dept d ON d.loc = 'NEW YORK';
--2. 보너스를 받는 직원에 대해 이름, 부서명, 근무지를 조회
SELECT ename, dname, loc FROM emp e JOIN dept d ON e.comm IS NOT NULL AND e.comm != 0;
--3. 이름 중간에 L자가 있는 직원의 이름, 업무, 부서명, 근무지를 조회
SELECT ename, job, dname, loc FROM emp e JOIN dept d ON e.ename LIKE '%L%';
--4. 각 직원들에 대해 그들의 관리자보다 먼저 입사한 직원의 이름, 입사일, 
SELECT ename, hiredate FROM emp WHERE hiredate < ANY (SELECT e2.hiredate FROM emp e1 JOIN emp e2 ON e1.mgr = e2.empno);
--
--5. 말단사원의 사번, 이름, 업무, 부서번호, 근무지를 조회
-- 보고하는 직원이 없는 사원, 입사일이 제일 늦은 사람 -- miller
SELECT e2.empno, e2.ename, e2.job, e2.deptno, loc
FROM emp e1 JOIN emp e2 
ON e1.mgr IS NULL AND e2.hiredate = (SELECT MAX(hiredate) FROM emp)
JOIN dept 
ON e2.deptno = dept.deptno;
--*. 테이블을 생성한다.
CREATE TABLE tblBook(
author varchar2(20),
title varchar2(20)
);
--
INSERT INTO tblBook VALUES('최주현', '하늘과 땅');
INSERT INTO tblBook VALUES('최주현', '바다');
INSERT INTO tblBook VALUES('유은정', '바다');
INSERT INTO tblBook VALUES('박성우', '문');
INSERT INTO tblBook VALUES('최주현', '문');
INSERT INTO tblBook VALUES('박성우', '천국');
INSERT INTO tblBook VALUES('최지은', '천국');
INSERT INTO tblBook VALUES('최주현', '천국');
INSERT INTO tblBook VALUES('박성우', '고슴도치');
INSERT INTO tblBook VALUES('서금동', '나');
--
--6. 한권의 책에 대해 두명 이상의 작가가 쓴 책을 검색
--책이름 작가명 작가명
select * from tblBook;
SELECT DISTINCT t1.title AS 책이름, t1.author AS 작가명
FROM tblBook t1
WHERE EXISTS (SELECT * FROM tblBook t2 WHERE t2.title = t1.title AND t2.author != t1.author)
ORDER BY t1.title;