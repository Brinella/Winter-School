package develop; /**
 * Created by rodrique on 9/6/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;
@Controller
@RequestMapping(path  = "develop")
public class App extends Application {
    @Autowired
    /*public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }*/

    private service.WinterSchoolServImpl winterService;
    private service.StudentServImpl studentService;
    private service.SubjectServImpl subjectService;
    private service.LocationServImpl locationService;
    private service.LecturerServImpl lecturerService;

    @GetMapping(path = "/add/{subjectName}")
    public @ResponseBody
    String addStudent(@PathVariable String studName) {
        domain.Student student = factories.StudentFactoryFactory.build(studName);
        studentService.save(student);
        return new Gson().toJson(student);
    }
}