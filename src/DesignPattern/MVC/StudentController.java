package DesignPattern.MVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentId(int id){
        model.setId(id);
    }

    public int getStudentId(){
        return model.getId();
    }

    public void printStudent(){
        view.perintStudentDetail(getStudentId(),getStudentName());
    }
}
