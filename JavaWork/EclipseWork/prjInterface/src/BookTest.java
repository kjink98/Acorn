class BookTest {
	public static void main(String[] args) {
		BookPack.Book books[] = new BookPack.Book[4];
		books[0] = new BookPack.Book("자바를 자바라", "홍길동", 2005);
		books[1] = new BookPack.Book("CSS", "임꺽정", 2012);
		books[2] = new BookPack.Book("JavaScript", "신돌석", 2009);
		books[3] = new BookPack.Book("HTML", "강감찬", 2020);

		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}
	}
}