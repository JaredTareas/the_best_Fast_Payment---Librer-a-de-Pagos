/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.the_best_Fast_Payment;

/**
 * Clase final que contiene métodos estáticos para procesar pagos y validaciones.
 * Esta clase no debe ser instanciada.
 * 
 * Métodos disponibles:
 * - calcularPagoEfectivo
 * - calcularPagoTarjeta
 * - calcularPagoTransferencia
 * - calcularIVA
 * - validarMonto
 * - validarDescripcion
 * 
 * @author jared
 */
public final class pay {
      /**
     * Calcula el pago en efectivo.
     * Si el monto es mayor a 500, se aplica un 5% de descuento.
     *
     * @param monto Monto base de la transacción.
     * @return Monto final después del descuento si aplica.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoEfectivo(double monto) {
        validarMonto(monto);
        return monto > 500 ? monto * 0.95 : monto;
    }

    /**
     * Calcula el pago con tarjeta.
     * Se aplica un 3% de comisión sobre el monto.
     *
     * @param monto Monto base de la transacción.
     * @return Monto final con comisión.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoTarjeta(double monto) {
        validarMonto(monto);
        return monto * 1.03; 
    }

    /**
     * Calcula el pago mediante transferencia.
     * Se suma una comisión fija de $15 al monto.
     *
     * @param monto Monto base de la transacción.
     * @return Monto final con comisión agregada.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoTransferencia(double monto) {
        validarMonto(monto);
        return monto + 15; 
    }

    /**
     * Valida que el monto sea mayor a cero.
     *
     * @param monto Monto a validar.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static void validarMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
    }

    /**
     * Valida que la descripción no esté vacía ni sea nula.
     *
     * @param descripcion Descripción a validar.
     * @throws IllegalArgumentException Si la descripción es nula o está vacía.
     */
    public static void validarDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
    }

    /**
     * Calcula el IVA del subtotal al 16%.
     *
     * @param subtotal Monto base sobre el cual se calculará el IVA.
     * @return Monto correspondiente al IVA.
     */
    public static double calcularIVA(double subtotal) {
        return subtotal * 0.16;
    }
}
