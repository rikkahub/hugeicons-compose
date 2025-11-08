package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RadioactiveAlert: ImageVector
    get() {
        if (_radioactiveAlert != null) {
            return _radioactiveAlert!!
        }
        _radioactiveAlert = ImageVector.Builder(
            name = "RadioactiveAlert",
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
        moveTo(9f, 3f)
        curveTo(7.78555f, 3.91217f, 7f, 5.36445f, 7f, 7.0002f)
        curveTo(7f, 9.76151f, 9.23858f, 12f, 12f, 12f)
        curveTo(14.7614f, 12f, 17f, 9.76151f, 17f, 7.0002f)
        curveTo(17f, 5.36445f, 16.2144f, 3.91217f, 15f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        curveTo(20.0878f, 11.7856f, 18.6355f, 11f, 16.9998f, 11f)
        curveTo(14.2385f, 11f, 12f, 13.2386f, 12f, 16f)
        curveTo(12f, 18.7614f, 14.2385f, 21f, 16.9998f, 21f)
        curveTo(18.6355f, 21f, 20.0878f, 20.2144f, 21f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 13f)
        curveTo(3.91221f, 11.7857f, 5.36426f, 11f, 7f, 11f)
        curveTo(9.76142f, 11f, 12f, 13.2386f, 12f, 16f)
        curveTo(12f, 18.7614f, 9.76142f, 21f, 7f, 21f)
        curveTo(5.3644f, 21f, 3.91223f, 20.2147f, 3f, 19.0005f)
        }
        }.build()

        return _radioactiveAlert!!
    }

private var _radioactiveAlert: ImageVector? = null
