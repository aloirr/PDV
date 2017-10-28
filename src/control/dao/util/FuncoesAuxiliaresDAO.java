package control.dao.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface IgeradorSqlUpdate extends IretornaValoresAtributosObj {

	static public <T> String sqlUpdate(T t, String table) {
		String getCampoWhere = "";
		List<String> camposUpdate = new ArrayList<>();
		Field[] fields = t.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				if (field.getName().equalsIgnoreCase("id")) {
					field.setAccessible(true);
					getCampoWhere = "'" + field.get(t) + "'";
					field.setAccessible(false);
				}
				field.setAccessible(true);
				camposUpdate.add(field.getName() + "=" + "'" + field.get(t) + "'");
				field.setAccessible(false);
			} catch (IllegalArgumentException | IllegalAccessException e) {

				e.printStackTrace();
			}

		}
		return "UPDATE " + table + " SET "
				+ camposUpdate.stream().map(p -> p.toString()).collect(Collectors.joining(","))
				+ " WHERE id" + "=" + getCampoWhere;
	}
}
