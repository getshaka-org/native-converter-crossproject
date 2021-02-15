package com.example.nccp.dto

import org.getshaka.nativeconverter.NativeConverter

case class User(name: String, isAdmin: Boolean, age: Int) derives NativeConverter

