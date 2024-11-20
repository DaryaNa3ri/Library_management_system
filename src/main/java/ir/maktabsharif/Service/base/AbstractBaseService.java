package ir.maktabsharif.Service.base;


import ir.maktabsharif.exception.MissionWasNotSuccessful;
import ir.maktabsharif.repository.base.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class AbstractBaseService <T,
        R extends BaseRepository<T, ID >,
        ID extends Serializable>  implements BaseService<T,ID>  {


    private R repository;
    private String exception = "mission wasn't successful, Please try again";

    public T insert(T t){
        Optional<T> optional = repository.insert(t);
        if(optional.isPresent()){
            return optional.get();
        }else{
            throw new MissionWasNotSuccessful(exception);
        }
    }

    public T update(T t){
        if (repository.update(t).isPresent()){
            return repository.update(t).get();
        }else
            throw new MissionWasNotSuccessful(exception);
    }

    public Boolean delete(ID id){
        if (repository.delete(id)){
            return true;
        }else
            throw new MissionWasNotSuccessful(exception);
    }

    public List<T> findAll(){
        if (repository.findAll().isPresent()){
            return repository.findAll().get();
        }else
            throw new MissionWasNotSuccessful(exception);
    }

    public T findById(ID id){
        if (repository.findById(id).isPresent()){
            return repository.findById(id).get();
        }else {
            throw new MissionWasNotSuccessful(exception);
        }

    }


}
