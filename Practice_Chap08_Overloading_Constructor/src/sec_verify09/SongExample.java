package sec_verify09;

public class SongExample {

	public static void main(String[] args) {

		String[] composer = new String[] { "윤일상", "한효주", "김을동" };

		Song song = new Song();
		song.Show("엄마 사랑해요~", "홍진영", "엄마사랑해요 OST", composer, 2016, 5);

	}

}
