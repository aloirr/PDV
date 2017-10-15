package control.dao.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface IretornaValoresAtributosObj {

	static <T> String retornaGetOld(T t) {
		String campoValue = null;
		try {
			for (Method field : Arrays.asList(t.getClass().getDeclaredMethods())) {
				if (field.getName().contains("get") && !field.getName().contains("Id")) {
					System.out.println(field.getName());

					if (campoValue == null) {
						campoValue = "'" + field.invoke(t) + "'";
					} else {
						campoValue += ",'" + field.invoke(t) + "'";
					}
				}
			}
			return campoValue;
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return campoValue;
	}

	static <T> String retornaGet(T t) {
		String campoValue = null;
		Field[] fields = t.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				campoValue += "'" + field.get(t) + "'";
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			field.setAccessible(false);
		}
		return campoValue;
	}

	static <T> String retornaGet(T t, String campoRemove) {
		List<String> campoValue = new ArrayList<>();
		Field[] fields = t.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (!field.getName().equals(campoRemove)) {
				field.setAccessible(true);

				try {
					campoValue.add("'" + field.get(t) + "'");
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
				field.setAccessible(false);
			}
		}
		return campoValue.stream().map(p -> p.toString()).collect(Collectors.joining(","));
	}
	
}