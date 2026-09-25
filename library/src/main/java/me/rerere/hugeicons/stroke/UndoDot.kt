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

val HugeIcons.UndoDot: ImageVector
    get() {
        if (_undoDot != null) {
            return _undoDot!!
        }
        _undoDot = ImageVector.Builder(
            name = "UndoDot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(11.9991f, 21f)
            curveTo(16.9696f, 21f, 20.9991f, 16.9706f, 20.9991f, 12f)
            curveTo(20.9991f, 7.02944f, 16.9696f, 3f, 11.9991f, 3f)
            curveTo(8.66782f, 3f, 5.75927f, 4.80989f, 4.20312f, 7.5f)
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
            moveTo(3f, 3f)
            verticalLineTo(4.27816f)
            curveTo(3f, 6.47004f, 3f, 7.56599f, 3.70725f, 8.16512f)
            curveTo(4.4145f, 8.76425f, 5.49553f, 8.58408f, 7.6576f, 8.22373f)
            lineTo(9f, 8f)
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
            moveTo(12f, 12f)
            verticalLineTo(11.2f)
            moveTo(13f, 12f)
            curveTo(13f, 11.4477f, 12.5523f, 11f, 12f, 11f)
            curveTo(11.4477f, 11f, 11f, 11.4477f, 11f, 12f)
            curveTo(11f, 12.5523f, 11.4477f, 13f, 12f, 13f)
            curveTo(12.5523f, 13f, 13f, 12.5523f, 13f, 12f)
            close()
        }
        }.build()

        return _undoDot!!
    }

private var _undoDot: ImageVector? = null
