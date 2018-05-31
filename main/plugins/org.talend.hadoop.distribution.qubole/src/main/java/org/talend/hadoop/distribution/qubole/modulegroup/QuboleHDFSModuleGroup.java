// ============================================================================
//
// Copyright (C) 2006-2018 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.qubole.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.qubole.QuboleConstant;

public class QuboleHDFSModuleGroup {

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> moduleGroups = new HashSet<>();
        DistributionModuleGroup moduleGroup = new DistributionModuleGroup(QuboleConstant.HDFS_MODULE_GROUP.getModuleName());
        moduleGroups.add(moduleGroup);
        return moduleGroups;
    }

}
