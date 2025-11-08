package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wrench01: ImageVector
    get() {
        if (_wrench01 != null) {
            return _wrench01!!
        }
        _wrench01 = ImageVector.Builder(
            name = "Wrench01",
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
        moveTo(20.3584f, 13.3567f)
        curveTo(19.1689f, 14.546f, 16.9308f, 14.4998f, 13.4992f, 14.4998f)
        curveTo(11.2914f, 14.4998f, 9.50138f, 12.7071f, 9.50024f, 10.4993f)
        curveTo(9.50024f, 7.07001f, 9.454f, 4.83065f, 10.6435f, 3.64138f)
        curveTo(11.8329f, 2.45212f, 12.3583f, 2.50027f, 17.6274f, 2.50027f)
        curveTo(18.1366f, 2.49809f, 18.3929f, 3.11389f, 18.0329f, 3.47394f)
        lineTo(15.3199f, 6.18714f)
        curveTo(14.6313f, 6.87582f, 14.6294f, 7.99233f, 15.3181f, 8.68092f)
        curveTo(16.0068f, 9.36952f, 17.1234f, 9.36959f, 17.8122f, 8.68109f)
        lineTo(20.5259f, 5.96855f)
        curveTo(20.886f, 5.60859f, 21.5019f, 5.86483f, 21.4997f, 6.37395f)
        curveTo(21.4997f, 11.6422f, 21.5479f, 12.1675f, 20.3584f, 13.3567f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 14.5f)
        lineTo(7.32842f, 20.6716f)
        curveTo(6.22386f, 21.7761f, 4.433f, 21.7761f, 3.32843f, 20.6716f)
        curveTo(2.22386f, 19.567f, 2.22386f, 17.7761f, 3.32843f, 16.6716f)
        lineTo(9.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.50896f, 18.5f)
        horizontalLineTo(5.5f)
        }
        }.build()

        return _wrench01!!
    }

private var _wrench01: ImageVector? = null
