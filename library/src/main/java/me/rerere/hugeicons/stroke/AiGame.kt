package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiGame: ImageVector
    get() {
        if (_aiGame != null) {
            return _aiGame!!
        }
        _aiGame = ImageVector.Builder(
            name = "AiGame",
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
        moveTo(6.00195f, 7.5f)
        curveTo(5.12645f, 7.64253f, 4.48184f, 7.90465f, 3.95937f, 8.3867f)
        curveTo(2.81421f, 9.44326f, 2.65433f, 11.1887f, 2.33456f, 14.6797f)
        lineTo(2.00778f, 18.2473f)
        curveTo(1.88378f, 20.0049f, 3.25864f, 21.5f, 4.99899f, 21.5f)
        horizontalLineTo(5.74567f)
        curveTo(6.97191f, 21.5f, 8.0746f, 20.7441f, 8.53002f, 19.5913f)
        lineTo(9.27241f, 17.7121f)
        curveTo(9.51592f, 17.0956f, 9.63768f, 16.7874f, 9.89165f, 16.6134f)
        curveTo(10.1456f, 16.4393f, 10.4736f, 16.4393f, 11.1295f, 16.4393f)
        horizontalLineTo(12.8705f)
        curveTo(13.5264f, 16.4393f, 13.8544f, 16.4393f, 14.1084f, 16.6134f)
        curveTo(14.3623f, 16.7874f, 14.4841f, 17.0956f, 14.7276f, 17.7121f)
        lineTo(15.47f, 19.5913f)
        curveTo(15.9254f, 20.7441f, 17.0281f, 21.5f, 18.2543f, 21.5f)
        horizontalLineTo(19.001f)
        curveTo(20.7414f, 21.5f, 22.1162f, 20.0049f, 21.9922f, 18.2473f)
        lineTo(21.6685f, 14.6855f)
        curveTo(21.351f, 11.192f, 21.1922f, 9.44521f, 20.0468f, 8.38767f)
        curveTo(19.5241f, 7.905f, 18.8789f, 7.64263f, 18.0024f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9998f, 12.5f)
        horizontalLineTo(17.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99981f, 12.5f)
        horizontalLineTo(7.00879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.998f, 2.5f)
        lineTo(12.256f, 3.19703f)
        curveTo(12.5942f, 4.11102f, 12.7633f, 4.56802f, 13.0967f, 4.90139f)
        curveTo(13.43f, 5.23477f, 13.887f, 5.40387f, 14.801f, 5.74208f)
        lineTo(15.498f, 6f)
        lineTo(14.801f, 6.25792f)
        curveTo(13.887f, 6.59613f, 13.43f, 6.76524f, 13.0967f, 7.09861f)
        curveTo(12.7633f, 7.43198f, 12.5942f, 7.88898f, 12.256f, 8.80297f)
        lineTo(11.998f, 9.5f)
        lineTo(11.7401f, 8.80297f)
        curveTo(11.4019f, 7.88898f, 11.2328f, 7.43198f, 10.8994f, 7.09861f)
        curveTo(10.5661f, 6.76523f, 10.1091f, 6.59613f, 9.19507f, 6.25792f)
        lineTo(8.49805f, 6f)
        lineTo(9.19507f, 5.74208f)
        curveTo(10.1091f, 5.40387f, 10.5661f, 5.23477f, 10.8994f, 4.90139f)
        curveTo(11.2328f, 4.56802f, 11.4019f, 4.11102f, 11.7401f, 3.19703f)
        lineTo(11.998f, 2.5f)
        }
        }.build()

        return _aiGame!!
    }

private var _aiGame: ImageVector? = null
