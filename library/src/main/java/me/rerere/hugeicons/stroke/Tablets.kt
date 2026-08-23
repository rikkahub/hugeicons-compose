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

val HugeIcons.Tablets: ImageVector
    get() {
        if (_tablets != null) {
            return _tablets!!
        }
        _tablets = ImageVector.Builder(
            name = "Tablets",
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
            moveTo(12.5f, 16.5f)
            horizontalLineTo(20.5f)
            moveTo(21f, 16.5f)
            curveTo(21f, 18.9853f, 18.9853f, 21f, 16.5f, 21f)
            curveTo(14.0147f, 21f, 12f, 18.9853f, 12f, 16.5f)
            curveTo(12f, 14.0147f, 14.0147f, 12f, 16.5f, 12f)
            curveTo(18.9853f, 12f, 21f, 14.0147f, 21f, 16.5f)
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
            moveTo(4.5f, 4.5f)
            lineTo(10.5f, 10.5f)
            moveTo(12f, 7.5f)
            curveTo(12f, 9.98528f, 9.98528f, 12f, 7.5f, 12f)
            curveTo(5.01472f, 12f, 3f, 9.98528f, 3f, 7.5f)
            curveTo(3f, 5.01472f, 5.01472f, 3f, 7.5f, 3f)
            curveTo(9.98528f, 3f, 12f, 5.01472f, 12f, 7.5f)
            close()
        }
        }.build()

        return _tablets!!
    }

private var _tablets: ImageVector? = null
