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

package tutoriales.liferay.servicebuilder.libro.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tutoriales.liferay.servicebuilder.libro.model.Escritor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Escritor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Escritor
 * @generated
 */
@ProviderType
public class EscritorCacheModel implements CacheModel<Escritor>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EscritorCacheModel)) {
			return false;
		}

		EscritorCacheModel escritorCacheModel = (EscritorCacheModel)obj;

		if (escritorId == escritorCacheModel.escritorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, escritorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", escritorId=");
		sb.append(escritorId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Escritor toEntityModel() {
		EscritorImpl escritorImpl = new EscritorImpl();

		if (uuid == null) {
			escritorImpl.setUuid(StringPool.BLANK);
		}
		else {
			escritorImpl.setUuid(uuid);
		}

		escritorImpl.setEscritorId(escritorId);
		escritorImpl.setGroupId(groupId);
		escritorImpl.setCompanyId(companyId);
		escritorImpl.setUserId(userId);

		if (userName == null) {
			escritorImpl.setUserName(StringPool.BLANK);
		}
		else {
			escritorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			escritorImpl.setCreateDate(null);
		}
		else {
			escritorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			escritorImpl.setModifiedDate(null);
		}
		else {
			escritorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			escritorImpl.setNombre(StringPool.BLANK);
		}
		else {
			escritorImpl.setNombre(nombre);
		}

		escritorImpl.resetOriginalValues();

		return escritorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		escritorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(escritorId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}
	}

	public String uuid;
	public long escritorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
}