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

val HugeIcons.AlignStartHorizontal: ImageVector
    get() {
        if (_alignStartHorizontal != null) {
            return _alignStartHorizontal!!
        }
        _alignStartHorizontal = ImageVector.Builder(
            name = "AlignStartHorizontal",
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
            moveTo(5f, 9f)
            lineTo(5f, 19f)
            curveTo(5f, 20.1046f, 5.89543f, 21f, 7f, 21f)
            horizontalLineTo(8f)
            curveTo(9.10457f, 21f, 10f, 20.1046f, 10f, 19f)
            lineTo(10f, 9f)
            curveTo(10f, 7.89543f, 9.10457f, 7f, 8f, 7f)
            horizontalLineTo(7f)
            curveTo(5.89543f, 7f, 5f, 7.89543f, 5f, 9f)
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
            moveTo(14f, 9f)
            lineTo(14f, 13f)
            curveTo(14f, 14.1046f, 14.8954f, 15f, 16f, 15f)
            horizontalLineTo(17f)
            curveTo(18.1046f, 15f, 19f, 14.1046f, 19f, 13f)
            verticalLineTo(9f)
            curveTo(19f, 7.89543f, 18.1046f, 7f, 17f, 7f)
            horizontalLineTo(16f)
            curveTo(14.8954f, 7f, 14f, 7.89543f, 14f, 9f)
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
            moveTo(3f, 3f)
            horizontalLineTo(21f)
        }
        }.build()

        return _alignStartHorizontal!!
    }

private var _alignStartHorizontal: ImageVector? = null
