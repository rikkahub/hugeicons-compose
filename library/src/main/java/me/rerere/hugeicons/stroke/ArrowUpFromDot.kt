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

val HugeIcons.ArrowUpFromDot: ImageVector
    get() {
        if (_arrowUpFromDot != null) {
            return _arrowUpFromDot!!
        }
        _arrowUpFromDot = ImageVector.Builder(
            name = "ArrowUpFromDot",
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
            moveTo(12f, 3f)
            verticalLineTo(15f)
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
            moveTo(12f, 20.5f)
            verticalLineTo(20f)
            moveTo(13f, 20f)
            curveTo(13f, 19.4477f, 12.5523f, 19f, 12f, 19f)
            curveTo(11.4477f, 19f, 11f, 19.4477f, 11f, 20f)
            curveTo(11f, 20.5523f, 11.4477f, 21f, 12f, 21f)
            curveTo(12.5523f, 21f, 13f, 20.5523f, 13f, 20f)
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
            moveTo(7f, 7.99996f)
            curveTo(7f, 7.99996f, 10.6824f, 3.00001f, 12f, 3f)
            curveTo(13.3176f, 2.99999f, 17f, 8f, 17f, 8f)
        }
        }.build()

        return _arrowUpFromDot!!
    }

private var _arrowUpFromDot: ImageVector? = null
