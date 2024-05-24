package jorgeandaurrios.myapplication.model

import jorgeandaurrios.myapplication.R

object ImageRepository {
    fun getImageList(): List<ImageItem> {
        return listOf(
            ImageItem(R.drawable.grp2),
            ImageItem(R.drawable.grp1),
            ImageItem(R.drawable.grp3),
            ImageItem(R.drawable.grp4),
            ImageItem(R.drawable.grp5),
            ImageItem(R.drawable.grp2),
            ImageItem(R.drawable.grp1),
            ImageItem(R.drawable.grp3),
            ImageItem(R.drawable.grp4),
            ImageItem(R.drawable.grp5)
        )
    }
}