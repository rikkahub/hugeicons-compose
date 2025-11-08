package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FavouriteCircle: ImageVector
    get() {
        if (_favouriteCircle != null) {
            return _favouriteCircle!!
        }
        _favouriteCircle = ImageVector.Builder(
            name = "FavouriteCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        curveTo(12f, 17f, 7f, 13.8235f, 7f, 10.75f)
        curveTo(7f, 9.23122f, 8.05263f, 8f, 9.5f, 8f)
        curveTo(10.25f, 8f, 11f, 8.26471f, 12f, 9.32353f)
        curveTo(13f, 8.26471f, 13.75f, 8f, 14.5f, 8f)
        curveTo(15.9474f, 8f, 17f, 9.23122f, 17f, 10.75f)
        curveTo(17f, 13.8235f, 12f, 17f, 12f, 17f)
        }
        }.build()

        return _favouriteCircle!!
    }

private var _favouriteCircle: ImageVector? = null
