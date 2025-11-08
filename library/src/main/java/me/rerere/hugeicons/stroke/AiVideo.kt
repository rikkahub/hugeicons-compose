package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiVideo: ImageVector
    get() {
        if (_aiVideo != null) {
            return _aiVideo!!
        }
        _aiVideo = ImageVector.Builder(
            name = "AiVideo",
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
        moveTo(14.4531f, 12.8948f)
        curveTo(14.3016f, 13.5215f, 13.5857f, 13.9644f, 12.1539f, 14.8502f)
        curveTo(10.7697f, 15.7064f, 10.0777f, 16.1346f, 9.51993f, 15.9625f)
        curveTo(9.28934f, 15.8913f, 9.07925f, 15.7562f, 8.90982f, 15.57f)
        curveTo(8.5f, 15.1198f, 8.5f, 14.2465f, 8.5f, 12.5f)
        curveTo(8.5f, 10.7535f, 8.5f, 9.88018f, 8.90982f, 9.42995f)
        curveTo(9.07925f, 9.24381f, 9.28934f, 9.10868f, 9.51993f, 9.03753f)
        curveTo(10.0777f, 8.86544f, 10.7697f, 9.29357f, 12.1539f, 10.1498f)
        curveTo(13.5857f, 11.0356f, 14.3016f, 11.4785f, 14.4531f, 12.1052f)
        curveTo(14.5156f, 12.3639f, 14.5156f, 12.6361f, 14.4531f, 12.8948f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9977f, 11f)
        curveTo(21f, 11.4701f, 21f, 11.9693f, 21f, 12.5f)
        curveTo(21f, 16.9783f, 21f, 19.2175f, 19.6088f, 20.6088f)
        curveTo(18.2175f, 22f, 15.9783f, 22f, 11.5f, 22f)
        curveTo(7.02166f, 22f, 4.78249f, 22f, 3.39124f, 20.6088f)
        curveTo(2f, 19.2175f, 2f, 16.9783f, 2f, 12.5f)
        curveTo(2f, 8.02166f, 2f, 5.78249f, 3.39124f, 4.39124f)
        curveTo(4.78249f, 3f, 7.02166f, 3f, 11.5f, 3f)
        curveTo(12.0307f, 3f, 12.5299f, 3f, 13f, 3.00231f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 2f)
        lineTo(18.7579f, 2.69703f)
        curveTo(19.0961f, 3.61102f, 19.2652f, 4.06802f, 19.5986f, 4.40139f)
        curveTo(19.932f, 4.73477f, 20.389f, 4.90387f, 21.303f, 5.24208f)
        lineTo(22f, 5.5f)
        lineTo(21.303f, 5.75792f)
        curveTo(20.389f, 6.09613f, 19.932f, 6.26524f, 19.5986f, 6.59861f)
        curveTo(19.2652f, 6.93198f, 19.0961f, 7.38898f, 18.7579f, 8.30297f)
        lineTo(18.5f, 9f)
        lineTo(18.2421f, 8.30297f)
        curveTo(17.9039f, 7.38898f, 17.7348f, 6.93198f, 17.4014f, 6.59861f)
        curveTo(17.068f, 6.26524f, 16.611f, 6.09613f, 15.697f, 5.75792f)
        lineTo(15f, 5.5f)
        lineTo(15.697f, 5.24208f)
        curveTo(16.611f, 4.90387f, 17.068f, 4.73477f, 17.4014f, 4.40139f)
        curveTo(17.7348f, 4.06802f, 17.9039f, 3.61102f, 18.2421f, 2.69703f)
        lineTo(18.5f, 2f)
        }
        }.build()

        return _aiVideo!!
    }

private var _aiVideo: ImageVector? = null
