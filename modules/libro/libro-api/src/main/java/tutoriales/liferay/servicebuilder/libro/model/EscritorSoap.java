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
public class EscritorSoap implements Serializable {
	public static EscritorSoap toSoapModel(Escritor model) {
		EscritorSoap soapModel = new EscritorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEscritorId(model.getEscritorId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static EscritorSoap[] toSoapModels(Escritor[] models) {
		EscritorSoap[] soapModels = new EscritorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EscritorSoap[][] toSoapModels(Escritor[][] models) {
		EscritorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EscritorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EscritorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EscritorSoap[] toSoapModels(List<Escritor> models) {
		List<EscritorSoap> soapModels = new ArrayList<EscritorSoap>(models.size());

		for (Escritor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EscritorSoap[soapModels.size()]);
	}

	public EscritorSoap() {
	}

	public long getPrimaryKey() {
		return _escritorId;
	}

	public void setPrimaryKey(long pk) {
		setEscritorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEscritorId() {
		return _escritorId;
	}

	public void setEscritorId(long escritorId) {
		_escritorId = escritorId;
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

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	private String _uuid;
	private long _escritorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombre;
}