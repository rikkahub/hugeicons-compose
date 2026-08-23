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

val HugeIcons.LensConvex: ImageVector
    get() {
        if (_lensConvex != null) {
            return _lensConvex!!
        }
        _lensConvex = ImageVector.Builder(
            name = "LensConvex",
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.5039f, 2f)
            curveTo(10.6442f, 2f, 10.2143f, 2f, 9.78933f, 2.21442f)
            curveTo(9.36437f, 2.42885f, 9.15533f, 2.71185f, 8.73726f, 3.27785f)
            curveTo(7.03359f, 5.58433f, 5.99585f, 8.64362f, 5.99585f, 12f)
            curveTo(5.99585f, 15.3564f, 7.03359f, 18.4157f, 8.73726f, 20.7221f)
            curveTo(9.15533f, 21.2881f, 9.36437f, 21.5711f, 9.78933f, 21.7856f)
            curveTo(10.2143f, 22f, 10.6442f, 22f, 11.5039f, 22f)
            horizontalLineTo(12.4878f)
            curveTo(13.3475f, 22f, 13.7774f, 22f, 14.2024f, 21.7856f)
            curveTo(14.6273f, 21.5711f, 14.8364f, 21.2881f, 15.2544f, 20.7221f)
            curveTo(16.9581f, 18.4157f, 17.9959f, 15.3564f, 17.9959f, 12f)
            curveTo(17.9959f, 8.64362f, 16.9581f, 5.58433f, 15.2544f, 3.27785f)
            curveTo(14.8364f, 2.71185f, 14.6273f, 2.42885f, 14.2024f, 2.21442f)
            curveTo(13.7774f, 2f, 13.3475f, 2f, 12.4878f, 2f)
            horizontalLineTo(11.5039f)
            close()
        }
        }.build()

        return _lensConvex!!
    }

private var _lensConvex: ImageVector? = null
