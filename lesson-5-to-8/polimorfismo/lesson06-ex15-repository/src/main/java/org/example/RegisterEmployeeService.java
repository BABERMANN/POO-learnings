package org.example;

public class RegisterEmployeeService {

    private final Repository<String, Employee> repository;

    public RegisterEmployeeService(Repository<String,Employee> repository){
        this.repository = repository;
    }

    public boolean register(Employee e){
        if(repository.findById(e.getId()) == null){
            repository.save(e);
            return true;
        }
        return false;
    }

}
