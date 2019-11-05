package com.acelopez.jdk7.coin;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Define la estructura para los lectores de recursos...
 * TODO: ¿Qué debería tener esta interface para que sus implementaciones puedan usarse dentro de un try con recursos?
 */
public interface ResourceReader {

    /**
     * Lee datos de un recurso.
     */
    public void read() throws IOException, SQLException;

    /**
     * Libera recursos usados.
     */
    public void releaseResource() throws IOException;
}
