public class InMemoryBlog implements Blog {

	private Article[] articles = {};

	@Override
	public Integer createArticle(Article newArticle) {
		// TODO newArticle.setId(???);
		Article[] newArticles = new Article[this.articles.length + 1];
		for (int i = 0; i < this.articles.length; i++) {
			newArticles[i] = this.articles[i];
		}
		// TODO newArticles[newArticles.length - 1] = ???;
		this.articles = newArticles;
		return 1;
	}

	@Override
	public Article[] getArticles() {
		// TODO
		return null;
	}

	@Override
	public Article getArticle(Integer id) {
		// TODO
		return null;
	}

	@Override
	public Integer updateArticle(Article updateArticle, Integer id) {
		int updateCount = 0;
		Article[] newArticles = new Article[this.articles.length];
		for (int i = 0; i < this.articles.length; i++) {
			if (this.articles[i].getId() == id) {
				// TODO newArticles[i] = ???;
				// TODO ???++;
			} else {
				// TODO newArticles[i] = ???;
			}
		}
		this.articles = newArticles;
		return updateCount;
	}

	@Override
	public Integer deleteArticle(Integer id) {
		// TODO
		return -1;
	}

	private Integer getNextId() {
		Integer nextId = 0;
		for (int i = 0; i < this.articles.length; i++) {
			if (nextId < this.articles[i].getId()) {
				nextId = this.articles[i].getId();
			}
		}
		return nextId + 1;
	}

}
