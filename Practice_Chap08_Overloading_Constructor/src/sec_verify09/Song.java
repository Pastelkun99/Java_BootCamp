package sec_verify09;

import java.util.Arrays;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String[] composer = {"���ϻ�", "��ȿ��", "������"};
	private int year;
	private int track;
	
	public void Show(String title, String artist, String album, String[] composer, int year, int track) {
		System.out.println("�뷡 ���� : " + title);
		System.out.println("���� : " + artist);
		System.out.println("�ٹ� : " + album);
		System.out.println("�۰ : " + Arrays.toString(composer));
		System.out.println("�⵵ : " + year);
		System.out.println("Ʈ�� ��ȣ : " + track);
	}
	
	public void Show() {
		System.out.println("�뷡 ���� : " + this.title);
		System.out.println("���� : " + this.artist);
		System.out.println("�ٹ� : " + this.album);
		System.out.println("�۰ : " + Arrays.toString(composer));
		System.out.println("�⵵ : " + this.year);
		System.out.println("Ʈ�� ��ȣ : " + this.track);
	}
}

