#language: es
@FeatureName:BuyProductInOnlineStore

  Característica: Comprar dos productos en tienda Online

    @SauceLogout
    Escenario: Comprar dos productos exitosamente en tienda online
      Dado que Efrain inicia sesion
      Cuando agrega dos productos al carrito de compras
      Entonces hace la compra exitosamente