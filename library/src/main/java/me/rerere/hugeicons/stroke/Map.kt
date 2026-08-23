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

val HugeIcons.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = ImageVector.Builder(
            name = "Map",
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
            moveTo(7.99609f, 3.34375f)
            curveTo(7.99609f, 9.09164f, 7.99609f, 12.3143f, 7.99609f, 18.0621f)
            moveTo(14.9961f, 20.0923f)
            verticalLineTo(5.88141f)
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
            moveTo(1.99609f, 15.8671f)
            verticalLineTo(8.39062f)
            curveTo(1.99609f, 7.16968f, 1.99609f, 6.55922f, 2.29479f, 6.06863f)
            curveTo(2.59349f, 5.57805f, 3.13141f, 5.30504f, 4.20724f, 4.75902f)
            lineTo(4.67742f, 4.52039f)
            curveTo(6.30984f, 3.69189f, 7.12605f, 3.27764f, 8.00812f, 3.25133f)
            curveTo(8.89019f, 3.22502f, 9.72895f, 3.5899f, 11.4065f, 4.31967f)
            lineTo(13.4204f, 5.19579f)
            curveTo(14.1972f, 5.5337f, 14.5856f, 5.70266f, 14.9961f, 5.70266f)
            curveTo(15.4066f, 5.70266f, 15.795f, 5.5337f, 16.5718f, 5.19579f)
            lineTo(17.8143f, 4.65524f)
            curveTo(19.7032f, 3.83355f, 20.6476f, 3.42271f, 21.3218f, 3.87401f)
            curveTo(21.9961f, 4.32531f, 21.9961f, 5.36828f, 21.9961f, 7.4542f)
            verticalLineTo(15.3847f)
            curveTo(21.9961f, 16.6832f, 21.9961f, 17.3324f, 21.6658f, 17.8409f)
            curveTo(21.3355f, 18.3494f, 20.7476f, 18.6051f, 19.5718f, 19.1166f)
            lineTo(18.1474f, 19.7362f)
            curveTo(16.5939f, 20.4121f, 15.8171f, 20.75f, 14.9961f, 20.75f)
            curveTo(14.1751f, 20.75f, 13.3983f, 20.4121f, 11.8447f, 19.7362f)
            lineTo(9.39393f, 18.6701f)
            curveTo(8.70287f, 18.3695f, 8.35734f, 18.2191f, 7.99029f, 18.2036f)
            curveTo(7.62324f, 18.1881f, 7.2666f, 18.3088f, 6.55334f, 18.5501f)
            lineTo(5.94478f, 18.7561f)
            curveTo(4.14291f, 19.3657f, 3.24196f, 19.6706f, 2.61903f, 19.2148f)
            curveTo(1.99609f, 18.7591f, 1.99609f, 17.7951f, 1.99609f, 15.8671f)
            close()
        }
        }.build()

        return _map!!
    }

private var _map: ImageVector? = null
