public class LLDCourse extends Course{

    LLDCourse(){
        createCourse();
    }

    @Override
    void createCourse() {
        moduleList.add(new SummaryModule());
    }
}
