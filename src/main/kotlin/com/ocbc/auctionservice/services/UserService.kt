package com.ocbc.auctionservice.services

import com.ocbc.auctionservice.entities.User
import org.springframework.stereotype.Service

@Service
class UserService {
    private var users:MutableList<User> = mutableListOf(
        User(
            id = 0,
            address = "Toa Payoh",
            age = 39,
            name = "Toru"
        ),
        User(
            id = 1,
            address = "Tampines",
            age = 35,
            name = "Shan Feng"
        ),
        User(
            id = 2,
            address = "Bishan",
            age = 20,
            name = "Alex"
        ),
        User(
            id = 3,
            address = "Raffles Place",
            age = 40,
            name = "Alicia"
        ),
        User(
            id = 4,
            address = "River Valley",
            age = 13,
            name = "Morgan"
        )
    )

    fun getUsers() = users

    fun getUser(id: Int): User? {
        return users.firstOrNull { it.id == id }
    }

    fun createUser(user: User): User {
        users.add(user)
        return user
    }

    fun updateUser(user: User): User {
        return user
    }

    fun deleteUser(user: User): User {
        return user
    }
}