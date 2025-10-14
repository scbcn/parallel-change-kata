package com.pduda.method

import com.pduda.method.AuthenticationService

class AuthenticationServiceTest extends munit.FunSuite {
  test("administrator is always authenticated") {
    val service = new AuthenticationService
    val adminId = 12345
    assert(service.isAuthenticated(adminId))
  }

  test("normal user is not authenticated initially") {
    val service      = new AuthenticationService
    val normalUserId = 11111
    assert(!service.isAuthenticated(normalUserId))
  }
}
