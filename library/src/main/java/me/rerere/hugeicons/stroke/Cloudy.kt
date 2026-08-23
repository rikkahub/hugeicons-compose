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

val HugeIcons.Cloudy: ImageVector
    get() {
        if (_cloudy != null) {
            return _cloudy!!
        }
        _cloudy = ImageVector.Builder(
            name = "Cloudy",
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
            moveTo(14.3821f, 12.8f)
            curveTo(14.388f, 12.8f, 14.394f, 12.8f, 14.4f, 12.8f)
            curveTo(16.3882f, 12.8f, 18f, 14.4118f, 18f, 16.4f)
            curveTo(18f, 18.3882f, 16.3882f, 20f, 14.4f, 20f)
            horizontalLineTo(6f)
            curveTo(3.79086f, 20f, 2f, 18.2091f, 2f, 16f)
            curveTo(2f, 13.9203f, 3.58718f, 12.2113f, 5.61634f, 12.0182f)
            moveTo(13.8675f, 14.5f)
            curveTo(14.1469f, 13.9866f, 14.327f, 13.4113f, 14.3821f, 12.8f)
            curveTo(14.3939f, 12.6683f, 14.4f, 12.5349f, 14.4f, 12.4f)
            curveTo(14.4f, 9.96995f, 12.4301f, 8f, 10f, 8f)
            curveTo(7.69859f, 8f, 5.80986f, 9.7669f, 5.61634f, 12.0182f)
            moveTo(5.61634f, 12.0182f)
            curveTo(5.74261f, 12.0061f, 5.87059f, 12f, 6f, 12f)
            curveTo(6.72857f, 12f, 7.41165f, 12.1948f, 8f, 12.5351f)
        }

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
            moveTo(11f, 5.18207f)
            curveTo(11.786f, 4.44874f, 12.841f, 4f, 14.0008f, 4f)
            curveTo(16.4309f, 4f, 18.4008f, 5.96995f, 18.4008f, 8.4f)
            curveTo(18.4008f, 8.53485f, 18.3948f, 8.66829f, 18.3829f, 8.80004f)
            moveTo(21.0009f, 14.89f)
            curveTo(21.6203f, 14.2434f, 22.0008f, 13.3661f, 22.0008f, 12.4f)
            curveTo(22.0008f, 10.4118f, 20.3891f, 8.8f, 18.4008f, 8.8f)
            curveTo(18.3949f, 8.8f, 18.3889f, 8.80001f, 18.3829f, 8.80004f)
            moveTo(18.3829f, 8.80004f)
            curveTo(18.3451f, 9.21981f, 18.2483f, 9.62258f, 18.1009f, 10f)
        }
        }.build()

        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
