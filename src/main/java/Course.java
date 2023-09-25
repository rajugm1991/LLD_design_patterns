import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    List<Module> moduleList=new ArrayList<Module>();

    abstract void createCourse();

    @Override
    public String toString() {
        return "Course{" +
                "moduleList=" + moduleList +
                '}';
    }
}
