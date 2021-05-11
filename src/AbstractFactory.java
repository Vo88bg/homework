public interface AbstractFactory<T> {
    T create(int creditScore, String cardHolder);
}
