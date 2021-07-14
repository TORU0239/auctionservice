package com.ocbc.auctionservice.services

import com.ocbc.auctionservice.entities.User
import org.springframework.stereotype.Service

@Service
class UserService {
    private var users:MutableList<User> = mutableListOf()

    fun getUsers() = users

    fun getUser(id: Int): User? {
        return users.firstOrNull { it.id == id }
    }

    fun createUser(user: User): User {
        users.add(user)
        return user
    }
}