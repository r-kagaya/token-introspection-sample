drop table AccessToken;
create table if not exists AccessToken (
  token varchar(25) primary key,
  created_at datetime,
  updated_at datetime
);

delete from AccessToken;
insert into AccessToken
VALUES( 'FwSKxcV5a5asNsDYzRDwQs2Ri', NOW() , NOW()),
( 'uNbYAQTd4nehr2RL2gsEdbQrH', NOW() , NOW()),
( 'H7wDcHQPXkZ3RY3rxZuYf8gbN', NOW() , NOW());
