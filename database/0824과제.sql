
--1. country_id별 지역 개수를 구하여 출력하세요.
--group by 기능을 사용
select country_id, count(*) from locations group by country_id order by country_id asc;

--2. 작업자 중에서 급여를 가장 많이 받는 사람을 5명 출력하세요.
--employees 테이블에서 salary를 내림차순으로 정렬하고 rownum 5까지 자른다
--탑앤쿼리


select*from(
    select TMP.*, rownum rn from(
        select*from employees order by salary desc
    )TMP
)where rn between 1 and 5;


--3. 작업자 중에서 가장 오래 근무한 사람을 3명 출력하세요.
--입사 빨리한순서대로3명

select*from(
    select TMP.*, rownum rn from(
        select*from employees order by hire_date asc
    )TMP
)where rn between 1 and 3;

--4. 작업 이력 중에서 가장 오랜 기간 동안 작업한 사람의 id를 출력하세요.
--작업이력  job_history
--max(end_date-start_date) 을 만들어야하는줄알고 뻘짓했음 
--ORA-00937: not a single-group group function
--SUM, AVG, COUNT, MAX, MIN, STDDEV, VARIANCE는 그룹 함수(그룹으로 묶어서 처리해야 하는 함수)다.
--그룹함수를 썼으면 group by절이 반드시 들어가야 하고, group by절에는  select절에 있는 모든 함수가 들어가야 한다.

select * from (
    select TMP.*, rownum rn from (
        select job_id, end_date - start_date from job_history
        order by end_date - start_date desc
    )TMP
) where rn =1;


--5. job_id별 평균, 최대,최소 급여 출력
--4번에서 본 그룹함수의특성 다시한번 생각하기
select job_id, max(salary)최대급여, min(salary)최저급여, avg(salary)평균 from employees
group by job_id order by job_id asc;




--6. 작업자를 급여순서대로 순위를 매겨 출력하세요(전체/직군(JOB_ID)별)

--전체별 순위
select employees.*, rank() over(order by salary desc)전체봉급순위 from employees;

--직군별 순위
select employees.*, rank() over(partition by job_id order by salary desc)직군별봉급순위 from employees;
