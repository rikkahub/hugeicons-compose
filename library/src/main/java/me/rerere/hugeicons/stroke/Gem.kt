package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = ImageVector.Builder(
            name = "Gem",
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
        moveTo(9.85221f, 21.0098f)
        lineTo(5.44108f, 18.227f)
        curveTo(3.62622f, 17.0821f, 2.71879f, 16.5097f, 2.53271f, 15.569f)
        curveTo(2.34663f, 14.6284f, 2.96172f, 13.723f, 4.1919f, 11.9122f)
        lineTo(8.60303f, 5.41914f)
        curveTo(10.1516f, 3.13971f, 10.9259f, 2f, 12f, 2f)
        curveTo(13.0741f, 2f, 13.8484f, 3.13971f, 15.397f, 5.41914f)
        lineTo(19.8081f, 11.9122f)
        curveTo(21.0383f, 13.723f, 21.6534f, 14.6284f, 21.4673f, 15.569f)
        curveTo(21.2812f, 16.5097f, 20.3738f, 17.0821f, 18.5589f, 18.227f)
        lineTo(14.1478f, 21.0098f)
        curveTo(13.1014f, 21.6699f, 12.5781f, 22f, 12f, 22f)
        curveTo(11.4219f, 22f, 10.8986f, 21.6699f, 9.85221f, 21.0098f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        lineTo(14f, 14f)
        moveTo(21f, 15.569f)
        lineTo(14f, 14f)
        moveTo(12f, 22f)
        lineTo(14f, 14f)
        moveTo(3f, 15.569f)
        lineTo(14f, 14f)
        }
        }.build()

        return _gem!!
    }

private var _gem: ImageVector? = null
