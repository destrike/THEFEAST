package com.thefeast.user.thefeast;

/**
 * Created by User on 2/4/2016.
 */
import java.io.*;

/**
 * A class that implements the Java FileFilter interface.
 * It will filter and grab only mp3
 */
public class Filterdip implements FileFilter
{
    private final String[] okFileExtensions =
            new String[] {"pdf", "jpg", "png"};

    public boolean accept(File file)
    {
        for (String extension : okFileExtensions)
        {
            if (file.getName().toLowerCase().endsWith(extension))
            {
                return true;
            }
        }
        return false;
    }
}
