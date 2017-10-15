package control.dao.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface IpegaAtributosObjetos {

	static <T> List<String> Lista(T t, String campoRemove) {

		List<String> atribObjList = Arrays.asList(t.getClass().getDeclaredFields()).stream().map(Field::getName)
				.collect(Collectors.toList());
		if (!campoRemove.isEmpty()) {
			atribObjList.remove(campoRemove);
		}
		return atribObjList;
	}

	static <T> List<String> Lista(T t) {

		List<String> atribObjList = Arrays.asList(t.getClass().getDeclaredFields()).stream().map(Field::getName)
				.collect(Collectors.toList());
		return atribObjList;
	}

	static <T> String String(T t, String campoRemove) {
		List<String> lista = Lista(t, campoRemove);
		String atributosString = lista.stream().map(Object::toString).collect(Collectors.joining(","));
		// StringBuilder atribObjString =
		// Arrays.asList(t.getClass().getDeclaredFields()).stream().map(Field::getName)
		// .collect(Collectors.joining(","));
		// if (!campoRemove.isEmpty()) {
		// atribObjString.replace(campoRemove, "");
		return atributosString;
	}

	static <T> String String(T t) {
		String atributosString = Lista(t).stream().map(Object::toString).collect(Collectors.joining(","));
		return atributosString;
	}
}
