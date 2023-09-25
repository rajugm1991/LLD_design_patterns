public class HldCourse extends Course{

    HldCourse(){
        createCourse();
    }

    @Override
    void createCourse() {
       moduleList.add(new IntroductionModule());
       moduleList.add(new ConceptModule());
    }

    @Override
    public String toString() {
        return "HldCourse{}";
    }
}
