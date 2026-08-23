package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) {
            return _zodiacCancer!!
        }
        _zodiacCancer = ImageVector.Builder(
            name = "ZodiacCancer",
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
            moveTo(10f, 9.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 3f, 9.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 10f, 9.5f)
            close()
        }

        group(rotate = 180f, pivotX = 17.5f, pivotY = 14.5f) {
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
                moveTo(21f, 14.5f)
                arcTo(3.5f, 3.5f, 0f, true, false, 14f, 14.5f)
                arcTo(3.5f, 3.5f, 0f, true, false, 21f, 14.5f)
                close()
            }
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 9.5f)
            curveTo(3f, 5.91015f, 7.02944f, 3f, 12f, 3f)
            curveTo(15.4829f, 3f, 18.5038f, 4.42887f, 20f, 6.51924f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 14.5f)
            curveTo(21f, 18.0899f, 16.9706f, 21f, 12f, 21f)
            curveTo(8.51707f, 21f, 5.49623f, 19.5711f, 4f, 17.4808f)
        }
        }.build()

        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
