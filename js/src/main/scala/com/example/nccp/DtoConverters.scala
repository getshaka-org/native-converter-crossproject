package com.example.nccp

import org.getshaka.nativeconverter.NativeConverter
import com.example.nccp.dto.User

object DtoConverters:
  given NativeConverter[User] = NativeConverter.derived
