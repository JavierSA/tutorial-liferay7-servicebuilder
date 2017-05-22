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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Escritor. This utility wraps
 * {@link tutoriales.liferay.servicebuilder.libro.service.impl.EscritorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EscritorLocalService
 * @see tutoriales.liferay.servicebuilder.libro.service.base.EscritorLocalServiceBaseImpl
 * @see tutoriales.liferay.servicebuilder.libro.service.impl.EscritorLocalServiceImpl
 * @generated
 */
@ProviderType
public class EscritorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tutoriales.liferay.servicebuilder.libro.service.impl.EscritorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of escritors.
	*
	* @return the number of escritors
	*/
	public static int getEscritorsCount() {
		return getService().getEscritorsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritors(
		int start, int end) {
		return getService().getEscritors(start, end);
	}

	/**
	* Returns all the escritors matching the UUID and company.
	*
	* @param uuid the UUID of the escritors
	* @param companyId the primary key of the company
	* @return the matching escritors, or an empty list if no matches were found
	*/
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getEscritorsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<tutoriales.liferay.servicebuilder.libro.model.Escritor> getEscritorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tutoriales.liferay.servicebuilder.libro.model.Escritor> orderByComparator) {
		return getService()
				   .getEscritorsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the escritor to the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was added
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor addEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return getService().addEscritor(escritor);
	}

	/**
	* Creates a new escritor with the primary key. Does not add the escritor to the database.
	*
	* @param escritorId the primary key for the new escritor
	* @return the new escritor
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor createEscritor(
		long escritorId) {
		return getService().createEscritor(escritorId);
	}

	/**
	* Deletes the escritor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor that was removed
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor deleteEscritor(
		long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEscritor(escritorId);
	}

	/**
	* Deletes the escritor from the database. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was removed
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor deleteEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return getService().deleteEscritor(escritor);
	}

	public static tutoriales.liferay.servicebuilder.libro.model.Escritor fetchEscritor(
		long escritorId) {
		return getService().fetchEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor, or <code>null</code> if a matching escritor could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor fetchEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchEscritorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the escritor with the primary key.
	*
	* @param escritorId the primary key of the escritor
	* @return the escritor
	* @throws PortalException if a escritor with the primary key could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor getEscritor(
		long escritorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEscritor(escritorId);
	}

	/**
	* Returns the escritor matching the UUID and group.
	*
	* @param uuid the escritor's UUID
	* @param groupId the primary key of the group
	* @return the matching escritor
	* @throws PortalException if a matching escritor could not be found
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor getEscritorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEscritorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the escritor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param escritor the escritor
	* @return the escritor that was updated
	*/
	public static tutoriales.liferay.servicebuilder.libro.model.Escritor updateEscritor(
		tutoriales.liferay.servicebuilder.libro.model.Escritor escritor) {
		return getService().updateEscritor(escritor);
	}

	public static EscritorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EscritorLocalService, EscritorLocalService> _serviceTracker =
		ServiceTrackerFactory.open(EscritorLocalService.class);
}