package control.dao.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IretornaConsulta {

	@SuppressWarnings("unchecked")
	public static <T> List<T> retornaConsulta(ResultSet rs, T t) {
		List<T> retornoConsulta = new ArrayList<>();
		String value = null;
		String colName = null;
		try {
			while (rs.next()) {
				Object obj = t.getClass().newInstance();
				for (int col = 1; col <= rs.getMetaData().getColumnCount(); col++) {
					value = rs.getString(col);
					colName = rs.getMetaData().getColumnName(col);
					try {
						Field field = obj.getClass().getDeclaredField(colName);
						field.setAccessible(true);
						if (rs.getMetaData().getColumnTypeName(col).equals("INT")) {
							field.set(obj, Integer.parseInt(value));
						} else {
							field.set(obj, value);

						}
						field.setAccessible(false);

					} catch (IllegalArgumentException | IllegalAccessException
							| NoSuchFieldException | SecurityException e) {
						e.printStackTrace();
					}
				}
				retornoConsulta.add((T) obj);
			}
		} catch (SQLException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return retornoConsulta;
	}
}
