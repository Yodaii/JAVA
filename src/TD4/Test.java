package TD4;

public class Test {
	public static void main(String[] args) {
		Seq<String> s = new Seq<String>();
		s.add("le");
		s.add("petit");
		s.add("chat");
		s.add("est");
		s.add("sur");
		s.add("le");
		s.add("fauteuil");
		System.out.println(s);
		System.out.println(s.occursAt("chat", 2));
		System.out.println(s.find("le"));
		System.out.println(s.countOccurence("le"));
		Seq<String> sous = new Seq<String>();
		sous.add("bien");
		sous.add("assis");
		s.insert(4, sous);
		System.out.println(s);
	}
}
