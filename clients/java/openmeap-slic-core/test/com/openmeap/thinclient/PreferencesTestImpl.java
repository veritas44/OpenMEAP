/*
 ###############################################################################
 #                                                                             #
 #    Copyright (C) 2011-2014 OpenMEAP, Inc.                                   #
 #    Credits to Jonathan Schang & Rob Thacher                                 #
 #                                                                             #
 #    Released under the LGPLv3                                                #
 #                                                                             #
 #    OpenMEAP is free software: you can redistribute it and/or modify         #
 #    it under the terms of the GNU Lesser General Public License as published #
 #    by the Free Software Foundation, either version 3 of the License, or     #
 #    (at your option) any later version.                                      #
 #                                                                             #
 #    OpenMEAP is distributed in the hope that it will be useful,              #
 #    but WITHOUT ANY WARRANTY; without even the implied warranty of           #
 #    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
 #    GNU Lesser General Public License for more details.                      #
 #                                                                             #
 #    You should have received a copy of the GNU Lesser General Public License #
 #    along with OpenMEAP.  If not, see <http://www.gnu.org/licenses/>.        #
 #                                                                             #
 ###############################################################################
 */

package com.openmeap.thinclient;

import java.util.HashMap;
import java.util.Map;

public class PreferencesTestImpl implements Preferences {
	private Map map = null;
	public PreferencesTestImpl() {
		this.map = new HashMap();
	}
	public String get(String key) {
		return (String)map.get(key);
	}
	public Boolean put(String key, String value) {
		return Boolean.valueOf(map.put(key,value)!=null);
	}
	public Boolean remove(String key) {
		return Boolean.valueOf(map.remove(key)!=null);
	}
	public Boolean clear() {
		map.clear();
		return Boolean.TRUE;
	}
}
