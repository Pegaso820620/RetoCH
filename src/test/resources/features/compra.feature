# Autor: Julian Loaiza
@Hu3
Feature: Comprobar que el producto seleccionado se encuentre en el carrito

  @Caso1
  Scenario Outline: realizar una compra de un producto
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona un producto para ingresarlo al carrito
    And ingreso al carrito de compras
    And inicie el checkout
    And ingrese los datos y finalice la compra
      | nombre   | apellido   | zip   |
      | <nombre> | <apellido> | <zip> |
    Then la compra se realize de forma correcta
      | confirmacion   |
      | <confirmacion> |

    Examples:
      | usuario       | contrasenna  | nombre | apellido | zip    | confirmacion              |
      | standard_user | secret_sauce | Andres | Lopez    | 363636 | Thank you for your order! |

  @Caso2
  Scenario Outline: validar campos vacios en informacion de envio
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona un producto para ingresarlo al carrito
    And ingreso al carrito de compras
    And inicie el checkout
    And ingrese los datos
      | nombre   | zip   |
      | <nombre> | <zip> |
    Then el sistema mostrar un mensaje de alerta
      | mensaje_vacio    |
      | <mensaje_vacio> |

    Examples:
      | usuario       | contrasenna  | nombre | zip    | mensaje_vacio                |
      | standard_user | secret_sauce | Andres | 363636 | Error: Last Name is required |

  @Caso3
  Scenario Outline: realizar una compra de varios productos
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona varios productos para ingresarlo al carrito
    And ingreso al carrito de compras
    And inicie el checkout
    And ingrese los datos y finalice la compra
      | nombre   | apellido   | zip   |
      | <nombre> | <apellido> | <zip> |
    Then la compra se realize de forma correcta
      | confirmacion   |
      | <confirmacion> |

    Examples:
      | usuario       | contrasenna  | nombre | apellido | zip    | confirmacion              |
      | standard_user | secret_sauce | Andres | Lopez    | 363636 | Thank you for your order! |