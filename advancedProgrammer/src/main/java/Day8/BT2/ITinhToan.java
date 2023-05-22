package Day8.BT2;

public interface ITinhToan <T> {
    T cong(T ...args);

    T tru(T t1, T t2);

    T nhan(T ... args);

    T chia(T t1, T t2);
}
