drop table AccessToken;
create table if not exists AccessToken (
  token varchar(25) primary key,
  expire varchar(26) NOT NULL,
  created_at TIMESTAMP,
  updated_at TIMESTAMP
);

delete from AccessToken;
insert into AccessToken
VALUES( 'FwSKxcV5a5asNsDYzRDwQs2Ri', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) + 60, NOW(), NOW()),
( 'uNbYAQTd4nehr2RL2gsEdbQrH', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) , NOW(), NOW()),
( 'H7wDcHQPXkZ3RY3rxZuYf8gbN', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) + 60, NOW(), NOW());
