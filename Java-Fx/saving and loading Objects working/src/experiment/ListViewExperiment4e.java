package experiment;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import model.Person;

/**
 *  Version 4e: ListView 4e 
 *  with Save/Load as CSV & Object in MenuBar - SOLVED
 *  
 * @author PUZ
 * @version 2021-01-27
 *
 */
public class ListViewExperiment4e extends Application {

	// DATA MODEL DEFINITION
	private String formTitle;
	private ArrayList<Person> 	arrayListPersons;

	
	// VIEW NODES DEFINITION
	private ObservableList<Person> 	olPersons;
	private ListView<Person> 		lvPersons;
	//
	private TextField 	txtName;
	private Label 		lblName;
	private TextField 	txtSurname;
	private Label 		lblSurname;
	private TextField 	txtAge;
	private Label 		lblAge;
	private Button 		btnAddnew;
	private Button 		btnDelete;
	private Button 		btnUpdate;
	private Button 		btnReport;
	private Button 		btnClear;
	
	private Button btnPersonMaxAge;
	private Button btnPersonMinAge;
	private Button btnPersonShortestFullName;
	private Button btnPersonLongestFullName;
	
	private HBox 		nameControls;
	private HBox 		surnnameControls;
	private HBox		agecontrols;
	private HBox 		personButtons;
	private VBox 		personControls;
	private HBox		personButtons1;
	//
	private HBox 		listEditBox;
	//
	private VBox 		mainBox; 
	
	// Menu nodes 
	private MenuBar 	menuBar;
	private Menu 		menuData;
	private MenuItem 	menuItemDataOpenCSV;
	private MenuItem 	menuItemDataSaveCSV;
	private MenuItem 	menuItemDataOpenObjectStreamFile;
	private MenuItem 	menuItemDataSaveObjectStreamFile;	
	private Menu 		menuPerson;
	private MenuItem 	menuItemPersonAddNew;
	private MenuItem 	menuItemPersonDelete;
	private MenuItem 	menuItemPersonClear;
	private MenuItem 	menuItemPersonUpdate;
	private MenuItem 	menuItemPersonReport;
	private MenuItem 	menuItemPersonMaxAge;
	private MenuItem 	menuItemPersonMinAge;
	private MenuItem 	menuItemPersonMaxName;
	private MenuItem 	menuItemPersonMinName;

	/**
	 *  JavaFX init & start
	 */
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// DATA MODEL INIT
		formTitle= "ListView 4e - with Save/Load as CSV & Object in MenuBar - SOLVED"; 
		arrayListPersons = new ArrayList<Person>();
		
		olPersons = FXCollections.observableArrayList();
		arrayListPersons.add(new Person("John", "Doe",25));
		arrayListPersons.add(new Person("Jane", "Doe",30));
		arrayListPersons.add(new Person ("Max", "Mustermann",45));
	
		
		// DATA MODEL => VIEW COMPONENTS
		primaryStage.setTitle(formTitle);	
		lvPersons = new ListView<Person>();
		olPersons = FXCollections.observableList(arrayListPersons);
		lvPersons.setItems(olPersons);

		// VIEW COMPONENTS INIT (not part of data model)
		menuBar = new MenuBar();
		menuData = new Menu("File");
		menuItemDataOpenCSV = new MenuItem("Open File (CSV)...");
		menuItemDataSaveCSV = new MenuItem("Save To File (CSV) ...");
		menuItemDataOpenObjectStreamFile = new MenuItem("Open File (Stream)...");
	    menuItemDataSaveObjectStreamFile = new MenuItem("Save To File (Stream)...");	
		menuData.getItems().add(menuItemDataSaveCSV);
	    menuData.getItems().add(menuItemDataOpenCSV);
		menuData.getItems().add(menuItemDataSaveObjectStreamFile);
		menuData.getItems().add(menuItemDataOpenObjectStreamFile);
		menuBar.getMenus().add(menuData);
		menuPerson = new Menu("Person");
		menuItemPersonAddNew = new MenuItem("Add new");
		menuItemPersonUpdate = new MenuItem("Clear");		
		menuItemPersonDelete = new MenuItem("Delete");	
		menuItemPersonClear  = new MenuItem("Clear");
		menuItemPersonMaxAge=new MenuItem("Max Age");
		menuItemPersonMinAge=new MenuItem("Min Age");
		menuItemPersonMaxName=new MenuItem("Max Name");
		menuItemPersonMinName=new MenuItem("Min Name");

