import static org.junit.Assert.*;
import org.junit.*;


public class AllTests {
	@RunWith(Suite.class)
	@SuiteClasses({TestMovieList.class,TestEmptyMovieList.class,TestMovieListWithOneMovie.class}) 
}