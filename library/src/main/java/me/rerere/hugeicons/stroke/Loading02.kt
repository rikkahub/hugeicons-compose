package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Loading02: ImageVector
    get() {
        if (_loading02 != null) {
            return _loading02!!
        }
        _loading02 = ImageVector.Builder(
            name = "Loading02",
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
        moveTo(18.001f, 20f)
        curveTo(16.3295f, 21.2558f, 14.2516f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 12.8634f, 21.8906f, 13.7011f, 21.6849f, 14.5003f)
        curveTo(21.4617f, 15.3673f, 20.5145f, 15.77f, 19.6699f, 15.4728f)
        curveTo(18.9519f, 15.2201f, 18.6221f, 14.3997f, 18.802f, 13.66f)
        curveTo(18.9314f, 13.1279f, 19f, 12.572f, 19f, 12f)
        curveTo(19f, 8.13401f, 15.866f, 5f, 12f, 5f)
        curveTo(8.13401f, 5f, 5f, 8.13401f, 5f, 12f)
        curveTo(5f, 15.866f, 8.13401f, 19f, 12f, 19f)
        curveTo(13.3197f, 19f, 14.554f, 18.6348f, 15.6076f, 18f)
        }
        }.build()

        return _loading02!!
    }

private var _loading02: ImageVector? = null
