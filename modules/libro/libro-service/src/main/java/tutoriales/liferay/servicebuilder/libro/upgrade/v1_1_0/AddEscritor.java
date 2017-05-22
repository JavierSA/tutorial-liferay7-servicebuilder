package tutoriales.liferay.servicebuilder.libro.upgrade.v1_1_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class AddEscritor extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        runSQL("CREATE TABLE LIBRO_Escritor (" +
                "uuid_ VARCHAR(75) NULL," +
                "escritorId LONG NOT NULL PRIMARY KEY," +
                "groupId LONG," +
                "companyId LONG," +
                "userId LONG," +
                "userName VARCHAR(75) NULL," +
                "createDate DATE NULL," +
                "modifiedDate DATE NULL," +
                "nombre VARCHAR(75) NULL" +
                ");");
    }

}
