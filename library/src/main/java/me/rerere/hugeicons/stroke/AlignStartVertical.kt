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

val HugeIcons.AlignStartVertical: ImageVector
    get() {
        if (_alignStartVertical != null) {
            return _alignStartVertical!!
        }
        _alignStartVertical = ImageVector.Builder(
            name = "AlignStartVertical",
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
            moveTo(9f, 5f)
            lineTo(19f, 5f)
            curveTo(20.1046f, 5f, 21f, 5.89543f, 21f, 7f)
            verticalLineTo(8f)
            curveTo(21f, 9.10457f, 20.1046f, 10f, 19f, 10f)
            horizontalLineTo(9f)
            curveTo(7.89543f, 10f, 7f, 9.10457f, 7f, 8f)
            verticalLineTo(7f)
            curveTo(7f, 5.89543f, 7.89543f, 5f, 9f, 5f)
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
            moveTo(9f, 14f)
            lineTo(13f, 14f)
            curveTo(14.1046f, 14f, 15f, 14.8954f, 15f, 16f)
            verticalLineTo(17f)
            curveTo(15f, 18.1046f, 14.1046f, 19f, 13f, 19f)
            horizontalLineTo(9f)
            curveTo(7.89543f, 19f, 7f, 18.1046f, 7f, 17f)
            verticalLineTo(16f)
            curveTo(7f, 14.8954f, 7.89543f, 14f, 9f, 14f)
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
            verticalLineTo(21f)
        }
        }.build()

        return _alignStartVertical!!
    }

private var _alignStartVertical: ImageVector? = null
