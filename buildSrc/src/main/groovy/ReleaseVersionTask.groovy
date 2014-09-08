import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

//custom task
class ReleaseVersionTask extends DefaultTask {
    @Input Boolean release        //inputs. pemet a gradle  de n executer ce code qu en cas de necessite
    @OutputFile File destFile                            // pareil pour output code:


    ReleaseVersionTask()
    {
        group = 'versionning'
        description = 'here is my desription'
    }

    @TaskAction
    void start()
    {
        project.version.release = true
        ant.propertyfile( file : destFile){
            entry(key: 'release', type: 'string', operation: '=', value: 'true')
        }
    }

}