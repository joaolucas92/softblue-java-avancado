package br.com.softblue.Annotations;

import java.lang.reflect.Method;

public class Property {

	public static <T> void set(Object obj, String field, T value) throws Exception {
		set(obj, field, value, null);
	}

	public static <T> void set(Object obj, String field, T value, Class<?> paramType) {

		try {
			Class<?> clazz = obj.getClass();

			if (paramType == null) {
				// Se paramType não foi definido, considere que ele é do mesmo tipo do valor da
				// propriedade
				paramType = value.getClass();
			}

			String methodName = "set" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
			Method m = clazz.getMethod(methodName, paramType);
			m.invoke(obj, value);

		} catch (NoSuchMethodException e) {
			throw new RuntimeException("Método não encontrado para o campo: " + field, e);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao invocar o setter para: " + field, e);
		}

	}

	public static <T> T get(Object obj, String field, Class<T> returnType) {

		try {
			Class<?> clazz = obj.getClass();
			String methodName = "get" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
			Method m = clazz.getMethod(methodName);
			Object ret = m.invoke(obj);
			return returnType.cast(ret);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("Método getter não encontrado para o campo: " + field, e);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao invocar o getter para: " + field, e);
		}

	}
}
