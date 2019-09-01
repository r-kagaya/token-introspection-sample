# token-introspection-sample
token-introspection api

## How To Call
```
// already expired
$ curl -X POST -H 'Content-Type: application/x-www-form-urlencoded' -H 'Authorization: Basic Y2xpZW50aWQ6c2VjcmV0' -d "token=uNbYAQTd4nehr2RL2gsEdbQrH" -d "tokenTypeHint=access_token" http://localhost:8080/token/introspection

// expire after 1 minutes
$ curl -X POST -H 'Content-Type: application/x-www-form-urlencoded' -H 'Authorization: Basic Y2xpZW50aWQ6c2VjcmV0' -d "token=FwSKxcV5a5asNsDYzRDwQs2Ri" -d "tokenTypeHint=access_token" http://localhost:8080/token/introspection
```
