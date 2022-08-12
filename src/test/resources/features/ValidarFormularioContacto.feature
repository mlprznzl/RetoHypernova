Feature: Validar Formulario de Contacto

  Scenario: Correo invalido en formulario de contacto
    Given Usuario accede a la pagina de Hypernova
      And selecciona el modulo de Contacto
    When completa el formulario con un correo invalido
    Then el sistema retorna mensajes de error debido al correo invalido