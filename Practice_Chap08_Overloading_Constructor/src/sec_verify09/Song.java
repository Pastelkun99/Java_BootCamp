package sec_verify09;

import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String[] composer = {"윤일상", "한효주", "김을동"};
	private int year;
	private int track;
	
	public void Show(String title, String artist, String album, String[] composer, int year, int track) {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 : " + album);
		System.out.println("작곡가 : " + Arrays.toString(composer));
		System.out.println("년도 : " + year);
		System.out.println("트랙 번호 : " + track);
	}
	
	public void Show() {
		System.out.println("노래 제목 : " + this.title);
		System.out.println("가수 : " + this.artist);
		System.out.println("앨범 : " + this.album);
		System.out.println("작곡가 : " + Arrays.toString(composer));
		System.out.println("년도 : " + this.year);
		System.out.println("트랙 번호 : " + this.track);
	}
}

