package com.ocbc.auctionservice.services

import com.ocbc.auctionservice.entities.User
import org.springframework.stereotype.Service

@Service
class UserService {
    private lateinit var users: List<User>

    fun getUser(id: Int): User? {
        return users.firstOrNull { it.id == id }
    }
}