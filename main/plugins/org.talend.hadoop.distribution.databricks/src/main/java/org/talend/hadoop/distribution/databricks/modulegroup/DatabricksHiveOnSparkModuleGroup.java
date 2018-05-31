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
package org.talend.hadoop.distribution.databricks.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.condition.BasicExpression;
import org.talend.hadoop.distribution.condition.ComponentCondition;
import org.talend.hadoop.distribution.condition.EqualityOperator;
import org.talend.hadoop.distribution.condition.SimpleComponentCondition;
import org.talend.hadoop.distribution.constants.SparkBatchConstant;
import org.talend.hadoop.distribution.databricks.DatabricksConstant;

public class DatabricksHiveOnSparkModuleGroup {

    private final static ComponentCondition condition = new SimpleComponentCondition(new BasicExpression(
            SparkBatchConstant.SPARK_LOCAL_MODE_PARAMETER, EqualityOperator.EQ, "false")); //$NON-NLS-1$
/*
    private final static ComponentCondition conditionS3 = new SimpleComponentCondition(new BasicExpression(
            SparkBatchConstant.ALTUS_CLOUD_PROVIDER, EqualityOperator.EQ, "\"AWS\"")); //$NON-NLS-1$

    private final static ComponentCondition conditionAzureFS = new SimpleComponentCondition(new BasicExpression(
            SparkBatchConstant.ALTUS_CLOUD_PROVIDER, EqualityOperator.EQ, "\"Azure\"")); //$NON-NLS-1$
*/
    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        hs.add(new DistributionModuleGroup(DatabricksConstant.HDFS_MODULE_GROUP.getModuleName(), false, condition));
       hs.add(new DistributionModuleGroup(DatabricksConstant.SPARK_MRREQUIRED_MODULE_GROUP.getModuleName(), false, condition));
       /* hs.add(new DistributionModuleGroup(QuboleConstant.SPARK_MODULE_GROUP.getModuleName(), false, condition));
        hs.add(new DistributionModuleGroup(QuboleConstant.SPARK_S3_MRREQUIRED_MODULE_GROUP.getModuleName(), true, conditionS3));
        hs.add(new DistributionModuleGroup(QuboleConstant.SPARK_AZURE_MRREQUIRED_MODULE_GROUP.getModuleName(), true,
                conditionAzureFS));*/
        hs.add(new DistributionModuleGroup(DatabricksConstant.BIGDATALAUNCHER_MODULE_GROUP.getModuleName(), true, condition));
        //hs.add(new DistributionModuleGroup(QuboleConstant.GRAPHFRAMES_MRREQUIRED_MODULE_GROUP.getModuleName(), true, condition));
        return hs;
    }
}
