package com.github.sawafrolov.digitalloan.loanrequestservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoanRequestServiceApplication

fun main(args: Array<String>) {
    runApplication<LoanRequestServiceApplication>(*args)
}
