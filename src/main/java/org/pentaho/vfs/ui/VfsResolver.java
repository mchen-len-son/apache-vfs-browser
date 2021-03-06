/*
* Copyright 2002 - 2016 Pentaho Corporation.  All rights reserved.
*
* This software was developed by Pentaho Corporation and is provided under the terms
* of the Mozilla Public License, Version 1.1, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to http://www.mozilla.org/MPL/MPL-1.1.txt. TThe Initial Developer is Pentaho Corporation.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package org.pentaho.vfs.ui;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;

/**
 * @author Andrey Khayrutdinov
 */
public interface VfsResolver {

  FileObject resolveFile( String vfsUrl ) throws FileSystemException;

  FileObject resolveFile( String vfsUrl, FileSystemOptions fsOptions ) throws FileSystemException;
}
