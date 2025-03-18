docker run -d \
--name loanConfirm-mysql \
-e MYSQL_ROOT_PASSWORD="loanConfirm" \
-e MYSQL_USER="loanConfirm" \
-e MYSQL_PASSWORD="loanConfirm" \
-e MYSQL_DATABASE="loanConfirm" \
-p 3307:3307 \
mysql:latest