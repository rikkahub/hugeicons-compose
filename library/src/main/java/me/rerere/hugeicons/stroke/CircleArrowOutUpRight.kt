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

val HugeIcons.CircleArrowOutUpRight: ImageVector
    get() {
        if (_circleArrowOutUpRight != null) {
            return _circleArrowOutUpRight!!
        }
        _circleArrowOutUpRight = ImageVector.Builder(
            name = "CircleArrowOutUpRight",
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
            moveTo(12f, 8.5f)
            verticalLineTo(16f)
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
            moveTo(8f, 12f)
            curveTo(8f, 12f, 10.946f, 8.00001f, 12f, 8f)
            curveTo(13.0541f, 7.99999f, 16f, 12f, 16f, 12f)
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
            moveTo(2f, 12f)
            curveTo(2f, 10.9064f, 2.17555f, 9.8538f, 2.5f, 8.86884f)
            moveTo(5.5f, 4.40041f)
            curveTo(5.14414f, 4.70507f, 4.80993f, 5.03429f, 4.5f, 5.38544f)
            moveTo(2.83209f, 16f)
            curveTo(3.42083f, 17.3475f, 4.29795f, 18.5402f, 5.38544f, 19.5f)
            moveTo(8.5f, 21.3704f)
            curveTo(9.58934f, 21.7775f, 10.7687f, 22f, 12f, 22f)
            curveTo(13.5646f, 22f, 15.0454f, 21.6407f, 16.3641f, 21f)
            moveTo(19.5f, 18.6146f)
            curveTo(21.0559f, 16.8517f, 22f, 14.5361f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(10.9548f, 2f, 9.94704f, 2.16035f, 9f, 2.4578f)
        }
        }.build()

        return _circleArrowOutUpRight!!
    }

private var _circleArrowOutUpRight: ImageVector? = null
