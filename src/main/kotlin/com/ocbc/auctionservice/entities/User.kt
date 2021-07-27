package com.ocbc.auctionservice.entities

import javax.persistence.*

@Entity
@Table(name = "Users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Int,

    @Column(name = "name")
    val name: String,

    @Column(name = "address")
    val address: String,

    @Column(name = "age")
    val age: Int
)