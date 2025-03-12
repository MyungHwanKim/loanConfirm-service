docker run -d \
--name loanConfirm-mysql \
-e MYSQL_ROOT_PASSWORD="loanConfirm" \
-e MYSQL_USER="loanConfirm" \
-e MYSQL_PASSWORD="loanConfirm" \
-e MYSQL_DATABASE="loanConfirm" \
-e 3306:3306 \
mysql:latest