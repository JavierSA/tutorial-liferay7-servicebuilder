package tutoriales.liferay.servicebuilder.libro.upgrade.v1_2_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class UpgradeLibro extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        runSQL("ALTER TABLE LIBRO_Libro DROP COLUMN escritorId");
    }

}
