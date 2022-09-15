package view;

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
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import model.CrewMember;
import model.Person;

public class StarshipCRUD1b extends Application {

	private String formTitle;
	public static String DEFAULT_CREWMEMBER_IMAGE = "res/images/crew/free/Redshirt.jpg";
	private FileInputStream fileStreamCrewMemberImg;
	private ListView<CrewMember> listCrew;
	private ObservableList<CrewMember> observeableListCrew;
	private TextField txtJob;
	private Label lblJob;
	private TextField txtName;
	private Label lblName;
	private TextField txtSurname;
	private Label lblSurname;
	private TextField txtRace;
	private Label lblRace;
	private Image imgCrewMember;
	private ImageView iViewCrewMember;
	private Button btnAddnew;
	private Button btnDelete;
	private Button btnUpdate;
	private Button btnReport;
	private Button btnClear;
	private HBox jobControls;
	private HBox nameControls;
	private HBox surnnameControls;
	private HBox personButtons;
	private VBox personControls;
	private HBox crewMembersControl;
	private HBox raceControls;
	private Menu menuFile;
	private MenuBar menuBar;
	private MenuItem menuItemFileOpen;
	private MenuItem menuItemFileSave;
	private Menu menuCrewMember;
	private MenuItem menuItemPersonAddNew;
	private MenuItem menuItemPersonDelete;
	private MenuItem menuItemPersonClear;
	private MenuItem menuItemPersonUpdate;
	private MenuItem menuItemPersonReport;
	private Scene scene;
	private VBox mainBox;
	private HBox listEditBox;
	private TabPane tabPane;
	private Tab tab1;
	
	private Tab tab2;
	private VBox log;
	private TextField txtLog;
	private Button btnLog;
	private ListView<String> logs;
	/**
	 * JavaFX init & start
	 */

