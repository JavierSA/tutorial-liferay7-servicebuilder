/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tutoriales.liferay.servicebuilder.libro.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class LibroSoap implements Serializable {
	public static LibroSoap toSoapModel(Libro model) {
		LibroSoap soapModel = new LibroSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLibroId(model.getLibroId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setEscritor(model.getEscritor());
		soapModel.setPublicacion(model.getPublicacion());

		return soapModel;
	}

	public static LibroSoap[] toSoapModels(Libro[] models) {
		LibroSoap[] soapModels = new LibroSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LibroSoap[][] toSoapModels(Libro[][] models) {
		LibroSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LibroSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LibroSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LibroSoap[] toSoapModels(List<Libro> models) {
		List<LibroSoap> soapModels = new ArrayList<LibroSoap>(models.size());

		for (Libro model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LibroSoap[soapModels.size()]);
	}

	public LibroSoap() {
	}

	public long getPrimaryKey() {
		return _libroId;
	}

	public void setPrimaryKey(long pk) {
		setLibroId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLibroId() {
		return _libroId;
	}

	public void setLibroId(long libroId) {
		_libroId = libroId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public String getEscritor() {
		return _escritor;
	}

	public void setEscritor(String escritor) {
		_escritor = escritor;
	}

	public Date getPublicacion() {
		return _publicacion;
	}

	public void setPublicacion(Date publicacion) {
		_publicacion = publicacion;
	}

	private String _uuid;
	private long _libroId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _titulo;
	private String _escritor;
	private Date _publicacion;
}