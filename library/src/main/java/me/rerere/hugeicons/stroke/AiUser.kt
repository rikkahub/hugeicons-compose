package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiUser: ImageVector
    get() {
        if (_aiUser != null) {
            return _aiUser!!
        }
        _aiUser = ImageVector.Builder(
            name = "AiUser",
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
        moveTo(13f, 3.00231f)
        curveTo(12.5299f, 3f, 12.0307f, 3f, 11.5f, 3f)
        curveTo(7.02166f, 3f, 4.78249f, 3f, 3.39124f, 4.39124f)
        curveTo(2f, 5.78249f, 2f, 8.02166f, 2f, 12.5f)
        curveTo(2f, 16.9783f, 2f, 19.2175f, 3.39124f, 20.6088f)
        curveTo(4.78249f, 22f, 7.02166f, 22f, 11.5f, 22f)
        curveTo(15.9783f, 22f, 18.2175f, 22f, 19.6088f, 20.6088f)
        curveTo(21f, 19.2175f, 21f, 16.9783f, 21f, 12.5f)
        curveTo(21f, 11.9693f, 21f, 11.4701f, 20.9977f, 11f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17.5f)
        curveTo(9.3317f, 15.0578f, 13.6432f, 14.9428f, 16f, 17.5f)
        moveTo(13.9951f, 10f)
        curveTo(13.9951f, 11.3807f, 12.8742f, 12.5f, 11.4915f, 12.5f)
        curveTo(10.1089f, 12.5f, 8.98797f, 11.3807f, 8.98797f, 10f)
        curveTo(8.98797f, 8.61929f, 10.1089f, 7.5f, 11.4915f, 7.5f)
        curveTo(12.8742f, 7.5f, 13.9951f, 8.61929f, 13.9951f, 10f)
        }
        }.build()

        return _aiUser!!
    }

private var _aiUser: ImageVector? = null
