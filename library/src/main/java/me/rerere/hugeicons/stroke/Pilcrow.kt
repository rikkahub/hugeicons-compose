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

val HugeIcons.Pilcrow: ImageVector
    get() {
        if (_pilcrow != null) {
            return _pilcrow!!
        }
        _pilcrow = ImageVector.Builder(
            name = "Pilcrow",
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
            moveTo(12.9922f, 3f)
            verticalLineTo(21f)
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
            moveTo(16.9922f, 3f)
            verticalLineTo(21f)
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
            moveTo(18.9922f, 3f)
            horizontalLineTo(9.49219f)
            curveTo(8.29871f, 3f, 7.15412f, 3.47411f, 6.31021f, 4.31802f)
            curveTo(5.46629f, 5.16193f, 4.99219f, 6.30653f, 4.99219f, 7.5f)
            curveTo(4.99219f, 8.69347f, 5.46629f, 9.83807f, 6.31021f, 10.682f)
            curveTo(7.15412f, 11.5259f, 8.29871f, 12f, 9.49219f, 12f)
            horizontalLineTo(12.9922f)
        }
        }.build()

        return _pilcrow!!
    }

private var _pilcrow: ImageVector? = null
