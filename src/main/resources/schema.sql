drop table AccessToken;
create table if not exists AccessToken (
  token varchar(25) primary key,
  created_at varchar(26),
  updated_at varchar(26)
);

delete from AccessToken;
insert into AccessToken
VALUES( 'FwSKxcV5a5asNsDYzRDwQs2Ri', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) , DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP())),
( 'uNbYAQTd4nehr2RL2gsEdbQrH', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) , DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP())),
( 'H7wDcHQPXkZ3RY3rxZuYf8gbN', DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()) , DATEDIFF('SECOND', timestamp '1970-01-01 09:00:00', CURRENT_TIMESTAMP()));
