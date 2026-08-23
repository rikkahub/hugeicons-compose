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

val HugeIcons.MoveRight: ImageVector
    get() {
        if (_moveRight != null) {
            return _moveRight!!
        }
        _moveRight = ImageVector.Builder(
            name = "MoveRight",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 12f)
            arcTo(3f, 3f, 0f, true, false, 2f, 12f)
            arcTo(3f, 3f, 0f, true, false, 8f, 12f)
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
            moveTo(22f, 12f)
            lineTo(12f, 12f)
            moveTo(22f, 12f)
            curveTo(22f, 12.562f, 21.5619f, 12.9893f, 20.6857f, 13.8437f)
            lineTo(19.0294f, 15.5001f)
            moveTo(22f, 12f)
            curveTo(22f, 11.4379f, 21.5619f, 11.0107f, 20.6857f, 10.1563f)
            lineTo(19.0296f, 8.50012f)
        }
        }.build()

        return _moveRight!!
    }

private var _moveRight: ImageVector? = null
