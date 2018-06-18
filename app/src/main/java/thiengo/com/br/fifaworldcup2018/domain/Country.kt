package thiengo.com.br.fifaworldcup2018.domain

import android.os.Parcel
import android.os.Parcelable

class Country(
        var name: String,
        val flagResource: Int) : Parcelable {

    constructor(source: Parcel) : this(
            source.readString(),
            source.readInt()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(name)
        writeInt(flagResource)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Country> = object : Parcelable.Creator<Country> {
            override fun createFromParcel(source: Parcel): Country = Country(source)
            override fun newArray(size: Int): Array<Country?> = arrayOfNulls(size)
        }
    }
}