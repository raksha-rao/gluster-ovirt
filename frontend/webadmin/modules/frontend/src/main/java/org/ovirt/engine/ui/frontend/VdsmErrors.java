package org.ovirt.engine.ui.frontend;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface VdsmErrors extends ConstantsWithLookup {
    String BlockDeviceActionError();

    String BlockStorageDomainMasterFSCKError();

    String BlockStorageDomainMasterMountError();

    String CannotAccessLogicalVolume();

    String CannotCreateLogicalVolume();

    String CannotDeactivateLogicalVolume();

    String CannotRemoveLogicalVolume();

    String ExportError();

    String GeneralException();

    String HostIdMismatch();

    String ImageDeleteError();

    String ImageDoesNotExistInDomainError();

    String ImageIsNotEmpty();

    String ImageMissingFromVm();

    String ImagePathError();

    String ImagesActionError();

    String ImageValidationError();

    String ImportError();

    String ImportInfoError();

    String ImportUnknownType();

    String IncorrectFormat();

    String InvalidParameterException();

    String InvalidTask();

    String LogicalVolumeExtendError();

    String MergeSnapshotsError();

    String MetaDataKeyError();

    String MetaDataKeyNotFoundError();

    String MetaDataSealIsBroken();

    String MetaDataValidationError();

    String MoveImageError();

    String NotImplementedException();

    String PhysDevInitializationError();

    String ReconstructMasterError();

    String ResourceException();

    String AcquireLockFailure();

    String SpmFenceError();

    String SpmParamsMismatch();

    String SpmStartError();

    String SpmStatusError();

    String SpmStopError();

    String StorageDomainActionError();

    String StorageDomainActivateError();

    String StorageDomainAlreadyExists();

    String StorageDomainAttachError();

    String StorageDomainCreationError();

    String StorageDomainDeactivateError();

    String StorageDomainDetachError();

    String StorageDomainDoesNotExist();

    String StorageDomainFormatError();

    String StorageDomainNotEmpty();

    String StorageDomainFSNotMounted();

    String StorageDomainLayoutError();

    String StorageDomainMasterCopyError();

    String StorageDomainMasterError();

    String StorageDomainMasterUnmountError();

    String StorageDomainMetadataCreationError();

    String StorageDomainMetadataFileMissing();

    String StorageDomainMetadataNotFound();

    String StorageDomainNotActive();

    String StorageDomainNotInPool();

    String StorageException();

    String StoragePoolActionError();

    String StoragePoolConnectionError();

    String StoragePoolCreationError();

    String StoragePoolDestroyingError();

    String StoragePoolDisconnectionError();

    String StoragePoolHasPotentialMaster();

    String StoragePoolInternalError();

    String StoragePoolMasterNotFound();

    String StoragePoolNotConnected();

    String StoragePoolTooManyMasters();

    String StoragePoolWrongMaster();

    String StoragePoolUnknown();

    String StorageServerActionError();

    String StorageServerConnectionError();

    String StorageServerDisconnectionError();

    String StorageServeriSCSIError();

    String StorageServerValidationError();

    String StorageUpdateVmError();

    String TaskClearError();

    String TemplateCreationError();

    String UnknownTask();

    String VolumeAccessError();

    String VolumeAlreadyExists();

    String VolumeCreationError();

    String VolumeDoesNotExist();

    String VolumeExtendingError();

    String VolumeGeneralException();

    String UnicodeArgumentException();

    String VolumeGroupActionError();

    String VolumeGroupAlreadyExistsError();

    String VolumeGroupCreateError();

    String VolumeGroupDoesNotExist();

    String VolumeGroupExtendError();

    String VolumeGroupPermissionsError();

    String VolumeGroupSizeError();

    String OrphanVolumeError();

    String VolumeImageHasChildren();

    String VolumeIsBusy();

    String VolumeMetadataReadError();

    String VolumeMetadataWriteError();

    String VolumeUnlinkError();

    String copyerr();

    String createErr();

    String down();

    String exist();

    String imageErr();

    String migrateErr();

    String MissParam();

    String nfsErr();

    String noConPeer();

    String nonresp();

    String noVM();

    String noVmType();

    String outOfMem();

    String recovery();

    String sparse();

    String ticketErr();

    String unexpected();

    String unsupFormat();

    String AddiSCSINodeError();

    String AddiSCSIPortalError();

    String AddTaskError();

    String CannotActivateLogicalVolume();

    String CannotCloneVolume();

    String CannotShareVolume();

    String CopyImageError();

    String DestImageActionError();

    String GetAllLogicalVolumeTagsError();

    String GetFloppyListError();

    String GetiSCSISessionListError();

    String GetIsoListError();

    String GetLogicalVolumeDevError();

    String GetLogicalVolumesByTagError();

    String GetLogicalVolumeTagError();

    String GetStorageDomainListError();

    String GetVolumeGroupListError();

    String ImageIsEmpty();

    String InternalVolumeNonWritable();

    String InvalidTaskType();

    String iSCSILoginError();

    String ISCSI_LOGIN_AUTH_ERROR();

    String iSCSISetupError();

    String IsoCannotBeMasterDomain();

    String IsSpm();

    String LogicalVolumeAddTagError();

    String LogicalVolumePermissionsError();

    String LogicalVolumeRefreshError();

    String LogicalVolumeRemoveTagError();

    String LogicalVolumeScanError();

    String LogicalVolumesListError();

    String MetaDataMappingError();

    String MiscBlockReadException();

    String MiscBlockWriteException();

    String MiscFileReadException();

    String MiscFileWriteException();

    String MultipathRestartError();

    String OperationInProgress();

    String RemoveiSCSINodeError();

    String RemoveiSCSIPortalError();

    String SetiSCSIAuthError();

    String SetiSCSIPasswdError();

    String SetiSCSIUsernameError();

    String SharedVolumeNonWritable();

    String SourceImageActionError();

    String StorageDomainTypeError();

    String StoragePoolAlreadyExists();

    String TaskInProgress();

    String TaskNotFinished();

    String VolumeCannotGetParent();

    String VolumeGroupAddTagError();

    String VolumeGroupHasDomainTag();

    String VolumeGroupReadTagError();

    String VolumeGroupRemoveTagError();

    String VolumeGroupScanError();

    String VolumeGroupUninitialized();

    String VolumeNonShareable();

    String VolumeNonWritable();

    String VolumeOwnershipError();

    String VolumesZeroingError();

    String StorageDomainNotMemberOfPool();

    String StorageDomainAccessError();

    String ERR_BAD_PARAMS();

    String ERR_BAD_ADDR();

    String ERR_BAD_NIC();

    String ERR_USED_NIC();

    String ERR_BAD_BONDING();

    String ERR_BAD_VLAN();

    String ERR_BAD_BRIDGE();

    String ERR_USED_BRIDGE();

    String ENGINE();

    String IRS_IMAGE_STATUS_ILLEGAL();

    String VDS_SHUTDOWN_ERROR();

    String IRS_REPOSITORY_NOT_FOUND();

    String MAC_POOL_INITIALIZATION_FAILED();

    String VDS_FENCING_OPERATION_FAILED();

    String VDS_NETWORK_ERROR();

    String DeviceNotFound();

    String CannotModifyVolumeTime();

    String CannotDeleteVolume();

    String CannotDeleteSharedVolume();

    String NonLeafVolumeNotWritable();

    String VolumeCopyError();

    String ImageIsNotLegalChain();

    String CouldNotValideTemplateOnTargetDomain();

    String StoragePoolCheckError();

    String BackupCannotBeMasterDomain();

    String MissingOvfFileFromVM();

    String ImageNotOnTargetDomain();

    String VMPathNotExists();

    String CannotConnectMultiplePools();

    String StorageDomainStatusError();

    String StorageDomainCheckError();

    String StorageDomainTypeNotBackup();

    String LogicalVolumeRenameError();

    String CannotWriteAccessLogialVolume();

    String CannotSetRWLogicalVolume();

    String LVMSetupError();

    String CouldNotRetrievePhysicalVolumeList();

    String LogicalVolumeAlreadyExists();

    String StorageDomainAlreadyAttached();

    String MultipathSetupError();

    String LogicalVolumesScanError();

    String CannotActivateLogicalVolumes();

    String GetLogicalVolumeDataError();

    String CouldNotRetrieveLogicalVolumesList();

    String MetaDataParamError();

    String MiscBlockWriteIncomplete();

    String NO_FREE_VM_IN_POOL();

    String CannotDetachMasterStorageDomain();

    String createIllegalVolumeSnapshotError();

    String createVolumeRollbackError();

    String createVolumeSizeError();

    String DomainAlreadyLocked();

    String DomainLockDoesNotExist();

    String CannotRetrieveSpmStatus();

    String FileStorageDomainStaleNFSHandle();

    String InvalidJob();

    String InvalidPhysDev();

    String PartitionedPhysDev();

    String InvalidRecovery();

    String InvalidTaskMng();

    String MoveTemplateImageError();

    String MultipleMoveImageError();

    String OverwriteImageError();

    String prepareIllegalVolumeError();

    String StorageDomainActive();

    String StorageDomainClassError();

    String StorageDomainInsufficientPermissions();

    String StorageDomainStateTransitionIllegal();

    String StoragePoolConnected();

    String StoragePoolHigherVersionMasterFound();

    String StorageTypeError();

    String StorageServerAccessPermissionError();

    String MountTypeError();

    String MountParsingError();

    String InvalidIpAddress();

    String iSCSIifaceError();

    String iSCSILogoutError();

    String iSCSIDiscoveryError();

    String TaskAborted();

    String TaskDirError();

    String TaskHasRefs();

    String ActionStopped();

    String TaskMetaDataLoadError();

    String TaskMetaDataSaveError();

    String TaskPersistError();

    String TaskStateError();

    String TaskStateTransitionError();

    String UnmanagedTask();

    String VolumeGroupRemoveError();

    String VolumeGroupRenameError();

    String InvalidDefaultExceptionException();

    String MiscDirCleanupFailure();

    String ResourceNamespaceNotEmpty();

    String ResourceTimeout();

    String StoragePoolDescriptionTooLongError();

    String TooManyDomainsInStoragePoolError();

    String StorageDomainDescriptionTooLongError();

    String StorageDomainIsMadeFromTooManyPVs();

    String TooManyPVsInVG();

    String MetadataOverflowError();

    String MergeVolumeRollbackError();

    String ResourceReferenceInvalid();

    String ResourceAcqusitionFailed();

    String ENGINE_ERROR_CREATING_STORAGE_POOL();

    String unavail();

    String FAILED_CHANGE_CD_IS_MOUNTED();

    String destroyErr();

    String fenceAgent();

    String StorageDomainIllegalRemotePath();

    String CannotFormatAttachedStorageDomain();

    String CannotFormatStorageDomainInConnectedPool();

    String UnsupportedDomainVersion();

    String CurrentVersionTooAdvancedError();

    String PoolUpgradeInProgress();

    String NoSpaceLeftOnDomain();

    String MixedSDVersionError();

    String VolumeGroupReplaceTagError();

    String LogicalVolumeReplaceTagError();

    String MkfsError();

    String MissingTagOnLogicalVolume();

    String LogicalVolumeDoesNotExistError();

    String LogicalVolumeCachingError();

    String LogicalVolumeWrongTagError();

    String MetaDataGeneralError();

    String ResourceDoesNotExist();

    String InvalidResourceName();

    String CANT_RECONSTRUCT_WHEN_A_DOMAIN_IN_POOL_IS_LOCKED();

    String NO_IMPLEMENTATION();

    String VOLUME_WAS_NOT_PREPARED_BEFORE_TEARDOWN();

    String IMAGES_NOT_SUPPORTED_ERROR();

    String GET_FILE_LIST_ERROR();

    String STORAGE_DOMAIN_REFRESH_ERROR();

    String VOLUME_GROUP_BLOCK_SIZE_ERROR();

    String DEVICE_BLOCK_SIZE_NOT_SUPPORTED();

    String HOST_ALREADY_EXISTS();

    String MIGRATION_DEST_INVALID_HOSTNAME();

    String MIGRATION_CANCEL_ERROR();

    String DB();

    String DB_NO_SUCH_VM();

    String MAC_POOL_NO_MACS_LEFT();

    String MAC_POOL_NOT_INITIALIZED();

    String RESOURCE_MANAGER_CANT_ALLOC_VDS_MIGRATION();

    String RESOURCE_MANAGER_MIGRATION_FAILED_AT_DST();

    String RESOURCE_MANAGER_VDS_NOT_FOUND();

    String RESOURCE_MANAGER_VM_SNAPSHOT_MISSMATCH();

    String VM_TEMPLATE_CANT_LOCATE_DISKS_IN_DB();

    String VM_WITH_SAME_NAME_EXIST();
}
