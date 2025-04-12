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
     * Si el monto es mayor o igual al mínimo establecido, se aplica un descuento.
     *
     * @param monto Monto base de la transacción.
     * @param descuentoPorcentaje Porcentaje de descuento (ej. 5 para 5%).
     * @param montoMinimoParaDescuento Monto mínimo para aplicar descuento.
     * @return Monto final después del descuento si aplica.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoEfectivo(double monto, double descuentoPorcentaje, double montoMinimoParaDescuento) {
        validarMonto(monto);
        if (monto >= montoMinimoParaDescuento) {
            return monto * (1 - descuentoPorcentaje / 100);
        }
        return monto;
    }

    /**
     * Calcula el pago con tarjeta.
     * Se aplica un porcentaje de comisión sobre el monto.
     *
     * @param monto Monto base de la transacción.
     * @param comisionPorcentaje Porcentaje de comisión (ej. 3 para 3%).
     * @return Monto final con comisión.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoTarjeta(double monto, double comisionPorcentaje) {
        validarMonto(monto);
        return monto * (1 + comisionPorcentaje / 100);
    }

    /**
     * Calcula el pago mediante transferencia.
     * Se suma una comisión fija al monto.
     *
     * @param monto Monto base de la transacción.
     * @param comisionFija Comisión fija (ej. 15 pesos).
     * @return Monto final con comisión agregada.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public static double calcularPagoTransferencia(double monto, double comisionFija) {
        validarMonto(monto);
        return monto + comisionFija;
    }

    /**
     * Calcula el IVA sobre un subtotal dado.
     *
     * @param subtotal Monto base sobre el cual se calculará el IVA.
     * @param ivaPorcentaje Porcentaje del IVA (ej. 10 para 10%).
     * @return Monto correspondiente al IVA.
     */
    public static double calcularIVA(double subtotal, double ivaPorcentaje) {
        return subtotal * (ivaPorcentaje / 100);
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
}
