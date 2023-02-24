# Conversor-de-Moneda---Challenge-ONE-Java

<h1><span style="color: #ecf0f1;"><strong>Conversor de moneda en Java</strong></span></h1>
<p>Este proyecto consiste en una aplicaci&oacute;n Java que permite convertir entre diferentes monedas utilizando tipos de cambio preestablecidos.</p>
<h2><span style="color: #ecf0f1;">C&oacute;mo usar</span></h2>
<p>Para usar la aplicaci&oacute;n, simplemente ejecute el m&eacute;todo main en la clase MainWhitJOptionPane. Al hacerlo, se le pedir&aacute; que ingrese un monto en la moneda de origen, luego se le pedir&aacute; que seleccione la moneda de origen y la moneda de destino, y finalmente se mostrar&aacute; el monto convertido en la moneda de destino.</p>
<p>La aplicaci&oacute;n le permite realizar varias conversiones de moneda consecutivas sin tener que volver a ejecutar el m&eacute;todo main. Una vez que se completa una conversi&oacute;n, se le preguntar&aacute; si desea realizar otra.<br /><br /></p>
<h2><span style="color: #ecf0f1;"><strong>C&oacute;mo funciona</strong></span></h2>
<p>El proyecto consta de tres clases:</p>
<ul>
<li><strong>Money </strong>representa una cantidad de dinero en una moneda determinada.</li>
<li><strong>Currency </strong>enumera las monedas que se pueden usar en la aplicaci&oacute;n.</li>
<li><strong>CurrencyConverter </strong>maneja las conversiones de moneda.<br /><br />La clase Money tiene un m&eacute;todo convertTo() que convierte una cantidad de dinero de una moneda a otra. <br />La clase CurrencyConverter tiene un m&eacute;todo convert() que realiza la conversi&oacute;n real.</li>
</ul>
<p>La clase MainWhitJOptionPane se encarga de interactuar con el usuario a trav&eacute;s de una interfaz de usuario b&aacute;sica proporcionada por JOptionPane. Al ejecutar main, se le solicita al usuario que ingrese el monto en la moneda de origen, seleccione la moneda de origen y la moneda de destino, y se muestra el resultado de la conversi&oacute;n en una ventana de mensaje.</p>
<p>Modificaci&oacute;n de tipos de cambio<br />Para modificar los tipos de cambio utilizados en la aplicaci&oacute;n, debe modificar la implementaci&oacute;n del m&eacute;todo getExchangeRate() en la clase <strong>CurrencyConverter.</strong> Actualmente, para cada par de moneda se utiliza una matriz de tipos de cambio preestablecidos est&aacute;ticamente, con actualizaci&oacute;n de las conversiones actuales proporcionadas por Google 23-2-23. Si desea utilizar un servicio web de terceros o una API de cambio de moneda para obtener los tipos de cambio, puede modificar esta implementaci&oacute;n en consecuencia.</p>
<h2><span style="color: #ecf0f1;"><strong>Limitaciones</strong></span></h2>
<p>Este proyecto es solo una implementaci&oacute;n simple de un conversor de moneda y tiene varias limitaciones, como:</p>
<ul>
<li>Los tipos de cambio son preestablecidos y no se actualizan en tiempo real.</li>
<li>Se realizan verificaciones b&aacute;sicas de entrada del usuario, lo que significa que si el usuario ingresa una entrada no v&aacute;lida, la aplicaci&oacute;n puede bloquearse.</li>
<li>Solo se admiten unas pocas monedas, por lo que si desea convertir entre monedas que no est&aacute;n en la lista, deber&aacute; agregarlas manualmente.</li>
</ul>
<p>#Autor: Andr&eacute;s garc&iacute;a<br />#Linkedln: @autentoken</p>
<div id="_rc_sig"></div>
