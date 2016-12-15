package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Tag extends Model implements Comparable<Tag> {
 
    private String name;
    
    public Tag(String name) {
        this.name = name;
    }
    
	public static Tag findOrCreateByName(String name) {
	    Tag tag = (Tag) Tag.find("byName", name)/*.first()*/;
	    if(tag == null) {
	        tag = new Tag(name);
	    }
	    return tag;
	}
    
    public int compareTo(Tag otherTag) {
        return name.compareTo(otherTag.name);
    }

	public static Object find(String string, String name2) {
		// TODO Auto-generated method stub
		return null;
	}
	
    public String toString() {
        return name;
    }
 
}
