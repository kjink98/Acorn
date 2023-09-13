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


--1. Blake�� ���� �μ��� �ִ� ��� ������ ���, �̸�, �Ի����� ��ȸ
SELECT empno, ename, hiredate FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename='BLAKE');
--2. SELECT empno, ename, deptno, sal, comm FROM emp
--WHERE (sal, comm) IN(SELECT sal, comm FROM emp WHERE deptno=30);
--�� �������� ���ʽ��� null�� ����� ��µ� �� �ֵ��� �����Ͻÿ�.
SELECT empno, ename, deptno, sal, comm FROM emp
WHERE (sal, comm) IN (SELECT sal, comm FROM emp WHERE deptno=30 OR comm IS NULL);
--
--3. ��� �޿� �̻��� �޴� ��������  ���, �̸��� ��ȸ. ��, �޿��� ���� ������ ����
SELECT empno, ename FROM emp WHERE sal > (SELECT AVG(sal) FROM emp) ORDER BY sal DESC;
--
--4. �̸��� T�ڰ� ���� ������ �ٹ��ϴ� �μ����� �ٹ��ϴ� ������ ���, �̸�, �޿� ��ȸ
SELECT empno, ename, sal FROM emp WHERE ename IN (SELECT ename FROM emp WHERE ename LIKE '%T%');
--5. �μ��� ��ġ�� dallas�� ��� ������ ���� ���, �̸�, �޿�, ������ȸ
SELECT empno, ename, sal, job FROM emp WHERE deptno IN (SELECT deptno FROM dept WHERE loc = 'DALLAS');
--6. King���� �����ϴ� ��� ������ �̸��� �μ�, ����, �޿��� ��ȸ
SELECT ename, deptno, job, sal FROM emp WHERE mgr IN (SELECT mgr FROM emp WHERE mgr = 7839);
--7. �޿��� 30�� �μ��� �����޿����� ���� ������ ���, �̸�, �޿� ��ȸ
SELECT empno, ename, sal FROM emp WHERE sal > (SELECT MIN(sal) FROM emp WHERE deptno = 30);
--
--8. 10���μ����� 30�� �μ��� ������ ���� ������ �ϴ� ������ �̸��� ������ ��ȸ
SELECT ename, job FROM emp WHERE deptno = 10 AND job IN (SELECT job FROM emp WHERE deptno = 30); 
--9. ���� �ֱٿ� �Ի��� ������ �̸��� �μ�, ����, �޿��� ��ȸ
SELECT ename, deptno, job, sal FROM (SELECT * FROM emp  ORDER BY hiredate DESC) WHERE ROWNUM = 1; 

--************************** JOIN ���� *********************************
--1. Newyork���� �ٹ��ϴ� ������ ���, �̸�, ����, �μ����� ��ȸ
select * from dept;
SELECT empno, ename, job, dname FROM emp e JOIN dept d ON d.loc = 'NEW YORK';
--2. ���ʽ��� �޴� ������ ���� �̸�, �μ���, �ٹ����� ��ȸ
SELECT ename, dname, loc FROM emp e JOIN dept d ON e.comm IS NOT NULL AND e.comm != 0;
--3. �̸� �߰��� L�ڰ� �ִ� ������ �̸�, ����, �μ���, �ٹ����� ��ȸ
SELECT ename, job, dname, loc FROM emp e JOIN dept d ON e.ename LIKE '%L%';
--4. �� �����鿡 ���� �׵��� �����ں��� ���� �Ի��� ������ �̸�, �Ի���, 
SELECT ename, hiredate FROM emp WHERE hiredate < ANY (SELECT e2.hiredate FROM emp e1 JOIN emp e2 ON e1.mgr = e2.empno);
--
--5. ���ܻ���� ���, �̸�, ����, �μ���ȣ, �ٹ����� ��ȸ
-- �����ϴ� ������ ���� ���, �Ի����� ���� ���� ��� -- miller
SELECT e2.empno, e2.ename, e2.job, e2.deptno, loc
FROM emp e1 JOIN emp e2 
ON e1.mgr IS NULL AND e2.hiredate = (SELECT MAX(hiredate) FROM emp)
JOIN dept 
ON e2.deptno = dept.deptno;
--*. ���̺��� �����Ѵ�.
CREATE TABLE tblBook(
author varchar2(20),
title varchar2(20)
);
--
INSERT INTO tblBook VALUES('������', '�ϴð� ��');
INSERT INTO tblBook VALUES('������', '�ٴ�');
INSERT INTO tblBook VALUES('������', '�ٴ�');
INSERT INTO tblBook VALUES('�ڼ���', '��');
INSERT INTO tblBook VALUES('������', '��');
INSERT INTO tblBook VALUES('�ڼ���', 'õ��');
INSERT INTO tblBook VALUES('������', 'õ��');
INSERT INTO tblBook VALUES('������', 'õ��');
INSERT INTO tblBook VALUES('�ڼ���', '����ġ');
INSERT INTO tblBook VALUES('���ݵ�', '��');
--
--6. �ѱ��� å�� ���� �θ� �̻��� �۰��� �� å�� �˻�
--å�̸� �۰��� �۰���
select * from tblBook;
SELECT DISTINCT t1.title AS å�̸�, t1.author AS �۰���
FROM tblBook t1
WHERE EXISTS (SELECT * FROM tblBook t2 WHERE t2.title = t1.title AND t2.author != t1.author)
ORDER BY t1.title;