public void deleteFile (){
  File someFile = new File( ”someFileName.txt” ) ;
  // Do something with someFileName
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
}
