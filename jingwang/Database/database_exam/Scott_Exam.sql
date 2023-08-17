--1. 1981�⿡ �Ի��� ����� �̸�, ����, �Ի����ڸ� ��ȸ
SELECT ename, job, hiredate FROM emp WHERE hiredate LIKE '81%';
--2. ����� 7902, 7788, 7566�� ����� �̸�, ����, �޿�, �Ի����� ��ȸ
SELECT ename, job, sal, hiredate FROM emp WHERE empno IN (7902, 7788, 7566);
--3. ������ manager, clerk, anaylst�� �ƴ� ������ �̸�, ����, �޿�, �μ���ȣ ��ȸ
SELECT ename, job, sal, deptno FROM emp WHERE job NOT IN ('MANAGER', 'CLERK', 'ANALYST');
--4. ������ president �Ǵ� salesman�̰� �޿��� 1500�� ������ �̸�, �޿�, ����, �μ���ȣ ��ȸ
SELECT ename, sal, job, deptno FROM emp WHERE job IN ('PRESIDENT', 'SALESMAN') AND sal = 1500;
--5. ���� �ֱٿ� �Ի��� ������ �̸�, �μ�, ����, �Ի����� ��ȸ
SELECT ename, deptno, job, hiredate FROM emp ORDER BY hiredate DESC;
--6. ���� �μ������� ���� ������ �ϴ� ������ �޿��� ���� ������ ��ȸ
SELECT ename, deptno, sal FROM emp ORDER BY deptno, sal DESC;
--7. Ŀ�̼��� �޿����� 10%�̻� ���� ������ �޿��� ���� ������ ��ȸ
SELECT ename, comm, sal FROM emp WHERE comm >= sal*1.1 ORDER BY sal DESC;
--8. �̸��� L�� 2�� �ְ� 30�� �μ��̰ų� ���ӻ�簡 7782�� ������ �̸�, �μ�, ���ӻ�� ��ȸ
SELECT ename, deptno, mgr FROM emp WHERE (ename LIKE '%LL%' AND deptno = 30) OR mgr = 7782;

--************************* �Լ� ���� ******************************
--1. ���ú��� 12�� 25�ϱ��� ������ ���Ҵ°�?
SELECT TO_DATE('2023-12-25', 'YYYY-MM-DD') - TO_DATE(sysdate) FROM dual;
--2. ������� �ٹ��� �������� �ٹ��ϼ��� ���� ���Ϸ� ��ȸ.(��, �ٹ��ϼ��� ���� ��� ������ ��ȸ)
SELECT ename, hiredate, TRUNC((sysdate - hiredate) / 7) AS ��, TRUNC(mod((sysdate - hiredate), 7)) AS �� 
FROM emp
ORDER BY TRUNC(sysdate - hiredate) ASC;
--3. 10�� �μ� ������ �� ��������� �ٹ������� ����ؼ� ��ȸ
SELECT deptno, ename, hiredate, TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS �ٹ����� 
FROM emp 
WHERE deptno = 10;
--4. 20�� �μ� ������ �� �Ի����ڷκ��� 13������ ���� ���� ��¥�� ��ȸ
SELECT deptno, ename, hiredate, TRUNC(ADD_MONTHS(hiredate, 13)) AS "13������"
FROM emp
WHERE deptno = 20;
--5. ��� ������ ���� �Ի��� ���� �ٹ��ϼ��� ��ȸ
SELECT deptno, ename, hiredate, LAST_DAY(hiredate) - hiredate AS "�Ի�� �ٹ��ϼ�"
FROM emp;
--6. ���� �޿��� 15%�� ������ �޿��� ����Ͽ� ���, �̸�, �޿�, ������ �޿��� ��ȸ
--(��, �޿��� �ݿø��Ͽ� �����Ѵ�.)
SELECT empno, ename, sal, round(sal * 1.15) FROM emp;
--7. �̸�, �Ի���, �Ի��Ϸκ��� ��������� ����, �޿�, �޿� �Ѱ踦 ��ȸ
SELECT ename, hiredate, TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS "������� ���� ��",
        sal, sal * TRUNC(MONTHS_BETWEEN(sysdate, hiredate)) AS "�޿� �Ѱ�"
FROM emp;
--8. ������ analyst�̸� �޿��� 10%������Ű�� clerk�̸� 15%, manager�̸� 20%���� ���Ѽ� �̸�, ����, �޿�, ������ �޿��� ��ȸ
SELECT ename, job, sal, nvl(DECODE(job, 'ANALYST', sal * 1.1, 'CLERK', sal * 1.15, 'MANAGER', sal * 1.2), sal) AS "������ �޿�"
FROM emp;
--9. �̸��� ù���ڰ� k���� ũ�� y���� ���� ������ �̸�, �μ�, ������ ��ȸ�Ͻÿ�.
SELECT ename, deptno, job FROM emp WHERE ename BETWEEN 'L' AND 'X';

--1. �ο���, ���ʽ��� null�� �ƴ� �ο���, ���ʽ��� ���(���ʽ��� null�̾ƴ� ���, null�� ������ ���), 
--��ϵǾ� �ִ� �μ��� ��(�ߺ� ����)�� ���Ͽ� ��ȸ
SELECT COUNT(empno) AS �ο���, COUNT(comm) AS "���ʽ� �ο��� null����", AVG(comm) AS "���ʽ� null ���",
    AVG(NVL(comm,0)) AS "���ʽ� ���(NULL ����)", COUNT(DISTINCT (deptno)) AS "�μ��� ��"
FROM emp;

--2.	�⵵	count	  min		  max		  avg		sum
--	-------------------------------------------------------------------------
--	80	   1	     800		  800		  800		800
--	81	   10	     950		  5000	  	  2282.5	22825
--	82	   2	     1300	      3000	  	  2150	  	4300
--	83	   1	     1100	      1100	  	  1100	  	1100
SELECT EXTRACT(year from hiredate) AS �⵵, COUNT(hiredate) AS "count", MIN(sal) AS "min", 
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
--4. ����		   10	      20	     30	      Total
--	-------------------------------------------------------------------------------
--	ANALYST			     6000		           6000
--	CLERK	    1300	 1900  	     950	   4150
--	MANAGE		2450	 2975  	    2850	   8275
--	PRESIDEN  	5000			               5000
--	SALESMAN			 5600	               5600