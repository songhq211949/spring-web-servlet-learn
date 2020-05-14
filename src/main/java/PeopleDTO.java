
public class PeopleDTO {
	
	private Boolean live;
	
	private boolean rich;

	//注意到没有 boolean 生成的是isRich;
	public boolean isRich() {
		return rich;
	}

	public void setRich(boolean rich) {
		this.rich = rich;
	}

	public Boolean getLive() {
		return live;
	}

	public void setLive(Boolean live) {
		this.live = live;
	}
	
	

}
