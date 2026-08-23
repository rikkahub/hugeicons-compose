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

val HugeIcons.Atom01: ImageVector
    get() {
        if (_atom01 != null) {
            return _atom01!!
        }
        _atom01 = ImageVector.Builder(
            name = "Atom01",
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
            moveTo(16f, 12f)
            arcTo(4f, 4f, 0f, true, false, 8f, 12f)
            arcTo(4f, 4f, 0f, true, false, 16f, 12f)
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
            moveTo(7.77778f, 20.5f)
            curveTo(4.84996f, 19.0788f, 2.85799f, 16.2638f, 2.5f, 13.0416f)
            moveTo(16.2222f, 20.5f)
            curveTo(19.15f, 19.0788f, 21.142f, 16.2638f, 21.5f, 13.0416f)
            moveTo(5.87777f, 4.63781f)
            curveTo(9.37758f, 1.7874f, 14.4113f, 1.7874f, 17.9111f, 4.63781f)
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
            moveTo(12.125f, 21.25f)
            horizontalLineTo(12f)
            moveTo(3.125f, 8.5f)
            horizontalLineTo(3f)
            moveTo(21.125f, 8.5f)
            horizontalLineTo(21f)
            moveTo(12.25f, 21.25f)
            curveTo(12.25f, 21.3881f, 12.1381f, 21.5f, 12f, 21.5f)
            curveTo(11.8619f, 21.5f, 11.75f, 21.3881f, 11.75f, 21.25f)
            curveTo(11.75f, 21.1119f, 11.8619f, 21f, 12f, 21f)
            curveTo(12.1381f, 21f, 12.25f, 21.1119f, 12.25f, 21.25f)
            close()
            moveTo(3.25f, 8.5f)
            curveTo(3.25f, 8.63807f, 3.13807f, 8.75f, 3f, 8.75f)
            curveTo(2.86193f, 8.75f, 2.75f, 8.63807f, 2.75f, 8.5f)
            curveTo(2.75f, 8.36193f, 2.86193f, 8.25f, 3f, 8.25f)
            curveTo(3.13807f, 8.25f, 3.25f, 8.36193f, 3.25f, 8.5f)
            close()
            moveTo(21.25f, 8.5f)
            curveTo(21.25f, 8.63807f, 21.1381f, 8.75f, 21f, 8.75f)
            curveTo(20.8619f, 8.75f, 20.75f, 8.63807f, 20.75f, 8.5f)
            curveTo(20.75f, 8.36193f, 20.8619f, 8.25f, 21f, 8.25f)
            curveTo(21.1381f, 8.25f, 21.25f, 8.36193f, 21.25f, 8.5f)
            close()
        }
        }.build()

        return _atom01!!
    }

private var _atom01: ImageVector? = null
