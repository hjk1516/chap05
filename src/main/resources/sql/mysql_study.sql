SELECT * FROM dept;

SELECT * FROM emp;

UPDATE emp
   SET gender = 'M'
 WHERE gender = 'm';
 
UPDATE emp
	SET gender = 'F'
	where gender ='f';

COMMIT;

delete from tbl_emp;
select * from tbl_dept;
select * from tbl_emp;


insert into tbl_dept
select * from dept;

insert into tbl_emp
select * from emp;

insert into tbl_emp
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job, mgr, sal from emp;

