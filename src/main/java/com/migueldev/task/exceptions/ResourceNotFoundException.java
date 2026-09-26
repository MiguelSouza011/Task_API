package com.migueldev.task.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resouce not found. id " + id);
    }
}
