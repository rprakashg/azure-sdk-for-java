/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.sql.SqlElasticPool;
import com.microsoft.azure.management.sql.SqlElasticPools;
import com.microsoft.azure.management.sql.SqlServer;

import java.util.List;

/**
 * Implementation of SqlServer.ElasticPools, which enables the creating the elastic pools from the SQLServer directly.
 */
public class ElasticPoolsImpl implements SqlServer.ElasticPools {

    private final String resourceGroupName;
    private final String sqlServerName;
    private final SqlElasticPools.SqlElasticPoolsCreatable elasticPools;
    private final Region region;

    ElasticPoolsImpl(ElasticPoolsInner innerCollection,
                     SqlServerManager manager,
                     DatabasesInner databasesInner,
                     DatabasesImpl databasesImpl,
                     String resourceGroupName,
                     String sqlServerName,
                     Region region) {
        this.resourceGroupName = resourceGroupName;
        this.sqlServerName = sqlServerName;
        this.region = region;
        this.elasticPools = new SqlElasticPoolsImpl(innerCollection, manager, databasesInner, databasesImpl);
    }

    protected SqlElasticPools elasticPools() {
        return this.elasticPools;
    }
    @Override
    public SqlElasticPool get(String firewallRuleName) {
        return this.elasticPools.getBySqlServer(this.resourceGroupName, this.sqlServerName, firewallRuleName);
    }

    @Override
    public SqlElasticPool.DefinitionStages.Blank define(String firewallRuleName) {
        return this.elasticPools.definedWithSqlServer(this.resourceGroupName, this.sqlServerName, firewallRuleName, this.region);
    }

    @Override
    public List<SqlElasticPool> list() {
        return this.elasticPools.listBySqlServer(this.resourceGroupName, this.sqlServerName);
    }

    @Override
    public void delete(String firewallRuleName) {
        this.elasticPools.deleteByParent(this.resourceGroupName, this.sqlServerName, firewallRuleName);
    }
}
