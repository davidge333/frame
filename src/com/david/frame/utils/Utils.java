package com.david.frame.utils;

public class Utils {
	/**
	 * to int
	 * @param value
	 * @param _default
	 * @return
	 */
	public static final int toInt(Object value, int _default) {
		if (value == null || "".equals(value.toString().trim())) {
			return _default;
		}

		try {
			return Integer.valueOf(value.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return _default;
	}
	
	/**
	 * to long
	 * @param value
	 * @param _default
	 * @return
	 */
	public static final long toLong(Object value, long _default) {
		if (value == null || "".equals(value.toString().trim())) {
			return _default;
		}

		try {
			return Long.valueOf(value.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return _default;
	}
	
	/**
	 *  to double
	 * @param value
	 * @param _default
	 * @return
	 */
	public static final double toDouble(Object value, double _default) {
		if (value == null || "".equals(value.toString().trim())) {
			return _default;
		}

		try {
			return Double.valueOf(value.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

		return _default;
	}
}
