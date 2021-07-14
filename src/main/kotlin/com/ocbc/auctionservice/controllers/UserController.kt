package com.ocbc.auctionservice.controllers

import com.ocbc.auctionservice.entities.User
import com.ocbc.auctionservice.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController {
    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun getUsers(): List<User> {
        return userService.getUsers()
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int): User? {
        return userService.getUser(id)
    }

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

//    @PutMapping
//    fun updateUser(){}
//
//    @DeleteMapping
//    fun deleteUser(){}
}