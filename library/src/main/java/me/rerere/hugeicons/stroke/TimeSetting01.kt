package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeSetting01: ImageVector
    get() {
        if (_timeSetting01 != null) {
            return _timeSetting01!!
        }
        _timeSetting01 = ImageVector.Builder(
            name = "TimeSetting01",
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
        moveTo(12f, 8f)
        verticalLineTo(12f)
        lineTo(14.8037f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13.9669f)
        verticalLineTo(10.0332f)
        curveTo(19.1433f, 10.0332f, 17.2857f, 6.93041f, 18.732f, 4.46691f)
        lineTo(15.2679f, 2.5001f)
        curveTo(13.8038f, 4.99405f, 10.1978f, 4.99395f, 8.73363f, 2.5f)
        lineTo(5.26953f, 4.46681f)
        curveTo(6.71586f, 6.93035f, 4.85673f, 10.0332f, 2f, 10.0332f)
        verticalLineTo(13.9669f)
        curveTo(4.85668f, 13.9669f, 6.71425f, 17.0697f, 5.26795f, 19.5332f)
        lineTo(8.73205f, 21.5f)
        curveTo(10.1969f, 19.0048f, 13.8046f, 19.0047f, 15.2695f, 21.4999f)
        lineTo(18.7336f, 19.5331f)
        curveTo(17.2874f, 17.0696f, 19.1434f, 13.9669f, 22f, 13.9669f)
        }
        }.build()

        return _timeSetting01!!
    }

private var _timeSetting01: ImageVector? = null
