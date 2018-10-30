import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Blog blog = BlogFactory.newBlog();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("> ");
			String readLine = scanner.nextLine();
			String[] command = readLine.split(" ");
			if ("list".equals(command[0])) {
				Article[] articles = blog.getArticles();
				for (Article article : articles) {
					System.out.println(article.getId() + ":" + article.getTitle());
				}
			} else if ("show".equals(command[0])) {
				Integer id = Integer.parseInt(command[1]);
				Article article = blog.getArticle(id);
				if (article != null) {
					System.out.println("ID:" + article.getId());
					System.out.println("TITLE:" + article.getTitle());
					System.out.println("BODY:" + article.getBody());
				}
			} else if ("create".equals(command[0])) {
				Article newArticle = new Article(null, command[1], command[2]);
				int count = blog.createArticle(newArticle);
				System.out.println("(" + count + ")");
			} else if ("update".equals(command[0])) {
				Integer id = Integer.parseInt(command[1]);
				Article updateArticle = new Article(id, command[2], command[3]);
				int count = blog.updateArticle(updateArticle, id);
				System.out.println("(" + count + ")");
			} else if ("delete".equals(command[0])) {
				Integer id = Integer.parseInt(command[1]);
				int count = blog.deleteArticle(id);
				System.out.println("(" + count + ")");
			} else if ("quit".equals(command[0])) {
				break;
			} 
		}
		System.out.println("bye");
		scanner.close();
	}
}
