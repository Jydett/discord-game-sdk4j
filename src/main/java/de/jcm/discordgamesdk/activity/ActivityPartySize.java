package de.jcm.discordgamesdk.activity;

/**
 * @see <a href="https://discordapp.com/developers/docs/game-sdk/activities#data-models-partysize-struct">
 *     https://discordapp.com/developers/docs/game-sdk/activities#data-models-partysize-struct</a>
 */
public class ActivityPartySize
{
	private long pointer;

	ActivityPartySize(long pointer)
	{
		this.pointer = pointer;
	}

	public void setCurrentSize(int size)
	{
		setCurrentSize(pointer, size);
	}
	public int getCurrentSize()
	{
		return getCurrentSize(pointer);
	}

	public void setMaxSize(int size)
	{
		setMaxSize(pointer, size);
	}
	public int getMaxSize()
	{
		return getMaxSize(pointer);
	}

	private native void setCurrentSize(long pointer, int size);
	private native int getCurrentSize(long pointer);
	private native void setMaxSize(long pointer, int size);
	private native int getMaxSize(long pointer);
}
