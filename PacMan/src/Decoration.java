public enum Decoration {
	LEFT ('>'),
	RIGHT ('<'),
	UP ('v'),
	DOWN ('^'),
	ALIVE ('*'),
	EAT (' ');
	
	private Character decoration;
	private Decoration(Character decoration){
		this.decoration=decoration;
		
	}
	public Character getDecoration() {
		return decoration;	
	}
	public void setDecoration(Character decoration) {
		this.decoration = decoration;
	}
}