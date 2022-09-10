package online.yang.cloud.service;



public interface BaseService<T> {

    T findById(String id);

    int add(T t);

    int update(T t);

    int delete(String id);

}
