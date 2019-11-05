package com.acelopez.jdk7.nio2;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

import static org.junit.Assert.*;

public class Nio2Test {

    private static final String RELATIVE_TXT_FILE_NAME = "AuxFile.txt";
    private static final String RELATIVE_ZIP_FILE_NAME = "AuxFile.zip";
    private static final String RELATIVE_TXT_FILE_PATH = "./src/AuxFile.txt";
    private static final String ABSOLUTE_TXT_FILE_PATH = "/home/tmp/AuxFile.txt";

    @Test
    public void test_getFileName_from_auxFile() {
        Path path = Paths.get(RELATIVE_TXT_FILE_NAME);

        String name = Nio2.getFileName(path);

        assertThat(name, is(RELATIVE_TXT_FILE_NAME));
    }

    @Test
    public void test_getFileName_from_null() {
        Path path = null;

        String name = Nio2.getFileName(path);

        assertThat(name, is(nullValue()));
    }


    @Test
    public void test_toFile_from_auxFile() {
        Path path = Paths.get(RELATIVE_TXT_FILE_NAME);

        File file = Nio2.toFile(path);

        assertThat(file, is(path.toFile()));
    }

    @Test
    public void test_toFile_from_null() {
        Path path = null;

        File file = Nio2.toFile(path);

        assertThat(file, is(nullValue()));
    }

    @Test
    public void test_path_size() {

        int size = Nio2.getPathSize(RELATIVE_TXT_FILE_PATH);

        assertThat(size, is(3));
    }

    @Test
    public void test_path_size_from_null() {

        int size = Nio2.getPathSize(null);

        assertThat(size, is(0));
    }


    @Test
    public void test_root_when_path_is_relative() {

        String root = Nio2.getRoot(RELATIVE_TXT_FILE_PATH);

        assertThat(root, is("/"));
    }

    @Test
    public void test_root_when_path_is_absolute() {
        Path p = Paths.get(ABSOLUTE_TXT_FILE_PATH);
        String root = Nio2.getRoot(ABSOLUTE_TXT_FILE_PATH);

        assertThat(root, is(p.getRoot().toString()));
    }

    @Test
    public void test_root_when_path_is_null() {

        String root = Nio2.getRoot(null);

        assertThat(root, is(""));
    }


    @Test
    public void test_text_extension_for_txt_file() {
        Path p = Paths.get(RELATIVE_TXT_FILE_NAME);
        boolean result = Nio2.isTxtFile(p);

        assertTrue(result);
    }

    @Test
    public void test_text_extension_for_zip_file() {
        Path p = Paths.get(RELATIVE_ZIP_FILE_NAME);
        boolean result = Nio2.isTxtFile(p);

        assertTrue(!result);
    }

    @Test
    public void test_text_extension_when_path_is_null() {

        boolean result = Nio2.isTxtFile(null);

        assertTrue(!result);
    }

    @Test
    public void test_joinPaths() {
        String strRoot = "/tmp";
        Path root = Paths.get(strRoot);
        Path path1 = null;
        Path path2 = Paths.get(RELATIVE_TXT_FILE_NAME);
        Path path3 = Paths.get(RELATIVE_ZIP_FILE_NAME);
        Path[] paths = Nio2.joinPaths(strRoot, path1, path2,path3);

        assertThat(paths.length, is(2));
        assertThat(paths[0], is(root.resolve(path2)));
        assertThat(paths[1], is(root.resolve(path3)));
    }

    @Test
    public void test_joinPaths_when_root_is_null() {
        String strRoot = null;
        Path path1 = Paths.get(RELATIVE_TXT_FILE_NAME);
        Path[] paths = Nio2.joinPaths(strRoot, path1);

        assertThat(paths, is(nullValue()));
    }

    @Test
    public void test_joinPaths_when_children_are_null() {
        String strRoot = "/tmp";
        Path root = Paths.get(strRoot);
        Path[] paths = Nio2.joinPaths(strRoot);

        assertThat(paths.length, is(1));
        assertThat(paths[0], is(root));
    }

    @Test
    public void test_getLines_iso88591() throws IOException {
        String strPath = "./iso_8859_1";

        List<String> lines = Nio2.getLinesIso88591(strPath);

        assertThat(lines.get(0), is("Este archivo se creó usando ISO_8859_1"));
    }

    @Test
    public void test_getLines_iso88591_for_folder_path() throws IOException {
        String strPath = ".";

        List<String> lines = Nio2.getLinesIso88591(strPath);

        assertTrue(lines.isEmpty());
    }

    @Test
    public void test_getLines_iso88591_for_null_path() throws IOException {
        String strPath = null;

        List<String> lines = Nio2.getLinesIso88591(strPath);

        assertTrue(lines.isEmpty());
    }

    @Test
    public void test_createFilterForHiddenFiles() throws IOException {
        Path hiddenPath = Paths.get(".gitIgnore");
        DirectoryStream.Filter<Path> filter = Nio2.createFilterForHiddenFiles();

        assertTrue(filter.accept(hiddenPath));
    }
}