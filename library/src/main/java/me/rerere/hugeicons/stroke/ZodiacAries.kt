package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZodiacAries: ImageVector
    get() {
        if (_zodiacAries != null) {
            return _zodiacAries!!
        }
        _zodiacAries = ImageVector.Builder(
            name = "ZodiacAries",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9999f, 20f)
            verticalLineTo(18.3309f)
            moveTo(11.9999f, 18.3309f)
            curveTo(11.9999f, 13.8055f, 10.8323f, 9.34991f, 8.6101f, 5.38638f)
            curveTo(7.72498f, 3.80769f, 5.53616f, 3.52069f, 4.26307f, 4.81821f)
            curveTo(3.47195f, 5.6245f, 3.27535f, 6.82962f, 3.77032f, 7.83856f)
            lineTo(4.24004f, 8.79602f)
            moveTo(11.9999f, 18.3309f)
            curveTo(11.9999f, 13.8055f, 13.1677f, 9.34991f, 15.3899f, 5.38638f)
            curveTo(16.275f, 3.80769f, 18.4638f, 3.52069f, 19.7369f, 4.81821f)
            curveTo(20.528f, 5.6245f, 20.7247f, 6.82962f, 20.2297f, 7.83856f)
            lineTo(19.76f, 8.79602f)
        }
        }.build()

        return _zodiacAries!!
    }

private var _zodiacAries: ImageVector? = null