		menuItemPersonReport = new MenuItem("Report");
		
		menuPerson.getItems().add(menuItemPersonAddNew);
		menuPerson.getItems().add(menuItemPersonUpdate);
		menuPerson.getItems().add(menuItemPersonDelete);
		menuPerson.getItems().add(menuItemPersonClear);
		menuPerson.getItems().add(menuItemPersonMaxAge);
		menuPerson.getItems().add(menuItemPersonMinAge);
		menuPerson.getItems().add(menuItemPersonMaxName);
		menuPerson.getItems().add(menuItemPersonMinName);
	     //Adding separator objects to menu
		menuPerson.getItems().add(new SeparatorMenuItem());	
		menuPerson.getItems().add(menuItemPersonReport);
		menuBar.getMenus().add(menuPerson);

		// old nodes (ver3):
		txtName = new TextField("");
		lblName = new Label("name");
		txtSurname = new TextField("");
		lblSurname = new Label("surname");
		txtAge = new TextField();
		lblAge = new Label("age");

		btnAddnew = new Button("Add new");
		btnDelete = new Button("Delete");
		btnUpdate = new Button("Update");
		btnReport = new Button("Report");
		btnClear  = new Button("Clear");
		btnPersonMaxAge=new Button("Max Age");
		btnPersonMinAge=new Button("Min Age");
		btnPersonShortestFullName=new Button("Shortest Full Name");
		btnPersonLongestFullName=new Button("Longest Full Name");

		nameControls = new HBox(10, txtName, lblName);
		surnnameControls = new HBox(10, txtSurname, lblSurname);
		agecontrols=new HBox(10,txtAge,lblAge);
		personButtons = new HBox(10, btnAddnew, btnClear, btnUpdate, btnDelete, btnReport);
		personButtons1=new HBox(10,btnPersonMaxAge,btnPersonMinAge,btnPersonShortestFullName,btnPersonLongestFullName);
		personControls = new VBox(10, nameControls, surnnameControls,agecontrols, personButtons,personButtons1);

		listEditBox = new HBox(10, lvPersons, personControls);
		HBox.setMargin(lvPersons, new Insets(10, 10, 10, 10));
		HBox.setMargin(personControls, new Insets(10, 10, 10, 10));

		mainBox = new VBox(10, menuBar,listEditBox);
		
		Scene scenePersonList = new Scene(mainBox, 700, 350);
		primaryStage.setScene(scenePersonList);
		primaryStage.show();

		// CONTROL:  action events => method call
		lvPersons.getSelectionModel().selectedItemProperty().addListener(
		(ObservableValue<? extends Person> ov, Person old_val, Person new_val) -> {			
				setTextFieldToListSelection(new_val);				
		});
		
		// add new
		btnAddnew.setOnAction(e -> addNewPerson());
		menuItemPersonAddNew.setOnAction(e -> addNewPerson());	
		// clear
		btnClear.setOnAction(e -> clearFields());
		menuItemPersonClear.setOnAction(e -> clearFields());
		// delete
		btnDelete.setOnAction(e ->  deleteSelectedPerson());
		menuItemPersonDelete.setOnAction(e -> deleteSelectedPerson());		
		// update
		btnUpdate.setOnAction(event -> updateSelectedPerson());
		menuItemPersonUpdate.setOnAction(e -> updateSelectedPerson());	
		// report
		btnReport.setOnAction(event -> personReport());
		menuItemPersonReport.setOnAction(event -> personReport());
		//MaxAge
		btnPersonMaxAge.setOnAction(event -> MaxAgePerson());
		menuItemPersonMaxAge.setOnAction(event -> MaxAgePerson());
		//MinAge
		btnPersonMinAge.setOnAction(event -> MinAgePerson());
		menuItemPersonMinAge.setOnAction(event -> MinAgePerson());
		//MaxName
		btnPersonLongestFullName.setOnAction(event -> longestFullName());
		menuItemPersonMaxName.setOnAction(event -> longestFullName());
		//MinName
		btnPersonShortestFullName.setOnAction(event -> shortestFullName());
		menuItemPersonMinName.setOnAction(event -> shortestFullName());

