package com.loanConfirm.domain.domain

import javax.persistence.*

@Entity
@Table(name = "LOAN_REVIEW")
class LoanReview (
    @Column(name = "usr_key")
    var userKey: String,

    @Column(name = "loan_lmt_amt")
    var loanLimitedAmount: Long,

    @Column(name = "loan_intrt")
    var loanInterest: Double,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}