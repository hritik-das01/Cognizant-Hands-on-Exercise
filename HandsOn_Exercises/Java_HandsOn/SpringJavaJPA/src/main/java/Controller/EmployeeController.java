package Controller;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping
    public List<Employee> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return repository.save(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id,@RequestBody Employee employee){

        employee.setId(id);

        return repository.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
