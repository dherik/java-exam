package io.github.dherik.exercises._01;

class Message {

    private final String message;

    Message(String message) {
        this.message = message;
    }

    String printMessage() {
        System.out.println(message);
        return message;
    }
}
