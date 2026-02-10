class AuthenticationService:
    def is_authenticated(self, user_id):
        return user_id == 12345


class AuthenticationClient:
    def __init__(self, authentication_service):
        self.authentication_service = authentication_service

    def run(self):
        authenticated = self.authentication_service.is_authenticated(33)
        print("is authenticated: ", str(authenticated))


class YetAnotherClient:
    def run(self):
        AuthenticationService().is_authenticated(100)
