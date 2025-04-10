INTEGRANTES DE EQUIPO
-GARCIA GARCIA LUIS JARED 22161064
-BAUTISTA RAMIREZ AMIZADAI ZURIEL 22161010


# 💸 the_best_Fast_Payment - Librería de Pagos

FastPay es una librería en Java diseñada para simplificar el cálculo de pagos en efectivo, tarjeta y transferencia. Incluye validaciones integradas y cálculo de impuestos (IVA). Es reutilizable, clara y cumple con principios de programación orientada a objetos.

---

## ✅ Funcionalidades principales

- calcularPagoEfectivo(double monto) 
  Calcula el total con posible descuento del 5% si el monto es mayor a 500.

- calcularPagoTarjeta(double monto)
  Aplica un 3% de comisión al monto.

- calcularPagoTransferencia(double monto)  
  Agrega $15 de comisión fija.

- calcularIVA(double subtotal)
  Calcula el 16% de IVA.

- validarMonto(double monto)
  Lanza una excepción si el monto es menor o igual a cero.

- validarDescripcion(String descripcion)  
  Lanza una excepción si la descripción es nula o vacía.



### Clase Pay
```java
public final class Pay {
    public static double calcularPagoEfectivo(double monto);
    public static double calcularPagoTarjeta(double monto);
    public static double calcularPagoTransferencia(double monto);
    public static double calcularIVA(double subtotal);
    public static void validarMonto(double monto);
    public static void validarDescripcion(String descripcion);
}

Razones por las que se pone final en la clase:
Indica que no debe heredarse: Al poner final, ningún otro programador podrá extender esa clase.
Cuando haces una clase utilitaria (que solo tiene métodos estáticos), lo mejor es marcarla como final y no permitir que se cree un objeto de esa clase.


Instrucciones para importar el .jar en otro proyecto
Abre tu proyecto en NetBeans.

Haz clic derecho en Libraries y selecciona "Add JAR/Folder...".

Busca el archivo the_best_fast_Payment.jar generado de tu librería.

En tu proyecto cuando ya estes programando simplemente debes importar la librería (import com.the_best_Fast_Payment.pay;)

Un ejemplo para llamar el metodo de la libreria seria asi ( total = pay.calcularPagoTarjeta(monto);)

Y listo ya puedes usar la clase Pay directamente en tu proyecto.