	@Override
	public void start(Stage primaryStage) throws Exception {

		// DATA MODEL INIT
		formTitle = "StarshipCRUD1b";
		observeableListCrew = FXCollections.observableArrayList();
		observeableListCrew.addAll(
				new CrewMember("James", "Tiberius Kirk", "Captain", "human",
						"res/images/crew/free/James_Tiberius_Kirk_2267.jpg",
						"https://memory-beta.fandom.com/de/wiki/James_Tiberius_Kirk",
						"https://www.youtube.com/watch?v=E-n00YxKJnY"),
				new CrewMember("S’chn-T’ Gaii", "Spock", "First Officer", "Human / Vulcan Hybrid",
						"res/images/crew/free/Spock_2268.jpg", "https://memory-alpha.fandom.com/wiki/Spock",
						"https://www.youtube.com/watch?v=5vrXKlO2Jbw"),
				new CrewMember("Dr. Leonard", "H. McCoy", "Medical Officer", "human",
						"res/images/crew/free/Leonard_McCoy_2266.jpg",
						"https://memory-alpha.fandom.com/de/wiki/Leonard_McCoy",
						"https://www.youtube.com/watch?v=AbCA6EK_jQU"),
				new CrewMember("Hikaru", "Sulu", "Navigator", "human", "res/images/crew/free/Hikaru_Sulu-2266.jpg",
						"https://memory-alpha.fandom.com/de/wiki/Hikaru_Sulu",
						"https://www.youtube.com/watch?v=Y69Mp1Gi7qM"),
				new CrewMember("Pavel Andreievich", "Chekov", "Security Chief", "human",
						"res/images/crew/free/Pavel_Chekov_2293-B.jpg",
						"https://memory-alpha.fandom.com/wiki/Pavel_Chekov",
						"https://www.youtube.com/watch?v=IC6W8J0j8Co"),
				new CrewMember("Nyota", "Uhura", "Communication Officer", "human",
						"res/images/crew/free/Nyota_Uhura.jpg", "https://memory-alpha.fandom.com/wiki/Nyota_Uhura",
						"https://www.youtube.com/watch?v=nh96D7xNzvM"));

		// DATA MODEL => VIEW COMPONENTS
		primaryStage.setTitle(formTitle);
		listCrew = new ListView<CrewMember>();
		listCrew.setItems(observeableListCrew);

		// VIEW COMPONENTS INIT (not part of data model)
		menuBar = new MenuBar();
		menuFile = new Menu("File");
		menuItemFileOpen = new MenuItem("Open File ...");
		menuItemFileSave = new MenuItem("Save To File");
		menuFile.getItems().add(menuItemFileOpen);
		menuFile.getItems().add(menuItemFileSave);
		menuBar.getMenus().add(menuFile);
		menuCrewMember = new Menu("Crew Member");
		menuItemPersonAddNew = new MenuItem("Add new");
		menuItemPersonUpdate = new MenuItem("Update");
		menuItemPersonDelete = new MenuItem("Delete");
		menuItemPersonClear = new MenuItem("Clear");

		menuItemPersonReport = new MenuItem("Report");

		

		menuCrewMember.getItems().add(menuItemPersonAddNew);
		menuCrewMember.getItems().add(menuItemPersonUpdate);
		menuCrewMember.getItems().add(menuItemPersonDelete);
		menuCrewMember.getItems().add(menuItemPersonClear);
		// Adding separator objects to menu
		menuCrewMember.getItems().add(new SeparatorMenuItem());
		menuCrewMember.getItems().add(menuItemPersonReport);
		menuBar.getMenus().add(menuCrewMember);

		// old nodes (ver3):
		txtJob = new TextField("");
		lblJob = new Label("job");
		txtName = new TextField("");
		lblName = new Label("name");
		txtSurname = new TextField("");
		lblSurname = new Label("surname");
		txtRace = new TextField("");
		lblRace = new Label("race");

		fileStreamCrewMemberImg = new FileInputStream(StarshipCRUD1b.DEFAULT_CREWMEMBER_IMAGE);
		imgCrewMember = new Image(fileStreamCrewMemberImg);
		iViewCrewMember = new ImageView(imgCrewMember);
		iViewCrewMember.setFitHeight(400);
		iViewCrewMember.setPreserveRatio(true);

		btnAddnew = new Button("Add new");
		btnDelete = new Button("Delete");
		btnUpdate = new Button("Update");
		btnReport = new Button("Report");
		btnClear = new Button("Clear");

		jobControls = new HBox(10, txtJob, lblJob);
		nameControls = new HBox(10, txtName, lblName);
		surnnameControls = new HBox(10, txtSurname, lblSurname);
		raceControls = new HBox(10, txtRace, lblRace);

		personButtons = new HBox(10, btnAddnew, btnClear, btnUpdate, btnDelete, btnReport);
		personControls = new VBox(10, jobControls, nameControls, surnnameControls, raceControls, iViewCrewMember,
				personButtons);

		listEditBox = new HBox(10, listCrew, personControls);
		HBox.setMargin(listCrew, new Insets(10, 10, 10, 10));
		HBox.setMargin(personControls, new Insets(10, 10, 10, 10));

		txtLog = new TextField("");
		btnLog=new Button("Add Starship Log Entry");
		logs = new ListView<String>();
//		logs.set
		log = new VBox(10,txtLog,btnLog,logs);
		VBox.setMargin(log, new Insets(10,10,10,10));
		
		tabPane = new TabPane();

		tab1 = new Tab("Crew CRUD", listEditBox);
		tab2 = new Tab("Starship Log", log);

		tabPane.getTabs().add(tab1);
		tabPane.getTabs().add(tab2); 
		
		mainBox = new VBox(10, menuBar,tabPane, listEditBox);

		Scene scenePersonList = new Scene(mainBox,700, 700);
		primaryStage.setScene(scenePersonList);
		primaryStage.show();

		// CONTROL: action events => method call
		listCrew.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends CrewMember> ov, CrewMember oldVal, CrewMember newVal) -> {
					setTextFieldToListSelection(newVal);

					if(newVal.getImage()!= "none") {
						fileStreamCrewMemberImg = null;
						try {
							fileStreamCrewMemberImg = new FileInputStream(newVal.getImage());
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						imgCrewMember = new Image(fileStreamCrewMemberImg);
						iViewCrewMember.setImage(imgCrewMember);
					}
					else {
						fileStreamCrewMemberImg = null;
						try {
							fileStreamCrewMemberImg = new FileInputStream("res/images/crew/free/Redshirt.jpg");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						imgCrewMember = new Image(fileStreamCrewMemberImg);
						iViewCrewMember.setImage(imgCrewMember);
					}
					
				});

		// Platzhalter
		menuItemFileOpen.setOnAction(e -> {
			System.out.println("Open Data from File: TODO");
		});
		menuItemFileSave.setOnAction(e -> {
			System.out.println("Save Data To File: TODO");
		});

		// add new
		btnAddnew.setOnAction(e -> addCrewMember());
		menuItemPersonAddNew.setOnAction(e -> addCrewMember());
		// clear
		btnClear.setOnAction(e -> clearFields());
		menuItemPersonClear.setOnAction(e -> clearFields());
		// delete
		btnDelete.setOnAction(e -> deleteSelectedPerson());
		menuItemPersonDelete.setOnAction(e -> deleteSelectedPerson());
		// update
		btnUpdate.setOnAction(event -> updateSelectedPerson());
		menuItemPersonUpdate.setOnAction(e -> updateSelectedPerson());
		// report
		btnReport.setOnAction(event -> personReport());
		menuItemPersonReport.setOnAction(event -> personReport());

	}

