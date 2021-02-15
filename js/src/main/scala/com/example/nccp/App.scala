package com.example.nccp

import org.getshaka.nativeconverter.EsConverters.given
import org.getshaka.nativeconverter.NativeConverter

import com.example.nccp.dto.User
import scala.collection.Map
import scala.collection.mutable.HashMap
import scala.scalajs.js.JSON
import scala.scalajs.js

@main def launchApp: Unit =
  val u = User("hello", true, 69)
  println("User json: " + u.toJson)

  val map = HashMap(1 -> 2, 3 -> 4)
  val es6Map = NativeConverter[Map[Int, Int]].toNative(map)
  println("es6Map.get(3): " + es6Map.asInstanceOf[js.Dynamic].get(3))
