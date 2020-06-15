package com.lambdaschool.schools.exceptions;

public class UrlNotFoundException extends RuntimeException
{
    public UrlNotFoundException(String message)
    {
        super("Found an issue with School: " + message);
    }
}
