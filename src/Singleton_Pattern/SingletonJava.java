package Singleton_Pattern;

public class SingletonJava {

    private SingletonJava() {
    }

    private static SingletonJava mSingletonJava = null;

    //如果不加synchronized再多線程的情況下是有可能new出多個mSingletonJava
    public static synchronized SingletonJava getInstance() {
        if (mSingletonJava == null) {
            mSingletonJava = new SingletonJava();
        }
        return mSingletonJava;
    }

    public void a(){

    }

    public void b(){

    }
}
