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

val HugeIcons.PoundSterling: ImageVector
    get() {
        if (_poundSterling != null) {
            return _poundSterling!!
        }
        _poundSterling = ImageVector.Builder(
            name = "PoundSterling",
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
            moveTo(10.6172f, 14f)
            curveTo(9.36719f, 16.9167f, 7.49219f, 19.8333f, 4.99219f, 21f)
            horizontalLineTo(16.8672f)
            curveTo(16.8672f, 21f, 18.7422f, 21f, 19.9922f, 19.8333f)
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
            moveTo(14.9922f, 14f)
            horizontalLineTo(3.99219f)
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
            moveTo(17.9922f, 8.5f)
            curveTo(17.9922f, 5.46243f, 15.5298f, 3f, 12.4922f, 3f)
            curveTo(9.45462f, 3f, 6.99219f, 5.46243f, 6.99219f, 8.5f)
            curveTo(6.99219f, 11.5376f, 9.45462f, 14f, 12.4922f, 14f)
        }
        }.build()

        return _poundSterling!!
    }

private var _poundSterling: ImageVector? = null
