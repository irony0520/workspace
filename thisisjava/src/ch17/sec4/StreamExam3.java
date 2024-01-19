package ch17.sec4;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExam3 {

	public static void main(String[] args) throws Exception {
		
		Class cla = StreamExam3.class;
		URL url = cla.getResource("data.txt");
		URI uri = url.toURI();
		Path path = Paths.get(uri);
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
				
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}

}
