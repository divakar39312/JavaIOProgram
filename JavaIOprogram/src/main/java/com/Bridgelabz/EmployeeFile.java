package com.Bridgelabz;

import java.io.File;

import java.io.File;

public class EmployeeFile {
    public static boolean deleteFiles(File contentsToDelete){
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null){
            for (File file : allContents){
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }
}