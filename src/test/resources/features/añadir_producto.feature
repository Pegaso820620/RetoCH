# Autor: Julian Loaiza
@Hu2
Feature: Comprobar que el producto seleccionado se encuentre en el carrito

  @Caso1
  Scenario Outline: ingresar un producto al carrito de compras
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona un producto para ingresarlo al carrito
    And ingreso al carrito de compras
    Then en el carrito de compras se mostrara el producto seleccionado
      | producto   |
      | <producto> |

    Examples:
      | usuario      | contrasenna  | producto            |
      | standard_user| secret_sauce | Sauce Labs Backpack |

  @Caso2
  Scenario Outline: seleccionar varios productos al carrito de compras
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona varios productos para ingresarlo al carrito
    And ingreso al carrito de compras
    Then en el carrito de compras se mostrara el total de productos seleccionados
      | cantidad   |
      | <cantidad> |

    Examples:
      | usuario      | contrasenna  | cantidad |
      | standard_user| secret_sauce | 3        |

  @Caso3
  Scenario Outline: eliminar un producto al carrito de compras
    Given que el usuario ingresa a la tienda virtual
    When ingrese usuario y contrasenna
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    And selecciona varios productos para ingresarlo al carrito
    And ingreso al carrito de compras
    And remuevo un producto seleccionado del carrito
    Then en el carrito de compras se mostrara el total de productos seleccionados
      | cantidad   |
      | <cantidad> |

    Examples:
      | usuario      | contrasenna  | cantidad |
      | standard_user | secret_sauce | 2        |
