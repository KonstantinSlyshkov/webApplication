package stripes.forTesting;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Iterator;

/**
 * (c) Swissquote 6/4/15
 *
 * @author kslyshkov
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class DataBaseTest {

	public static DaoSupport daoSupport;

	public static DaoSupport getDaoSupport() {
		return daoSupport;
	}

	public static void setDaoSupport(DaoSupport daoSupport) {
		DataBaseTest.daoSupport = daoSupport;
	}

	public abstract Class[] getClassesToDelete();

	public void cleanDb() {
		Iterator<Class> classesToRemove = Arrays.asList(getClassesToDelete()).iterator();
		while (classesToRemove.hasNext()) {
			daoSupport
					.getSession().createQuery("DELETE FROM " + transformToString(classesToRemove.next()))
					.executeUpdate();
		}
	}

	private String transformToString(Class classToRemove) {
		return classToRemove.getSimpleName();
	}
}
