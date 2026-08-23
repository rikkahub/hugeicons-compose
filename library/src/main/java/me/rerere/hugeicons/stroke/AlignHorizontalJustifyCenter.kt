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

val HugeIcons.AlignHorizontalJustifyCenter: ImageVector
    get() {
        if (_alignHorizontalJustifyCenter != null) {
            return _alignHorizontalJustifyCenter!!
        }
        _alignHorizontalJustifyCenter = ImageVector.Builder(
            name = "AlignHorizontalJustifyCenter",
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
            moveTo(12f, 21f)
            verticalLineTo(3f)
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
            moveTo(18.5f, 8.00232f)
            curveTo(19.3439f, 8.00232f, 20.3179f, 7.91895f, 20.799f, 8.75232f)
            curveTo(21f, 9.10039f, 21f, 9.5677f, 21f, 10.5023f)
            lineTo(21f, 13.5023f)
            curveTo(21f, 14.4369f, 21f, 14.9042f, 20.799f, 15.2523f)
            curveTo(20.3179f, 16.0857f, 19.3439f, 16.0023f, 18.5f, 16.0023f)
            curveTo(17.6561f, 16.0023f, 16.6821f, 16.0857f, 16.201f, 15.2523f)
            curveTo(16f, 14.9042f, 16f, 14.4369f, 16f, 13.5023f)
            lineTo(16f, 10.5023f)
            curveTo(16f, 9.5677f, 16f, 9.10039f, 16.201f, 8.75232f)
            curveTo(16.6821f, 7.91895f, 17.6561f, 8.00232f, 18.5f, 8.00232f)
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
            moveTo(5.5f, 6.00232f)
            curveTo(6.34389f, 6.00232f, 7.31789f, 5.91895f, 7.79904f, 6.75232f)
            curveTo(8f, 7.10039f, 8f, 7.5677f, 8f, 8.50232f)
            lineTo(8f, 15.5023f)
            curveTo(8f, 16.4369f, 8f, 16.9042f, 7.79904f, 17.2523f)
            curveTo(7.31789f, 18.0857f, 6.34389f, 18.0023f, 5.5f, 18.0023f)
            curveTo(4.65611f, 18.0023f, 3.68211f, 18.0857f, 3.20096f, 17.2523f)
            curveTo(3f, 16.9042f, 3f, 16.4369f, 3f, 15.5023f)
            lineTo(3f, 8.50232f)
            curveTo(3f, 7.5677f, 3f, 7.10039f, 3.20096f, 6.75232f)
            curveTo(3.68211f, 5.91895f, 4.65611f, 6.00232f, 5.5f, 6.00232f)
            close()
        }
        }.build()

        return _alignHorizontalJustifyCenter!!
    }

private var _alignHorizontalJustifyCenter: ImageVector? = null
