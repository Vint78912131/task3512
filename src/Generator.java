public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return aClass.newInstance();
    }
}