	// BINDING FUNCTIONS (CONTROLLER)
	/**
	 * create new CrewMember in data model
	 */
	public void addCrewMember() {
		String name = txtName.getText();
		String surname = txtSurname.getText();
		String job = txtJob.getText();
		String race = txtRace.getText();
		String image = StarshipCRUD1b.DEFAULT_CREWMEMBER_IMAGE;
		String link = "none";
		String youtube = "none";
		CrewMember c = new CrewMember(name, surname, job, race, image, link, youtube);
		// listCrew.getItems().add(p); // OLD
		observeableListCrew.add(c); // NEW
		listCrew.getSelectionModel().select(c); // forcing iteration, slow + ERROR SOURCE !!!!
	}

	/**
	 * report (data model)
	 */
	public void personReport() {
		System.out.println("\nReport\n*********");
		System.out.println("TITLE=" + formTitle);

		for (CrewMember p : observeableListCrew) {
			System.out.println(p);
		}
	}

	/**
	 * update selected person in data model (according to text field' content
	 */
	public void updateSelectedPerson() {
		CrewMember p = listCrew.getSelectionModel().getSelectedItem();
		if (p != null) {
			p.setJob(txtJob.getText());
			p.setSurname(txtSurname.getText());
			p.setName(txtName.getText());
			p.setRace(txtRace.getText());
			listCrew.refresh();
		}
	}

	/**
	 * delete person object from data model and view
	 */
	public void deleteSelectedPerson() {
		int selectedIdx = listCrew.getSelectionModel().getSelectedIndex();
		if (selectedIdx != -1) {
			CrewMember p = listCrew.getSelectionModel().getSelectedItem();
			// listCrew.getItems().remove(selectedIdx); // OLD - fast
			observeableListCrew.remove(p); // NEW - forcing iteration, slow + ERROR SOURCE !!!!
			System.out.println("Removed " + p);
		}
	}

	/**
	 * Copy settings from a Person object into text field. Used by ListView
	 * listeners
	 * 
	 * @param new_val - newly selected Person in the list
	 */
	public void setTextFieldToListSelection(CrewMember new_val) {
		if (new_val != null) {
			txtJob.setText(new_val.getJob());
			txtName.setText(new_val.getName());
			txtSurname.setText(new_val.getSurname());
			txtRace.setText(new_val.getRace());
		} else {
			clearFields();
		}
	}

	/**
	 * clear text input fields
	 */
	public void clearFields() {
		txtJob.setText("");
		txtName.setText("");
		txtSurname.setText("");
		txtRace.setText("");
	}

	/**
	 * start the javafx application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Application.launch(args);

	}

}