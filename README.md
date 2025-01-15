# Conversor de monedas

Esta aplicación está diseñada para vincularse mediante la API ExchangeRate-API, empleada para la consulta de cambio de más de 160 divisas.

En esta aplicación, el usuario interactúa con la consola del entorno de Java para acceder a varias opciones, entre ellas están definidas de forma predeterminada las conversiones de dólar americano a peso colombiano, peso argentino y real brasileño, así como sus conversiones inversas. También le permite al usuario definir cualquier conversión permitiéndole escoger no solo la divisa de cambio, sino que puede escoger también la moneda local. Esto le brinda al usuario la posibilidad de escoger casi 26000 conversiones.

Para hacer la interacción de la aplicación con el usuario, se define un determinado número para la elección de las opciones. De acuerdo al número seleccionado, la aplicación se dirige a distintas opciones de acuerdo al requerimiento del usuario.

Hay seis opciones que hacen referencia a las divisas mencionadas anteriormente, después de escoger la tasa de cambio de interés se ingresa la cantidad de la divisa local, y luego envía un mensaje a pantalla haciendo una descripción de la corversión realizada. 

Existe también otra opción donde uno puede escoger una conversión de divisas diferente, en la cual, después de seleccionar la opción correspondiente, aparecen como opciones todas las divisas que hacen parte de la API, con las cuales se definen tanto la divisa local como la de cambio. Luego, el usuario define la cantidad de la divisa local y también envía un mensaje a la consola, del mismo modo que se hace con las conversiones predeterminadas.
