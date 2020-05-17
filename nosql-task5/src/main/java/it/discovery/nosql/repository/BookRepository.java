package it.discovery.nosql.repository;

import it.discovery.nosql.model.Book;

import java.util.List;

public interface BookRepository {

	/**
	 * Saves this book instance
	 *
	 * @param book
	 * @return
	 */
	Book save(Book book);

	/**
	 * Returns all the books with exact name and
	 * specified locale
	 *
	 * @param name
	 * @param locale
	 * @return
	 */
	List<Book> findByName(String name, String locale);

	/**
	 * Returns all the books with exact name irregardless of locale
	 *
	 * @param name
	 * @return
	 */
	List<Book> findByName(String name);

	/**
	 * Returns all the books that has at least one review
	 *
	 * @return
	 */
	List<Book> findWithReviews();

	/**
	 * Returns all the books where number of pages is greater than pages parameter
	 *
	 * @param name
	 * @return
	 */
	List<Book> findByPagesGreaterThan(int pages);

	/**
	 * Returns all the books of the specified author
	 * ignore them
	 *
	 * @param name
	 * @param pages
	 * @return
	 */
	List<Book> findAllByAuthor_Name(String name);

	/**
	 * Returns overall number of pages for all the books
	 *
	 * @return
	 */
	int findTotalPages();

}
