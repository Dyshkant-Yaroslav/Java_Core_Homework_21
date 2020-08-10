package ua.lviv.desctop.min;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws IOException {

		writeAnnotationFieldsInFile(Car.class);

	}

	public static void writeAnnotationFieldsInFile(Class<?> customClass) throws IOException {
		Field[] fields = customClass.getDeclaredFields();
		File file = new File("FieldFile.txt");
		Writer wr = new FileWriter(file);
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(CarFields.class) instanceof CarFields) {
				wr.write(field.getName() + "\n");

			}

		}
		wr.close();
	}

}
