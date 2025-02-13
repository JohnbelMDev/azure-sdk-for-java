// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The data disk of the VMSS.
 */
@Fluent
public final class DataDisk {
    /*
     * The type of caching to be enabled for the data disks. The default value for caching is readwrite. For information
     * about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     */
    @JsonProperty(value = "caching")
    private CachingType caching;

    /*
     * The initial disk size in gigabytes.
     */
    @JsonProperty(value = "diskSizeGiB")
    private Integer diskSizeGiB;

    /*
     * The storage Account type to be used for the data disk. If omitted, the default is "standard_lrs".
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /*
     * The drive letter for the empty data disk. If not specified, it will be the first available letter.
     */
    @JsonProperty(value = "driveLetter")
    private String driveLetter;

    /**
     * Creates an instance of DataDisk class.
     */
    public DataDisk() {
    }

    /**
     * Get the caching property: The type of caching to be enabled for the data disks. The default value for caching is
     * readwrite. For information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * 
     * @return the caching value.
     */
    public CachingType caching() {
        return this.caching;
    }

    /**
     * Set the caching property: The type of caching to be enabled for the data disks. The default value for caching is
     * readwrite. For information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * 
     * @param caching the caching value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGiB property: The initial disk size in gigabytes.
     * 
     * @return the diskSizeGiB value.
     */
    public Integer diskSizeGiB() {
        return this.diskSizeGiB;
    }

    /**
     * Set the diskSizeGiB property: The initial disk size in gigabytes.
     * 
     * @param diskSizeGiB the diskSizeGiB value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGiB(Integer diskSizeGiB) {
        this.diskSizeGiB = diskSizeGiB;
        return this;
    }

    /**
     * Get the storageAccountType property: The storage Account type to be used for the data disk. If omitted, the
     * default is "standard_lrs".
     * 
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: The storage Account type to be used for the data disk. If omitted, the
     * default is "standard_lrs".
     * 
     * @param storageAccountType the storageAccountType value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the driveLetter property: The drive letter for the empty data disk. If not specified, it will be the first
     * available letter.
     * 
     * @return the driveLetter value.
     */
    public String driveLetter() {
        return this.driveLetter;
    }

    /**
     * Set the driveLetter property: The drive letter for the empty data disk. If not specified, it will be the first
     * available letter.
     * 
     * @param driveLetter the driveLetter value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDriveLetter(String driveLetter) {
        this.driveLetter = driveLetter;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
