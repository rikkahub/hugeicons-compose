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

val HugeIcons.Music02: ImageVector
    get() {
        if (_music02 != null) {
            return _music02!!
        }
        _music02 = ImageVector.Builder(
            name = "Music02",
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
            moveTo(20.9922f, 15.75f)
            arcTo(3f, 3f, 0f, true, false, 14.9922f, 15.75f)
            arcTo(3f, 3f, 0f, true, false, 20.9922f, 15.75f)
            close()
        }

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
            moveTo(8.99219f, 17.75f)
            arcTo(3f, 3f, 0f, true, false, 2.99219f, 17.75f)
            arcTo(3f, 3f, 0f, true, false, 8.99219f, 17.75f)
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
            moveTo(8.99219f, 17.75f)
            verticalLineTo(9.66559f)
            moveTo(8.99219f, 9.66559f)
            verticalLineTo(8.77944f)
            curveTo(8.99219f, 7.26371f, 8.99219f, 6.50585f, 9.41578f, 5.9576f)
            curveTo(9.83937f, 5.40936f, 10.5669f, 5.22555f, 12.022f, 4.85793f)
            lineTo(16.022f, 3.84738f)
            curveTo(18.3099f, 3.26938f, 19.4538f, 2.98038f, 20.223f, 3.58727f)
            curveTo(20.859f, 4.08907f, 20.9691f, 4.99061f, 20.9882f, 6.63495f)
            moveTo(8.99219f, 9.66559f)
            lineTo(20.9882f, 6.63495f)
            moveTo(20.9922f, 15.7289f)
            verticalLineTo(7.76889f)
            curveTo(20.9922f, 7.35623f, 20.9922f, 6.9793f, 20.9882f, 6.63495f)
            moveTo(20.9882f, 6.63495f)
            lineTo(20.9922f, 6.63394f)
        }
        }.build()

        return _music02!!
    }

private var _music02: ImageVector? = null
