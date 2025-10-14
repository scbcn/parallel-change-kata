package com.pduda.method

import com.pduda.method.AuthenticationService
import org.junit.Assert
import org.junit.Test

class AuthenticationServiceTest extends munit.FunSuite {
  test("administrator is always authenticated") {
    val service = new AuthenticationService
    val adminId = 12345
    Assert.assertTrue(service.isAuthenticated(adminId))
  }

  test("normal user is not authenticated initially") {
    val service      = new AuthenticationService
    val normalUserId = 11111
    Assert.assertFalse(service.isAuthenticated(normalUserId))
  }
}
