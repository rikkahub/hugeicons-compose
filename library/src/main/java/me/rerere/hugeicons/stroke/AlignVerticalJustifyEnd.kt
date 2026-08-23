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

val HugeIcons.AlignVerticalJustifyEnd: ImageVector
    get() {
        if (_alignVerticalJustifyEnd != null) {
            return _alignVerticalJustifyEnd!!
        }
        _alignVerticalJustifyEnd = ImageVector.Builder(
            name = "AlignVerticalJustifyEnd",
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
            moveTo(21f, 21f)
            lineTo(3f, 21f)
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
            moveTo(6.00232f, 14.5f)
            curveTo(6.00232f, 13.6561f, 5.91895f, 12.6821f, 6.75232f, 12.201f)
            curveTo(7.10039f, 12f, 7.5677f, 12f, 8.50232f, 12f)
            lineTo(15.5023f, 12f)
            curveTo(16.4369f, 12f, 16.9042f, 12f, 17.2523f, 12.201f)
            curveTo(18.0857f, 12.6821f, 18.0023f, 13.6561f, 18.0023f, 14.5f)
            curveTo(18.0023f, 15.3439f, 18.0857f, 16.3179f, 17.2523f, 16.799f)
            curveTo(16.9042f, 17f, 16.4369f, 17f, 15.5023f, 17f)
            horizontalLineTo(8.50232f)
            curveTo(7.5677f, 17f, 7.10039f, 17f, 6.75232f, 16.799f)
            curveTo(5.91895f, 16.3179f, 6.00232f, 15.3439f, 6.00232f, 14.5f)
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
        }.build()

        return _alignVerticalJustifyEnd!!
    }

private var _alignVerticalJustifyEnd: ImageVector? = null
