package com.loanConfirm.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.loanConfirm.domain"])
@EntityScan(basePackages = ["com.loanConfirm.domain"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}