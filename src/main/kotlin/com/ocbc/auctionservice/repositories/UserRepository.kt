package com.ocbc.auctionservice.repositories

import com.ocbc.auctionservice.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
}