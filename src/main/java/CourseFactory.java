public class CourseFactory {

    public static Course getCourseFactory(String type){
        switch (type){
            case "HLD":
               return new HldCourse();
            case "LLD":
                return new LLDCourse();
            default:
                return null;
        }
    }
}
