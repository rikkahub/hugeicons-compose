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

val HugeIcons.DiscoverSquare: ImageVector
    get() {
        if (_discoverSquare != null) {
            return _discoverSquare!!
        }
        _discoverSquare = ImageVector.Builder(
            name = "DiscoverSquare",
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
            moveTo(12.4014f, 8.29796f)
            lineTo(15.3213f, 7.32465f)
            curveTo(16.2075f, 7.02924f, 16.6507f, 6.88153f, 16.8846f, 7.11544f)
            curveTo(17.1185f, 7.34935f, 16.9708f, 7.79247f, 16.6753f, 8.67871f)
            lineTo(15.702f, 11.5986f)
            curveTo(15.1986f, 13.1088f, 14.9469f, 13.8639f, 14.4054f, 14.4054f)
            curveTo(13.8639f, 14.9469f, 13.1088f, 15.1986f, 11.5986f, 15.702f)
            lineTo(8.67871f, 16.6753f)
            curveTo(7.79247f, 16.9708f, 7.34935f, 17.1185f, 7.11544f, 16.8846f)
            curveTo(6.88153f, 16.6507f, 7.02924f, 16.2075f, 7.32465f, 15.3213f)
            lineTo(8.29796f, 12.4014f)
            curveTo(8.80136f, 10.8912f, 9.05306f, 10.1361f, 9.59457f, 9.59457f)
            curveTo(10.1361f, 9.05306f, 10.8912f, 8.80136f, 12.4014f, 8.29796f)
            close()
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
            moveTo(12.125f, 12f)
            horizontalLineTo(12f)
            moveTo(12.25f, 12f)
            curveTo(12.25f, 12.1381f, 12.1381f, 12.25f, 12f, 12.25f)
            curveTo(11.8619f, 12.25f, 11.75f, 12.1381f, 11.75f, 12f)
            curveTo(11.75f, 11.8619f, 11.8619f, 11.75f, 12f, 11.75f)
            curveTo(12.1381f, 11.75f, 12.25f, 11.8619f, 12.25f, 12f)
            close()
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
            moveTo(3f, 12f)
            curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
            curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
            curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
            curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
            curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
            curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
            curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
            curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
            close()
        }
        }.build()

        return _discoverSquare!!
    }

private var _discoverSquare: ImageVector? = null
