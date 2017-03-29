package stripes.forTesting;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (c) Swissquote 6/4/15
 *
 * @author kslyshkov
 */
@Repository
@Transactional
public class DaoSupport {
	private SessionFactory sessionFactory;

	public DaoSupport(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public <E> Object save(Object entity) {
		return this.getSession().save(entity);
	}

	public <E> void saveAll(E... entities) {
		Object[] arr = entities;
		int len = entities.length;

		for(int i = 0; i < len; ++i) {
			Object entity = arr[i];
			this.getSession().save(entity);
		}
	}

	public <E> void updateAll(E... entities) {
		Object[] arr = entities;
		int len = entities.length;

		for(int i = 0; i < len; ++i) {
			Object entity = arr[i];
			this.getSession().update(entity);
		}
	}

	public <E> List<E> findAll(Class<E> entityClass) {
		return this.getSession().createCriteria(entityClass).list();
	}

	public void flushSession() {
		this.getSession().flush();
	}

	public void flushAndClear() {
		this.getSession().flush();
		this.getSession().clear();
	}

}
