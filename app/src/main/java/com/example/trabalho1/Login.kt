package com.example.trabalho1

import java.io.Serializable

data class Login (
  var username: String,
  var password: String
) : Serializable{
  
  override fun toString(): String{
    return this.username
  }
}
