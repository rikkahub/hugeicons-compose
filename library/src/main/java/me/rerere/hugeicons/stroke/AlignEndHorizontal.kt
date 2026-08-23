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

val HugeIcons.AlignEndHorizontal: ImageVector
    get() {
        if (_alignEndHorizontal != null) {
            return _alignEndHorizontal!!
        }
        _alignEndHorizontal = ImageVector.Builder(
            name = "AlignEndHorizontal",
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
            moveTo(5f, 15f)
            lineTo(5f, 5f)
            curveTo(5f, 3.89543f, 5.89543f, 3f, 7f, 3f)
            lineTo(8f, 3f)
            curveTo(9.10457f, 3f, 10f, 3.89543f, 10f, 5f)
            lineTo(10f, 15f)
            curveTo(10f, 16.1046f, 9.10457f, 17f, 8f, 17f)
            horizontalLineTo(7f)
            curveTo(5.89543f, 17f, 5f, 16.1046f, 5f, 15f)
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
            moveTo(14f, 15f)
            lineTo(14f, 11f)
            curveTo(14f, 9.89543f, 14.8954f, 9f, 16f, 9f)
            lineTo(17f, 9f)
            curveTo(18.1046f, 9f, 19f, 9.89543f, 19f, 11f)
            verticalLineTo(15f)
            curveTo(19f, 16.1046f, 18.1046f, 17f, 17f, 17f)
            horizontalLineTo(16f)
            curveTo(14.8954f, 17f, 14f, 16.1046f, 14f, 15f)
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
            moveTo(3f, 21f)
            horizontalLineTo(21f)
        }
        }.build()

        return _alignEndHorizontal!!
    }

private var _alignEndHorizontal: ImageVector? = null
