# Autor: Julian Loaiza
@Hu1
Feature: Ingreso a la tienda virtual

  @Caso1
  Scenario Outline: verificar el ingreso correcto a la tienda virtual
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Then se verifica que ingreso correctamente
      | validacion   |
      | <validacion> |

    Examples:
      | usuario      | contrasenna  | validacion |
      | problem_user | secret_sauce | Products   |


  @Caso2
  Scenario Outline: verificar el ingreso correcto con diferentes usuarios
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Then se verifica que ingreso correctamente
      | validacion   |
      | <validacion> |

    Examples:
      | usuario                 | contrasenna  | validacion |
      | standard_user           | secret_sauce | Products   |
      | problem_user        | secret_sauce | Products   |
      | performance_glitch_user | secret_sauce | Products   |

  @Caso3
  Scenario Outline: verificar mensaje de error al ingresar credenciales invalidas
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Then verifica el mensaje de error
      | mensajeError   |
      | <mensajeError> |

    Examples:
      | usuario       | contrasenna     | mensajeError                                                              |
      | lockedoutuser | secret_sauce123 | Epic sadface: Username and password do not match any user in this service |

