package com.pduda.method

object ClientOfAuthenticator {
  def main(args: Array[String]): Unit =
    new ClientOfAuthenticator(new AuthenticationService).run()
}
class ClientOfAuthenticator(private var authenticationService: AuthenticationService) {
  def run(): Unit = {
    val authenticated = authenticationService.isAuthenticated(33)
    println("33 is authenticated = " + authenticated)
  }
}
