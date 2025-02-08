Feature: Recruitment
@Test1
Scenario: Realizar proceso de contratación
Given El usuario está en la página de inicio de sesión Orange
When El usuario ingresa la cedula y la contraseña Orange
And El usuario hace clic en el botón de Entrar Orange
Then El usuario debe ser redirigido a Dashboard Orange
And El usuario hace clic en Recruitment Orange y en agregar