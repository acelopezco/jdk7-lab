package com.acelopez.jdk7.coin;

import java.io.IOException;
import java.util.Map;

/**
 * Clase que permite practicar con las mejores ofrecidas por ProjectCoin.
 */
public class Coin {

    /* Constantes para proveedores.*/
    public static final String VENDOR_NAME_ORACLE = "ORACLE";
    public static final String VENDOR_NAME_MICROSOFT = "MICROSOFT";
    public static final String VENDOR_NAME_GOOGLE = "GOOGLE";
    public static final int VENDOR_ID_ORACLE = 1;
    public static final int VENDOR_ID_MICROSOFT = 2;
    public static final int VENDOR_ID_GOOGLE = 3;

    /* TODO: ¿Cuál de las mejoras que ofrece Project Coin te permite visualizar mejor estos valores? */
    public static final int VALOR_1_MILLON = 1000000;
    public static final int VALOR_10_MILLON = 10000000;
    public static final int VALOR_100_MILLON = 100000000;


    /**
     * Permite obtener le identificador del proveedor pasado por param.
     *
     * @param pVendor Nombre de algún proveedor.
     * @return Identificador para ese proveedor o -1 si el proveedor no existe.
     */
    public static int mapVendorId(String pVendor) {
        //TODO:¿Cuál de las mejores que ofrece Project Coin crees que puedes aplicar al siguiente código?

        if (VENDOR_NAME_ORACLE.equals(pVendor)) {
            return VENDOR_ID_ORACLE;
        } else if (VENDOR_NAME_MICROSOFT.equals(pVendor)) {
            return VENDOR_ID_MICROSOFT;
        } else if (VENDOR_NAME_GOOGLE.equals(pVendor)) {
            return VENDOR_ID_GOOGLE;
        } else {
            return -1;
        }
    }

    /**
     * Lectura de recursos.
     *
     * @param reader Usado para la lectura.
     */
    public void readResource(ResourceReader reader) {
        //TODO: Implementa try con recursos propios.
        //TODO: Implementa multicatch
        try {
            reader.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.releaseResource();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Retorna un mapa donde la llave es el ID del proveedor y el valor es su nombre.
     *
     * @return Mapa que relaciona IDs con nombres de proveedores.
     */
    public Map<String, Integer> diamondOp() {
        //TODO: Implementar este método haciendo uso del operador diamante.
        return null;
    }
}
