package br.com.softblue.Annotations;

import java.lang.reflect.Method;

public class ObjectCreator {

	public static <T> T create(Class<T> clazz) throws Exception {

		try {

			T obj = clazz.getDeclaredConstructor().newInstance();

			Method[] metodos = clazz.getDeclaredMethods();

			for (Method m : metodos) {
				if (m.isAnnotationPresent(Init.class)) {

					Init init = m.getAnnotation(Init.class);
					if (init != null && init.runOnInstantation()) {
						m.invoke(obj);
					}
				}
			}
			return obj;
		} catch (Exception e) {
			System.out.println("Objeto é nulo");
			return null;
		}
	}

}