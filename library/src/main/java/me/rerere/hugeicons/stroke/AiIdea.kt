package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiIdea: ImageVector
    get() {
        if (_aiIdea != null) {
            return _aiIdea!!
        }
        _aiIdea = ImageVector.Builder(
            name = "AiIdea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9.62069f)
        curveTo(19f, 12.1999f, 17.7302f, 14.1852f, 15.7983f, 15.4917f)
        curveTo(15.3483f, 15.796f, 15.1233f, 15.9482f, 15.0122f, 16.1212f)
        curveTo(14.9012f, 16.2942f, 14.8633f, 16.5214f, 14.7876f, 16.9757f)
        lineTo(14.7287f, 17.3288f)
        curveTo(14.5957f, 18.127f, 14.5292f, 18.526f, 14.2494f, 18.763f)
        curveTo(13.9697f, 19f, 13.5651f, 19f, 12.7559f, 19f)
        horizontalLineTo(10.1444f)
        curveTo(9.33528f, 19f, 8.93069f, 19f, 8.65095f, 18.763f)
        curveTo(8.3712f, 18.526f, 8.30469f, 18.127f, 8.17166f, 17.3288f)
        lineTo(8.11281f, 16.9757f)
        curveTo(8.03734f, 16.5229f, 7.99961f, 16.2965f, 7.88968f, 16.1243f)
        curveTo(7.77976f, 15.9521f, 7.55428f, 15.798f, 7.10332f, 15.4897f)
        curveTo(5.1919f, 14.1832f, 4f, 12.1986f, 4f, 9.62069f)
        curveTo(4f, 5.4119f, 7.35786f, 2f, 11.5f, 2f)
        curveTo(12.0137f, 2f, 12.5153f, 2.05248f, 13f, 2.15244f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 2f)
        lineTo(16.7579f, 2.69703f)
        curveTo(17.0961f, 3.61102f, 17.2652f, 4.06802f, 17.5986f, 4.40139f)
        curveTo(17.932f, 4.73477f, 18.389f, 4.90387f, 19.303f, 5.24208f)
        lineTo(20f, 5.5f)
        lineTo(19.303f, 5.75792f)
        curveTo(18.389f, 6.09613f, 17.932f, 6.26524f, 17.5986f, 6.59861f)
        curveTo(17.2652f, 6.93198f, 17.0961f, 7.38898f, 16.7579f, 8.30297f)
        lineTo(16.5f, 9f)
        lineTo(16.2421f, 8.30297f)
        curveTo(15.9039f, 7.38898f, 15.7348f, 6.93198f, 15.4014f, 6.59861f)
        curveTo(15.068f, 6.26524f, 14.611f, 6.09613f, 13.697f, 5.75792f)
        lineTo(13f, 5.5f)
        lineTo(13.697f, 5.24208f)
        curveTo(14.611f, 4.90387f, 15.068f, 4.73477f, 15.4014f, 4.40139f)
        curveTo(15.7348f, 4.06802f, 15.9039f, 3.61102f, 16.2421f, 2.69703f)
        lineTo(16.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 19f)
        verticalLineTo(20f)
        curveTo(13.5f, 20.9428f, 13.5f, 21.4142f, 13.2071f, 21.7071f)
        curveTo(12.9142f, 22f, 12.4428f, 22f, 11.5f, 22f)
        curveTo(10.5572f, 22f, 10.0858f, 22f, 9.79289f, 21.7071f)
        curveTo(9.5f, 21.4142f, 9.5f, 20.9428f, 9.5f, 20f)
        verticalLineTo(19f)
        }
        }.build()

        return _aiIdea!!
    }

private var _aiIdea: ImageVector? = null
