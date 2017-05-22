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

package tutoriales.liferay.servicebuilder.libro.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EscritorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EscritorLocalService
 * @generated
 */
@ProviderType
public class EscritorLocalServiceWrapper implements EscritorLocalService,
	ServiceWrapper<EscritorLocalService> {
	public EscritorLocalServiceWrapper(
		EscritorLocalService escritorLocalService) {
		_escritorLocalService = escritorLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _escritorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _escritorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _escritorLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _escritorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _escritorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _escritorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of escritors.
	*
	* @return the number of escritors
	*/
	@Override
	public int getEscritorsCount() {
		return _escritorLocalService.getEscritorsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _escritorLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _escritorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _escritorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _escritorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the escritors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tutoriales.liferay.servicebuilder.libro.model.impl.EscritorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @return the range of escritors
	*/
	@Override
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritors(
		int start, int end) {
		return _escritorLocalService.getEscritors(start, end);
	}

	/**
	* Returns all the escritors matching the UUID and company.
	*
	* @param uuid the UUID of the escritors
	* @param companyId the primary key of the company
	* @return the matching escritors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _escritorLocalService.getEscritorsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of escritors matching the UUID and company.
	*
	* @param uuid the UUID of the escritors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of escritors
	* @param end the upper bound of the range of escritors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching escritors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tutoriales.liferay.servicebuilder.libro.model.Escritor> orderByComparator) {
		return _escritorLocalService.getEscritorsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _escritorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _escritorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the escritor to the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was added
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor addEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return _escritorLocalService.addEscritor(escritor);
	}

	/**
	* Creates a new escritor with the primary key. Does not add the escritor to the database.
	*
	* @param escritorId the primary key for the new escritor
	* @return the new escritor
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor createEscritor(
		long escritorId) {
		return _escritorLocalService.createEscritor(escritorId);
	}

	/**
	* Deletes the escritor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor that was removed
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor deleteEscritor(
		long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _escritorLocalService.deleteEscritor(escritorId);
	}

	/**
	* Deletes the escritor from the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was removed
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor deleteEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return _escritorLocalService.deleteEscritor(escritor);
	}

	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor fetchEscritor(
		long escritorId) {
		return _escritorLocalService.fetchEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor fetchEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _escritorLocalService.fetchEscritorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the escritor with the primary key.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor getEscritor(
		long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _escritorLocalService.getEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor
	* @throws PortalException if a matching escritor could not be found
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor getEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _escritorLocalService.getEscritorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the escritor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was updated
	*/
	@Override
	public tutoriales.liferay.servicebuilder.libro.model.Escritor updateEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return _escritorLocalService.updateEscritor(escritor);
	}

	@Override
	public EscritorLocalService getWrappedService() {
		return _escritorLocalService;
	}

	@Override
	public void setWrappedService(EscritorLocalService escritorLocalService) {
		_escritorLocalService = escritorLocalService;
	}

	private EscritorLocalService _escritorLocalService;
}