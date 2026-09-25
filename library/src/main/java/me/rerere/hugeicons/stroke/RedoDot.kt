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

val HugeIcons.RedoDot: ImageVector
    get() {
        if (_redoDot != null) {
            return _redoDot!!
        }
        _redoDot = ImageVector.Builder(
            name = "RedoDot",
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
            moveTo(12f, 12f)
            verticalLineTo(11.2f)
            moveTo(13f, 12f)
            curveTo(13f, 11.4477f, 12.5523f, 11f, 12f, 11f)
            curveTo(11.4477f, 11f, 11f, 11.4477f, 11f, 12f)
            curveTo(11f, 12.5523f, 11.4477f, 13f, 12f, 13f)
            curveTo(12.5523f, 13f, 13f, 12.5523f, 13f, 12f)
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
            moveTo(12f, 21f)
            curveTo(7.02944f, 21f, 3f, 16.9706f, 3f, 12f)
            curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
            curveTo(16f, 3f, 18f, 4.5f, 20.5f, 7.5f)
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
            moveTo(16f, 7.72343f)
            curveTo(16f, 7.72343f, 20.101f, 8.34574f, 20.7234f, 7.72339f)
            curveTo(21.3458f, 7.10104f, 20.7234f, 3f, 20.7234f, 3f)
        }
        }.build()

        return _redoDot!!
    }

private var _redoDot: ImageVector? = null
