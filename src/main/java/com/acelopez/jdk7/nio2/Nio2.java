package com.acelopez.jdk7.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.List;

/**
 * Clase que permite practicar con las mejores ofrecidas por NIO.2.
 */
public class Nio2 {

    /**
     * Retorna el nombre del archivo representado por el path pasado por param.
     *
     * @param path Archivo del cual se desea conocer su nombre.
     * @return Nombre del archivo pasado por param o null si el param es null.
     */
    public static String getFileName(Path path) {
        //TODO: Implementar este método

        return null;
    }

    /**
     * Retorna un File análogo al Path recibido como param.
     *
     * @param path Path del cual se desea conocer su análogo en File.
     * @return Objeto File análogo al Path recibido como param o null si el param es null.
     */
    public static File toFile(Path path) {
        //TODO: Implementar este método

        return null;
    }

    /**
     * Retorna la cantidad de elementos que componen la ruta pasada por param.
     *
     * @param strPath Ruta de la que se desea conocer la cantidad de elementos que la componen.
     * @return Cantidad de elementos que componen la ruta pasada por param o cero si la ruta es nula.
     */
    public static int getPathSize(String strPath) {
        //TODO: Implementar este método

        return 0;
    }

    /**
     * Retorna el Root de la ruta pasada por param.
     * Si la ruta es relativa, entonces retorna un slash "/".
     * Si la ruta es nula, entonces retorna cadena vacía "".
     *
     * @param strPath Ruta de la cual se desea conocer su Root.
     * @return Root de la ruta pasada por param o / si la ruta es relativa o cadena vacía si la ruta es nula.
     */
    public static String getRoot(String strPath) {
        //TODO: Implementar este método

        return null;
    }

    /**
     * Verifica si la extensión del Path pasado como param es ".txt".
     *
     * @param path Path del cual se desea conocer si tiene extensión ".txt".
     * @return true si y solo si el Path pasado como param tiene extensión ".txt".
     */
    public static boolean isTxtFile(Path path) {
        //TODO: Implementar este método

        return false;
    }

    /**
     * Combina la ruta psada por param con los Paths también pasados por params.
     * Si la ruta al Root es nula o vacía, retornar nulo.
     * Si alguno de los Path hijos es nulo o es absoluto, no procesarlo.
     * Si no se pasan Paths hijos, retornar solo el Root.
     * Las anteriores condiciones indican que el tamaño del arreglo resultado es diferente al tamaño del
     * arreglo de los Paths hijos.
     *
     * @param strRoot  ruta hacia el Root.
     * @param children Paths que se combinarán con el root.
     * @return
     */
    public static Path[] joinPaths(String strRoot, Path... children) {
        //TODO: Implementar este método

        return null;
    }

    /**
     * Lee las lineas del archivo pasado por param usando el juego de caracteres ISO-8859-1.
     * Si la ruta pasada por param es nula o vacía o es un directorio, retornar una lista vacía.
     *
     * @param strPath Ruta hacia el archivo a leer.
     * @return Listado de todas las líneas dentro del archivo pasado por param.
     * @throws IOException si ocurre un error en la lectura.
     */
    public static List<String> getLinesIso88591(String strPath) throws IOException {
        //TODO: Implementar este método

        return null;
    }

    /**
     * Crear un filtro para archivos ocultos.
     *
     * @return Filtro para ser usado por un DirectoryStream que permita obtener archivos ocultos.
     */
    public static DirectoryStream.Filter<Path> createFilterForHiddenFiles() {
        //TODO: Implementar este método

        return null;
    }
}
