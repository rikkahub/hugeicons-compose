package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OlympicTorch: ImageVector
    get() {
        if (_olympicTorch != null) {
            return _olympicTorch!!
        }
        _olympicTorch = ImageVector.Builder(
            name = "OlympicTorch",
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
        moveTo(10f, 8.94648f)
        curveTo(10.0112f, 7.71996f, 10.5211f, 6.32069f, 11.6575f, 5.3729f)
        curveTo(14.5106f, 2.99353f, 21.2591f, 6.95603f, 20.8207f, 2f)
        curveTo(24.4804f, 7.64147f, 18.4776f, 7.81928f, 18.2152f, 9.83766f)
        curveTo(18.0664f, 10.9826f, 20.1591f, 11.6114f, 21.3687f, 10.6027f)
        curveTo(21.1245f, 11.4521f, 19.5f, 14.8057f, 15f, 13.8206f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.95445f, 12.0276f)
        curveTo(7.83074f, 10.9039f, 8.01032f, 7f, 8.01032f, 7f)
        lineTo(17f, 15.9897f)
        curveTo(17f, 15.9897f, 13.0961f, 16.1678f, 11.9724f, 15.0441f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.14822f, 12f)
        lineTo(2.24774f, 19.983f)
        curveTo(1.87554f, 20.4866f, 1.92775f, 21.1867f, 2.37054f, 21.6295f)
        curveTo(2.81333f, 22.0722f, 3.51343f, 22.1245f, 4.01701f, 21.7523f)
        lineTo(12f, 15.8518f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10f)
        lineTo(14f, 17f)
        }
        }.build()

        return _olympicTorch!!
    }

private var _olympicTorch: ImageVector? = null
