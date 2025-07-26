package service;

	import model.Student;
	import java.util.ArrayList;
	import java.util.List;

	public class StudentService {
	    private final List<Student> store = new ArrayList<>();

	    public void save(Student s) {
	        store.add(s);
	    }

	    public List<Student> getAll() {
	        return new ArrayList<>(store);
	    }

	    public void printAll() {
	        System.out.println("All students:");
	        for (Student s : store) {
	            System.out.println(" - " + s);
	        }
	    }
	}

    
