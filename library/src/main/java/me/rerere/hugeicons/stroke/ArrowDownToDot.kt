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

val HugeIcons.ArrowDownToDot: ImageVector
    get() {
        if (_arrowDownToDot != null) {
            return _arrowDownToDot!!
        }
        _arrowDownToDot = ImageVector.Builder(
            name = "ArrowDownToDot",
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
            moveTo(17f, 10f)
            curveTo(17f, 10f, 13.3176f, 15f, 12f, 15f)
            curveTo(10.6824f, 15f, 7f, 10f, 7f, 10f)
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
            moveTo(12f, 15f)
            lineTo(12f, 3f)
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
            moveTo(12f, 19.5f)
            verticalLineTo(20f)
            moveTo(13f, 20f)
            curveTo(13f, 20.5523f, 12.5523f, 21f, 12f, 21f)
            curveTo(11.4477f, 21f, 11f, 20.5523f, 11f, 20f)
            curveTo(11f, 19.4477f, 11.4477f, 19f, 12f, 19f)
            curveTo(12.5523f, 19f, 13f, 19.4477f, 13f, 20f)
            close()
        }
        }.build()

        return _arrowDownToDot!!
    }

private var _arrowDownToDot: ImageVector? = null
