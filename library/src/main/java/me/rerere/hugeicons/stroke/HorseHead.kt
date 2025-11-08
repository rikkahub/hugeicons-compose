package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = ImageVector.Builder(
            name = "HorseHead",
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
        moveTo(14.0002f, 21f)
        curveTo(9.5f, 16f, 12.5f, 13f, 12.5f, 13f)
        curveTo(13.4238f, 15.4634f, 16.5f, 15f, 16.5f, 15f)
        lineTo(18.2742f, 16.3595f)
        curveTo(18.6707f, 16.6133f, 19.182f, 16.5153f, 19.4708f, 16.1301f)
        lineTo(20.7978f, 14.5278f)
        curveTo(21.0918f, 14.1358f, 21.0625f, 13.5705f, 20.7296f, 13.2155f)
        lineTo(19.4484f, 11.8489f)
        curveTo(18.8595f, 11.2207f, 18.4693f, 10.4119f, 18.3324f, 9.53566f)
        curveTo(18.1705f, 8.49976f, 17.5002f, 7.5f, 16.887f, 6.90803f)
        lineTo(16.0002f, 6f)
        lineTo(17.0002f, 3f)
        curveTo(17.0002f, 3f, 14.424f, 3.02925f, 13.5002f, 5f)
        curveTo(7.5f, 5.5f, 3f, 9.53566f, 3f, 21f)
        }
        }.build()

        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
