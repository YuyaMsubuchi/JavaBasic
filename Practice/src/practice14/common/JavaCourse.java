package practice14.common;

public abstract class JavaCourse implements Course {
	
	
	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */
	public String getCourseName() {
		return "【Eラーニング】Java";
		
	}
	public String[] getCourseUnit(){
		String[] array = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承高度な継承"};
	    return array;
	}

	
}
