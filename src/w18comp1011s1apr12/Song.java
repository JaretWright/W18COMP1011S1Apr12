package w18comp1011s1apr12;

/**
 *
 * @author JWright
 */
public class Song
{
    private String atrist, songName;
    private int lengthInSec;

    public Song(String songName, String atrist, int lengthInSec)
    {
        setAtrist(atrist);
        setSongName(songName);
        setLengthInSec(lengthInSec);
    }

    public String getAtrist()
    {
        return atrist;
    }

    public void setAtrist(String atrist)
    {
        this.atrist = atrist;
    }

    public String getSongName()
    {
        return songName;
    }

    public void setSongName(String songName)
    {
        this.songName = songName;
    }

    public int getLengthInSec()
    {
        return lengthInSec;
    }

    public void setLengthInSec(int lengthInSec)
    {
        this.lengthInSec = lengthInSec;
    }
    
    public String toString()
    {
        return String.format("Title: %s Length: %d sec. ", this.songName,
                                                          this.lengthInSec);
    }
}
