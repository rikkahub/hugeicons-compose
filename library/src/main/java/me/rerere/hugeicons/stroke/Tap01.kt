package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tap01: ImageVector
    get() {
        if (_tap01 != null) {
            return _tap01!!
        }
        _tap01 = ImageVector.Builder(
            name = "Tap01",
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
        moveTo(6.98752f, 6.02772f)
        curveTo(6.92162f, 5.10717f, 7.48861f, 3.28606f, 9.04448f, 2.5246f)
        curveTo(9.68606f, 2.13485f, 11.4471f, 1.5314f, 13.1314f, 2.60667f)
        curveTo(14.7913f, 3.66635f, 14.9033f, 5.22874f, 15.0078f, 6.01736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.165f, 22.0019f)
        curveTo(17.1197f, 20.3659f, 17.2229f, 20.2038f, 17.3425f, 19.8398f)
        curveTo(17.4621f, 19.4759f, 18.2988f, 18.1634f, 18.5948f, 17.2257f)
        curveTo(19.5525f, 14.1918f, 18.6599f, 13.5465f, 17.4698f, 12.6861f)
        curveTo(16.1501f, 11.732f, 13.7755f, 11.2582f, 12.5409f, 11.3628f)
        verticalLineTo(6.52393f)
        curveTo(12.5409f, 5.7005f, 11.7516f, 5.02722f, 10.9089f, 5.02722f)
        curveTo(10.0661f, 5.02722f, 9.29135f, 5.7005f, 9.29135f, 6.52393f)
        verticalLineTo(14.8358f)
        lineTo(7.57205f, 13.3449f)
        curveTo(7.01247f, 12.7519f, 6.1132f, 12.6918f, 5.49945f, 13.2312f)
        curveTo(4.91784f, 13.7424f, 4.83296f, 14.6033f, 5.30401f, 15.2135f)
        lineTo(6.43462f, 16.6783f)
        moveTo(9.24414f, 22.0019f)
        verticalLineTo(21.1487f)
        curveTo(9.28171f, 20.0958f, 8.49784f, 19.4088f, 7.47551f, 18.0353f)
        curveTo(7.40185f, 17.9363f, 7.33017f, 17.8407f, 7.26038f, 17.7481f)
        moveTo(7.26038f, 17.7481f)
        curveTo(6.95063f, 17.3373f, 6.67809f, 16.9872f, 6.43462f, 16.6783f)
        moveTo(7.26038f, 17.7481f)
        lineTo(8.28346f, 19.0736f)
        moveTo(7.26038f, 17.7481f)
        lineTo(6.43462f, 16.6783f)
        moveTo(6.43462f, 16.6783f)
        curveTo(5.93475f, 16.044f, 5.55741f, 15.5831f, 5.23211f, 15.1251f)
        }
        }.build()

        return _tap01!!
    }

private var _tap01: ImageVector? = null
