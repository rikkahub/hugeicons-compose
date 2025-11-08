package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = ImageVector.Builder(
            name = "Satellite",
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
        moveTo(9f, 22f)
        lineTo(6f, 15f)
        lineTo(3f, 22f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.1917f, 13.3352f)
        curveTo(19.4847f, 14.6282f, 20.1312f, 15.2747f, 19.9778f, 16.2732f)
        curveTo(19.9707f, 16.3193f, 19.9548f, 16.3994f, 19.9437f, 16.4447f)
        curveTo(19.7033f, 17.4259f, 19.0448f, 17.6987f, 17.7276f, 18.2443f)
        curveTo(16.5231f, 18.7432f, 15.2321f, 19f, 13.9283f, 19f)
        curveTo(12.6245f, 19f, 11.3334f, 18.7432f, 10.1289f, 18.2443f)
        curveTo(8.92433f, 17.7453f, 7.82984f, 17.014f, 6.90792f, 16.0921f)
        curveTo(5.986f, 15.1702f, 5.25468f, 14.0757f, 4.75574f, 12.8711f)
        curveTo(4.2568f, 11.6666f, 4f, 10.3755f, 4f, 9.07173f)
        curveTo(4f, 7.76794f, 4.2568f, 6.4769f, 4.75575f, 5.27235f)
        curveTo(5.30131f, 3.95524f, 5.5741f, 3.29668f, 6.55528f, 3.05633f)
        curveTo(6.60061f, 3.04523f, 6.68071f, 3.0293f, 6.72683f, 3.02221f)
        curveTo(7.72531f, 2.86878f, 8.3718f, 3.51527f, 9.66479f, 4.80826f)
        lineTo(18.1917f, 13.3352f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 7.13288f)
        lineTo(17.7134f, 5.5293f)
        lineTo(15.8766f, 10.5293f)
        }
        }.build()

        return _satellite!!
    }

private var _satellite: ImageVector? = null
