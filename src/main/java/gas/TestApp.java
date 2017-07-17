package gas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class TestApp {
	public static void main(String[] args) {
	
		//Maven: copy files to {basedir}/target/patch
		//Java: read file relative to classpath (see bellow)
		File file = new File(FilenameUtils.separatorsToSystem("patch\\test.txt"));
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		try {
			System.out.println(FileUtils.readFileToString(file, "UTF-8"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
