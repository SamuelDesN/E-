Como funciona el codigo:
    Selección del tipo de vehículo: El usuario ingresa el tipo de vehículo que ingresa al taller (coche, moto, camión, tractor o grúa).
    Creación del vehículo: Se crea un objeto de la clase correspondiente al tipo de vehículo ingresado, utilizando la información de matrícula, color y marca predefinida en el código.
    Descripción del vehículo: Se muestra una descripción del vehículo, incluyendo su matrícula, color, marca y las piezas que tiene.
    Reparación de piezas: El usuario indica qué pieza del vehículo necesita reparación, ingresando el número correspondiente.
    Decisión de seguir o salir: Después de reparar una pieza, el programa pregunta al usuario si desea seguir reparando ese mismo vehículo o salir del taller. Si elige seguir, se repite el proceso de reparación de piezas. Si elige salir, el programa termina.
    El código utiliza un bucle while para permitir al usuario seguir reparando el mismo vehículo hasta que decida salir. Se utilizan diferentes clases para representar los diferentes tipos de vehículos y se utiliza polimorfismo para tratarlos de manera uniforme en el código. El programa utiliza la clase Scanner para interactuar con el usuario y obtener su entrada desde la consola.


Preguntas:
    ¿Puede existir esta estructura primero una clase padre, una clase hijo y un hijo de la clase hijo en Java?
        Sí, en Java puedes tener una clase padre, clases hijas que hereden de la clase padre, y clases que hereden de esas clases hijas. Esto se conoce como herencia múltiple.

  ¿Puede existir esto una clase que herede de 2 padres?
        No, Java no permite la herencia múltiple directa, es decir, una clase no puede heredar de dos clases padres diferentes. Esto se debe a problemas de ambigüedad y complejidad que pueden surgir. Sin embargo, puedes lograr un comportamiento similar mediante interfaces, ya que una clase puede implementar múltiples interfaces.

