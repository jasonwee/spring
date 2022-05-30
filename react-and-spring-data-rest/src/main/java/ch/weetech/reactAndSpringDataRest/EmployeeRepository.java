package ch.weetech.reactAndSpringDataRest;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> { 

}
