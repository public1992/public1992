create sequence customer_seq;
drop sequence customer_seq;
create table customer(
cus_nu number not null unique,
id varchar2(60) not null unique check(REGEXP_LIKE(id,'^[a-zA-Z0-9]{8,20}$')),
phone char(13) not null check(regexp_like(phone, '^(010)-[0-9]{3,4}-[0-9]{4}$')),
entry char(10) not null check(regexp_like(entry, '^((19|20)[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])$')),
lastday char(10) not null check(regexp_like(lastday, '^((19|20)[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])$')),
miliage number default 0 check(miliage>=0),
cus_level varchar2(21) check(cus_level in('일반','VIP','VVIP', '플래티넘'))
);

insert into customer(cus_nu, id, phone, entry, lastday, miliage, cus_level) 
values(customer_seq.nextval, 'testuser01', '010-1212-3434', '2022-01-01','2022-03-11',5500,'VIP');
insert into customer(cus_nu, id, phone, entry, lastday, miliage, cus_level) 
values(customer_seq.nextval, 'testuser02', '010-2323-4545', '2020-05-11', '2022-01-30', 7200, 'VVIP');
insert into customer(cus_nu, id, phone, entry, lastday, miliage, cus_level) 
values(customer_seq.nextval, 'testuser03', '010-3434-5656', '2021-11-26','2021-12-25', 30000, '플래티넘');
insert into customer(cus_nu, id, phone, entry, lastday, miliage, cus_level) 
values(customer_seq.nextval, 'testuser04', '010-4545-6767', '2022-02-03', '2022-03-15', 500, '일반');
insert into customer(cus_nu, id, phone, entry, lastday, miliage, cus_level) 
values(customer_seq.nextval, 'testuser05', '010-5656-7878', '2021-12-31', '2022-01-31', 800, '일반');

select*from customer;
