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

val HugeIcons.BookKey: ImageVector
    get() {
        if (_bookKey != null) {
            return _bookKey!!
        }
        _bookKey = ImageVector.Builder(
            name = "BookKey",
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
            moveTo(20f, 22f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(9f)
            moveTo(4f, 20f)
            verticalLineTo(8f)
            curveTo(4f, 5.17157f, 4f, 3.75736f, 4.87868f, 2.87868f)
            curveTo(5.75736f, 2f, 7.17157f, 2f, 10f, 2f)
            horizontalLineTo(14f)
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
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
            moveTo(15.5f, 6.5f)
            lineTo(20f, 2f)
            moveTo(19f, 3.5f)
            lineTo(20f, 4.5f)
            moveTo(16f, 8f)
            curveTo(16f, 9.10457f, 15.1046f, 10f, 14f, 10f)
            curveTo(12.8954f, 10f, 12f, 9.10457f, 12f, 8f)
            curveTo(12f, 6.89543f, 12.8954f, 6f, 14f, 6f)
            curveTo(15.1046f, 6f, 16f, 6.89543f, 16f, 8f)
            close()
        }
        }.build()

        return _bookKey!!
    }

private var _bookKey: ImageVector? = null
