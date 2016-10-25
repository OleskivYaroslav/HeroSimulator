
public class User {
	String name;
	int id;
	Skills skills = new Skills();
	int money = 27000;
	final int UpgradeCost = 500;

	public boolean buyUpgrade(int SkillId) {
		boolean bool;
		Skill s = skills.list.get(SkillId);
		int cash = UpgradeCost * s.getLevel();
		if (this.money < cash) {
			bool = false;
		} else {
			this.money -= cash;
			s.setLevel(s.getLevel() + 1);
			bool = true;
		}
		return bool;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", money=" + money + "]";
	}
	
	

}
