package experiment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.CrewMember;
import model.Person;

public class ListViewExperiment3a extends Application {

	private ListView<Person> list;
	private ListView<ImageView> list2;
	private ObservableList<Person> items;
	private ObservableList<ImageView> imagev;
	private TextField txtName;
	private Label lblName;
	private TextField txtSurname;
	private Label lblSurname;
	private Button btnAddnew;
	private Button btnDelete;
	private Button btnUpdate;
	private Button btnReport;
	private Button btnClear;
	private HBox nameControls;
	private HBox surnnameControls;
	private HBox personButtons;
	private VBox personControls;
	private HBox mainBox;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Starship");

		
		items = FXCollections.observableArrayList(
				new CrewMember("James", "Tiberius Kirk", "Captain", "human",
						 "res/images/crew/free/James_Tiberius_Kirk_2267.jpg",
						 "https://memory-beta.fandom.com/de/wiki/James_Tiberius_Kirk"),
						 new CrewMember("S’chn-T’ Gaii", "Spock", "First Officer", "Human / Vulcan Hybrid",
						 "res/images/crew/free/Spock_2268.jpg",
						 "https://memory-alpha.fandom.com/wiki/Spock"),
						 new CrewMember("Dr. Leonard", "H. McCoy", "Medical Officer", "human",
						 "res/images/crew/free/Leonard_McCoy_2266.jpg",
						 "https://memory-alpha.fandom.com/de/wiki/Leonard_McCoy"),
						 new CrewMember("Hikaru", "Sulu", "Navigator", "human",
						 "res/images/crew/free/Hikaru_Sulu-2266.jpg",
						 "https://memory-alpha.fandom.com/de/wiki/Hikaru_Sulu"),
						 new CrewMember("Pavel Andreievich", "Chekov", "Security Chief", "human",
						 "res/images/crew/free/Pavel_Chekov_2293-B.jpg",
						 "https://memory-alpha.fandom.com/wiki/Pavel_Chekov"),
						 new CrewMember("Nyota", "Uhura", "Communication Officer", "human",
						 "res/images/crew/free/Nyota_Uhura.jpg",
						 "https://www.youtube.com/watch?v=nh96D7xNzvM") );

		ListView<CrewMember> list1 = new ListView<CrewMember>();
		list.setItems(items);

        FileInputStream input1 = 
        		new FileInputStream("res/images/crew/free/Hikaru_Sulu-2266.jpg");
        FileInputStream input2 = 
        		new FileInputStream("res/images/crew/free/James_Tiberius_Kirk_2267.jpg");
        FileInputStream input3 = 
        		new FileInputStream("res/images/crew/free/Leonard_McCoy_2266.jpg");
        FileInputStream input4 = 
        		new FileInputStream("res/images/crew/free/Nyota_Uhura.jpg");
        FileInputStream input5 = 
        		new FileInputStream("res/images/crew/free/Pavel_Chekov_2293-B.jpg");
        FileInputStream input6 = 
        		new FileInputStream("res/images/crew/free/Redshirt.jpg");
        FileInputStream input7 = 
        		new FileInputStream("res/images/crew/free/Spock_2268.jpg");
        Image image1 = new Image(input1);
        Image image2 = new Image(input2);
        Image image3 = new Image(input3);
        Image image4 = new Image(input4);
        Image image5 = new Image(input5);
        Image image6 = new Image(input6);
        Image image7 = new Image(input7);
        ImageView img1 = new ImageView(image6);
        img1.setFitWidth(350);
        img1.setFitHeight(850);
        img1.setPreserveRatio(true);
         imagev = FXCollections.observableArrayList(new ImageView(image1), new ImageView(image2), 
        		new ImageView(image3), new ImageView(image4), new ImageView(image5), 
        		new ImageView(image6));
         
         list2 = new ListView<ImageView>();
 		list2.setItems(imagev);
		
		list1.getSelectionModel().selectedItemProperty().addListener(
				(ObservableValue<? extends CrewMember> ov, CrewMember old_val, CrewMember new_val) -> {
						txtName = new TextField("");
						lblName = new Label("name");
						txtSurname = new TextField("");
						lblSurname = new Label("surname");
						if(new_val.getImage().equals("res/images/crew/free/Hikaru_Sulu-2266.jpg")) 
						{
							img1.setImage(image1);
						}
						else if (new_val.getImage().equals("res/images/crew/free/James_Tiberius_Kirk_2267.jpg"))
						{
							img1.setImage(image2);
						}
						else if (new_val.getImage().equals("res/images/crew/free/Leonard_McCoy_2266.jpg"))
						{
							img1.setImage(image3);
						}
						else if (new_val.getImage().equals("res/images/crew/free/Nyota_Uhura.jpg"))
						{
							img1.setImage(image4);
						}
						else if (new_val.getImage().equals("res/images/crew/free/Pavel_Chekov_2293-B.jpg"))
						{
							img1.setImage(image5);
						}
						else if (new_val.getImage().equals("res/images/crew/free/Spock_2268.jpg"))
						{
							img1.setImage(image7);
						}
						else if (new_val.getImage().equals("res/images/crew/free/Redshirt.jpg"))
						{
							img1.setImage(image6);
						}

					
				});

		items = FXCollections.observableArrayList(
				new Person("John3", "Doe"), 
				new Person("Jane3", "Doe"),
				new Person("Max3", "Mustermann"));

		list = new ListView<Person>();
		list.setItems(items);

		txtName = new TextField("");
		lblName = new Label("name");
		txtSurname = new TextField("");
		lblSurname = new Label("surname");

		btnAddnew = new Button("CREATE (add new)");
		btnDelete = new Button("DELETE (selected)");
		btnUpdate = new Button("UPDATE (selected)");
		btnReport = new Button("Report");
		btnClear = new Button("Clear (input fields)");		

		nameControls = new HBox(10, txtName, lblName);
		surnnameControls = new HBox(10, txtSurname, lblSurname);
		personButtons = new HBox(10, btnAddnew, btnClear, btnUpdate, btnDelete, btnReport);
		personControls = new VBox(10, nameControls, surnnameControls, personButtons);
				        
		mainBox = new HBox(10, list, personControls);
		HBox.setMargin(list, new Insets(10, 10, 10, 10));
		HBox.setMargin(personControls, new Insets(10, 10, 10, 10));

		Scene scene = new Scene(mainBox, 1000, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

		

		btnAddnew.setOnAction(event -> {
			String name = txtName.getText();
			String surname = txtSurname.getText();
			Person p = new Person(name, surname);
			list.getItems().add(p);
            list.getSelectionModel().select(p);
            list.refresh();
		});

		btnClear.setOnAction(event -> {
			txtName.setText("");
			txtSurname.setText("");
            list.refresh();
		});

		btnDelete.setOnAction(event -> {

			int selectedIdx = list.getSelectionModel().getSelectedIndex();
			if (selectedIdx != -1) {
				Person itemToRemove = (Person) list.getSelectionModel().getSelectedItem();
				list.getItems().remove(selectedIdx);
				System.out.println("Removed " + itemToRemove);
			}
            list.refresh();
		});

		btnUpdate.setOnAction(event -> {

			int selectedIdx = list.getSelectionModel().getSelectedIndex();

			if (selectedIdx != -1) {
				items.get(selectedIdx).setSurname(txtSurname.getText());
				items.get(selectedIdx).setName(txtName.getText());
				list.refresh(); 
			}
		});

		btnReport.setOnAction(event -> {
			System.out.println("\nReport\n*********");
			for (int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i));
			}
		});

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}