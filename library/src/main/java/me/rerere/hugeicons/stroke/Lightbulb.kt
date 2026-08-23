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

val HugeIcons.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = ImageVector.Builder(
            name = "Lightbulb",
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
            moveTo(15.4812f, 16.9043f)
            curveTo(15.48f, 16.7344f, 15.4793f, 16.6494f, 15.4796f, 16.6252f)
            curveTo(15.4889f, 15.5876f, 15.6101f, 15.2943f, 16.3363f, 14.553f)
            curveTo(16.3532f, 14.5357f, 16.5411f, 14.35f, 16.917f, 13.9785f)
            curveTo(18.2007f, 12.7095f, 18.9961f, 10.9476f, 18.9961f, 9f)
            curveTo(18.9961f, 5.13401f, 15.8621f, 2f, 11.9961f, 2f)
            curveTo(8.1301f, 2f, 4.99609f, 5.13401f, 4.99609f, 9f)
            curveTo(4.99609f, 10.948f, 5.79184f, 12.7102f, 7.07601f, 13.9792f)
            curveTo(7.46075f, 14.3594f, 7.65312f, 14.5495f, 7.67314f, 14.5701f)
            curveTo(8.38589f, 15.3019f, 8.50393f, 15.5845f, 8.52348f, 16.6059f)
            curveTo(8.52402f, 16.6345f, 8.52402f, 16.7241f, 8.52402f, 16.9033f)
            curveTo(8.52402f, 16.9931f, 8.52402f, 17.038f, 8.52547f, 17.0759f)
            curveTo(8.56516f, 18.1209f, 9.40314f, 18.9589f, 10.4481f, 18.9986f)
            curveTo(10.486f, 19f, 10.5309f, 19f, 10.6207f, 19f)
            horizontalLineTo(13.4004f)
            curveTo(13.4759f, 19f, 13.5137f, 19f, 13.5456f, 18.999f)
            curveTo(14.6056f, 18.9652f, 15.4549f, 18.1098f, 15.4812f, 17.0495f)
            curveTo(15.482f, 17.0176f, 15.4817f, 16.9799f, 15.4812f, 16.9043f)
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
            moveTo(9.99609f, 19f)
            verticalLineTo(20f)
            curveTo(9.99609f, 21.1046f, 10.8915f, 22f, 11.9961f, 22f)
            curveTo(13.1007f, 22f, 13.9961f, 21.1046f, 13.9961f, 20f)
            verticalLineTo(19f)
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
            moveTo(8.49609f, 16f)
            horizontalLineTo(15.4961f)
        }
        }.build()

        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
