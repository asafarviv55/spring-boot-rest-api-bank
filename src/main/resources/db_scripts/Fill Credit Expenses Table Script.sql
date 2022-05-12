
use bankdb;

delete from credit_expenses where id > 0;

INSERT INTO credit_expenses ( owner, expense_amount, created_at) VALUES ( 1 , 1900 , now() ); 

select * from credit_expenses;
