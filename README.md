# tarea3 - Tercera Iteración
La presente tarea pretende la puesta en práctica y profundización de los siguientes puntos:
  ● Lograr la interoperabilidad de aplicaciones distribuidas vía Web Services.
  ● Diseño Responsive.

Basados en los lineamientos definidos en la Descripción de la tarea 2, en esta
tercera etapa, se continuará con el desarrollo de los componentes Servidor Central y
Servidor Web y se desarrollará el componente Dispositivo Móvil. Al finalizar esta
iteración se contará con las aplicaciones ejecutando cada una de ellas de forma
independiente en sus nodos correspondientes, comunicándose entre sí.

A la hora de considerar el mecanismo de comunicación y teniendo en cuenta la
amplia gama de dispositivos en el mercado, se valora especialmente la
interoperabilidad del sistema. El intercambio de datos mediante Web Services
contempla esta situación ya que se trata de un protocolo de comunicación basado en
estándares.

En esta tarea el Servidor Central es quién se encarga de centralizar los datos de la
ejecución. La lógica del negocio que provee el Servidor Central se invoca en forma
directa desde la Estación de Trabajo, y a la vez, se expone como Web Services para ser
accedida en forma remota desde el Servidor Web, para atender tanto al cliente web
como al dispositivo móvil.
