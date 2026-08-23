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

val HugeIcons.AlignEndVertical: ImageVector
    get() {
        if (_alignEndVertical != null) {
            return _alignEndVertical!!
        }
        _alignEndVertical = ImageVector.Builder(
            name = "AlignEndVertical",
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
            moveTo(15f, 5f)
            lineTo(5f, 5f)
            curveTo(3.89543f, 5f, 3f, 5.89543f, 3f, 7f)
            verticalLineTo(8f)
            curveTo(3f, 9.10457f, 3.89543f, 10f, 5f, 10f)
            horizontalLineTo(15f)
            curveTo(16.1046f, 10f, 17f, 9.10457f, 17f, 8f)
            verticalLineTo(7f)
            curveTo(17f, 5.89543f, 16.1046f, 5f, 15f, 5f)
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
            moveTo(15f, 14f)
            lineTo(11f, 14f)
            curveTo(9.89543f, 14f, 9f, 14.8954f, 9f, 16f)
            verticalLineTo(17f)
            curveTo(9f, 18.1046f, 9.89543f, 19f, 11f, 19f)
            horizontalLineTo(15f)
            curveTo(16.1046f, 19f, 17f, 18.1046f, 17f, 17f)
            verticalLineTo(16f)
            curveTo(17f, 14.8954f, 16.1046f, 14f, 15f, 14f)
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
            moveTo(21f, 3f)
            lineTo(21f, 21f)
        }
        }.build()

        return _alignEndVertical!!
    }

private var _alignEndVertical: ImageVector? = null
