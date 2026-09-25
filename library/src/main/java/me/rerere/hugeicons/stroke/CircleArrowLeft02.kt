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

val HugeIcons.CircleArrowLeft02: ImageVector
    get() {
        if (_circleArrowLeft02 != null) {
            return _circleArrowLeft02!!
        }
        _circleArrowLeft02 = ImageVector.Builder(
            name = "CircleArrowLeft02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(22f, 12f)
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
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
            moveTo(9.00009f, 12.0002f)
            lineTo(16.0001f, 12.0002f)
            moveTo(11.4999f, 8.50012f)
            curveTo(11.4999f, 8.50012f, 7.99995f, 11.0778f, 7.99995f, 12.0001f)
            curveTo(7.99994f, 12.9225f, 11.4999f, 15.5001f, 11.4999f, 15.5001f)
        }
        }.build()

        return _circleArrowLeft02!!
    }

private var _circleArrowLeft02: ImageVector? = null
