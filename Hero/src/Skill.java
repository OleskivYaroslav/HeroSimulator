
public class Skill {

	private int id;
	private String name;

	private int ht;
	private int t;
	private int e;

	private int level;
	private int percentage;

	public Skill() {

	}

	public Skill(int id, String name, int ht, int t, int e, int level, int percentage) {
		this.id = id;
		this.name = name;
		this.ht = ht;
		this.t = t;
		this.e = e;
		this.level = level;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHt() {
		return ht;
	}

	public void setHt(int ht) {
		this.ht = ht;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", ht=" + ht + ", t=" + t + ", e=" + e + ", level=" + level
				+ ", percentage=" + percentage + "]";
	}

	
}
