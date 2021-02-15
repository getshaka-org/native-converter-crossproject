package com.example.nccp

import com.example.nccp.dto.User

object App:
  @main def launchServer: Unit =
    println("beep.. boop.. " + User("adam smith", true, 530))
