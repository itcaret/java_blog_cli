public interface Blog {

	/**
	 * 記事一覧を取得します。
	 * @return 記事一覧
	 */
	Article[] getArticles();

	/**
	 * 記事を取得します。
	 * @param id 記事ID
	 * @return 記事
	 */
	Article getArticle(Integer id);

	/**
	 * 記事を作成します。
	 * @param newArticle 新規記事
	 * @return 作成件数
	 */
	Integer createArticle(Article newArticle);

	/**
	 * 記事を更新します。
	 * @param updateArticle 更新記事
	 * @param id 更新対象記事ID
	 * @return
	 */
	Integer updateArticle(Article updateArticle, Integer id);

	/**
	 * 記事を削除します。
	 * @param id 削除対象記事ID
	 * @return
	 */
	Integer deleteArticle(Integer id);
}
