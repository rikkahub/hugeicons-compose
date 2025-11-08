package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shaka02: ImageVector
    get() {
        if (_shaka02 != null) {
            return _shaka02!!
        }
        _shaka02 = ImageVector.Builder(
            name = "Shaka02",
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
        moveTo(17.7116f, 11.671f)
        lineTo(15.6393f, 13.5f)
        curveTo(15.6393f, 12.1103f, 15.6393f, 11.4155f, 15.4376f, 10.8867f)
        curveTo(15.0858f, 9.96466f, 14.3147f, 9.28087f, 13.377f, 9.05945f)
        curveTo(12.8393f, 8.93248f, 12.172f, 9.03555f, 10.8373f, 9.2417f)
        lineTo(6.899f, 10f)
        verticalLineTo(4.75f)
        curveTo(6.899f, 3.7835f, 6.13811f, 3f, 5.1995f, 3f)
        curveTo(4.26089f, 3f, 3.5f, 3.7835f, 3.5f, 4.75f)
        verticalLineTo(13.1795f)
        curveTo(3.5f, 15.8106f, 3.5f, 17.1261f, 3.98274f, 18.1435f)
        curveTo(4.47679f, 19.1846f, 5.31535f, 20.0232f, 6.35655f, 20.5173f)
        curveTo(7.37391f, 21f, 8.68944f, 21f, 11.3205f, 21f)
        curveTo(12.791f, 21f, 13.5263f, 21f, 14.188f, 20.7435f)
        curveTo(14.392f, 20.6643f, 14.5893f, 20.5677f, 14.7776f, 20.4545f)
        curveTo(15.3882f, 20.0874f, 15.8519f, 19.4998f, 16.7792f, 18.3246f)
        lineTo(20.1218f, 14.0883f)
        curveTo(20.623f, 13.4531f, 20.6264f, 12.5441f, 20.1299f, 11.905f)
        curveTo(19.5331f, 11.1369f, 18.4369f, 11.0308f, 17.7116f, 11.671f)
        }
        }.build()

        return _shaka02!!
    }

private var _shaka02: ImageVector? = null
