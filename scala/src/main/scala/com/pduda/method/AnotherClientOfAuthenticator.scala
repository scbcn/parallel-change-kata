package com.pduda.method

class AnotherClientOfAuthenticator {
  def unusedClientCode(): Unit = try new AuthenticationService().isAuthenticated(3545)
  catch {
    case e: Exception =>

    // ignored
  }
}
