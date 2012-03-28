/*
 ###############################################################################
 #                                                                             #
 #    Copyright (C) 2011-2012 OpenMEAP, Inc.                                   #
 #    Credits to Jonathan Schang & Robert Thacher                              #
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

package com.openmeap.constants;

import org.apache.http.protocol.HTTP;

public class FormConstants {
	
	final static public String CONTENT_TYPE = "Content-type";
	final static public String CONT_TYPE_DEFAULT = "application/x-www-form-urlencoded";
	final static public String CONT_TYPE_XML = "text/xml";
	final static public String CONT_TYPE_HTML = "text/html";
	
	final static public String ENCODING_TYPE = "encodingType";
	final static public String ENCTYPE_MULTIPART_FORMDATA = "multipart/form-data";
	
	final static public String CHAR_ENC_DEFAULT = HTTP.UTF_8;
	
	/*
	 * Page bean names
	 */
	
	final static public String PAGE_BEAN_APP_ADDMODIFY = "addModifyAppPage";
	final static public String PAGE_BEAN_MAIN = "mainOptionsPage";
	
	/*
	 * Shared form parameter names
	 */
	final static public String PROCESS_TARGET = "processTarget";
	final static public String PAGE_BEAN = "bean";
	final static public String DELETE = "delete";
	final static public String APP_ID = "applicationId";
	
	/*
	 * App Add/Modify unique parameter constants
	 */
	final static public String APP_DESCRIPTION = "description";
	final static public String APP_ADMINS = "admins";
	final static public String APP_VERSIONADMINS = "admins";
	final static public String APP_DEPL_HIST_LEN = "deploymentHistoryLength";
	
	/*
	 * App Add/Modify unique parameter string values
	 */
	final static public String APP_DELETE_CONFIRM_TEXT = "delete the application";
	
}
