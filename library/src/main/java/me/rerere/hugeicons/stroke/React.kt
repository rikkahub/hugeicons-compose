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

val HugeIcons.React: ImageVector
    get() {
        if (_react != null) {
            return _react!!
        }
        _react = ImageVector.Builder(
            name = "React",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.0001f, 8f)
            curveTo(17.5229f, 8f, 22.0001f, 9.79086f, 22.0001f, 12f)
            curveTo(22.0001f, 14.2091f, 17.5229f, 16f, 12.0001f, 16f)
            curveTo(6.47721f, 16f, 2.00006f, 14.2091f, 2.00006f, 12f)
            curveTo(2.00006f, 9.79086f, 6.47721f, 8f, 12.0001f, 8f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.5591f, 9.97529f)
            curveTo(18.3962f, 14.8173f, 19.1027f, 19.649f, 17.1371f, 20.7672f)
            curveTo(15.1715f, 21.8855f, 11.2781f, 18.8667f, 8.44104f, 14.0247f)
            curveTo(5.60395f, 9.18269f, 4.89746f, 4.35097f, 6.86306f, 3.23275f)
            curveTo(8.82865f, 2.11454f, 12.722f, 5.13327f, 15.5591f, 9.97529f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.5591f, 14.0247f)
            curveTo(12.722f, 18.8667f, 8.82865f, 21.8855f, 6.86306f, 20.7672f)
            curveTo(4.89746f, 19.649f, 5.60395f, 14.8173f, 8.44104f, 9.97529f)
            curveTo(11.2781f, 5.13327f, 15.1715f, 2.11454f, 17.1371f, 3.23275f)
            curveTo(19.1027f, 4.35097f, 18.3962f, 9.18269f, 15.5591f, 14.0247f)
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
            moveTo(12.2501f, 12f)
            horizontalLineTo(12.0001f)
            moveTo(12.5001f, 12f)
            curveTo(12.5001f, 12.2761f, 12.2762f, 12.5f, 12.0001f, 12.5f)
            curveTo(11.7239f, 12.5f, 11.5001f, 12.2761f, 11.5001f, 12f)
            curveTo(11.5001f, 11.7239f, 11.7239f, 11.5f, 12.0001f, 11.5f)
            curveTo(12.2762f, 11.5f, 12.5001f, 11.7239f, 12.5001f, 12f)
            close()
        }
        }.build()

        return _react!!
    }

private var _react: ImageVector? = null
