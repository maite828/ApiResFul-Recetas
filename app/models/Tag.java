package models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Tag extends Model implements Comparable<Tag> {
 
	@Required
	private String name;
    
    public Tag(String name) {
        this.name = name;
    }
    
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
    public Set<Receta> recipes;
	
	private static final Find<Long,Tag> find =new Find<Long,Tag>(){};
    
	public static Tag findOrCreateByName(String name) {
	    Tag tag = (Tag) Tag.find("byName", name);
	    if(tag == null) {
	        tag = new Tag(name);
	    }
	    return tag;
	}
    
    private static Tag find(String string, String name2) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(Tag otherTag) {
        return name.compareTo(otherTag.name);
    }
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Tag> getByName(String tagName){
		 return find.where().eq("name",tagName ).findList(); 
	}

	public void addRecipe(Receta receta){
		this.recipes.add(receta);
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}	
 
}
