import java.util.ArrayList;
import java.util.List;

public class Skills {

	List<Skill> list = new ArrayList<Skill>();

	public void newSkill(int id, String name, int ht, int t, int e, int level, int percentage) {
		Skill skill = new Skill(id, name, ht, t, e, level, percentage);
		list.add(skill);
	}

	public Skills() {
		newSkill(list.size(), "Superhuman Strength", 0, 0, 0, 1, 0);
		newSkill(list.size(), "Superhuman Endurance", 0, 0, 0, 1, 0);
		newSkill(list.size(), "Superhuman Intelligence", 0, 0, 0, 1, 0);
		newSkill(list.size(), "Superhuman Speed", 0, 0, 0, 1, 0);
		newSkill(list.size(), "Superhuman Agility", 0, 0, 0, 1, 0);
		newSkill(list.size(), "Super Hearing", 0, 0, 0, 1, 0);
	}

	@Override
	public String toString() {
		String s = "Skills [list= \n";
		for(int i =0; i<list.size();i++){
			s+=list.get(i).toString();
			s+="\n";
		}
		return s;
	}

}
