package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Avalanche: ImageVector
    get() {
        if (_avalanche != null) {
            return _avalanche!!
        }
        _avalanche = ImageVector.Builder(
            name = "Avalanche",
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
        moveTo(2f, 21f)
        horizontalLineTo(11.6547f)
        curveTo(14.1755f, 21f, 15.4359f, 21f, 15.8711f, 20.1706f)
        curveTo(16.3063f, 19.3412f, 15.6107f, 18.2648f, 14.2196f, 16.112f)
        lineTo(6.93559f, 4.83965f)
        curveTo(6.13925f, 3.60728f, 5.74108f, 2.9911f, 5.17984f, 3.0001f)
        curveTo(3.95309f, 3.01976f, 2.5f, 6f, 2f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5f)
        curveTo(10.6024f, 6.2142f, 11.1505f, 7.01476f, 12f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        curveTo(2.19944f, 7.58943f, 2.32706f, 8.50266f, 2.75554f, 8.96655f)
        curveTo(3.00648f, 9.23823f, 3.39002f, 9.34981f, 3.75053f, 9.25601f)
        curveTo(4.29307f, 9.11485f, 4.61512f, 8.53558f, 5.1267f, 8.33278f)
        curveTo(5.36623f, 8.23783f, 5.63377f, 8.23783f, 5.8733f, 8.33278f)
        curveTo(6.51536f, 8.5873f, 6.92764f, 9.39686f, 7.63967f, 9.49121f)
        curveTo(8.32392f, 9.58188f, 8.66629f, 8.9708f, 9f, 8.47768f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.7267f, 15.0452f)
        curveTo(18.6898f, 15.426f, 18.5912f, 15.7902f, 18.4401f, 16.1291f)
        moveTo(18.7267f, 15.0452f)
        curveTo(18.936f, 12.8817f, 17.0417f, 11f, 14.762f, 11f)
        curveTo(14.0531f, 11f, 12.8052f, 11.1754f, 12f, 11.763f)
        moveTo(18.7267f, 15.0452f)
        curveTo(20.5289f, 15.0371f, 22f, 16.3985f, 22f, 18.0791f)
        curveTo(22f, 19.4694f, 20.9961f, 20.6412f, 19.6267f, 21f)
        }
        }.build()

        return _avalanche!!
    }

private var _avalanche: ImageVector? = null
