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

val HugeIcons.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = ImageVector.Builder(
            name = "Dock",
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
            moveTo(14f, 4f)
            horizontalLineTo(10f)
            curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
            curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
            curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
            curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
            horizontalLineTo(14f)
            curveTo(17.7712f, 20f, 19.6569f, 20f, 20.8284f, 18.8284f)
            curveTo(22f, 17.6569f, 22f, 15.7712f, 22f, 12f)
            curveTo(22f, 8.22876f, 22f, 6.34315f, 20.8284f, 5.17157f)
            curveTo(19.6569f, 4f, 17.7712f, 4f, 14f, 4f)
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
            moveTo(6f, 16f)
            horizontalLineTo(18f)
        }
        }.build()

        return _dock!!
    }

private var _dock: ImageVector? = null
