package com.convergence.framework.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 基础工具
 */
public class ValidateUtil {
	/*************************** Data Validate ***************************/
	/**
	 * Is Empty Check
	 */
	public static boolean isEmpty(CharSequence c){
		return (c==null || c.length()==0);
	}
	/**
	 * Is Not Empty Check
	 */
	public static boolean isNotEmpty(CharSequence c){
		return !isEmpty(c);
	}
	/**
	 * Is Empty Check
	 */
	public static boolean isEmpty(String s){
		return (s==null || "".equals(s) || s.length()==0 || "".equals(s.trim()));
	}
	/**
	 * Is Not Empty Check
	 */
	public static boolean isNotEmpty(String s){
		return !isEmpty(s);
	}
	/**
	 * Is Empty Check
	 * @param <E>
	 * @param <K>
	 */
	public static <E, K> boolean isEmpty(Map<K, E> m){
		return (m==null || m.size()==0);
	}
	/**
	 * Is Not Empty Check
	 * @param <K>
	 * @param <E>
	 */
	public static <K, E> boolean isNotEmpty(Map<K, E> m){
		return !isEmpty(m);
	}
	/**
	 * Is Empty Check
	 * @param <E>
	 */
	public static <E> boolean isEmpty(Collection<E> c){
		return (c==null || c.size()==0);
	}
	/**
	 * Is Not Empty Check
	 * @param <E>
	 */
	public static <E> boolean isNotEmpty(Collection<E> c){
		return !isEmpty(c);
	}
	/**
	 * Is Empty Check
	 */
	public static <E> boolean isEmpty(Object o){
		if(o==null){
			return true;
		}
		if(o instanceof List){
			return ((List) o).size() == 0;  
		}
		if((o instanceof String)){
			return ((String) o).trim().equals("");
		}
		return false;
	}
	/**
	 * Is Not Empty Check
	 */
	public static <E> boolean isNotEmpty(Object o){
		return !isEmpty(o);
	}
	
}
