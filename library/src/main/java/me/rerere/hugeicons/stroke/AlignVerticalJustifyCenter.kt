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

val HugeIcons.AlignVerticalJustifyCenter: ImageVector
    get() {
        if (_alignVerticalJustifyCenter != null) {
            return _alignVerticalJustifyCenter!!
        }
        _alignVerticalJustifyCenter = ImageVector.Builder(
            name = "AlignVerticalJustifyCenter",
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
            moveTo(21f, 12f)
            lineTo(3f, 12f)
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
            moveTo(8.00232f, 5.5f)
            curveTo(8.00232f, 4.65611f, 7.91895f, 3.68211f, 8.75232f, 3.20096f)
            curveTo(9.10039f, 3f, 9.5677f, 3f, 10.5023f, 3f)
            horizontalLineTo(13.5023f)
            curveTo(14.4369f, 3f, 14.9042f, 3f, 15.2523f, 3.20096f)
            curveTo(16.0857f, 3.68211f, 16.0023f, 4.65611f, 16.0023f, 5.5f)
            curveTo(16.0023f, 6.34389f, 16.0857f, 7.31789f, 15.2523f, 7.79904f)
            curveTo(14.9042f, 8f, 14.4369f, 8f, 13.5023f, 8f)
            horizontalLineTo(10.5023f)
            curveTo(9.5677f, 8f, 9.10039f, 8f, 8.75232f, 7.79904f)
            curveTo(7.91895f, 7.31789f, 8.00232f, 6.34389f, 8.00232f, 5.5f)
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
            moveTo(6.00232f, 18.5f)
            curveTo(6.00232f, 17.6561f, 5.91895f, 16.6821f, 6.75232f, 16.201f)
            curveTo(7.10039f, 16f, 7.5677f, 16f, 8.50232f, 16f)
            lineTo(15.5023f, 16f)
            curveTo(16.4369f, 16f, 16.9042f, 16f, 17.2523f, 16.201f)
            curveTo(18.0857f, 16.6821f, 18.0023f, 17.6561f, 18.0023f, 18.5f)
            curveTo(18.0023f, 19.3439f, 18.0857f, 20.3179f, 17.2523f, 20.799f)
            curveTo(16.9042f, 21f, 16.4369f, 21f, 15.5023f, 21f)
            horizontalLineTo(8.50232f)
            curveTo(7.5677f, 21f, 7.10039f, 21f, 6.75232f, 20.799f)
            curveTo(5.91895f, 20.3179f, 6.00232f, 19.3439f, 6.00232f, 18.5f)
            close()
        }
        }.build()

        return _alignVerticalJustifyCenter!!
    }

private var _alignVerticalJustifyCenter: ImageVector? = null
