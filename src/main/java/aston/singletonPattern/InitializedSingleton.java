package singletonPattern;

public class InitializedSingleton {
    static InitializedSingleton instance;

    private InitializedSingleton() {
    }

    public static InitializedSingleton getInstance() {
        if (instance == null) {
            instance = new InitializedSingleton();
        }
        return instance;
    }
}