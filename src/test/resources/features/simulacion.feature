#language: es

Característica: El usuario quiere hacer compras

  Escenario: Agregar 2 productos al carro de compras.
    Dado que el usuario esta en la página inicial
    Cuando el usuario agrega productos en el carrito de compras
    Entonces el usuario completa compra "MDF 00010” se ha añadido a tu carrito. "

  Escenario: Eliminar producto
    Dado que el usuario esta en la página inicial
    Cuando el usuario elimina productos en el carrito de compras
    Entonces el usuario completa la eliminacion "¿Deshacer?"