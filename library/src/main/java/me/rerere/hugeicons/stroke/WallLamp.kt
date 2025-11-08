package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WallLamp: ImageVector
    get() {
        if (_wallLamp != null) {
            return _wallLamp!!
        }
        _wallLamp = ImageVector.Builder(
            name = "WallLamp",
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
        moveTo(3.99847f, 14.0034f)
        verticalLineTo(21.9997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.99847f, 18.3026f)
        lineTo(7.95839f, 19.8479f)
        curveTo(10.4759f, 20.8303f, 11.7348f, 21.3216f, 12.6312f, 20.7699f)
        curveTo(13.5277f, 20.2182f, 13.5277f, 18.9524f, 13.5277f, 16.4205f)
        verticalLineTo(8.0061f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5512f, 2.99895f)
        verticalLineTo(2.00024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.07806f, 8.00604f)
        horizontalLineTo(20.0015f)
        moveTo(9.34851f, 6.21058f)
        curveTo(8.70062f, 6.81563f, 8.57262f, 6.90994f, 8.39517f, 7.07597f)
        curveTo(8.14082f, 7.31396f, 8.0538f, 7.67835f, 8.14236f, 8.01464f)
        lineTo(10.196f, 15.8126f)
        curveTo(10.3301f, 16.3218f, 10.751f, 16.7057f, 11.2719f, 16.7938f)
        curveTo(12.7667f, 17.0466f, 14.2916f, 17.0556f, 15.786f, 16.7918f)
        curveTo(16.2798f, 16.7046f, 16.6788f, 16.3416f, 16.8109f, 15.8596f)
        lineTo(18.9668f, 7.98768f)
        curveTo(19.0519f, 7.67688f, 18.9918f, 7.33475f, 18.7674f, 7.10279f)
        curveTo(18.5846f, 6.91382f, 18.4566f, 6.84432f, 17.7779f, 6.21058f)
        curveTo(17.0255f, 5.50786f, 16.3052f, 4.23972f, 16.001f, 3.85472f)
        curveTo(15.6968f, 3.46971f, 15.4628f, 3.28072f, 15.0767f, 3.19345f)
        curveTo(14.0804f, 2.96823f, 13.0461f, 2.96823f, 12.0497f, 3.19345f)
        curveTo(11.6637f, 3.28072f, 11.4646f, 3.42312f, 11.1255f, 3.85472f)
        curveTo(10.7863f, 4.28631f, 10.101f, 5.50786f, 9.34851f, 6.21058f)
        }
        }.build()

        return _wallLamp!!
    }

private var _wallLamp: ImageVector? = null
