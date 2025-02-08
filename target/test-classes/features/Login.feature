Feature: Login
  @Test0
  Scenario: Login exitoso con credenciales válidas
    Given El usuario está en la página de inicio de sesión
    When El usuario ingresa la cedula y la contraseña
    And El usuario hace clic en el botón de Entrar
    Then El usuario debe ser redirigido a Dashboard


