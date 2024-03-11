package com.spring.spring.entity;



public class Course {
	
	private long id;
  private String title;
  private String description;// Corrected the data type from 'styring' to 'string'   private string description;

// Constructor for the Course class
  public Course(long id, String title, String description)
  {
	 super();
   this.setId(id);
   this.setTitle(title);
   this.setDescription(description);
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

}
