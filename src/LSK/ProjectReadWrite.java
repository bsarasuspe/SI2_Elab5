package LSK;

import java.util.Vector;

public class ProjectReadWrite implements ProjectInterface {

	public Vector<ProjectFile> files=new Vector<ProjectFile>();
	
	@Override
	public void addProject(ProjectFile p){
		files.add(p);
	}
	
	@Override
	public void loadAllFiles(){
		for (ProjectFile f:files)
			f.loadFile();
	}
	
	@Override
	public void storeAllFiles(){
		for (ProjectFile f:files)
			f.storeFile();
	}
}
