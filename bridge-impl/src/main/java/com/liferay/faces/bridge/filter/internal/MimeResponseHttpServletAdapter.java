/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.filter.internal;

import java.io.IOException;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.MimeResponse;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


/**
 * Provides a way to decorate a {@link MimeResponse} as an {@link HttpServletResponse}. The methods signatures that are
 * unique to {@link HttpServletResponse} throw {@link UnsupportedOperationException} since they are never called during
 * the RENDER_RESPONSE phase of the JSF lifecycle (the use-case for which this class was written).
 *
 * @author  Neil Griffin
 */
public class MimeResponseHttpServletAdapter extends MimeResponseWrapper implements HttpServletResponse {

	public MimeResponseHttpServletAdapter(MimeResponse mimeResponse) {
		super(mimeResponse);
	}

	/**
	 * See {@link HttpServletResponse#addCookie(Cookie)}
	 */
	public void addCookie(Cookie cookie) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#addDateHeader(String, long)}
	 */
	public void addDateHeader(String name, long date) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#addHeader(String, String)}
	 */
	public void addHeader(String name, String value) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#addIntHeader(String, int)}
	 */
	public void addIntHeader(String name, int value) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#containsHeader(String)}
	 */
	public boolean containsHeader(String name) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#encodeRedirectURL(String)}
	 */
	public String encodeRedirectURL(String url) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#encodeRedirectUrl(String)}
	 */
	public String encodeRedirectUrl(String url) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#encodeUrl(String)}
	 */
	public String encodeUrl(String url) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#sendError(int)}
	 */
	public void sendError(int sc) throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#sendError(int)}
	 */
	public void sendError(int sc, String msg) throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#sendRedirect(String)}
	 */
	public void sendRedirect(String location) throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setCharacterEncoding(String)}
	 */
	public void setCharacterEncoding(String charset) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setContentLength(int)}
	 */
	public void setContentLength(int len) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setDateHeader(String, long)}
	 */
	public void setDateHeader(String name, long date) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setHeader(String, String)}
	 */
	public void setHeader(String name, String value) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setIntHeader(String, int)}
	 */
	public void setIntHeader(String name, int value) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setLocale(Locale)}
	 */
	public void setLocale(Locale loc) {
		// no-op: called by org.apache.myfaces.view.jsp.JspViewDeclarationLanguage.buildView(FacesContext,UIViewRoot)
	}

	/**
	 * See {@link HttpServletResponse#getOutputStream()}
	 */
	public ServletOutputStream getOutputStream() throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setStatus(int)}
	 */
	public void setStatus(int sc) {
		throw new UnsupportedOperationException();
	}

	/**
	 * See {@link HttpServletResponse#setStatus(int, String)}
	 */
	public void setStatus(int sc, String sm) {
		throw new UnsupportedOperationException();
	}
}