		// Platzhalter
		menuItemDataOpenCSV.setOnAction(e -> {
		   //  System.out.println("Open Data from CSV File: TODO");
			FileChooser fileChooser = new FileChooser();
			File selectedFile = fileChooser.showOpenDialog(primaryStage);	
			try {
				readFromCSV(selectedFile);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});		
		menuItemDataSaveCSV.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			File selectedFile = fileChooser.showSaveDialog(primaryStage);
			try {
				writeToCSV(selectedFile);
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}  
			
		});

		menuItemDataSaveObjectStreamFile.setOnAction(e -> {

			FileChooser fileChooser = new FileChooser();
			File selectedFile = fileChooser.showSaveDialog(primaryStage);
			
			if (selectedFile != null) {
				try {
					serializeToFileAsObjectStream(selectedFile);
				} catch (FileNotFoundException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				} catch (IOException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		
		menuItemDataOpenObjectStreamFile.setOnAction(e -> {

			FileChooser fileChooser = new FileChooser();
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
			
			if (selectedFile != null) {
				try {
					deserializeFromFileAsObjectStream(selectedFile);
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}		
		});				
	}

	// BINDING FUNCTIONS (CONTROLLER)
	/**
	 * Demonstrate object serialization
	 * 
	 * @param filename path to file
	 * 
	 * @throws FileNotFoundException if filename can not be opened for writing
	 * @throws IOException           if a problem occurs during writeObject
	 */
	public void serializeToFileAsObjectStream(File f) throws FileNotFoundException, IOException {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			oos.writeObject(arrayListPersons);
		}
		// no catch ... try-with-resources (@see API-Doc: AutoClosable )
		finally {
			System.out.println("DEBUG: Save to: " + f.getPath() + " over.");
		}

	}

	/**
	 *  simple way of writing files
	 */
	public void writeToCSV(File f) throws IOException {

		String name = f.getAbsolutePath();
		try (PrintWriter out = new PrintWriter(new FileWriter(name, true))) {
			// prepare file handling
			
			for (Person p: arrayListPersons) {
				// parse to string
				String line = Integer.toString(p.getId());
				line += "\t" + p.getName();
				line += "\t" + p.getSurname();
				// write string
				out.println(line);
			}
		}

	}

	/**
	 *  simple way of writing files
	 */
	public void readFromCSV(File f) throws IOException {


		ArrayList<Person> newPersons = new ArrayList<>(); // my data model
		Path p = f.toPath();

		try (BufferedReader in = Files.newBufferedReader(p)) {

			String line = in.readLine();

			while (line != null) {
 
				// parse data
				String[] data = line.split("\t");
				int id = Integer.parseInt(data[0]);
				String name =  data[1];
				String surname = data[2];
				int age = Integer.parseInt(data[3]);
				// add data through special constructor (with Id) 
				newPersons.add( new Person(id, name, surname,age));

				// get next line
				line = in.readLine();
			}
			// in.close(); // do not need it, will be automatically closed (AutoClosable)

			// update list
//			arrayListPersons.clear();
//			arrayListPersons.addAll(newPersons); 
//			// needed
//			lvPersons.refresh();

			arrayListPersons = newPersons;
			olPersons = FXCollections.observableList(arrayListPersons);
			lvPersons.setItems(olPersons);
			lvPersons.refresh();
		}		

		

	}	
	@SuppressWarnings("unchecked")
	public void deserializeFromFileAsObjectStream(File f)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			
			//  DOES NOT WORK / FUNKTIONIERT NICHT: 
			//  reference to old object is removed from memory, so olCrewList have lost the reference
			//  arrayListCrew = (ArrayList<CrewMember>) ois.readObject();
			//  
			
			ArrayList<Person> newPersons = (ArrayList<Person>) ois.readObject();

			// see
//			arrayListPersons.clear(); // remove old / alte Elemente entfernen
//			arrayListPersons.addAll(tempCrew); // add new / neue Elemente hinzufügen
//			lvPersons.refresh();
		
			arrayListPersons = newPersons;
			olPersons = FXCollections.observableList(arrayListPersons);
			lvPersons.setItems(olPersons);
			lvPersons.refresh();
			
			
		} finally {
			System.out.println("DEBUG: open from: " + f.getPath() + " over.");
		}

	}


	
	
	/**
	 *  create new Person in data model 
	 */
	public void addNewPerson() {
		String name = txtName.getText();
		String surname = txtSurname.getText();
		int age=Integer.parseInt(txtAge.getText());
		Person p = new Person(name, surname,age);
		//lvPersons.getItems().add(p);     // OLD
		olPersons.add(p);                  // NEW 
		lvPersons.getSelectionModel().select(p); // forcing iteration, slow + ERROR SOURCE !!!!	
	}
	
	/**
	 *  report on data model
	 */
	public void personReport() {
		System.out.println("TITLE=" + formTitle);
		
		System.out.println("\n Observable List \n****************");	
		for (Person p: olPersons) {
			System.out.println(p);
		}

		System.out.println("\n arrayListPersons \n****************");	
		for (Person p: arrayListPersons) {
			System.out.println(p);
		}
	}
	
	/**
	 * Maximum age of person object in data model
	 */
	public void MaxAgePerson() {
		System.out.println("TITLE=" + formTitle);
		int i=0;
		for(Person p:arrayListPersons) {
			if(p.getAge()>i) {
				i=p.getAge();
			}
		}
		System.out.println(" Oldest Person is: \n");
		System.out.println(i);
	}
	public void MinAgePerson() {
		System.out.println("TITLE=" + formTitle);
		int i=10000000;
		for(Person p:arrayListPersons) {
			if(p.getAge()<i) {
				i=p.getAge();
			}
		}
		System.out.println(" Youngest Person is: \n");
		System.out.println(i);
	}
	
	/** 
     * Shortest Name
     */
	public void shortestFullName() {
        String s="\t\t\t\t\t\t\t\t\t";
        for(Person p: arrayListPersons) {
            if (p.getFullName()!=null && p.getFullName().length()<s.length())s=p.getFullName();
        }
        System.out.println(s);
    } 
    
    /**
     * Longest Name
     */
    public void longestFullName() {
        String s="";
        for(Person p: arrayListPersons) {
            if (p.getFullName().length()>s.length())s=p.getFullName();
        }
        System.out.println(s);
    }

	/**
	 *  update selected person in data model (according to text field' content
	 */
	public void updateSelectedPerson() {
		Person p = lvPersons.getSelectionModel().getSelectedItem();
		if (p != null) {
			p.setSurname(txtSurname.getText());
			p.setName(txtName.getText());
			p.setAge(Integer.parseInt(txtAge.getText()));
			lvPersons.refresh(); 								 
		}
	}


	/**
	 *  delete person object from data model and view
	 */
	public void deleteSelectedPerson() {
		int selectedIdx = lvPersons.getSelectionModel().getSelectedIndex();
		if (selectedIdx != -1) {
			Person p = (Person) lvPersons.getSelectionModel().getSelectedItem();
			lvPersons.getItems().remove(selectedIdx);  // OLD - fast
			//olPersons.remove(p); // NEW - forcing iteration, slow + ERROR SOURCE !!!!
			System.out.println("Removed " + p);
		}
	}
	

	/**
	 * Copy settings from a Person object into text field. 
	 * Used by ListView listeners
	 * 
	 * @param new_val		- newly selected Person in the list
	 */
	public void setTextFieldToListSelection(Person new_val) {
		if (new_val != null) {
			txtName.setText(new_val.getName());
			txtSurname.setText(new_val.getSurname());
			txtAge.setText((new_val.getAge()+""));
		} else {
			clearFields();
		}
	}

	/**
	 *  clear text input fields
	 */
	public void clearFields() {
		txtName.setText("");
		txtSurname.setText("");
		txtAge.setText("");
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