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

val HugeIcons.Brackets: ImageVector
    get() {
        if (_brackets != null) {
            return _brackets!!
        }
        _brackets = ImageVector.Builder(
            name = "Brackets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 21f)
            curveTo(16.93f, 21f, 17.395f, 21f, 17.7765f, 20.8978f)
            curveTo(18.8117f, 20.6204f, 19.6204f, 19.8117f, 19.8978f, 18.7765f)
            curveTo(20f, 18.395f, 20f, 17.93f, 20f, 17f)
            verticalLineTo(7f)
            curveTo(20f, 6.07003f, 20f, 5.60504f, 19.8978f, 5.22354f)
            curveTo(19.6204f, 4.18827f, 18.8117f, 3.37962f, 17.7765f, 3.10222f)
            curveTo(17.395f, 3f, 16.93f, 3f, 16f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 21f)
            curveTo(7.07003f, 21f, 6.60504f, 21f, 6.22354f, 20.8978f)
            curveTo(5.18827f, 20.6204f, 4.37962f, 19.8117f, 4.10222f, 18.7765f)
            curveTo(4f, 18.395f, 4f, 17.93f, 4f, 17f)
            verticalLineTo(7f)
            curveTo(4f, 6.07003f, 4f, 5.60504f, 4.10222f, 5.22354f)
            curveTo(4.37962f, 4.18827f, 5.18827f, 3.37962f, 6.22354f, 3.10222f)
            curveTo(6.60504f, 3f, 7.07003f, 3f, 8f, 3f)
        }
        }.build()

        return _brackets!!
    }

private var _brackets: ImageVector? = null
