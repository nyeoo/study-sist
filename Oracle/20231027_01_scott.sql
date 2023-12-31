SELECT USER
FROM DUAL;
--==>> SCOTT


--○ TBL_EMP 테이블에서 수당(커미션, COMM)이 가장 많은 사원의
--   사원번호, 사원명, 부서번호, 직종명, 커미션 항목을 조회한다.


SELECT EMPNO, ENAME, DEPTNO, JOB, COMM
FROM TBL_EMP
WHERE COMM이 가장 많은 사원;

SELECT EMPNO "사원번호", ENAME "사원명", DEPTNO "부서번호", JOB "직종명", COMM "커미션"
FROM TBL_EMP
WHERE COMM >=ALL(SELECT COMM FROM TBL_EMP);
--==>> 조회 결과 없음
-- NULL 값을 빼고 얻어내야 함을 알 수 있음

-- 선생님풀이
SELECT EMPNO "사원번호", ENAME "사원명", DEPTNO "부서번호", JOB "직종명", COMM "커미션"
FROM TBL_EMP
WHERE COMM >=ALL(SELECT COMM FROM TBL_EMP WHERE COMM IS NOT NULL);


-- 첫번째 방법
SELECT EMPNO "사원번호", ENAME "사원명", DEPTNO "부서번호", JOB "직종명", COMM "커미션"
FROM TBL_EMP
WHERE COMM >=ALL(SELECT NVL(COMM,0) FROM TBL_EMP);

-- 두번째 방법
SELECT EMPNO "사원번호", ENAME "사원명", DEPTNO "부서번호", JOB "직종명", COMM "커미션"
FROM TBL_EMP
WHERE COMM = (SELECT MAX(NVL(COMM,0)) FROM TBL_EMP);
--==>> 7654	MARTIN	30	SALESMAN	1400

--○ DISTINCT() 중복 행(레코드)을 제거하는 함수

SELECT DISTINCT(JOB)
FROM TBL_EMP;

SELECT DISTINCT(DEPTNO)
FROM TBL_EMP;



-- TBL_EMP 테이블에서 관리자로 등록된 사원의
-- 사원번호, 사원명, 직종명을 조회한다.

SELECT EMPNO, ENAME, JOB
FROM TBL_EMP
WHERE 관리자로 등록된 사원;

SELECT EMPNO, ENAME, JOB
FROM TBL_EMP
WHERE 사원번호 = MGR 로 등록된 사원;


SELECT EMPNO, ENAME, JOB
FROM TBL_EMP
WHERE 사원번호 = (7902, 7698, 7839, 7566, NULL, 7788, 7566, 7782);

SELECT EMPNO, ENAME, JOB
FROM TBL_EMP
WHERE EMPNO IN (7902, 7698, 7839, 7566, NULL, 7788, 7566, 7782);

SELECT EMPNO, ENAME, JOB
FROM TBL_EMP
WHERE EMPNO IN (SELECT DISTINCT(MGR) FROM TBL_EMP); 
--==>>
/*
7902	FORD	ANALYST
7698	BLAKE	MANAGER
7839	KING	PRESIDENT
7566	JONES	MANAGER
7788	SCOTT	ANALYST
7782	CLARK	MANAGER
*/

--------------------------------------------------------------------------------

SELECT *
FROM TBL_SAWONBACKUP;


--○ TBL_SAWON 테이블 백업(데이터 위주--> 테이블간의 관계나 제약조건은 상관없이 이관하는 것)


CREATE TABLE TBL_SAWONBACKUP
AS
SELECT *
FROM TBL_SAWON;
--==>> Table TBL_SAWONBACKUP이(가) 생성되었습니다.
-- 즉, 다른 이름의 테이블로 저장해 둔 상황



--○ 데이터 수정
UPDATE TBL_SAWON
SET SANAME ='똘똘이';
--==>> 15개 행 이(가) 업데이트되었습니다.

COMMIT;
--==>> 커밋 완료.



SELECT *
FROM TBL_SAWON;
--==>>
/*
1001	똘똘이	9710171234567	2005-01-03	3000
1002	똘똘이	9511182234567	1999-11-23	4000
1003	똘똘이	9902082234567	2006-08-10	4000
1004	똘똘이	9708112234567	2010-05-06	5000
1005	똘똘이	0502034234567	2015-10-19	1000
1006	똘똘이	0609304234567	2012-06-17	1000
1007	똘똘이	6510102234567	1999-08-22	2000
1008	똘똘이	6909101234567	1998-01-10	2000
1009	똘똘이	0505053234567	2011-05-06	1500
1010	똘똘이	6611112234567	2000-01-16	1300
1011	똘똘이	9501061234567	2009-09-19	4000
1012	똘똘이	0606064234567	2011-11-11	2000
1013	똘똘이	6511111234567	1999-11-11	2000
1014	똘똘이	9904171234567	2009-11-11	2000
1015	똘똘이	0202023234567	2010-10-10	2300
*/


--UPDATE TBL_SAWON
--SET SANAME = 
--WHERE ()


UPDATE TBL_SAWON TS
SET
SANAME =
(
    SELECT TB.SANAME
    FROM TBL_SAWONBACKUP TB
    WHERE TS.SANO = TB.SANO 
)
WHERE SANAME = '똘똘이';



--○ 커밋
COMMIT;
--==>> 커밋 완료.






